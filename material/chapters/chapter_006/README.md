# 챕터 6: 접근 제어자

> 학습 날짜: 2026-01-05

## 핵심 개념

### 접근 제어자란?

클래스, 필드, 생성자, 메서드에 대한 외부 접근을 제어하는 키워드다.

### 접근 제어자 종류

| 접근 제어자 | 같은 클래스 | 같은 패키지 | 상속 관계 | 모든 곳 |
|:-----------|:----------:|:----------:|:--------:|:------:|
| `private` | O | X | X | X |
| `default` (생략) | O | O | X | X |
| `protected` | O | O | O | X |
| `public` | O | O | O | O |

- **private**: 모든 외부 호출을 막는다. 클래스 내부에서만 접근 가능.
- **default** (package-private): 같은 패키지 안에서의 호출만 허용한다.
- **protected**: 같은 패키지 + 상속 관계에서 허용한다.
- **public**: 모든 외부 호출을 허용한다.

### 핵심 원리

- 클래스 내의 메서드로 필드에 접근하는 것은 **내부 호출**이다.
- 적절한 제약이 있는 프로그램이 좋은 프로그램이다.

---

## 캡슐화 (Encapsulation)

데이터(필드)를 `private`으로 숨기고, `public` 메서드를 통해서만 접근하게 하는 것.

```java
public class Account {
    private int balance;  // 외부 직접 접근 차단

    public int getBalance() {  // 메서드를 통한 접근
        return balance;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

---

## 연습 문제

| 문제 | 설명 | 난이도 |
|:----|:----|:------|
| exercise_01 | 도서관 책 대출 시스템 (Book, Library) | 기초 |
| exercise_02 | 최대 카운터와 캡슐화 (MaxCounter) | 기초 |
| exercise_03 | 쇼핑 카트 (Item, ShoppingCart) | 응용 |

### 실행 방법

```bash
# exercise_01
cd exercises/exercise_01 && javac library/*.java && java library.LibraryMain

# exercise_02
cd exercises/exercise_02 && javac counter/*.java && java counter.CounterMain

# exercise_03
cd exercises/exercise_03 && javac cart/*.java && java cart.ShoppingCartMain
```
