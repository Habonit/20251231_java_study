/**
 * 연습 문제 3: BankAccount 클래스 정의
 *
 * 캡슐화(Encapsulation)란?
 * - 데이터(속성)와 기능(메서드)을 하나의 단위(클래스)로 묶는 것
 * - 데이터를 직접 접근하지 못하게 숨기고, 메서드를 통해서만 접근
 * - "객체가 자신의 데이터를 스스로 관리"
 *
 * 모듈화(Modularization)와의 차이:
 * - 모듈화: 코드를 독립적인 단위로 분리 (함수, 클래스, 패키지 등)
 * - 캡슐화: 데이터 + 기능을 하나로 묶고, 데이터를 보호
 * - 캡슐화는 모듈화의 한 형태이면서, 데이터 보호에 초점
 *
 * 예시:
 * - 모듈화: MathUtils 클래스에 수학 함수들 모음 (데이터 없음)
 * - 캡슐화: BankAccount 클래스가 잔액을 가지고 스스로 관리 (데이터 + 기능)
 */
public class BankAccount {

    // TODO: 멤버 변수를 정의하세요
    // - balance (int): 잔액 (초기값 0)


    /**
     * 입금 메서드.
     *
     * @param amount 입금할 금액
     */
    // TODO: deposit 메서드를 정의하세요
    // - amount가 0보다 크면 balance에 더하고 "입금 완료" 출력
    // - amount가 0 이하면 "잘못된 금액입니다" 출력


    /**
     * 출금 메서드.
     *
     * @param amount 출금할 금액
     */
    // TODO: withdraw 메서드를 정의하세요
    // - balance >= amount 이면 출금하고 "출금 완료" 출력
    // - balance < amount 이면 "잔액이 부족합니다" 출력


    /**
     * 잔액 조회 메서드.
     *
     * @return 현재 잔액
     */
    // TODO: getBalance 메서드를 정의하세요
    // - balance 값을 반환


    /**
     * 계좌 상태 출력 메서드.
     */
    // TODO: showStatus 메서드를 정의하세요
    // - "현재 잔액: {balance}원" 출력

}
