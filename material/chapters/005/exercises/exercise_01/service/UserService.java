package service;

// TODO 4: model 패키지의 User 클래스를 import 하세요
// 힌트: import 패키지명.클래스명;
import model.User;

/**
 * 연습 문제 1: package와 import 기본 사용법
 *
 * 이 클래스는 service 패키지에 속해 있습니다.
 * model 패키지의 User 클래스를 사용하려면 import가 필요합니다.
 *
 * package vs import 차이점:
 * - package: 현재 클래스가 어느 패키지에 속하는지 선언 (코드 첫 줄)
 * - import: 다른 패키지의 클래스를 가져와서 사용하겠다고 선언
 */
public class UserService {

    /**
     * TODO 5: User 객체를 생성하고 정보를 출력하는 메서드를 작성하세요
     *
     * 요구사항:
     * - User 객체 생성 (이름: "홍길동", 이메일: "hong@example.com")
     * - displayInfo() 메서드 호출
     *
     * 주의: import를 하지 않으면 User 클래스를 찾을 수 없습니다!
     */
    public void createUser() {
        // 여기에 코드를 작성하세요
        User user = new User("홍길동", "hong@example.com");
        user.displayInfo();
    }

    /**
     * TODO 6: import 없이 전체 경로로 User 객체를 생성하는 메서드를 작성하세요
     *
     * 요구사항:
     * - model.User 형태로 전체 경로를 사용해서 객체 생성
     * - 이름: "김철수", 이메일: "kim@example.com"
     *
     * 힌트: import 대신 패키지명.클래스명 형태로 직접 사용 가능
     */
    public void createUserWithFullPath() {
        // 여기에 코드를 작성하세요
        model.User user = new model.User("김철수", "kim@example.com");
        user.displayInfo();
    }
}
