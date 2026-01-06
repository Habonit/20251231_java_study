# 챕터 4: 생성자

> 학습 날짜: 2026-01-04

## 핵심 개념

### 생성자란?

객체가 생성될 때 자동으로 호출되는 특별한 메서드. 객체 초기화를 담당한다.

```java
public class Member {
    String name;
    int age;

    // 생성자: 클래스 이름과 동일
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// 사용
Member member = new Member("홍길동", 20);
```

### 생성자의 장점

- **유령 회원 문제 방지**: 필수 데이터 없이 객체가 생성되는 것을 막는다.
- **컴파일 단계에서 오류 감지**: 잘못된 객체 생성을 미리 잡아준다.

---

## this 키워드

현재 인스턴스 자신을 가리킨다.

```java
public Member(String name, int age) {
    this.name = name;   // this.name은 멤버 변수
    this.age = age;     // name은 매개변수
}
```

- `this`는 스코프에 따라 생략 가능하지만, 명시적으로 적는 코딩 스타일도 있다.

---

## 기본 생성자

- 생성자가 하나도 없으면 자바가 **기본 생성자**를 자동으로 만든다.
- 생성자가 하나라도 있으면 기본 생성자를 만들지 않는다.

```java
public class Data {
    int value;
    // 생성자가 없으면 자바가 자동으로 Data() {} 생성
}
```

---

## this() - 생성자 체이닝

같은 클래스 내의 다른 생성자를 호출할 때 사용한다.

```java
public class Member {
    String name;
    int age;

    public Member(String name) {
        this(name, 0);  // 다른 생성자 호출
    }

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

- `this()`는 반드시 생성자의 **첫 줄**에서만 호출 가능하다.
- 시그니처(매개변수 타입, 개수, 순서)로 호출할 생성자를 결정한다.

---

## 배열로 객체 생성

```java
Member[] members = {
    new Member("홍길동", 20),
    new Member("김철수", 25)
};
```
