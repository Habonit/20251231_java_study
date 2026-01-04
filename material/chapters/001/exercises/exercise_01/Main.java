/**
 * 연습 문제 1: 객체 생성과 사용
 *
 * 객체(인스턴스)란?
 * - 클래스(설계도)를 기반으로 메모리에 생성된 실체이다.
 * - new 키워드로 생성한다.
 *
 * . (dot) 연산자란?
 * - 객체의 멤버 변수에 접근할 때 사용한다.
 * - 예: book1.title = "자바의 정석";
 */
// public class Main {

//     public static void main(String[] args) {

//         // TODO: Book 객체 2개를 생성하세요
//         // 힌트: Book book1 = new Book();


//         // TODO: 첫 번째 책 정보를 대입하세요
//         // - 제목: "자바의 정석"
//         // - 저자: "남궁성"
//         // - 가격: 30000


//         // TODO: 두 번째 책 정보를 대입하세요
//         // - 제목: "이펙티브 자바"
//         // - 저자: "조슈아 블로크"
//         // - 가격: 36000


//         // TODO: 각 책의 정보를 출력하세요
//         // 예상 출력: "제목: 자바의 정석, 저자: 남궁성, 가격: 30000"


//     }
// }

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.title = "자바의 정석";
        book1.author = "남궁성";
        book1.price = 30000;

        Book book2 = new Book();

        book2.title = "이펙티브 자바";
        book2.author = "조슈아 블로크";
        book2.price = 36000;

        System.out.println("제목: " + book1.title + ", 저자: " + book1.author + ", 가격: " + book1.price);
        System.out.println("제목: " + book2.title + ", 저자: " + book2.author + ", 가격: " + book2.price);
    }
}