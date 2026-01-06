# 연습 문제 3: 캡슐화 - 데이터와 기능 묶기

## 난이도: 응용

## 학습 목표

- 캡슐화(Encapsulation)의 개념을 이해한다
- 모듈화와 캡슐화의 차이를 이해한다
- 객체가 자신의 데이터를 스스로 관리하는 구조를 구현한다

---

## 핵심 개념

### 캡슐화 vs 모듈화

| 구분 | 캡슐화 (Encapsulation) | 모듈화 (Modularization) |
|:-----|:-----|:-----|
| 정의 | 데이터 + 기능을 하나로 묶음 | 코드를 독립적인 단위로 분리 |
| 목적 | 데이터 보호, 객체 자율성 | 코드 재사용, 유지보수 용이 |
| 단위 | 클래스 (객체) | 함수, 클래스, 패키지, 모듈 |
| 예시 | `BankAccount` 클래스가 잔액을 스스로 관리 | `MathUtils` 클래스에 수학 함수들 모음 |

### 캡슐화의 핵심

```java
// 캡슐화 적용
public class BankAccount {
    private int balance;  // 데이터 숨김
    
    public void deposit(int amount) {  // 기능으로 접근
        if (amount > 0) {
            balance += amount;
        }
    }
    
    public int getBalance() {
        return balance;
    }
}

// 외부에서 직접 접근 불가
account.balance = -1000;  // 에러! private이라 접근 불가
account.deposit(1000);    // OK! 메서드를 통해 안전하게 접근
```

---

## 문제 설명

은행 계좌를 관리하는 `BankAccount` 클래스를 구현하라.
캡슐화를 적용하여 데이터를 보호하고, 메서드를 통해서만 접근하도록 하라.

---

## 요구 사항

1. `BankAccount.java`에 `BankAccount` 클래스를 정의하라
   - balance (int): 잔액 (0으로 초기화)
   - deposit(int amount): 입금 (양수만 허용)
   - withdraw(int amount): 출금 (잔액 부족 시 실패)
   - getBalance(): 잔액 조회
   - showStatus(): 계좌 상태 출력

2. `Main.java`에서 BankAccount 객체를 사용하라
   - 10000원 입금
   - 3000원 출금
   - 잔액 확인
   - 10000원 출금 시도 (잔액 부족)

---

## 예상 출력

```
=== 은행 계좌 테스트 ===
계좌 생성 완료
10000원 입금 완료
현재 잔액: 10000원

3000원 출금 완료
현재 잔액: 7000원

10000원 출금 시도...
잔액이 부족합니다. (현재 잔액: 7000원)

최종 잔액: 7000원
```

---

## 힌트

- 잔액(balance)은 외부에서 직접 수정하지 못하게 해야 함 (추후 private 사용)
- 입금/출금은 반드시 메서드를 통해서만 가능하도록
- 잘못된 입력(음수, 잔액 초과)에 대한 검증 로직 포함
