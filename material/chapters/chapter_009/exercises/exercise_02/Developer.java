package chapters.chapter09.exercises.exercise_02;

/**
 * 개발자 클래스 - Employee를 상속받는 자식 클래스.
 *
 * 핵심 포인트:
 * - Employee에 기본 생성자가 없으므로 super(name, salary) 필수
 * - getInfo()를 오버라이딩하되, super.getInfo()를 활용하여 중복 제거
 */
public class Developer extends Employee/* TODO: Employee 상속 */ {

    // ==========================================================
    // TODO 1: Employee 클래스를 상속받도록 클래스 선언 수정
    // ==========================================================

    // ==========================================================
    // TODO 2: 필드 선언
    // - programmingLanguage: String (private)
    // ==========================================================
    private String programmingLanguage;

    // ==========================================================
    // TODO 3: 생성자 구현
    // - 매개변수: String name, int salary, String programmingLanguage
    // - 첫 줄에 super(name, salary) 호출 (필수!)
    // - programmingLanguage 필드 초기화
    // - "Developer 생성자 호출" 출력
    //
    // 질문: super(name, salary)를 생략하면 어떻게 될까?
    // 답: 컴파일 오류! Employee에 기본 생성자가 없기 때문
    // ==========================================================
    public Developer(String name, int salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
        System.out.println("Developer 생성자 호출");
    }

    // ==========================================================
    // TODO 4: getInfo() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 반환값: super.getInfo() + ", 언어: " + programmingLanguage
    //
    // 포인트: 부모의 getInfo()를 재사용하여 코드 중복 제거
    // ==========================================================
    @Override
    public String getInfo() {
        return super.getInfo() + ", 언어: " + this.programmingLanguage;
    }
}
