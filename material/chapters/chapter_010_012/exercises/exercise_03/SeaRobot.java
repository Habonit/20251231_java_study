package chapters.chapter_010_012.exercises.exercise_03;

/**
 * 씨 로봇 (바다 로봇).
 *
 * 기능: 수영 + 걷기 (다중 인터페이스 구현)
 *
 * TODO: Swimmable, Walkable 인터페이스를 모두 구현하세요
 * - swim() 메서드에서 "씨 로봇이 수영합니다." 출력
 * - walk() 메서드에서 "씨 로봇이 걷습니다." 출력
 */
public class SeaRobot implements Swimmable, Walkable {

    @Override
    public void swim() {
        System.out.println("씨 로봇이 수영합니다.");
    }

    @Override
    public void walk() {
        System.out.println("씨 로봇이 걷습니다.");
    }

}
