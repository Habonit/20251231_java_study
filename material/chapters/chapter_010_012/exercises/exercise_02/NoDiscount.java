package chapters.chapter_010_012.exercises.exercise_02;

/**
 * 할인 없음 정책.
 *
 * 할인 정책을 찾지 못했을 때 사용한다.
 * null 대신 이 객체를 사용하면 null 체크를 피할 수 있다.
 *
 * TODO: DiscountPolicy 인터페이스를 구현하세요
 * - discount 메서드에서 항상 0을 반환하세요
 */
public class NoDiscount implements DiscountPolicy {

    @Override
    public int discount(int price) {
        return 0;
    }

}
