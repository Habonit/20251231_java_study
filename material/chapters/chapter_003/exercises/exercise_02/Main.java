package chapters.chapter03.exercises.exercise_02;

/**
 * 연습 문제 2: 증감 연산자 이해
 *
 * volume++ vs volume += 1:
 * - 둘 다 volume을 1 증가시킴
 * - volume++이 더 간결함
 * - volume += n은 n만큼 증가 (1이 아닌 값도 가능)
 *
 * 전위(prefix) vs 후위(postfix):
 * - ++a: 먼저 증가, 그 값을 사용
 * - a++: 현재 값을 사용, 그 후 증가
 */
public class Main {

    public static void main(String[] args) {

        // === 기본 증감 연산자 ===
        System.out.println("=== 기본 증감 연산자 ===");

        // TODO: int volume = 0 선언


        System.out.println("초기값: volume = " + volume);

        // TODO: volume++ 사용하여 1 증가, 결과 출력


        // TODO: volume++ 사용하여 1 증가, 결과 출력


        // TODO: volume-- 사용하여 1 감소, 결과 출력


        System.out.println();


        // === 복합 대입 연산자 ===
        System.out.println("=== 복합 대입 연산자 ===");

        // TODO: int count = 10 선언


        System.out.println("초기값: count = " + count);

        // TODO: count += 5 사용하여 5 증가, 결과 출력


        // TODO: count -= 3 사용하여 3 감소, 결과 출력


        System.out.println();


        // === 전위 vs 후위 ===
        System.out.println("=== 전위 vs 후위 ===");

        // TODO: 전위 연산자 실험
        // int a = 5;
        // int b = ++a;  // 먼저 증가 후 대입
        // a와 b 값 출력


        System.out.println();

        // TODO: 후위 연산자 실험
        // int x = 5;
        // int y = x++;  // 먼저 대입 후 증가
        // x와 y 값 출력

    }
}
