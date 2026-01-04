package model;

/**
 * 연습 문제 1: package와 import 기본 사용법
 *
 * 이 클래스는 model 패키지에 속해 있습니다.
 * 다른 패키지(service)에서 이 클래스를 사용하려면 import가 필요합니다.
 */
public class User {

    // TODO 1: 멤버 변수를 선언하세요
    // - name (String): 사용자 이름
    // - email (String): 이메일 주소
    String name;
    String email;

    // TODO 2: 모든 필드를 초기화하는 생성자를 작성하세요
    // 힌트: 다른 패키지에서 호출하려면 public이 필요합니다
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // TODO 3: 사용자 정보를 출력하는 displayInfo() 메서드를 작성하세요
    // 출력 형식: "사용자: {name}, 이메일: {email}"
    public void displayInfo() {
        System.out.println("사용자: " + name + ", 이메일: " + email);
    }
}
