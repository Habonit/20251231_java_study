package chapters.chapter09.exercises.exercise_04;

/**
 * 상품 부모 클래스 (할인 기능 포함).
 *
 * exercise_03의 Item에서 getDiscountedPrice() 메서드가 추가되었다.
 */
public class Item {

    // ==========================================================
    // TODO 1: 필드 선언
    // - name: String (private)
    // - price: int (private)
    // ==========================================================
    private String name;
    private int price;

    // ==========================================================
    // TODO 2: 생성자 구현
    // - 매개변수: String name, int price
    // - 필드 초기화
    // ==========================================================
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // ==========================================================
    // TODO 3: getPrice() 메서드 구현
    // - 반환 타입: int
    // - 반환값: price
    // ==========================================================
    public int getPrice() {
        return price;
    }

    // ==========================================================
    // TODO 4: getDiscountedPrice() 메서드 구현 (신규!)
    // - 매개변수: int discountPercent (할인율, 0~100)
    // - 반환 타입: int
    // - 반환값: price - (price * discountPercent / 100)
    //
    // 예시: price=10000, discountPercent=20 -> 10000 - 2000 = 8000
    //
    // 힌트: 정수 연산이므로 소수점은 버려짐
    // ==========================================================
    public int getDiscountedPrice(int discountPercent) {
        return price - (price * discountPercent / 100);
    }

    // ==========================================================
    // TODO 5: print() 메서드 구현
    // - 반환 타입: void
    // - 출력: "이름:[name], 가격:[price]"
    // ==========================================================
    public void print() {
        System.out.println("이름:" + name + ", 가격:" + price);
    }

    // DiscountBook에서 name에 접근하기 위한 getter 추가
    public String getName() {
        return name;
    }
}
