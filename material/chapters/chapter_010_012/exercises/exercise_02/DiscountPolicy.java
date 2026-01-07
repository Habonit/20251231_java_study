package chapters.chapter_010_012.exercises.exercise_02;

/**
 * 연습 문제 2: 할인 정책 시스템 리팩토링 (응용)
 *
 * ========================================
 * 학습 목표
 * ========================================
 * - OCP(Open-Closed Principle) 원칙을 이해하고 적용한다
 * - 새로운 기능 추가 시 기존 코드 수정을 최소화하는 설계를 익힌다
 * - 전략 패턴(Strategy Pattern)의 기초를 이해한다
 *
 * ========================================
 * 문제 설명
 * ========================================
 * 쇼핑몰에서 다양한 할인 정책을 적용하는 시스템을 개발하고 있다.
 * 현재 2가지 할인 정책(정률 할인, 정액 할인)이 있고,
 * 앞으로 VIP 할인, 첫 구매 할인 등 다양한 정책이 추가될 예정이다.
 *
 * 아래의 기존 코드는 새로운 할인 정책을 추가할 때마다
 * OrderService의 if-else 문을 수정해야 하는 문제가 있다.
 *
 * OCP 원칙을 적용하여 리팩토링하세요.
 *
 * ========================================
 * 기존 코드 (리팩토링 대상)
 * ========================================
 *
 * // PercentDiscount.java
 * public class PercentDiscount {
 *     private int percent;
 *     public PercentDiscount(int percent) { this.percent = percent; }
 *     public int discount(int price) {
 *         return price * percent / 100;
 *     }
 * }
 *
 * // FixDiscount.java
 * public class FixDiscount {
 *     private int discountAmount;
 *     public FixDiscount(int amount) { this.discountAmount = amount; }
 *     public int discount(int price) {
 *         return discountAmount;
 *     }
 * }
 *
 * // OrderService.java
 * public class OrderService {
 *     public int calculateFinalPrice(String discountType, int price) {
 *         int discountAmount;
 *         if (discountType.equals("percent")) {
 *             PercentDiscount discount = new PercentDiscount(10);
 *             discountAmount = discount.discount(price);
 *         } else if (discountType.equals("fix")) {
 *             FixDiscount discount = new FixDiscount(1000);
 *             discountAmount = discount.discount(price);
 *         } else {
 *             discountAmount = 0;
 *         }
 *         return price - discountAmount;
 *     }
 * }
 *
 * ========================================
 * 요구사항
 * ========================================
 * 1. DiscountPolicy 인터페이스를 완성하세요
 *    - discount(int price) 메서드를 선언하세요
 *
 * 2. 다음 구현체를 작성하세요
 *    - PercentDiscount: 정률 할인 (예: 10% 할인)
 *    - FixDiscount: 정액 할인 (예: 1000원 할인)
 *    - NoDiscount: 할인 없음 (항상 0 반환)
 *
 * 3. DiscountStore 클래스를 작성하세요
 *    - findDiscount(String type) 메서드로 할인 정책 반환
 *    - "percent" -> PercentDiscount(10)
 *    - "fix" -> FixDiscount(1000)
 *    - 그 외 -> NoDiscount
 *
 * 4. OrderService를 리팩토링하세요
 *    - if-else 없이 다형성을 활용하세요
 *    - 새로운 할인 정책이 추가되어도 OrderService는 수정하지 않아야 함
 *
 * ========================================
 * 실행 결과 (예상)
 * ========================================
 * === 주문 처리 ===
 * 원래 가격: 10000원
 * 정률 할인 적용 -> 최종 가격: 9000원
 * 원래 가격: 10000원
 * 정액 할인 적용 -> 최종 가격: 9000원
 * 원래 가격: 10000원
 * 할인 없음 -> 최종 가격: 10000원
 *
 * ========================================
 * 힌트
 * ========================================
 * - NoDiscount를 사용하면 null 체크를 피할 수 있다
 * - DiscountStore는 static 메서드로 구현해도 좋다
 * - OrderService는 구체적인 할인 정책이 아닌 DiscountPolicy에만 의존해야 한다
 */
public interface DiscountPolicy {

    /**
     * 할인 금액을 계산한다.
     *
     * @param price 원래 가격
     * @return 할인 금액
     */
    int discount(int price);

}
