package chapters.chapter_010_012.exercises.exercise_02;

/**
 * 주문 서비스.
 *
 * TODO: calculateFinalPrice 메서드를 리팩토링하세요
 * - if-else 없이 다형성을 활용하세요
 * - DiscountStore.findDiscount()를 사용하세요
 * - 새로운 할인 정책이 추가되어도 이 클래스는 수정하지 않아야 함
 *
 * 핵심 포인트:
 * - OrderService는 구체적인 할인 정책(PercentDiscount, FixDiscount)을 모른다
 * - OrderService는 오직 DiscountPolicy 인터페이스에만 의존한다
 * - 이것이 OCP(Open-Closed Principle)의 핵심이다
 */
public class OrderService {

    public int calculateFinalPrice(String discountType, int price) {
        // 1. DiscountStore에서 할인 정책을 찾는다
        DiscountPolicy discountPolicy = DiscountStore.findDiscount(discountType);

        // 2. 할인 정책의 discount() 메서드를 호출한다
        int discountAmount = discountPolicy.discount(price);

        // 3. 원래 가격에서 할인 금액을 뺀 최종 가격을 반환한다
        return price - discountAmount;
    }
}
