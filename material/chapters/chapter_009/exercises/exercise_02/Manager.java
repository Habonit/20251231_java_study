package chapters.chapter09.exercises.exercise_02;

/**
 * 매니저 클래스 - Employee를 상속받는 자식 클래스.
 *
 * 핵심 포인트:
 * - Employee에 기본 생성자가 없으므로 super(name, salary) 필수
 * - getInfo()를 오버라이딩하되, super.getInfo()를 활용하여 중복 제거
 */
public class Manager extends Employee/* TODO: Employee 상속 */ {

    // ==========================================================
    // TODO 1: Employee 클래스를 상속받도록 클래스 선언 수정
    // ==========================================================

    // ==========================================================
    // TODO 2: 필드 선언
    // - teamSize: int (private)
    // ==========================================================
    private int teamSize;

    // ==========================================================
    // TODO 3: 생성자 구현
    // - 매개변수: String name, int salary, int teamSize
    // - 첫 줄에 super(name, salary) 호출 (필수!)
    // - teamSize 필드 초기화
    // - "Manager 생성자 호출" 출력
    // ==========================================================
    public Manager(String name, int salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
        System.out.println("Manager 생성자 호출");
    }

    // ==========================================================
    // TODO 4: getInfo() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 반환값: super.getInfo() + ", 팀원: " + teamSize + "명"
    // ==========================================================
    @Override
    public String getInfo() {
        return super.getInfo() + ", 팀원: " + this.teamSize + "명";
    }
}
