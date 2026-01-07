package chapters.chapter_010_012.exercises.exercise_03;

/**
 * 로봇 공장 실행 클래스.
 *
 * 이 클래스는 수정하지 않아도 됩니다.
 * 위의 인터페이스와 클래스들을 올바르게 구현하면 아래 코드가 정상 동작합니다.
 *
 * 주목할 점:
 * - 같은 로봇 객체를 여러 인터페이스 타입으로 참조할 수 있다
 * - SuperRobot은 Walkable[], Flyable[], Swimmable[] 모두에 포함될 수 있다
 */
public class RobotMain {

    public static void main(String[] args) {
        // 로봇 생성
        GroundRobot groundRobot = new GroundRobot();
        AirRobot airRobot = new AirRobot();
        SeaRobot seaRobot = new SeaRobot();
        SuperRobot superRobot = new SuperRobot();

        // 다형적 참조: Walkable 타입으로 참조
        Walkable[] walkables = {groundRobot, airRobot, seaRobot, superRobot};

        // 다형적 참조: Flyable 타입으로 참조
        Flyable[] flyables = {airRobot, superRobot};

        // 다형적 참조: Swimmable 타입으로 참조
        Swimmable[] swimmables = {seaRobot, superRobot};

        // 걸을 수 있는 로봇들
        System.out.println("=== 걸을 수 있는 로봇들 ===");
        for (Walkable walkable : walkables) {
            walkable.walk();
        }

        // 비행 가능한 로봇들
        System.out.println("\n=== 비행 가능한 로봇들 ===");
        for (Flyable flyable : flyables) {
            flyable.fly();
        }

        // 수영 가능한 로봇들
        System.out.println("\n=== 수영 가능한 로봇들 ===");
        for (Swimmable swimmable : swimmables) {
            swimmable.swim();
        }
    }
}
