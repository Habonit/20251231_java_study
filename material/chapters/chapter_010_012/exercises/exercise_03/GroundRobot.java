package chapters.chapter_010_012.exercises.exercise_03;

/**
 * 지상 로봇.
 *
 * 기능: 걷기만 가능
 *
 * TODO: Walkable 인터페이스를 구현하세요
 * - walk() 메서드에서 "지상 로봇이 걷습니다." 출력
 */
public class GroundRobot implements Walkable {

    @Override
    public void walk() {
        System.out.println("지상 로봇이 걷습니다.");
    }

}
