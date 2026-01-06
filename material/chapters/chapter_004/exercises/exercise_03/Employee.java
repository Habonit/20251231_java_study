package chapters.chapter04.exercises.exercise_03;

/**
 * 연습 문제 3: this()를 활용한 생성자 체이닝
 *
 * 학습 목표:
 * - this()를 사용해 생성자 내부에서 다른 생성자를 호출할 수 있다
 * - this()를 사용해 생성자 간 중복 코드를 제거할 수 있다
 * - this()는 반드시 생성자 코드의 첫 줄에서만 사용할 수 있다는 규칙을 이해한다
 *
 * 배경 설명:
 * - this()는 같은 클래스 내의 다른 생성자를 호출한다
 * - 시그니처(매개변수의 타입, 개수, 순서)에 맞는 생성자를 찾아 호출한다
 * - this()는 생성자 코드의 첫 줄에서만 작성 가능하다!
 *
 * 중요 규칙:
 * - 아래 코드는 컴파일 오류 발생!
 *   public Employee(String name) {
 *       System.out.println("출력"); // 첫 줄이 아님!
 *       this(name, "신입", 3000);   // 오류!
 *   }
 */
public class Employee {

    // 멤버 변수
    String name;       // 이름
    String position;   // 직급
    int salary;        // 연봉 (만원)

    /**
     * TODO 1: 기본 생성자를 this()를 사용해 작성하세요.
     *
     * 요구사항:
     * - this()를 사용해 전체 생성자를 호출
     * - name은 "미지정", position은 "인턴", salary는 2400으로 설정
     *
     * 힌트:
     * - this("미지정", "인턴", 2400); 형태로 작성
     */
    Employee() {
        // TODO: this()를 사용해 전체 생성자를 호출하세요
        this("미지정", "인턴", 2400);
    }

    /**
     * TODO 2: name만 받는 생성자를 this()를 사용해 작성하세요.
     *
     * 요구사항:
     * - this()를 사용해 전체 생성자를 호출
     * - position은 "사원", salary는 3500으로 설정
     *
     * @param name 직원 이름
     */
    Employee(String name) {
        // TODO: this()를 사용해 전체 생성자를 호출하세요
        this(name, "사원", 3500);
    }

    /**
     * TODO 3: name과 position을 받는 생성자를 this()를 사용해 작성하세요.
     *
     * 요구사항:
     * - this()를 사용해 전체 생성자를 호출
     * - salary는 직급에 따라 다르게 설정:
     *   - "인턴": 2400
     *   - "사원": 3500
     *   - "대리": 4500
     *   - "과장": 5500
     *   - 그 외: 3000
     *
     * 힌트:
     * - 삼항 연산자나 if문으로 salary를 결정한 후 this() 호출
     * - this()는 첫 줄에서만 호출 가능하므로, salary 계산을 먼저 할 수 없다!
     * - 대신 별도의 private 메서드를 만들거나 직접 값을 전달해야 한다
     *
     * @param name     직원 이름
     * @param position 직급
     */
    Employee(String name, String position) {
        // TODO: this()를 사용해 전체 생성자를 호출하세요
        // 힌트: 직급별 기본 연봉을 계산하는 로직이 필요합니다
        // 간단히 하려면 일단 기본값 4000으로 설정해도 됩니다
        this(name, position, switch (position) {
            case "인턴" -> 2400;
            case "사원" -> 3500;
            case "대리" -> 4500;
            case "과장" -> 5500;
            default -> 3000;
        });
    }

    /**
     * 전체 생성자 - 모든 필드를 받는 생성자 (이미 구현됨)
     *
     * 이 생성자가 실제로 필드를 초기화하는 "메인 생성자" 역할을 한다.
     * 다른 생성자들은 this()를 통해 이 생성자를 호출한다.
     *
     * @param name     직원 이름
     * @param position 직급
     * @param salary   연봉 (만원)
     */
    Employee(String name, String position, int salary) {
        System.out.println("전체 생성자 호출: " + name + ", " + position + ", " + salary + "만원");
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    /**
     * 직원 정보를 출력하는 메서드 (이미 구현됨)
     */
    void displayInfo() {
        System.out.println("이름: " + name + ", 직급: " + position + ", 연봉: " + salary + "만원");
    }
}
