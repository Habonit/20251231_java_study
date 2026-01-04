/**
 * 연습 문제 4: 유령 객체 방지를 위한 생성자 설계 - 실행 파일
 *
 * 실행 방법:
 * 1. exercise_04 디렉토리에서 실행
 * 2. javac *.java
 * 3. java Main
 *
 * 예상 출력:
 * === 필수값만으로 회원 생성 ===
 * 회원 생성: user1
 * ID: user1
 * 이름: 홍길동
 * 이메일: 미등록
 * 나이: 미등록
 * ---
 *
 * === 필수값 + 이메일로 회원 생성 ===
 * 회원 생성: user2
 * ID: user2
 * 이름: 김영희
 * 이메일: kim@email.com
 * 나이: 미등록
 * ---
 *
 * === 모든 정보로 회원 생성 ===
 * 회원 생성: user3
 * ID: user3
 * 이름: 박철수
 * 이메일: park@email.com
 * 나이: 30세
 * ---
 *
 * 핵심 포인트:
 * - 아래 코드는 컴파일 오류가 발생한다! (생성자를 직접 정의했으므로 기본 생성자가 없음)
 * - Member ghost = new Member();  // 컴파일 오류!
 * - 이로써 id와 name이 없는 "유령 회원"의 생성을 원천 차단할 수 있다
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== 필수값만으로 회원 생성 ===");
        Member member1 = new Member("user1", "홍길동");
        member1.displayInfo();

        System.out.println("=== 필수값 + 이메일로 회원 생성 ===");
        Member member2 = new Member("user2", "김영희", "kim@email.com");
        member2.displayInfo();

        System.out.println("=== 모든 정보로 회원 생성 ===");
        Member member3 = new Member("user3", "박철수", "park@email.com", 30);
        member3.displayInfo();

        // 아래 주석을 해제하면 컴파일 오류가 발생합니다!
        // 생성자를 직접 정의했으므로 기본 생성자가 자동 생성되지 않기 때문입니다.
        // Member ghost = new Member();  // 오류: no suitable constructor found
    }
}
