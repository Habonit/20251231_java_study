package chapters.chapter_010_012.exercises.exercise_02;

/**
 * 주문 시스템 실행 클래스.
 *
 * 이 클래스는 수정하지 않아도 됩니다.
 * 위의 클래스들을 올바르게 구현하면 아래 코드가 정상 동작합니다.
 */
public class OrderMain {

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        int price = 10000;

        System.out.println("=== 주문 처리 ===");

        // 정률 할인 (10%)
        System.out.println("원래 가격: " + price + "원");
        int finalPrice1 = orderService.calculateFinalPrice("percent", price);
        System.out.println("정률 할인 적용 -> 최종 가격: " + finalPrice1 + "원");

        // 정액 할인 (1000원)
        System.out.println("원래 가격: " + price + "원");
        int finalPrice2 = orderService.calculateFinalPrice("fix", price);
        System.out.println("정액 할인 적용 -> 최종 가격: " + finalPrice2 + "원");

        // 할인 없음
        System.out.println("원래 가격: " + price + "원");
        int finalPrice3 = orderService.calculateFinalPrice("none", price);
        System.out.println("할인 없음 -> 최종 가격: " + finalPrice3 + "원");
    }
}
