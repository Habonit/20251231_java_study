/**
 * 연습 문제 4: 유령 객체 방지를 위한 생성자 설계
 *
 * 학습 목표:
 * - 생성자를 통해 필수값 입력을 강제하는 방법을 이해한다
 * - 생성자가 없으면 기본 생성자가 자동 생성되어 "유령 객체"가 만들어질 수 있음을 이해한다
 * - 적절한 제약이 있는 프로그램이 좋은 프로그램임을 이해한다
 *
 * 문제 상황:
 * - 회원 시스템에서 id와 name은 반드시 있어야 하는 필수값이다
 * - 생성자 없이 기본 생성자만 사용하면 id와 name이 없는 "유령 회원"이 생길 수 있다
 * - 생성자를 통해 필수값 입력을 강제하면 컴파일 단계에서 문제를 방지할 수 있다
 *
 * 나쁜 예 (유령 회원 발생 가능):
 * ```
 * Member member = new Member();  // 기본 생성자로 생성
 * // id, name 설정을 까먹으면 유령 회원이 됨!
 * member.email = "test@test.com";
 * ```
 *
 * 좋은 예 (필수값 강제):
 * ```
 * Member member = new Member("user1", "홍길동");  // 필수값 반드시 입력
 * ```
 */
public class Member {

    // 멤버 변수
    String id;        // 회원 ID (필수)
    String name;      // 회원 이름 (필수)
    String email;     // 이메일 (선택)
    int age;          // 나이 (선택)

    /**
     * TODO 1: 필수값(id, name)만 받는 생성자를 작성하세요.
     *
     * 요구사항:
     * - id와 name은 필수값이므로 반드시 매개변수로 받아야 한다
     * - email은 기본값 "", age는 기본값 0으로 설정
     * - this()를 사용해 전체 생성자를 호출하는 방식으로 구현
     *
     * 핵심 포인트:
     * - 이 생성자가 있으면 new Member()로 유령 회원을 만들 수 없다!
     * - 기본 생성자가 자동 생성되지 않기 때문이다
     *
     * @param id   회원 ID (필수)
     * @param name 회원 이름 (필수)
     */
    // TODO: 필수값(id, name)만 받는 생성자를 작성하세요
    public Member(String id, String name) {
        this(id, name, "", 0);
    }


    /**
     * TODO 2: 필수값 + email을 받는 생성자를 작성하세요.
     *
     * 요구사항:
     * - id, name, email을 매개변수로 받는다
     * - age는 기본값 0으로 설정
     * - this()를 사용해 전체 생성자를 호출하는 방식으로 구현
     *
     * @param id    회원 ID (필수)
     * @param name  회원 이름 (필수)
     * @param email 이메일
     */
    // TODO: 필수값 + email을 받는 생성자를 작성하세요
    public Member(String id, String name, String email) {
        this(id, name, email, 0);
    }

    /**
     * TODO 3: 모든 필드를 받는 전체 생성자를 작성하세요.
     *
     * 요구사항:
     * - 모든 필드(id, name, email, age)를 매개변수로 받는다
     * - this 키워드를 사용해 멤버변수에 값을 할당
     * - "회원 생성: {id}"를 출력
     *
     * @param id    회원 ID (필수)
     * @param name  회원 이름 (필수)
     * @param email 이메일
     * @param age   나이
     */
    // TODO: 모든 필드를 받는 전체 생성자를 작성하세요
    public Member(String id, String name, String email, int age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        System.out.println("회원 생성: " + id);
    }

    /**
     * 회원 정보를 출력하는 메서드 (이미 구현됨)
     */
    void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("이름: " + name);
        System.out.println("이메일: " + (email.isEmpty() ? "미등록" : email));
        System.out.println("나이: " + (age == 0 ? "미등록" : age + "세"));
        System.out.println("---");
    }
}
