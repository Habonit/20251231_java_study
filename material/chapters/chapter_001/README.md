# 챕터 1: 클래스와 데이터

## 학습 목표

이 챕터에서는 Java의 핵심 개념인 **클래스**와 **객체**를 이해한다.

---

## 핵심 개념

### 1. 클래스가 필요한 이유

변수만 사용하면 관련 데이터를 묶어서 관리하기 어렵다.

```java
// 변수만 사용 - 학생 2명의 정보를 관리하려면?
String student1Name = "학생1";
int student1Age = 15;
int student1Grade = 90;

String student2Name = "학생2";
int student2Age = 16;
int student2Grade = 80;
```

배열을 사용해도 **개념적으로 묶이지 않는** 문제가 있다:

```java
// 배열 사용 - 데이터가 3개의 배열에 분산됨
String[] studentNames = {"학생1", "학생2"};
int[] studentAges = {15, 16};
int[] studentGrades = {90, 80};
```

**클래스**를 사용하면 관련 데이터를 하나의 타입으로 묶을 수 있다.

---

### 2. 클래스란?

클래스는 **사용자 정의 타입**이다. `int`, `String`처럼 새로운 타입을 직접 만드는 것이다.

```java
public class Student {
    String name;    // 멤버 변수 (필드)
    int age;
    int grade;
}
```

- **클래스**: 설계도, 틀
- **객체(인스턴스)**: 설계도를 기반으로 메모리에 생성된 실체

---

### 3. 객체 생성과 사용

```java
// 1. 변수 선언
Student student1;

// 2. 객체 생성 (new 키워드)
student1 = new Student();

// 3. 값 대입 (. 연산자로 접근)
student1.name = "학생1";
student1.age = 15;
student1.grade = 90;

// 4. 값 읽기
System.out.println(student1.name);  // "학생1"
```

---

### 4. 참조값 (Reference)

객체를 생성하면 메모리에 실체가 만들어지고, **참조값(주소)**이 반환된다.

```java
Student student1 = new Student();  // student1에는 참조값이 저장됨
Student student2 = student1;       // 같은 참조값 복사 → 같은 객체를 가리킴
```

> **"집은 하나인데 들어가는 문이 2개가 된 것이다."**
> - note.md에서 정리한 내용

---

### 5. 객체 배열

클래스 타입도 배열로 관리할 수 있다:

```java
Student[] students = new Student[2];
students[0] = student1;
students[1] = student2;

// 향상된 for문으로 순회
for (Student s : students) {
    System.out.println(s.name);
}
```

---

## note.md 질문 답변

| 질문 | 답변 |
|:-----|:-----|
| package란? | 클래스를 분류하는 폴더 개념. 5장에서 상세히 다룸 |
| public은 왜? | 접근 제어자. 다른 곳에서 접근 가능하게 함. 6장에서 상세히 다룸 |
| static은? | 클래스 레벨 소속. 7장에서 상세히 다룸 |
| void는? | 반환값이 없음을 의미 |
| 필드에 타입 지정? | Java는 정적 타입 언어라 반드시 타입 지정 필요 |
| System.out.println()? | 콘솔에 출력하는 메서드 |
| public static void main(String[] args)? | Java 프로그램의 시작점(entry point) |

---

## 연습 문제 구성

| 문제 | 난이도 | 주제 |
|:-----|:---:|:-----|
| exercise_01 | 기초 | 클래스 정의와 객체 생성 |
| exercise_02 | 응용 | 배열과 반복문 (for, 향상된 for) |
| exercise_03 | 심화 | 참조값 이해 |

---

## 실행 방법

```bash
# exercise_01 실행 예시
cd material/chapters/1/exercises/exercise_01
javac *.java
java Main
```
