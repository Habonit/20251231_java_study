package chapters.chapter_010_012.exercises.exercise_03;

/**
 * 슈퍼 로봇.
 *
 * 기능: 비행 + 수영 + 걷기 (모든 인터페이스 구현)
 *
 * TODO: Flyable, Swimmable, Walkable 인터페이스를 모두 구현하세요
 * - fly() 메서드에서 "슈퍼 로봇이 비행합니다." 출력
 * - swim() 메서드에서 "슈퍼 로봇이 수영합니다." 출력
 * - walk() 메서드에서 "슈퍼 로봇이 걷습니다." 출력
 *
 * 포인트:
 * - 하나의 클래스가 3개의 인터페이스를 동시에 구현할 수 있다
 * - 이것이 인터페이스의 강력한 장점이다
 */
public class SuperRobot implements Flyable, Swimmable, Walkable {

    @Override
    public void fly() {
        System.out.println("슈퍼 로봇이 비행합니다.");
    }

    @Override
    public void swim() {
        System.out.println("슈퍼 로봇이 수영합니다.");
    }

    @Override
    public void walk() {
        System.out.println("슈퍼 로봇이 걷습니다.");
    }

}
