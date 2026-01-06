package chapters.chapter09.exercises.exercise_03;

/**
 * 연습 문제 03: 상속 관계 상품 - 실행 클래스.
 *
 * Item.java, Book.java, Album.java, Movie.java의 TODO를 모두 완성한 후 실행하세요.
 *
 * 예상 출력:
 * =============
 * 이름:JAVA, 가격:10000
 * - 저자:han, isbn:12345
 * 이름:앨범1, 가격:15000
 * - 아티스트:seo
 * 이름:영화1, 가격:18000
 * - 감독:감독1, 배우:배우1
 * 상품 가격의 합: 43000
 * =============
 */
public class ShopMain {

    public static void main(String[] args) {
        // 각 상품 인스턴스 생성
        // 자식 생성자 -> super(name, price) -> 부모 생성자 순으로 호출됨
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");
        Movie movie = new Movie("영화1", 18000, "감독1", "배우1");

        // print() 호출 - 오버라이딩된 메서드 실행
        // 각 자식 클래스의 print()가 super.print()를 호출하여
        // 부모의 공통 출력 + 자식의 고유 출력을 조합
        book.print();
        album.print();
        movie.print();

        // getPrice()는 부모 Item에 정의됨
        // 자식 클래스에서 오버라이딩하지 않았으므로 부모의 메서드 사용
        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}
