package library;

/**
 * 연습 문제 1: 도서관 책 대출 시스템 - Library 클래스
 *
 * 학습 목표:
 * - 클래스 간의 협력 관계를 이해한다
 * - private 배열과 카운터를 사용하여 데이터를 관리한다
 * - 내부에서만 사용하는 메서드는 private으로 숨긴다
 *
 * 힌트:
 * - Book 클래스와 같은 패키지이므로 import 없이 사용 가능합니다.
 * - 배열의 인덱스 관리에 주의하세요.
 */
public class Library {

    // TODO 1: 다음 필드들을 private으로 선언하세요
    // - books (Book[]): 책 배열, 크기 100
    // - bookCount (int): 현재 등록된 책 수
    private Book[] books;
    private int bookCount; 
    private static final int MAX_BOOK_COUNT = 100;

    // TODO 2: 기본 생성자를 작성하세요
    // - books 배열을 크기 100으로 초기화
    // - bookCount는 0으로 초기화
    public Library() {
        this.books = new Book[Library.MAX_BOOK_COUNT];
        this.bookCount = 0;
    }

    // TODO 3: 책 추가 메서드를 작성하세요 (public)
    // - addBook(Book book): 책을 도서관에 추가
    //   - 배열이 가득 찼으면 "도서관이 가득 찼습니다." 출력 후 종료
    //   - 추가 성공 시 "'{제목}' 책이 등록되었습니다." 출력
    public void addBook(Book book) {
        // 배열이 가득 찼으면 추가 불가
        if (this.bookCount >= Library.MAX_BOOK_COUNT) {
            System.out.println("도서관이 가득 찼습니다.");
            return;
        }
        // 책 추가
        this.books[this.bookCount] = book;
        // 책 수 증가
        this.bookCount++;
        System.out.println(book.getTitle() + " 책이 등록되었습니다.");
    }

    // TODO 4: 책 검색 메서드를 작성하세요 (public)
    // - findBookByTitle(String title): 제목으로 책 검색
    //   - 찾으면 해당 Book 객체 반환
    //   - 못 찾으면 null 반환
    public Book findBookByTitle(String title) {
        for (Book book : this.books) {
            if (book != null && title.equals(book.getTitle())) {
                System.out.println(book.getTitle() + " 책을 찾았습니다.");
                return book;
            }
        }
        System.out.println(title + " 책을 찾을 수 없습니다.");
        return null;
    }

    // TODO 5: 대출 메서드를 작성하세요 (public)
    // - borrowBook(String title): 제목으로 책을 찾아 대출
    //   - 책을 찾지 못하면 "'{제목}' 책을 찾을 수 없습니다." 출력
    //   - 찾으면 Book의 borrow() 메서드 호출
    public void borrowBook(String title) {
        Book book = this.findBookByTitle(title);
        if (book != null) {
            book.borrow();
        }
        else {
            System.out.println(title + " 책을 찾을 수 없습니다.");
            return;
        }
    }

    // TODO 6: 반납 메서드를 작성하세요 (public)
    // - returnBook(String title): 제목으로 책을 찾아 반납
    //   - 책을 찾지 못하면 "'{제목}' 책을 찾을 수 없습니다." 출력
    //   - 찾으면 Book의 returnBook() 메서드 호출
    public void returnBook(String title) {
        Book book = this.findBookByTitle(title);
        if (book != null) {
            book.returnBook();
        }
        else {
            System.out.println(title + " 책을 찾을 수 없습니다.");
            return;
        }
    }

    // TODO 7: 전체 책 목록 출력 메서드를 작성하세요 (public)
    // - displayAllBooks(): 등록된 모든 책의 정보 출력
    //   - "=== 도서관 책 목록 ===" 출력 후
    //   - 각 책의 displayInfo() 호출
    //   - 책이 없으면 "등록된 책이 없습니다." 출력
    public void displayAllBooks() {
        if (this.bookCount == 0) {
            System.out.println("등록된 책이 없습니다.");
            return;
        }
        System.out.println("=== 도서관 책 목록 ===");
        for (Book book : this.books) {
            if (book != null) {
                book.displayInfo();
            }
        }
    }
    // TODO 8: 대출 가능한 책 수를 반환하는 private 메서드를 작성하세요
    // - countAvailableBooks(): 대출 가능한(isBorrowed가 false인) 책 수 반환
    // - 이 메서드는 내부에서만 사용됩니다
    private int countAvailableBooks() {
        int count = 0;
        for (Book book : this.books) {
            if (book != null && !book.isBorrowed()) {
                count++;
            }
        }
        return count;
    }

    // TODO 9: 도서관 상태 출력 메서드를 작성하세요 (public)
    // - displayStatus(): "전체 {n}권 중 {m}권 대출 가능" 형식으로 출력
    // - countAvailableBooks()를 활용하세요
    public void displayStatus() {
        int availableBooks = this.countAvailableBooks();
        System.out.println("전체 " + this.bookCount + "권 중 " + availableBooks + "권 대출 가능");
    }
}
