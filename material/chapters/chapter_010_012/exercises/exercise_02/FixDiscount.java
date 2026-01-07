package chapters.chapter_010_012.exercises.exercise_02;

/**
 * 정액 할인 정책.
 *
 * 예: 1000원 할인 -> 어떤 가격이든 1000원 할인
 *
 * TODO: DiscountPolicy 인터페이스를 구현하세요
 * - 생성자에서 할인 금액을 받으세요
 * - discount 메서드에서 고정 할인 금액을 반환하세요
 */
public class FixDiscount implements DiscountPolicy {

    private int discountAmount;

    public FixDiscount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public int discount(int price) {
        return discountAmount;
    }

}
