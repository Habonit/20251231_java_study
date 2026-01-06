package cart;

/**
 * 연습 문제 3: 쇼핑 카트 - ShoppingCart 클래스
 *
 * 요구사항:
 * - 접근 제어자를 사용해서 데이터를 캡슐화하세요.
 * - 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
 * - 장바구니에는 상품을 최대 10가지만 담을 수 있습니다.
 */
public class ShoppingCart {

    private static final int MAX_ITEM_COUNT = 10;
    private Item[] items = new Item[ShoppingCart.MAX_ITEM_COUNT];
    private int itemCount;

    // TODO: addItem(Item item) 메서드를 작성하세요
    // - 장바구니에 상품을 추가합니다.
    // - 10개 초과 시 "장바구니가 가득 찼습니다." 출력
    public void addItem(Item item) {
        if (this.itemCount >= ShoppingCart.MAX_ITEM_COUNT) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }
        this.items[this.itemCount] = item;
        this.itemCount++;
        System.out.println(item.getName() + " 상품이 장바구니에 추가되었습니다.");
    }

    // TODO: displayItems() 메서드를 작성하세요
    // - "장바구니 상품 출력" 출력
    // - 각 상품의 이름과 합계 출력: "상품명:{이름}, 합계:{총가격}"
    // - 전체 가격 합 출력: "전체 가격 합:{총합}"
    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice = 0;
        for (Item item : this.items) {
            if (item != null) {
                    totalPrice += item.getTotalPrice();
                    System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
                }
        }
        System.out.println("전체 가격 합:" + totalPrice);
    }
}
