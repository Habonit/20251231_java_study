package chapters.chapter09.exercises.exercise_02;

/**
 * 연습 문제 02: super 생성자와 초기화 순서 - 실행 클래스.
 *
 * Employee.java, Developer.java, Manager.java의 TODO를 모두 완성한 후 실행하세요.
 *
 * 예상 출력:
 * =============
 * === Developer 생성 ===
 * Employee 생성자 호출
 * Developer 생성자 호출
 *
 * === Manager 생성 ===
 * Employee 생성자 호출
 * Manager 생성자 호출
 *
 * === 직원 정보 출력 ===
 * 이름: 김개발, 급여: 5000원, 언어: Java
 * 이름: 박매니저, 급여: 6000원, 팀원: 5명
 * =============
 *
 * 주목할 점:
 * - 생성자 호출 순서: Employee(부모) -> Developer/Manager(자식)
 * - 이유: 자식 생성자 첫 줄에서 super()로 부모 생성자를 호출하기 때문
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== Developer 생성 ===");

        // Developer 인스턴스 생성
        // 생성자 호출 순서:
        // 1. Developer 생성자 진입
        // 2. super(name, salary) 호출 -> Employee 생성자 실행
        // 3. Employee 생성자 완료 -> Developer 생성자 나머지 실행
        Developer dev = new Developer("김개발", 5000, "Java");

        System.out.println();
        System.out.println("=== Manager 생성 ===");

        // Manager 인스턴스 생성
        Manager mgr = new Manager("박매니저", 6000, 5);

        System.out.println();
        System.out.println("=== 직원 정보 출력 ===");

        // getInfo() 호출 - 오버라이딩된 메서드 실행
        // super.getInfo()를 활용하여 부모의 정보에 자식 고유 정보를 추가
        System.out.println(dev.getInfo());
        System.out.println(mgr.getInfo());
    }
}
