package chapters.chapter09.exercises.exercise_03;

/**
 * 상품 부모 클래스.
 *
 * 핵심 포인트:
 * - Book, Album, Movie의 공통 속성(name, price)을 가진다
 * - print() 메서드는 자식 클래스에서 오버라이딩된다
 * - getPrice()는 외부에서 가격을 조회할 수 있게 한다
 */
public class Item {

    // ==========================================================
    // TODO 1: 필드 선언
    // - name: String (private)
    // - price: int (private)
    //
    // 질문: 왜 private을 사용할까?
    // 답: 캡슐화! 외부에서 직접 접근 못하게 하고, 메서드로만 접근
    // ==========================================================
    private String name;
    private int price;    

    // ==========================================================
    // TODO 2: 생성자 구현
    // - 매개변수: String name, int price
    // - 필드 초기화
    //
    // 힌트: 이 생성자가 있으면 기본 생성자가 자동 생성되지 않음!
    //       따라서 자식 클래스에서 반드시 super(name, price) 호출 필요
    // ==========================================================
    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // ==========================================================
    // TODO 3: getPrice() 메서드 구현
    // - 반환 타입: int
    // - 반환값: price
    //
    // 힌트: 외부에서 가격을 조회할 수 있게 getter 제공
    // ==========================================================
    public int getPrice() {
        return this.price;
    }

    // ==========================================================
    // TODO 4: print() 메서드 구현
    // - 반환 타입: void
    // - 출력: "이름:[name], 가격:[price]"
    //
    // 힌트: 자식 클래스에서 super.print()로 이 메서드를 재사용할 예정
    // ==========================================================
    public void print() {
        System.out.println("이름:" + this.name + ", 가격:" + this.price);
    }
}
