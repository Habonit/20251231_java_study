package chapters.chapter05.exercises.exercise_01;

// TODO 7: 이 파일은 기본 패키지(default package)에 있습니다.
// package 선언이 없으면 기본 패키지에 속합니다.

// TODO 8: 필요한 클래스들을 import 하세요
// - model.User
// - service.UserService
import chapters.chapter05.exercises.exercise_01.model.User;
import chapters.chapter05.exercises.exercise_01.service.UserService;

/**
 * 연습 문제 1: package와 import 기본 사용법
 *
 * 학습 목표:
 * - package 선언의 의미를 이해한다
 * - import를 사용해 다른 패키지의 클래스를 가져올 수 있다
 * - import 없이 전체 경로로 클래스를 사용할 수 있다
 *
 * 핵심 개념:
 * - package: "이 클래스는 여기에 있다"고 선언 (주소 등록)
 * - import: "저기 있는 클래스를 가져와 쓰겠다"고 선언 (주소 참조)
 *
 * 예상 출력:
 * === UserService 테스트 ===
 * 사용자: 홍길동, 이메일: hong@example.com
 * 사용자: 김철수, 이메일: kim@example.com
 * === 직접 User 생성 ===
 * 사용자: 이영희, 이메일: lee@example.com
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== UserService 테스트 ===");

        // TODO 9: UserService 객체를 생성하고 메서드들을 호출하세요
        // - createUser() 호출
        // - createUserWithFullPath() 호출
        UserService userService = new UserService();
        userService.createUser();
        userService.createUserWithFullPath();

        System.out.println("=== 직접 User 생성 ===");

        // TODO 10: Main에서 직접 User 객체를 생성하세요
        // - 이름: "이영희", 이메일: "lee@example.com"
        // - displayInfo() 호출
        User user = new User("이영희", "lee@example.com");
        user.displayInfo();
    }
}
