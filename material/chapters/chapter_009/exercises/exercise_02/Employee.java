package chapters.chapter09.exercises.exercise_02;

/**
 * 직원 부모 클래스.
 *
 * 핵심 포인트:
 * - 이 클래스는 기본 생성자(파라미터 없음)가 없다
 * - 따라서 자식 클래스에서 super()를 생략할 수 없다
 * - 자식 클래스는 반드시 super(name, salary)를 호출해야 한다
 */
public class Employee {

    // ==========================================================
    // TODO 1: 필드 선언
    // - name: String (protected)
    // - salary: int (protected)
    //
    // 힌트: protected를 사용하면 자식 클래스에서 직접 접근 가능
    // ==========================================================
    protected String name;
    protected int salary;

    // ==========================================================
    // TODO 2: 생성자 구현
    // - 매개변수: String name, int salary
    // - 필드 초기화
    // - "Employee 생성자 호출" 출력
    //
    // 주의: 기본 생성자를 만들지 않는다!
    //       자식 클래스가 반드시 super(name, salary)를 호출하도록 유도
    // ==========================================================
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Employee 생성자 호출");
    }

    // ==========================================================
    // TODO 3: getInfo() 메서드 구현
    // - 반환 타입: String
    // - 반환값: "이름: [name], 급여: [salary]원"
    //
    // 이 메서드는 자식 클래스에서 오버라이딩하여 추가 정보를 덧붙일 예정
    // ==========================================================
    public String getInfo() {
        return "이름: " + this.name + ", 급여: " + this.salary + "원";
    }
}
