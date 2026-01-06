package main;

// TODO: library 패키지의 Book, Library 클래스를 import 하세요
// 힌트: import exercise_01.library.Book;
// 힌트: import exercise_01.library.Library;
import library.Book;
import library.Library;

/**
 * 연습 문제 1: 도서관 책 대출 시스템 - Main 클래스
 *
 * 학습 목표:
 * - 다른 패키지의 클래스를 import하여 사용한다
 * - public 클래스와 메서드만 외부 패키지에서 접근 가능함을 이해한다
 * - 캡슐화된 객체를 메서드를 통해 조작한다
 *
 * 실행 방법:
 * 프로젝트 루트에서 다음 명령어 실행:
 * $ javac -d out material/chapters/006/exercises/exercise_01/library/*.java \
 *         material/chapters/006/exercises/exercise_01/main/*.java
 * $ java -cp out exercise_01.main.Main
 *
 * 예상 출력:
 * === 도서관 책 목록 ===
 * [자바의 정석] 저자: 남궁성, 상태: 대출가능
 * [클린 코드] 저자: 로버트 마틴, 상태: 대출가능
 * [이펙티브 자바] 저자: 조슈아 블로크, 상태: 대출가능
 * 전체 3권 중 3권 대출 가능
 *
 * --- 대출 테스트 ---
 * [자바의 정석] 저자: 남궁성, 상태: 대출중
 * 이미 대출 중인 책입니다: 자바의 정석
 * 전체 3권 중 2권 대출 가능
 *
 * --- 반납 테스트 ---
 * [자바의 정석] 저자: 남궁성, 상태: 대출가능
 * 전체 3권 중 3권 대출 가능
 */
public class Main {

    public static void main(String[] args) {
        // TODO 1: Library 객체 생성
        Library library = new Library();


        // TODO 2: Book 객체 3개 생성 후 도서관에 추가
        // - "자바의 정석", "남궁성"
        // - "클린 코드", "로버트 마틴"
        // - "이펙티브 자바", "조슈아 블로크"
        Book book1 = new Book("자바의 정석", "남궁성");
        Book book2 = new Book("클린 코드", "로버트 마틴");
        Book book3 = new Book("이펙티브 자바", "조슈아 블로크");
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // TODO 3: 전체 책 목록 출력
        // library.displayAllBooks();
        library.displayAllBooks();


        // TODO 4: 도서관 상태 출력
        // library.displayStatus();
        library.displayStatus();


        System.out.println();
        System.out.println("--- 대출 테스트 ---");

        // TODO 5: "자바의 정석" 대출
        // library.borrowBook("자바의 정석");
        library.borrowBook("자바의 정석");

        // TODO 6: 대출한 책 정보 확인
        // Book book = library.findBookByTitle("자바의 정석");
        // book.displayInfo();
        Book book = library.findBookByTitle("자바의 정석");
        book.displayInfo();


        // TODO 7: 같은 책 다시 대출 시도 (실패해야 함)
        // library.borrowBook("자바의 정석");
        library.borrowBook("자바의 정석");


        // TODO 8: 도서관 상태 출력
        // library.displayStatus();
        library.displayStatus();


        System.out.println();
        System.out.println("--- 반납 테스트 ---");

        // TODO 9: "자바의 정석" 반납
        // library.returnBook("자바의 정석");
        library.returnBook("자바의 정석");


        // TODO 10: 반납 후 책 정보 및 도서관 상태 확인
        book.displayInfo();
        library.displayStatus();


        // === 추가 도전 과제 ===
        // 아래 코드의 주석을 해제하면 컴파일 오류가 발생합니다.
        // 왜 오류가 발생하는지 생각해보세요!

        // book.isBorrowed = true;  // 컴파일 오류! private 필드 직접 접근 불가
        // book.title = "다른 책";   // 컴파일 오류! private 필드 직접 접근 불가
    }
}
