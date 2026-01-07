package chapters.chapter_010_012.exercises.exercise_02;

/**
 * 할인 정책 저장소.
 *
 * 할인 타입에 따라 적절한 할인 정책 구현체를 반환한다.
 *
 * TODO: findDiscount 메서드를 완성하세요
 * - "percent" -> new PercentDiscount(10)
 * - "fix" -> new FixDiscount(1000)
 * - 그 외 -> new NoDiscount()
 *
 * 힌트: 이 클래스는 static 메서드만 가지므로 abstract로 선언하여
 *       객체 생성을 막을 수 있다
 */
public abstract class DiscountStore {

    /**
     * 할인 타입에 따른 할인 정책을 반환한다.
     *
     * @param type 할인 타입 ("percent", "fix", 그 외)
     * @return 해당하는 할인 정책 구현체
     */
    public static DiscountPolicy findDiscount(String type) {
        if ("percent".equals(type)) {
            return new PercentDiscount(10);
        } else if ("fix".equals(type)) {
            return new FixDiscount(1000);
        } else {
            return new NoDiscount();
        }
    }

}
