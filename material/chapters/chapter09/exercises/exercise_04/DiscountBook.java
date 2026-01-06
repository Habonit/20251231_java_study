package chapters.chapter09.exercises.exercise_04;

/**
 * 할인 책 클래스 - Book을 상속받는 자식 클래스.
 *
 * 핵심 포인트:
 * - 3단계 상속: Item -> Book -> DiscountBook
 * - getPrice()를 오버라이딩하여 할인 적용된 가격 반환
 * - print()를 오버라이딩하여 할인 정보도 출력
 *
 * 주의:
 * - super.super.method()는 Java에서 지원하지 않음!
 * - 각 단계에서 super.method()만 호출 가능
 */
public class DiscountBook extends Book {

    // ==========================================================
    // TODO 1: Book 클래스를 상속받도록 클래스 선언 수정
    //
    // 힌트: 이미 Book이 Item을 상속받으므로, DiscountBook은
    //       Item의 모든 기능 + Book의 모든 기능을 가진다
    // ==========================================================

    // ==========================================================
    // TODO 2: 필드 선언
    // - discountPercent: int (private) - 할인율 (0~100)
    // ==========================================================
    private int discountPercent;

    // ==========================================================
    // TODO 3: 생성자 구현
    // - 매개변수: String name, int price, String author, String isbn, int discountPercent
    // - 첫 줄에 super(name, price, author, isbn) 호출
    // - discountPercent 필드 초기화
    //
    // 질문: 왜 super(name, price, author, isbn)인가?
    // 답: 직계 부모인 Book의 생성자를 호출해야 하기 때문!
    //     Book 생성자가 다시 super(name, price)로 Item 생성자를 호출함
    // ==========================================================
    public DiscountBook(String name, int price, String author, String isbn, int discountPercent) {
        super(name, price, author, isbn);
        this.discountPercent = discountPercent;
    }

    // ==========================================================
    // TODO 4: getPrice() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 반환값: 부모의 getPrice()에서 할인율 적용한 가격
    //
    // 힌트: Item의 getDiscountedPrice(discountPercent) 메서드 활용!
    //       또는 직접 계산: super.getPrice() - (super.getPrice() * discountPercent / 100)
    // ==========================================================
    @Override
    public int getPrice() {
        return super.getPrice() - (super.getPrice() * discountPercent / 100);
    }

    // ==========================================================
    // TODO 5: print() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 출력 형식: "이름:[name], 가격:[할인된가격] ([discountPercent]% 할인 적용)"
    // - 그 다음 줄에 "- 저자:[author], isbn:[isbn]"
    //
    // 도전 과제: super.print()를 활용하기 어려운 이유를 생각해보자
    //           (출력 형식이 달라져서 부모의 print()를 그대로 쓸 수 없음)
    //
    // 힌트: 이 경우는 super.print()를 쓰지 않고 직접 출력해도 됨
    //       또는 Item에 getName() 메서드를 추가하는 방법도 있음
    // ==========================================================
    @Override
    public void print() {
        System.out.println("이름:" + getName() + ", 가격:" + getPrice() + " (" + discountPercent + "% 할인 적용)");
        System.out.println("- 저자:" + getAuthor() + ", isbn:" + getIsbn());
    }
}
