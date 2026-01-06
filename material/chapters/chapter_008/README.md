# 챕터 08: final

> 교안: `material/pdf/8. final.pdf`

---

## 핵심 개념

### 1. final 키워드란?

`final`은 이름 그대로 "끝"이라는 뜻이다. 변수에 `final` 키워드가 붙으면 **더는 값을 변경할 수 없다**.

```java
final int data = 10;
// data = 20;  // 컴파일 오류! 값 변경 불가
```

---

### 2. final 변수의 종류

#### 2.1 final 지역 변수

```java
// 선언과 동시에 초기화
final int data1 = 10;

// 선언 후 최초 1회 할당
final int data2;
data2 = 20;  // OK - 최초 할당
// data2 = 30;  // 컴파일 오류 - 재할당 불가
```

#### 2.2 final 매개변수

```java
public void process(final int value) {
    // value = 10;  // 컴파일 오류! 매개변수 값 변경 불가
    System.out.println(value);
}
```

#### 2.3 final 필드 (멤버 변수)

```java
public class Person {
    final String id;        // 생성자에서 초기화 필수
    final int code = 100;   // 필드에서 직접 초기화

    public Person(String id) {
        this.id = id;  // 생성자 초기화 - 인스턴스마다 다른 값 가능
    }
}
```

---

### 3. 상수 (Constant)

상수는 **변하지 않고, 항상 일정한 값**을 갖는 수를 말한다.
자바에서 상수는 `static final` 키워드를 사용한다.

#### 상수의 특징

| 특징 | 설명 |
|:-----|:-----|
| 키워드 | `static final` 사용 |
| 네이밍 | `SCREAMING_SNAKE_CASE` (대문자 + 언더스코어) |
| 접근 | 필드에 직접 접근 (`클래스명.상수명`) |
| 메모리 | static 영역에 단 하나만 존재 |

#### 상수 예시

```java
public class AppConstants {
    // 수학 상수
    public static final double PI = 3.14159;

    // 시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;

    // 애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;
    public static final String DEFAULT_LOCALE = "ko_KR";
}
```

#### 왜 상수에 static을 붙이는가?

```java
public class Example {
    final int value = 10;  // 인스턴스마다 같은 값이 중복 생성됨 (메모리 낭비)
    static final int CONSTANT = 10;  // static 영역에 단 하나만 존재 (효율적)
}
```

- `final` 필드만 사용하면: 모든 인스턴스가 같은 값을 가지지만, 각 인스턴스마다 메모리에 중복 저장됨
- `static final` 사용하면: JVM의 static 영역에 단 하나만 존재하여 메모리 효율적

---

### 4. final과 참조형 변수 (중요!)

#### 핵심 개념

- `final`을 **기본형 변수**에 사용하면 → **값**을 변경할 수 없다
- `final`을 **참조형 변수**에 사용하면 → **참조값(주소)**을 변경할 수 없다

#### 참조형 변수에서 final의 의미

```java
final Data data = new Data();

// 1. 참조값 변경 - 불가능!
// data = new Data();  // 컴파일 오류! 다른 객체를 참조할 수 없음

// 2. 참조 대상의 필드 변경 - 가능!
data.value = 10;  // OK
data.value = 20;  // OK
```

**핵심**: `final`은 변수가 담고 있는 값(참조형의 경우 주소)만 변경하지 못하게 막는다.
참조하고 있는 **객체 내부의 필드**는 해당 필드가 `final`이 아니라면 얼마든지 변경 가능하다.

#### 그림으로 이해하기

```
┌─────────────────┐          ┌─────────────────┐
│  final data     │          │   Data 객체     │
│  ┌───────────┐  │   참조   │  ┌───────────┐  │
│  │   x001    │──┼──────────┼─>│  value=10 │  │ <-- 이 값은 변경 가능!
│  └───────────┘  │          │  └───────────┘  │
│        ↑        │          └─────────────────┘
│   변경 불가!    │
└─────────────────┘
```

---

### 5. final 변수 네이밍 컨벤션

| 변수 종류 | 네이밍 규칙 | 예시 |
|:-----|:-----|:-----|
| `static final` (상수) | SCREAMING_SNAKE_CASE | `MAX_COUNT`, `DEFAULT_NAME` |
| `final` (일반) | camelCase | `userId`, `maxValue` |

```java
public class NamingExample {
    // 상수 - 대문자 + 언더스코어
    public static final int MAX_RETRY_COUNT = 3;

    // final 필드 - 일반 camelCase
    private final String memberId;

    public NamingExample(String memberId) {
        this.memberId = memberId;
    }
}
```

---

### 6. final의 실무 활용

#### 변경되면 안 되는 값 보호하기

```java
public class Member {
    private final String id;  // ID는 생성 후 변경 불가
    private String name;      // 이름은 변경 가능

    public Member(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeName(String name) {
        this.name = name;
    }

    // public void changeId(String id) {
    //     this.id = id;  // 컴파일 오류 발생! ID 변경 방지
    // }
}
```

---

## 연습 문제

| 번호 | 주제 | 난이도 |
|:-----|:-----|:-----|
| 01 | final 참조형 변수와 객체 내부 값 변경 | 기초~응용 |

---

## 핵심 정리

1. `final` 변수는 **최초 1회만 할당** 가능하다
2. **상수**는 `static final` 키워드를 사용하며, `SCREAMING_SNAKE_CASE`로 작명한다
3. **일반 final 변수**는 `camelCase`로 작명한다
4. `final` 참조형 변수는 **참조값(주소) 변경만 불가**하고, **참조 대상의 필드는 변경 가능**하다
5. 상수는 기능이 아니라 **고정된 값 자체**를 사용하는 것이 목적이다
