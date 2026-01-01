# Java 개발 환경 설정 가이드

이 문서는 Cursor AI 환경에서 Java 학습을 위한 개발 환경 설정 방법을 안내한다.

---

## 1. 개요

### 1.1 필요한 것

| 구분 | 필수 여부 | 설명 |
|:-----|:-----|:-----|
| **OpenJDK 21** | 필수 | Java 컴파일러 및 실행 환경 |
| **Gradle** | 선택 | 빌드 자동화 도구 (학습 단계에서는 불필요) |

### 1.2 OpenJDK란?

**OpenJDK (Open Java Development Kit)**는 Java 프로그램을 개발하고 실행하기 위한 오픈소스 도구 모음이다.

```
OpenJDK 구성 요소:
├── javac    ← Java 컴파일러 (.java → .class 변환)
├── java     ← Java 실행기 (.class 파일 실행)
├── JVM      ← Java Virtual Machine (Java 프로그램이 돌아가는 가상 환경)
├── JRE      ← Java Runtime Environment (실행에 필요한 라이브러리)
└── 기타 도구 ← jar, javadoc, jdb 등
```

**왜 "Open"JDK인가?**

- Oracle JDK: Oracle 회사가 만든 상용 버전
- OpenJDK: 오픈소스 버전 (무료, Oracle JDK와 거의 동일)

학습 및 개발 목적으로는 OpenJDK를 사용하면 된다.

---

## 2. 운영체제별 설치 방법

### 2.1 Windows (WSL2 Ubuntu 환경)

WSL2에서 Ubuntu를 사용하는 경우 다음 명령어로 설치한다.

```bash
# 1. 패키지 목록 업데이트
sudo apt update

# 2. OpenJDK 21 설치
sudo apt install openjdk-21-jdk -y

# 3. 설치 확인
java -version
javac -version
```

**예상 출력:**
```
openjdk version "21.0.x" 2024-xx-xx
OpenJDK Runtime Environment (build 21.0.x+xx-Ubuntu-xxxxx)
OpenJDK 64-Bit Server VM (build 21.0.x+xx-Ubuntu-xxxxx, mixed mode, sharing)
```

### 2.2 Windows (직접 설치)

WSL을 사용하지 않고 Windows에서 직접 설치하는 경우:

**1단계: JDK 다운로드**

[Adoptium (Eclipse Temurin)](https://adoptium.net/) 에서 다운로드:
- Version: **21 - LTS**
- Operating System: **Windows**
- Architecture: **x64**

**2단계: 설치**

다운로드한 `.msi` 파일을 실행하고 설치한다.
설치 중 "Set JAVA_HOME variable" 옵션을 체크한다.

**3단계: 환경변수 확인**

PowerShell 또는 CMD에서 확인:
```powershell
java -version
javac -version
```

### 2.3 macOS

**Homebrew 사용 (권장):**

```bash
# 1. Homebrew가 없다면 먼저 설치
/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

# 2. OpenJDK 21 설치
brew install openjdk@21

# 3. 심볼릭 링크 생성 (시스템에서 인식하도록)
sudo ln -sfn $(brew --prefix)/opt/openjdk@21/libexec/openjdk.jdk /Library/Java/JavaVirtualMachines/openjdk-21.jdk

# 4. 설치 확인
java -version
javac -version
```

**Apple Silicon (M1/M2/M3) 사용자:**
- Homebrew로 설치하면 자동으로 ARM64 버전이 설치된다.

### 2.4 Linux (Ubuntu/Debian)

```bash
# 1. 패키지 목록 업데이트
sudo apt update

# 2. OpenJDK 21 설치
sudo apt install openjdk-21-jdk -y

# 3. 설치 확인
java -version
javac -version
```

### 2.5 SDKMAN 사용 (모든 OS 공통)

SDKMAN은 여러 버전의 JDK를 쉽게 관리할 수 있는 도구이다.

```bash
# 1. SDKMAN 설치
curl -s "https://get.sdkman.io" | bash

# 2. 터미널 재시작 또는 source 실행
source "$HOME/.sdkman/bin/sdkman-init.sh"

# 3. 사용 가능한 Java 버전 확인
sdk list java

# 4. OpenJDK 21 설치
sdk install java 21-open

# 5. 설치 확인
java -version
```

**SDKMAN의 장점:**
- 여러 JDK 버전을 동시에 설치하고 전환 가능
- `sdk use java 17-open` 명령으로 버전 전환

---

## 3. 환경변수 설정

### 3.1 JAVA_HOME이란?

`JAVA_HOME`은 JDK가 설치된 경로를 가리키는 환경변수이다.
일부 도구(Gradle, Maven 등)가 이 변수를 참조하여 JDK 위치를 찾는다.

### 3.2 환경변수 설정 방법

**WSL2 / Linux / macOS:**

```bash
# 1. 쉘 설정 파일 열기 (bash 사용 시)
nano ~/.bashrc

# 또는 zsh 사용 시
nano ~/.zshrc
```

다음 내용을 파일 맨 아래에 추가:

```bash
# Java 환경변수 설정
export JAVA_HOME=$(dirname $(dirname $(readlink -f $(which java))))
export PATH=$JAVA_HOME/bin:$PATH
```

설정 적용:

```bash
source ~/.bashrc  # 또는 source ~/.zshrc
```

확인:

```bash
echo $JAVA_HOME
# 출력 예: /usr/lib/jvm/java-21-openjdk-amd64
```

**Windows (시스템 환경변수):**

1. "시스템 환경 변수 편집" 검색하여 열기
2. "환경 변수" 버튼 클릭
3. "시스템 변수"에서 "새로 만들기" 클릭
   - 변수 이름: `JAVA_HOME`
   - 변수 값: `C:\Program Files\Eclipse Adoptium\jdk-21.x.x-hotspot` (설치 경로)
4. "Path" 변수 편집하여 `%JAVA_HOME%\bin` 추가

---

## 4. Cursor AI에서 Java 실행하기

### 4.1 기본 실행 방법

터미널에서 직접 컴파일하고 실행하는 방법이다.

**단일 파일 실행:**

```bash
# 1. Java 파일이 있는 디렉토리로 이동
cd material/chapters/chapter_01/src

# 2. 컴파일 (.java → .class)
javac Student.java

# 3. 실행
java Student
```

**패키지가 있는 경우:**

```bash
# 파일 구조 예시:
# src/
# └── class1/
#     └── ClassStart1.java

# 컴파일 (src 디렉토리에서)
javac -d out src/class1/ClassStart1.java

# 실행 (out 디렉토리의 클래스 사용)
java -cp out class1.ClassStart1
```

### 4.2 Java 11+ 단일 파일 실행 (간편 방법)

Java 11부터는 컴파일 없이 바로 실행할 수 있다:

```bash
# 컴파일 단계 생략하고 바로 실행
java Student.java
```

**제한사항:**
- 단일 파일만 가능
- 다른 클래스를 참조하는 경우 사용 불가

### 4.3 VS Code / Cursor 확장 프로그램

Cursor는 VS Code 기반이므로 Java 확장을 설치하면 편리하다.

**권장 확장 프로그램:**

1. **Extension Pack for Java** (Microsoft)
   - Java 개발에 필요한 확장 모음
   - 코드 자동완성, 디버깅, 테스트 지원

2. **Debugger for Java** (Microsoft)
   - 브레이크포인트, 변수 확인 등 디버깅 기능

**설치 방법:**
1. Cursor에서 `Ctrl+Shift+X` (확장 프로그램)
2. "Extension Pack for Java" 검색
3. 설치

**설치 후:**
- `.java` 파일에서 `Run` 버튼이 표시됨
- 클릭하면 자동으로 컴파일 및 실행

---

## 5. 설치 확인 체크리스트

다음 명령어들이 모두 정상 동작하는지 확인한다:

```bash
# Java 버전 확인 (21.x.x 이상)
java -version

# Java 컴파일러 버전 확인
javac -version

# JAVA_HOME 환경변수 확인 (선택)
echo $JAVA_HOME
```

**테스트 코드 실행:**

```bash
# 테스트 파일 생성
echo 'public class Hello { public static void main(String[] args) { System.out.println("Hello, Java!"); } }' > Hello.java

# 컴파일 및 실행
javac Hello.java
java Hello

# 예상 출력: Hello, Java!

# 정리
rm Hello.java Hello.class
```

---

## 6. 문제 해결

### 6.1 `java: command not found`

**원인:** Java가 설치되지 않았거나 PATH에 등록되지 않음

**해결:**
```bash
# 설치 여부 확인
which java

# 설치되어 있다면 PATH 확인
echo $PATH

# PATH에 Java 경로가 없다면 환경변수 설정 (3.2 참고)
```

### 6.2 `javac: command not found` (java는 됨)

**원인:** JRE만 설치되고 JDK가 설치되지 않음

**해결:**
```bash
# JDK 설치 (Ubuntu)
sudo apt install openjdk-21-jdk -y
```

### 6.3 버전이 21이 아닌 경우

**원인:** 다른 버전의 Java가 기본으로 설정됨

**해결 (Ubuntu):**
```bash
# 설치된 Java 버전 목록 확인
sudo update-alternatives --config java

# 원하는 버전 번호 선택
```

**해결 (SDKMAN):**
```bash
# 기본 버전 변경
sdk default java 21-open
```

### 6.4 Cursor에서 Java 확장이 JDK를 못 찾는 경우

**해결:**
1. `Ctrl+Shift+P` → "Java: Configure Java Runtime" 검색
2. JDK 경로 수동 지정

또는 `settings.json`에 추가:
```json
{
    "java.jdt.ls.java.home": "/usr/lib/jvm/java-21-openjdk-amd64"
}
```

---

## 7. 참고 자료

- [OpenJDK 공식 사이트](https://openjdk.org/)
- [Adoptium (Eclipse Temurin)](https://adoptium.net/)
- [SDKMAN](https://sdkman.io/)
- [VS Code Java 문서](https://code.visualstudio.com/docs/java/java-tutorial)

---
