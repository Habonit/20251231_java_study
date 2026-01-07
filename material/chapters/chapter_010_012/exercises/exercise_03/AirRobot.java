package chapters.chapter_010_012.exercises.exercise_03;

/**
 * 에어 로봇.
 *
 * 기능: 비행 + 걷기 (다중 인터페이스 구현)
 *
 * TODO: Flyable, Walkable 인터페이스를 모두 구현하세요
 * - fly() 메서드에서 "에어 로봇이 비행합니다." 출력
 * - walk() 메서드에서 "에어 로봇이 걷습니다." 출력
 *
 * 힌트: implements Flyable, Walkable
 */
public class AirRobot implements Flyable, Walkable {

    @Override
    public void fly() {
        System.out.println("에어 로봇이 비행합니다.");
    }

    @Override
    public void walk() {
        System.out.println("에어 로봇이 걷습니다.");
    }

}
