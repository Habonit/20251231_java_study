package chapters.chapter07.exercises.exercise_03;

/**
 * 연습 문제 3: 수학 유틸리티 클래스 - 메인 실행 클래스
 *
 * MathArrayUtils.java의 TODO를 모두 완성한 후 이 클래스를 실행하세요.
 *
 * 실행 방법:
 * 1. exercises 디렉토리로 이동
 * 2. 컴파일: javac exercise_03/*.java
 * 3. 실행: java exercise_03.MathArrayUtilsMain
 *
 * 예상 출력:
 * sum=15
 * average=3.0
 * min=1
 * max=5
 */
public class MathArrayUtilsMain {

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum=" + MathArrayUtils.sum(values));
        System.out.println("average=" + MathArrayUtils.average(values));
        System.out.println("min=" + MathArrayUtils.min(values));
        System.out.println("max=" + MathArrayUtils.max(values));
    }
}
