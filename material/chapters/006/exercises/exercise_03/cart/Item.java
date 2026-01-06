package cart;

/**
 * 연습 문제 3: 쇼핑 카트 - Item 클래스
 *
 * 요구사항:
 * - 접근 제어자를 사용해서 데이터를 캡슐화하세요.
 * - 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
 */
public class Item {

    private String name;
    private int price;
    private int quantity;

    // TODO: 생성자를 작성하세요
    // - 매개변수: name, price, quantity
    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    // TODO: getName() 메서드를 작성하세요
    public String getName() {
        return this.name;
    }

    // TODO: getTotalPrice() 메서드를 작성하세요
    // - 상품의 총 가격(price * quantity)을 반환합니다.
    public int getTotalPrice() {
        return this.price * this.quantity;
    }
}
