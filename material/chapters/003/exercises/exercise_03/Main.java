/**
 * 연습 문제 3: 캡슐화 테스트
 *
 * 캡슐화의 장점:
 * 1. 데이터 보호: 잘못된 값이 들어가는 것을 방지
 * 2. 유지보수 용이: 내부 구현을 변경해도 외부에 영향 없음
 * 3. 사용 편의성: 복잡한 내부 로직을 숨기고 간단한 인터페이스 제공
 *
 * 예: 잔액을 직접 수정하면?
 * account.balance = -1000;  // 위험! 잔액이 음수가 됨
 *
 * 메서드를 통해 접근하면?
 * account.deposit(-1000);   // 메서드 내부에서 검증 후 거부
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== 은행 계좌 테스트 ===");

        // TODO: BankAccount 객체를 생성하세요


        System.out.println("계좌 생성 완료");

        // TODO: 10000원 입금


        // TODO: 현재 잔액 출력 (showStatus 메서드 사용)


        System.out.println();

        // TODO: 3000원 출금


        // TODO: 현재 잔액 출력


        System.out.println();

        // TODO: 10000원 출금 시도 (잔액 부족 상황)


        System.out.println();

        // TODO: 최종 잔액 출력
        // 힌트: "최종 잔액: " + account.getBalance() + "원"

    }
}
