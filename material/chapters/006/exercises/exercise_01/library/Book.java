package library;

/**
 * 연습 문제 1: 도서관 책 대출 시스템 - Book 클래스
 *
 * 학습 목표:
 * - private 접근 제어자를 사용하여 데이터를 캡슐화한다
 * - public 메서드를 통해서만 데이터에 접근하도록 한다
 * - getter 메서드의 역할을 이해한다
 *
 * 배경 설명:
 * - 도서관에서 책을 관리하는 시스템을 만들고 있습니다.
 * - 책의 정보(제목, 저자, 대출 상태)는 외부에서 직접 수정하면 안 됩니다.
 * - 반드시 제공된 메서드를 통해서만 접근해야 합니다.
 */
public class Book {

    // TODO 1: 다음 필드들을 private으로 선언하세요
    // - title (String): 책 제목
    // - author (String): 저자
    // - isBorrowed (boolean): 대출 여부 (초기값: false)
    private String title;
    private String author;
    private boolean isBorrowed = false;

    // TODO 2: 생성자를 작성하세요
    // - 매개변수: title, author
    // - isBorrowed는 기본값 false로 설정
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    // TODO 3: getter 메서드들을 작성하세요
    // - getTitle(): 책 제목 반환
    // - getAuthor(): 저자 반환
    // - isBorrowed(): 대출 여부 반환
    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public boolean isBorrowed() {
        return this.isBorrowed;
    }

    // TODO 4: 대출 관련 메서드를 작성하세요
    // - borrow(): 책을 대출합니다
    //   - 이미 대출 중이면 "이미 대출 중인 책입니다: {제목}" 출력 후 false 반환
    //   - 대출 가능하면 isBorrowed를 true로 변경하고 true 반환
    public boolean borrow() {
        if (this.isBorrowed) {
            System.out.println("이미 대출 중인 책입니다: " + this.title);
            return false;
        }
        this.isBorrowed = true;
        System.out.println(this.title + " 책을 대출했습니다.");
        return true;
    }
    // - returnBook(): 책을 반납합니다
    //   - 대출 중이 아니면 "대출 중이 아닌 책입니다: {제목}" 출력 후 false 반환
    //   - 대출 중이면 isBorrowed를 false로 변경하고 true 반환
    
    public boolean returnBook() {
        if (!this.isBorrowed) {
            System.out.println("대출 중이 아닌 책입니다: " + this.title);
            return false;
        }
        this.isBorrowed = false;
        System.out.println(this.title + " 책을 반납했습니다.");
        return true;
        }
    // TODO 5: 책 정보를 출력하는 메서드를 작성하세요
    // - displayInfo(): "[제목] 저자: {저자}, 상태: 대출가능/대출중" 형식으로 출력
    public void displayInfo() {
        String status = this.isBorrowed ? "대출중" : "대출가능";
        System.out.println(this.title + " 저자: " + this.author + ", 상태: " + status);
    }
}
