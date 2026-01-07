# CLAUDE.md - Java 학습 프로젝트 가이드

이 문서는 Claude Code(AI 에이전트)가 이 프로젝트에서 작업할 때 참조하는 규칙과 가이드이다.

---

## 1. 프로젝트 개요

**목적**: Java 객체지향 프로그래밍 학습
**개발 환경**: Cursor AI (IntelliJ 대신 사용)
**강의 교안 위치**: `material/pdf/`

### 1.1 강의 교안 목록

| 챕터 | 파일명 |
|:-----|:-----|
| 000 | 0. 목차.pdf |
| 001 | 1. 클래스와 데이터.pdf |
| 002 | 2. 기본형과 참조형.pdf |
| 003 | 3. 객체 지향 프로그래밍.pdf |
| 004 | 4. 생성자.pdf |
| 005 | 5. 패키지.pdf |
| 006 | 6. 접근 제어자.pdf |
| 007 | 7. 자바 메모리 구조와 static.pdf |
| 008 | 8. final.pdf |
| 009 | 9. 상속.pdf |
| 010 | 10. 다형성1.pdf |
| 011 | 11. 다형성2.pdf |
| 012 | 12. 다형성과 설계.pdf |
| 013 | 13. 다음으로.pdf |

---

## 2. 개발 철학

### 2.1 핵심 원칙

1. **설명 중심의 코드 작성**: 주석과 README에 개념적인 내용을 **매우 상세하게** 설명한다
2. **학습 목적 우선**: 코드는 단순히 동작하는 것이 아니라, 학습자가 개념을 이해할 수 있도록 작성한다
3. **단계별 설명**: 복잡한 개념은 단계별로 나누어 설명한다

### 2.2 주석 작성 원칙

```java
// 좋은 예시 - 개념 설명이 포함된 주석
/**
 * 다형성(Polymorphism) 예제 클래스.
 *
 * 다형성이란?
 * - 하나의 객체가 여러 가지 타입을 가질 수 있는 것을 의미한다.
 * - 부모 타입의 참조 변수로 자식 타입의 객체를 참조할 수 있다.
 *
 * 왜 다형성을 사용하는가?
 * - 코드의 유연성과 확장성을 높일 수 있다.
 * - 새로운 클래스를 추가해도 기존 코드를 수정할 필요가 없다.
 */
public class PolymorphismExample {
    // ...
}
```

### 2.3 README 작성 원칙

각 챕터의 README는 다음 구조를 따른다:

1. **개념 설명**: 해당 챕터에서 다루는 핵심 개념
2. **왜 이것이 중요한가**: 실무에서의 활용 사례
3. **예제 코드 설명**: 예제가 무엇을 보여주는지 상세 설명
4. **연습 문제 안내**: TODO 문제 목록과 힌트

---

## 3. 챕터 학습 구조

### 3.1 디렉토리 구조

사용자가 특정 챕터의 연습문제나 개념 공부를 요청하면 다음 구조로 생성한다:

```
material/
├── pdf/                          # 강의 교안 PDF
│   ├── 0. 목차.pdf
│   ├── 1. 클래스와 데이터.pdf
│   └── ...
└── chapters/                     # 챕터별 학습 자료
    ├── chapter_001/              # 1. 클래스와 데이터
    │   ├── README.md             # 개념 설명 및 학습 가이드
    │   ├── src/                  # 예제 코드
    │   │   └── Example01.java
    │   └── exercises/            # 연습 문제
    │       ├── Exercise01.java   # TODO 주석으로 문제 제시
    │       └── Exercise02.java
    ├── chapter_002/              # 2. 기본형과 참조형
    │   └── ...
    └── ...
```

### 3.2 챕터 번호 규칙

PDF 파일명 앞의 숫자를 세 자리로 맞춰 폴더명으로 사용한다:

| PDF 파일 | 챕터 폴더 |
|:-----|:-----|
| 1. 클래스와 데이터.pdf | chapter_001/ |
| 2. 기본형과 참조형.pdf | chapter_002/ |
| 10. 다형성1.pdf | chapter_010/ |

### 3.3 연습 문제 작성 방식

연습 문제는 TODO 주석으로 작성한다:

```java
/**
 * 연습 문제 1: 클래스와 객체 생성
 *
 * 학습 목표:
 * - 클래스를 정의하는 방법을 익힌다
 * - 객체를 생성하고 사용하는 방법을 익힌다
 */
public class Exercise01 {

    // TODO: Student 클래스를 정의하세요
    // - name (String): 학생 이름
    // - age (int): 학생 나이
    // - grade (int): 학년

    // TODO: Student 객체를 생성하고 값을 설정하세요
    // - 이름: "홍길동"
    // - 나이: 20
    // - 학년: 2

    // TODO: 생성한 객체의 정보를 출력하세요
    // 예상 출력: "이름: 홍길동, 나이: 20, 학년: 2"

    public static void main(String[] args) {
        // 여기에 코드를 작성하세요
    }
}
```

### 3.4 연습 문제 구성 원칙

1. **해당 챕터의 핵심 개념**을 다룬다
2. **난이도를 점진적으로** 높인다 (기초 → 응용 → 심화)
3. **TODO 주석에 명확한 지시사항**을 포함한다
4. **예상 출력 또는 결과**를 명시한다

### 3.5 연습 문제 생성 시 note.md 참조

연습 문제를 생성할 때 **반드시** 해당 챕터의 `note.md`를 참조한다:

- **위치**: `material/chapters/{번호}/note.md`
- **참조 내용**:
  - 강의 내 질문: 학생이 궁금해했던 개념을 연습문제로 다룬다
  - 노트 작성: 학생이 정리한 내용을 기반으로 문제를 구성한다
- **템플릿**: `material/chapters/note_template.md` 참조

### 3.6 연습 문제 구조 권장사항

연습 문제는 **단일 스크립트가 아닌 패키지/모듈 구조**로 작성하는 것을 권장한다:

```
exercises/
├── exercise_01/                    # 연습 문제 1 (패키지 구조)
│   ├── Main.java                   # 메인 실행 파일
│   ├── Student.java                # 클래스 정의 파일
│   └── StudentManager.java         # 관련 기능 파일
├── exercise_02/
│   └── ...
└── Exercise03.java                 # 간단한 문제는 단일 파일도 허용
```

**권장 이유**:

1. **실무 구조 학습**: 실제 프로젝트처럼 여러 파일로 구성된 구조를 경험한다
2. **패키지 개념 익히기**: import, 접근 제어자 등을 자연스럽게 학습한다
3. **코드 분리 습관**: 책임 분리와 모듈화 개념을 체득한다

**적용 기준**:

| 문제 유형 | 권장 구조 |
|:-----|:-----|
| 단일 개념 확인 (1-2개 클래스) | 단일 파일 허용 |
| 여러 클래스 상호작용 | 패키지 구조 권장 |
| 심화 문제 | 패키지 구조 필수 |

---

## 4. 기반 규칙

이 프로젝트는 다음 문서의 규칙을 따른다:

| 문서 | 설명 |
|:-----|:-----|
| [docs/core/constitution.md](docs/core/constitution.md) | 프로젝트 전체 규칙 (Git, 코드 스타일, TDD 등) |
| [docs/core/ci_cd.md](docs/core/ci_cd.md) | CI/CD 워크플로우 |
| [docs/core/style.md](docs/core/style.md) | 문서 작성 스타일 가이드 |

### 4.1 Java 코드 스타일 요약

- **Java 버전**: 17+
- **들여쓰기**: 스페이스 4칸
- **라인 길이**: 최대 120자
- **네이밍**:
  - 클래스: PascalCase (예: `StudentService`)
  - 메서드/변수: camelCase (예: `findById`, `userName`)
  - 상수: UPPER_SNAKE_CASE (예: `MAX_COUNT`)
  - 패키지: lowercase (예: `com.example.service`)

### 4.2 주석/문서 언어 규칙

- **기본 언어**: 한글
- **영어 허용**: 기술 용어 (예: DataFrame, API, Exception 등)
- **Javadoc**: 모든 public 메서드에 작성

```java
/**
 * 사용자 ID로 사용자 정보 조회.
 *
 * @param userId 조회할 사용자 ID
 * @return 조회된 사용자 Entity
 * @throws UserNotFoundException 사용자가 존재하지 않을 경우
 */
public User findById(Long userId) {
    // ...
}
```

### 4.3 AI 에이전트 Git 작업 금지

Claude Code는 다음 Git 작업을 수행하지 않는다:

| 금지 작업 | 예시 |
|:-----|:-----|
| 커밋 생성 | `git commit` |
| 브랜치 생성/전환 | `git checkout`, `git branch` |
| 원격 저장소 작업 | `git push`, `git pull` |
| 스테이징 | `git add` |

**허용 작업**: 코드 작성/수정, 파일 생성, 테스트 실행, 빌드 실행, 문서 작성

---

## 5. 참조 문서

### 5.1 TDD 가이드

| 언어 | 문서 |
|:-----|:-----|
| Java | [docs/core/tdd_constitution_java.md](docs/core/tdd_constitution_java.md) |
| Python | [docs/core/tdd_constitution_python.md](docs/core/tdd_constitution_python.md) |
| TypeScript | [docs/core/tdd_constitution_typescript.md](docs/core/tdd_constitution_typescript.md) |
| JavaScript | [docs/core/tdd_constitution_javascript.md](docs/core/tdd_constitution_javascript.md) |
| Rust | [docs/core/tdd_constitution_rust.md](docs/core/tdd_constitution_rust.md) |

### 5.2 리뷰 가이드

| 시점 | 문서 |
|:-----|:-----|
| Push 전 | [docs/core/review_before_push.md](docs/core/review_before_push.md) |
| Main 머지 전 | [docs/core/review_before_merge.md](docs/core/review_before_merge.md) |

### 5.3 워크플로우 템플릿

| 언어 | 문서 |
|:-----|:-----|
| Java | [docs/core/workflow_template_java.yaml](docs/core/workflow_template_java.yaml) |
| Python | [docs/core/workflow_template_python.yaml](docs/core/workflow_template_python.yaml) |
| TypeScript | [docs/core/workflow_template_typescript.yaml](docs/core/workflow_template_typescript.yaml) |
| JavaScript | [docs/core/workflow_template_javascript.yaml](docs/core/workflow_template_javascript.yaml) |
| Rust | [docs/core/workflow_template_rust.yaml](docs/core/workflow_template_rust.yaml) |

---

## 6. 사용자 요청 처리 가이드

### 6.1 챕터 학습 요청 시

사용자가 특정 챕터에 대한 학습/연습 문제를 요청하면:

1. 해당 PDF 교안의 내용을 파악한다
2. `material/chapters/chapter_{3자리번호}/` 디렉토리 구조를 생성한다
3. README.md에 핵심 개념을 상세히 설명한다
4. exercises/에 TODO 형식의 연습 문제를 제공한다
5. src/에 참고할 수 있는 예제 코드를 제공한다

### 6.2 예시 요청과 응답

**요청**: "1. 클래스와 데이터 챕터 공부하게 해줘"

**응답 구조**:
```
material/chapters/chapter_001/
├── README.md                 # 클래스와 데이터 개념 설명
├── src/
│   ├── ClassExample.java     # 클래스 정의 예제
│   └── DataExample.java      # 데이터(필드) 예제
└── exercises/
    ├── Exercise01.java       # 기초: 클래스 정의하기
    ├── Exercise02.java       # 응용: 여러 객체 생성하기
    └── Exercise03.java       # 심화: 객체 간 상호작용
```

---

## 7. 개발 환경 설정

### 7.1 Cursor AI 사용 시 참고사항

- IntelliJ 기준 설명을 Cursor AI 환경에 맞게 적용한다
- 터미널에서 `javac`, `java` 명령어로 직접 컴파일/실행 가능
- Gradle 또는 Maven 빌드 도구 사용 가능

### 7.2 Java 실행 방법

```bash
# 단일 파일 컴파일 및 실행
javac Example.java
java Example

# 패키지가 있는 경우
javac -d out src/com/example/Main.java
java -cp out com.example.Main
```

---
