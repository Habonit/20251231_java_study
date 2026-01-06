# 챕터 09: 상속

> 교안: `material/pdf/9. 상속.pdf`

---

## 핵심 개념

### 1. 상속이란?

상속(Inheritance)은 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해준다.
기존 클래스의 속성과 기능을 그대로 물려받는 것이다.

```java
public class 자식클래스 extends 부모클래스 {
    // 자식 클래스의 고유 기능
}
```

---

### 2. 용어 정리

| 용어 | 다른 표현 | 설명 |
|:-----|:-----|:-----|
| 부모 클래스 | 슈퍼 클래스 (Super Class) | 상속을 통해 자신의 필드와 메서드를 다른 클래스에 제공 |
| 자식 클래스 | 서브 클래스 (Sub Class) | 부모 클래스로부터 필드와 메서드를 상속받음 |

**핵심**: 부모 클래스는 자식에 대한 정보가 없다. 자식 클래스만 `extends`를 통해 부모를 알고 있다.

---

### 3. 단일 상속

자바는 **다중 상속을 지원하지 않는다**. `extends` 대상은 **하나만** 선택할 수 있다.

```java
// 불가능! 다중 상속
public class Child extends ParentA, ParentB { }  // 컴파일 오류

// 가능! 단일 상속
public class Child extends Parent { }
```

**다이아몬드 문제**: 다중 상속 시 동일한 메서드가 여러 부모에 있으면 어떤 것을 호출할지 모호해지는 문제

---

### 4. 상속과 메모리 구조 (매우 중요!)

```java
ElectricCar electricCar = new ElectricCar();
```

자식 클래스를 인스턴스화하면, **부모와 자식 모두** 힙 메모리에 생성된다.

```
┌─────────────────────────┐
│         x001            │
│  ┌───────────────────┐  │
│  │       Car         │  │  <- 부모 클래스
│  │  + move()         │  │
│  └───────────────────┘  │
│  ┌───────────────────┐  │
│  │   ElectricCar     │  │  <- 자식 클래스
│  │  + charge()       │  │
│  └───────────────────┘  │
└─────────────────────────┘
```

**메서드 호출 규칙**:
1. 호출한 변수의 타입(클래스)에서 먼저 찾는다
2. 현재 타입에서 기능을 찾지 못하면 **상위 부모 타입으로 거슬러 올라간다**
3. 계속 찾아도 없으면 컴파일 오류 발생

---

### 5. 메서드 오버라이딩 (Overriding)

부모에게서 상속받은 기능을 자식이 **재정의**하는 것을 메서드 오버라이딩이라 한다.

```java
public class Car {
    public void move() {
        System.out.println("차를 이동합니다.");
    }
}

public class ElectricCar extends Car {
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }
}
```

#### @Override 어노테이션

- 상위 클래스의 메서드를 오버라이드하는 것임을 나타냄
- 컴파일러가 오버라이딩 조건을 확인하여 실수 방지
- **필수는 아니지만 관례로 반드시 붙여야 함**

#### 오버라이딩 불가능한 메서드

| 키워드 | 이유 |
|:-----|:-----|
| `static` | 클래스 레벨에서 작동하므로 인스턴스 레벨 오버라이딩 의미 없음 |
| `final` | 재정의 금지 |
| `private` | 해당 클래스에서만 접근 가능, 하위 클래스에서 보이지 않음 |

---

### 6. 오버로딩 vs 오버라이딩

| 구분 | 오버로딩 (Overloading) | 오버라이딩 (Overriding) |
|:-----|:-----|:-----|
| 의미 | 같은 이름, 다른 매개변수의 메서드 정의 | 부모 메서드를 자식이 재정의 |
| 관계 | 같은 클래스 내 | 상속 관계 |
| 메서드 이름 | 같음 | 같음 |
| 매개변수 | 다름 | 같음 |
| 반환 타입 | 상관없음 | 같음 |

---

### 7. super - 부모 참조

`super` 키워드를 사용하면 부모 클래스의 필드나 메서드에 접근할 수 있다.

```java
public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        // this는 자기 자신 참조 (생략 가능)
        System.out.println("this.value = " + this.value);   // child

        // super는 부모 클래스 참조
        System.out.println("super.value = " + super.value); // parent

        this.hello();   // Child.hello
        super.hello();  // Parent.hello
    }
}
```

---

### 8. super() - 부모 생성자 호출

상속 관계에서 자식 클래스의 생성자는 **반드시 부모 클래스의 생성자를 호출**해야 한다.

```java
public class Parent {
    public Parent(String name) {
        System.out.println("Parent 생성자: " + name);
    }
}

public class Child extends Parent {
    public Child() {
        super("홍길동");  // 부모 생성자 호출 (첫 줄에 위치해야 함)
        System.out.println("Child 생성자");
    }
}
```

#### 규칙

1. 자식 생성자의 **첫 줄**에 `super(...)`를 호출해야 한다
2. 부모의 **기본 생성자**(파라미터 없음)인 경우 `super()` 생략 가능
3. 생성자 실행 순서: **부모 -> 자식** (최상위 부모부터 초기화)

```java
// 기본 생성자일 경우 super() 생략 가능
public class Child extends Parent {
    public Child() {
        // super();  <- 자동으로 추가됨 (부모가 기본 생성자일 때만)
        System.out.println("Child 생성자");
    }
}
```

---

### 9. 클래스/메서드와 final

| 대상 | 효과 |
|:-----|:-----|
| `final class` | 상속 불가 (확장 끝!) |
| `final method` | 오버라이딩 불가 (재정의 끝!) |

```java
// 상속 불가
public final class FinalClass {
    // ...
}

// 오버라이딩 불가
public class Parent {
    public final void cannotOverride() {
        // ...
    }
}
```

---

## 연습 문제

| 번호 | 주제 | 난이도 |
|:-----|:-----|:-----|
| 01 | 상속 기본과 메서드 오버라이딩 | 기초 |
| 02 | super 생성자와 초기화 순서 | 응용 |

---

## 핵심 정리

1. **상속**은 `extends` 키워드를 사용하며, 부모는 **하나만** 선택 가능 (단일 상속)
2. 자식 인스턴스 생성 시 **부모와 자식 모두** 힙 메모리에 생성된다
3. 메서드가 겹치면 **자식 클래스 것**을 먼저 사용 (현재 타입에서 찾고 없으면 상위로)
4. **@Override** 어노테이션은 관례로 반드시 붙여야 한다
5. `static`, `final`, `private` 메서드는 **오버라이딩 불가**
6. `super.필드`, `super.메서드()`로 부모 클래스 접근 가능
7. `super()`는 부모의 **기본 생성자**일 때만 생략 가능
8. 생성자 초기화는 **부모부터** 진행된다 (자식 생성자 첫 줄에 부모 생성자 호출)
