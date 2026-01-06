package chapters.chapter09.exercises.exercise_03;

/**
 * 책 클래스 - Item을 상속받는 자식 클래스.
 *
 * 핵심 포인트:
 * - Item의 name, price를 상속받는다
 * - Book만의 고유 속성: author, isbn
 * - print()를 오버라이딩하여 super.print() + 고유 정보 출력
 */
public class Book extends Item /* TODO: Item 상속 */ {

    // ==========================================================
    // TODO 1: Item 클래스를 상속받도록 클래스 선언 수정
    // ==========================================================

    // ==========================================================
    // TODO 2: 필드 선언
    // - author: String (private) - 저자
    // - isbn: String (private) - ISBN 번호
    // ==========================================================
    private String author;
    private String isbn;
    // ==========================================================
    // TODO 3: 생성자 구현
    // - 매개변수: String name, int price, String author, String isbn
    // - 첫 줄에 super(name, price) 호출 (필수!)
    // - author, isbn 필드 초기화
    //
    // 질문: Item의 name, price 필드는 private인데 어떻게 초기화할까?
    // 답: super(name, price)로 부모 생성자를 호출하면 부모가 알아서 초기화!
    // ==========================================================
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    // ==========================================================
    // TODO 4: print() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 먼저 super.print() 호출 (부모의 "이름:..., 가격:..." 출력)
    // - 그 다음 "- 저자:[author], isbn:[isbn]" 출력
    //
    // 포인트: super.print()를 활용하여 코드 중복 제거!
    // ==========================================================
    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + this.author + ", ISBN:" + this.isbn);
    }
}
