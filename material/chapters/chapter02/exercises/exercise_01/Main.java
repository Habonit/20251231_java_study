package chapters.chapter02.exercises.exercise_01;

/**
 * 연습 문제 1: 기본형과 참조형의 차이
 *
 * 기본형(Primitive Type)이란?
 * - 자바가 기본으로 제공하는 데이터 타입
 * - int, long, double, float, boolean, char, byte, short
 * - 변수에 실제 값이 직접 저장된다
 *
 * int, long, double의 차이:
 * - int: 정수형, 4바이트, 약 -21억 ~ 21억
 * - long: 정수형, 8바이트, 매우 큰 정수
 * - double: 실수형, 8바이트, 소수점 있는 숫자
 *
 * 참조형(Reference Type)이란?
 * - 기본형을 제외한 모든 타입 (클래스, 배열 등)
 * - 변수에 참조값(객체의 메모리 주소)이 저장된다
 */
public class Main {

    public static void main(String[] args) {

        // === 기본형 복사 실험 ===
        System.out.println("=== 기본형 복사 실험 ===");

        // TODO: int 변수 a를 선언하고 10을 대입하세요
        int a = 10;


        // TODO: int 변수 b에 a를 복사하세요
        // 힌트: int b = a;
        int b = a;


        System.out.println("a = 10");
        System.out.println("b = a (복사)");

        // TODO: a의 값을 20으로 변경하세요
        a = 20;

        System.out.println("a = 20 (변경)");

        // TODO: a와 b의 값을 출력하세요
        // 예상: a = 20, b = 10 (기본형은 독립적)
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("-> 기본형은 값이 복사되어 독립적이다\n");


        // === 참조형 복사 실험 ===
        System.out.println("=== 참조형 복사 실험 ===");

        // TODO: Data 객체 dataA를 생성하고 value에 10을 대입하세요
        // 힌트: Data dataA = new Data();
        Data dataA = new Data();
        dataA.value = 10;

        // TODO: Data 변수 dataB에 dataA를 복사하세요
        // 힌트: Data dataB = dataA;
        Data dataB = dataA;


        System.out.println("dataA.value = 10");
        System.out.println("dataB = dataA (복사)");

        // TODO: dataA.value를 20으로 변경하세요
        dataA.value = 20;

        System.out.println("dataA.value = 20 (변경)");

        // TODO: dataA.value와 dataB.value를 출력하세요
        // 예상: 둘 다 20 (같은 객체를 가리킴)
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        System.out.println("-> 참조형은 같은 객체를 가리키므로 함께 변한다");
    }
}
