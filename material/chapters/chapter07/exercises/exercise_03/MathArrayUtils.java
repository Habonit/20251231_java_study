package chapters.chapter07.exercises.exercise_03;

/**
 * 연습 문제 3: 수학 유틸리티 클래스
 *
 * 학습 목표:
 * - 유틸리티 클래스를 static 메서드로 구현하는 방법을 익힌다
 * - private 생성자로 인스턴스 생성을 막는 방법을 익힌다
 * - static 메서드에서 다른 static 메서드를 호출하는 방법을 익힌다
 *
 * 요구사항:
 * - MathArrayUtils는 객체를 생성하지 않고 사용해야 합니다
 * - 누군가 실수로 MathArrayUtils의 인스턴스를 생성하지 못하게 막으세요
 * - 다음 기능을 제공하는 static 메서드를 구현하세요:
 *   - sum(int[] array): 배열의 모든 요소를 더하여 합계를 반환
 *   - average(int[] array): 배열의 모든 요소의 평균값을 계산
 *   - min(int[] array): 배열에서 최소값을 찾음
 *   - max(int[] array): 배열에서 최대값을 찾음
 *
 * 예상 출력:
 * sum=15
 * average=3.0
 * min=1
 * max=5
 */
public class MathArrayUtils {

    // ==========================================================
    // TODO 1: private 생성자 구현
    // - 외부에서 인스턴스를 생성하지 못하도록 private 생성자를 만드세요
    //
    // 힌트: 유틸리티 클래스는 인스턴스 변수 없이 static 메서드만 제공합니다.
    //       따라서 인스턴스를 생성할 필요가 없고, 생성하면 안 됩니다.
    //       private 생성자를 만들면 외부에서 new MathArrayUtils()를 호출할 수 없습니다.
    // ==========================================================
    private MathArrayUtils() {}

    // ==========================================================
    // TODO 2: static 메서드 구현 - sum(int[] values)
    // - 반환 타입: int
    // - 배열의 모든 요소를 더하여 합계를 반환합니다
    //
    // 힌트: for-each 문을 사용하면 간결하게 구현할 수 있습니다.
    //       for (int value : values) { ... }
    // ==========================================================
    public static int sum(int[] values) {
        int sum = 0;
        if (values == null || values.length == 0) {
            System.out.println("배열이 비어있습니다.");
            return sum;
        }
        System.out.println("배열의 요소를 더합니다.");
        for (int value : values) {
            sum += value;
        }
        System.out.println("배열의 요소를 더한 결과: " + sum);
        return sum;
    }

    // ==========================================================
    // TODO 3: static 메서드 구현 - average(int[] values)
    // - 반환 타입: double
    // - 배열의 모든 요소의 평균값을 계산합니다
    //
    // 힌트: sum() 메서드를 활용할 수 있습니다.
    //       정수 나눗셈이 아닌 실수 나눗셈이 되도록 (double) 캐스팅에 주의하세요.
    // ==========================================================
    public static double average (int[] value) {
        if (value == null || value.length == 0) {
            System.out.println("배열이 비어있습니다.");
            return 0.0;
        }
        System.out.println("배열의 요소의 평균값을 계산합니다.");
        double average = (double) sum(value) / value.length;
        System.out.println("배열의 요소의 평균값: " + average);
        return average;
    }

    // ==========================================================
    // TODO 4: static 메서드 구현 - min(int[] values)
    // - 반환 타입: int
    // - 배열에서 최소값을 찾습니다
    //
    // 힌트: 첫 번째 요소를 최소값으로 가정하고,
    //       배열을 순회하면서 더 작은 값이 있으면 갱신합니다.
    // ==========================================================
    public static int min(int[] value) {
        if (value == null || value.length == 0) {
            System.out.println("배열이 비어있습니다.");
            return 0;
        }
        System.out.println("배열에서 최소값을 찾습니다.");
        int min = value[0];
        for (int v : value) {
            if (v < min) {
                min = v;
            }
        }
        System.out.println("배열에서 최소값: " + min);
        return min;
    }
    // ==========================================================
    // TODO 5: static 메서드 구현 - max(int[] values)
    // - 반환 타입: int
    // - 배열에서 최대값을 찾습니다
    //
    // 힌트: min()과 반대로 구현합니다.
    // ==========================================================
    public static int max(int[] value) {
        if (value == null || value.length == 0) {
            System.out.println("배열이 비어있습니다.");
            return 0;
        }
        System.out.println("배열에서 최대값을 찾습니다.");
        int max = value[0];
        for (int v : value) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println("배열에서 최대값: " + max);
        return max;
    }
}
