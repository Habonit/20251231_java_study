/**
 * 연습 문제 3: 참조값 이해
 *
 * 핵심 개념:
 * - Java에서 대입(=)은 항상 변수에 들어있는 값을 복사한다.
 * - 객체 변수에는 참조값(주소)이 들어있다.
 * - 따라서 객체 변수를 대입하면 참조값이 복사된다.
 * - 결과: 두 변수가 같은 객체를 가리키게 된다.
 *
 * "집은 하나인데 들어가는 문이 2개가 된 것이다."
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("=== 참조값 실험 1: 같은 객체 참조 ===");

        // TODO: Counter 객체를 생성하고 c1에 저장
        // 힌트: Counter c1 = new Counter();
        Counter c1 = new Counter();


        // TODO: c1의 count를 10으로 설정
        c1.count = 10;

        // TODO: c2에 c1을 대입 (참조값 복사)
        // 힌트: Counter c2 = c1;
        Counter c2 = c1;

        // TODO: c2를 통해 count를 20으로 변경
        c2.count = 20;

        // TODO: c1.count를 출력하고 결과를 확인
        // 예상 결과: ??? (실행 전에 예상해보세요)
        System.out.println("c1, c2 모두 20 예상, c1:" + c1.count + ", c2:" + c2.count);

        System.out.println("\n=== 참조값 실험 2: 서로 다른 객체 ===");

        // TODO: 새로운 Counter 객체를 생성하고 c3에 저장
        Counter c3 = new Counter();

        // TODO: c3의 count를 100으로 설정
        c3.count = 100;

        // TODO: 또 다른 새로운 Counter 객체를 생성하고 c4에 저장
        // 주의: c4 = c3이 아니라 new Counter()로 새로 생성!
        Counter c4 = new Counter();

        // TODO: c4의 count를 200으로 설정
        c4.count = 200;

        // TODO: c3.count와 c4.count를 각각 출력
        // 예상 결과: c3.count = ???, c4.count = ???
        System.out.println("c3.count = " + c3.count + ", c4.count = " + c4.count);

        System.out.println("\n=== 참조값 확인 ===");

        // TODO: c1과 c2의 참조값을 출력해서 같은지 확인
        // 힌트: System.out.println(c1);
        // 힌트: System.out.println(c2);
        System.out.println("c1: " + c1 + ", c2: " + c2);


        // TODO: c3과 c4의 참조값을 출력해서 다른지 확인
        System.out.println("c3: " + c3 + ", c4: " + c4);

    }
}
