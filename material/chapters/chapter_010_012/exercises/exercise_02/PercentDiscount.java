package chapters.chapter_010_012.exercises.exercise_02;

/**
 * 정률 할인 정책.
 *
 * 예: 10% 할인 -> 10000원 상품에서 1000원 할인
 *
 * TODO: DiscountPolicy 인터페이스를 구현하세요
 * - 생성자에서 할인 퍼센트를 받으세요
 * - discount 메서드에서 가격의 percent%를 반환하세요
 */
public class PercentDiscount implements DiscountPolicy {

    private int percent;

    public PercentDiscount(int percent) {
        this.percent = percent;
    }

    @Override
    public int discount(int price) {
        return price * percent / 100;
    }

}
