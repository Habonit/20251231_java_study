package chapters.chapter08.exercises.exercise_01;

/**
 * 연습 문제 01: final 참조형 변수와 객체 내부 값 변경.
 *
 * 학습 목표:
 * - final 참조형 변수의 특성을 이해한다
 * - 참조값 변경 불가와 참조 대상의 필드 변경 가능의 차이를 구분한다
 *
 * 핵심 개념:
 * - final 참조형 변수는 "다른 객체를 참조하는 것"만 막는다
 * - 참조하고 있는 객체 내부의 필드가 final이 아니라면 변경 가능하다
 */
public class Main {

    public static void main(String[] args) {

        // ===========================================
        // TODO 1: Person 객체 생성
        // ===========================================
        // - 이름: "홍길동"
        // - 주소: city="서울시", district="강남구"
        // 힌트: Address 객체를 먼저 생성한 후, Person 생성자에 전달한다
        Address address = new Address("서울시", "강남구");
        Person person = new Person("홍길동", address);




        // ===========================================
        // TODO 2: 생성한 Person 정보 출력
        // ===========================================
        // - printInfo() 메서드를 사용하여 정보를 출력한다
        // 예상 출력:
        //   이름: 홍길동
        //   주소: 서울시 강남구

        System.out.println("=== Person 생성 ===");
        person.printInfo();

        // ===========================================
        // TODO 3: Address 내부 값 변경 시도
        // ===========================================
        // - person.address.city 를 "부산시"로 변경
        // - person.address.district 를 "해운대구"로 변경
        // - 변경 후 다시 printInfo()로 출력하여 변경되었는지 확인
        //
        // 질문: final Address address 인데 왜 내부 값이 변경될까?
        // 답: final은 참조값(주소)만 변경 못하게 막고, 참조 대상의 필드는 막지 않는다

        System.out.println();
        System.out.println("=== Address 내부 값 변경 시도 ===");
        person.address.city = "부산시";
        person.address.district = "해운대구";
        person.printInfo();


        // ===========================================
        // TODO 4: 새 Address 객체 할당 시도 (주석으로 작성)
        // ===========================================
        // - 아래 주석을 해제하면 컴파일 오류가 발생한다
        // - 왜 오류가 발생하는지 이해하고, 주석으로 설명을 작성하세요

        System.out.println();
        System.out.println("=== 새 Address 객체 할당 시도 ===");

        // 아래 코드의 주석을 해제하고 컴파일해보세요.
        // 그 후 왜 오류가 발생하는지 주석으로 설명을 작성하세요.

        // person.address = new Address("대구시", "수성구");
        // 오류 이유:

        System.out.println("// person.address = new Address(...);");
        System.out.println("// -> 컴파일 오류! final 참조형 변수는 다른 객체를 참조할 수 없음");
    }
}
