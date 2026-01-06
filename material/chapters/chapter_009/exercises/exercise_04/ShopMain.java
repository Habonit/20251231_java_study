package chapters.chapter09.exercises.exercise_04;

/**
 * 연습 문제 04: 상속 관계 상품 (심화 - 할인 기능) - 실행 클래스.
 *
 * 모든 TODO를 완성한 후 실행하세요.
 *
 * 예상 출력:
 * =============
 * === 일반 상품 ===
 * 이름:JAVA, 가격:10000
 * - 저자:han, isbn:12345
 * 이름:앨범1, 가격:15000
 * - 아티스트:seo
 *
 * === 할인 상품 ===
 * 이름:할인책, 가격:8000 (20% 할인 적용)
 * - 저자:kim, isbn:99999
 *
 * === 가격 합계 ===
 * 일반 가격 합계: 25000
 * 할인 적용 후 합계: 23000
 * =============
 *
 * 주목할 점:
 * - DiscountBook의 getPrice()는 할인 적용된 가격을 반환
 * - 따라서 합계 계산 시 자동으로 할인이 적용됨
 * - 이것이 메서드 오버라이딩의 강력함!
 */
public class ShopMain {

    public static void main(String[] args) {
        System.out.println("=== 일반 상품 ===");

        // 일반 상품 생성
        Book book = new Book("JAVA", 10000, "han", "12345");
        Album album = new Album("앨범1", 15000, "seo");

        book.print();
        album.print();

        System.out.println();
        System.out.println("=== 할인 상품 ===");

        // 할인 상품 생성 (원가 10000원, 20% 할인)
        // 생성자 호출 순서: DiscountBook -> Book -> Item
        DiscountBook discountBook = new DiscountBook("할인책", 10000, "kim", "99999", 20);

        discountBook.print();

        System.out.println();
        System.out.println("=== 가격 합계 ===");

        // 일반 가격 합계
        int normalSum = book.getPrice() + album.getPrice();
        System.out.println("일반 가격 합계: " + normalSum);

        // 할인 적용 후 합계
        // discountBook.getPrice()는 오버라이딩된 메서드가 호출되어 할인된 가격 반환
        int totalSum = book.getPrice() + album.getPrice() + discountBook.getPrice();
        System.out.println("할인 적용 후 합계: " + totalSum);
    }
}
