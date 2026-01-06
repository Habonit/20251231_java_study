package chapters.chapter04.exercises.exercise_02;

/**
 * 연습 문제 2: 생성자와 오버로딩 - 실행 파일
 *
 * 실행 방법:
 * 1. exercise_02 디렉토리에서 실행
 * 2. javac *.java
 * 3. java Main
 *
 * 예상 출력:
 * 기본 생성자 호출
 * 상품명: Unknown, 가격: 0원, 수량: 0개
 *
 * name 생성자 호출: 키보드
 * 상품명: 키보드, 가격: 1000원, 수량: 1개
 *
 * name, price 생성자 호출: 마우스, 25000
 * 상품명: 마우스, 가격: 25000원, 수량: 1개
 *
 * 전체 생성자 호출: 모니터, 350000, 2
 * 상품명: 모니터, 가격: 350000원, 수량: 2개
 */
public class Main {

    public static void main(String[] args) {
        // 기본 생성자 사용
        Product product1 = new Product();
        product1.displayInfo();
        System.out.println();

        // name만 전달하는 생성자 사용
        Product product2 = new Product("키보드");
        product2.displayInfo();
        System.out.println();

        // name과 price를 전달하는 생성자 사용
        Product product3 = new Product("마우스", 25000);
        product3.displayInfo();
        System.out.println();

        // 모든 필드를 전달하는 생성자 사용
        Product product4 = new Product("모니터", 350000, 2);
        product4.displayInfo();
    }
}
