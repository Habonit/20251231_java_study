package chapters.chapter09.exercises.exercise_04;

/**
 * 책 클래스 - Item을 상속받는 자식 클래스.
 *
 * exercise_03의 Book과 동일하다.
 */
public class Book extends Item {

    // ==========================================================
    // TODO 1: Item 클래스를 상속받도록 클래스 선언 수정
    // ==========================================================

    // ==========================================================
    // TODO 2: 필드 선언
    // - author: String (private)
    // - isbn: String (private)
    // ==========================================================
    private String author;
    private String isbn;

    // ==========================================================
    // TODO 3: 생성자 구현
    // - 매개변수: String name, int price, String author, String isbn
    // - 첫 줄에 super(name, price) 호출
    // - author, isbn 필드 초기화
    // ==========================================================
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    // ==========================================================
    // TODO 4: print() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 먼저 super.print() 호출
    // - 그 다음 "- 저자:[author], isbn:[isbn]" 출력
    // ==========================================================
    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }

    // DiscountBook에서 author, isbn에 접근하기 위한 getter 추가
    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
