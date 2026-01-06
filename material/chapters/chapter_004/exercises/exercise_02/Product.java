package chapters.chapter04.exercises.exercise_02;

/**
 * 연습 문제 2: 생성자와 오버로딩
 *
 * 학습 목표:
 * - 생성자의 특징을 이해한다 (클래스 이름과 동일, 반환 타입 없음)
 * - 생성자 오버로딩으로 다양한 객체 생성 방법을 제공할 수 있다
 * - 기본 생성자의 자동 생성 규칙을 이해한다
 *
 * 배경 설명:
 * - 생성자가 하나도 없으면 자바가 기본 생성자를 자동으로 만들어준다
 * - 생성자가 하나라도 있으면 기본 생성자는 자동으로 만들어지지 않는다
 * - 생성자도 메서드처럼 오버로딩이 가능하다
 */
public class Product {

    // 멤버 변수
    String name;      // 상품명
    int price;        // 가격
    int quantity;     // 수량

    /**
     * TODO 1: 기본 생성자를 작성하세요.
     *
     * 요구사항:
     * - name은 "Unknown", price는 0, quantity는 0으로 초기화
     * - "기본 생성자 호출"을 출력
     *
     * 힌트:
     * - 생성자 이름은 클래스 이름과 같아야 한다
     * - 생성자는 반환 타입이 없다
     */
    // TODO: 기본 생성자를 작성하세요
    public Product() {
        this("Unknown", 0, 0);
        System.out.println("기본 생성자 호출");
    }

    /**
     * TODO 2: name만 받는 생성자를 작성하세요.
     *
     * 요구사항:
     * - name은 매개변수로 받은 값, price는 1000, quantity는 1로 초기화
     * - "name 생성자 호출: {name}"을 출력
     *
     * @param name 상품명
     */
    // TODO: name만 받는 생성자를 작성하세요
    public Product(String name) {
        this(name, 1000, 1);
    }

    /**
     * TODO 3: name과 price를 받는 생성자를 작성하세요.
     *
     * 요구사항:
     * - name과 price는 매개변수로 받은 값, quantity는 1로 초기화
     * - "name, price 생성자 호출: {name}, {price}"를 출력
     *
     * @param name  상품명
     * @param price 가격
     */
    // TODO: name과 price를 받는 생성자를 작성하세요
    public Product(String name, int price) {
        this(name, price, 1);
    }

    /**
     * TODO 4: 모든 필드를 받는 생성자를 작성하세요.
     *
     * 요구사항:
     * - 모든 필드를 매개변수로 받은 값으로 초기화
     * - "전체 생성자 호출: {name}, {price}, {quantity}"를 출력
     *
     * @param name     상품명
     * @param price    가격
     * @param quantity 수량
     */
    // TODO: 모든 필드를 받는 생성자를 작성하세요
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        System.out.println("전체 생성자 호출: " + name + ", " + price + ", " + quantity);
    }

    /**
     * 상품 정보를 출력하는 메서드 (이미 구현됨)
     */
    void displayInfo() {
        System.out.println("상품명: " + name + ", 가격: " + price + "원, 수량: " + quantity + "개");
    }
}
