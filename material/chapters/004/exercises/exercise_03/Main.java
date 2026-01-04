
/**
 * 연습 문제 3: this()를 활용한 생성자 체이닝 - 실행 파일
 *
 * 실행 방법:
 * 1. exercise_03 디렉토리에서 실행
 * 2. javac *.java
 * 3. java Main
 *
 * 예상 출력:
 * === 기본 생성자 테스트 ===
 * 전체 생성자 호출: 미지정, 인턴, 2400만원
 * 이름: 미지정, 직급: 인턴, 연봉: 2400만원
 *
 * === name 생성자 테스트 ===
 * 전체 생성자 호출: 김철수, 사원, 3500만원
 * 이름: 김철수, 직급: 사원, 연봉: 3500만원
 *
 * === name, position 생성자 테스트 ===
 * 전체 생성자 호출: 이영희, 대리, 4000만원
 * 이름: 이영희, 직급: 대리, 연봉: 4000만원
 *
 * === 전체 생성자 테스트 ===
 * 전체 생성자 호출: 박지성, 과장, 6000만원
 * 이름: 박지성, 직급: 과장, 연봉: 6000만원
 *
 * 핵심 포인트:
 * - 모든 생성자 호출 시 "전체 생성자 호출"이 출력된다
 * - 이는 모든 생성자가 this()를 통해 전체 생성자를 호출하기 때문이다
 * - 이렇게 하면 실제 초기화 로직은 전체 생성자 한 곳에만 있으므로 중복이 제거된다
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== 기본 생성자 테스트 ===");
        Employee emp1 = new Employee();
        emp1.displayInfo();
        System.out.println();

        System.out.println("=== name 생성자 테스트 ===");
        Employee emp2 = new Employee("김철수");
        emp2.displayInfo();
        System.out.println();

        System.out.println("=== name, position 생성자 테스트 ===");
        Employee emp3 = new Employee("이영희", "대리");
        emp3.displayInfo();
        System.out.println();

        System.out.println("=== 전체 생성자 테스트 ===");
        Employee emp4 = new Employee("박지성", "과장", 6000);
        emp4.displayInfo();
    }
}
