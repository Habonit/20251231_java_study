package chapters.chapter02.exercises.exercise_03;

/**
 * 연습 문제 3: Counter 클래스 정의
 *
 * 멤버 변수(인스턴스 변수)란?
 * - 클래스 내부, 메서드 외부에 선언된 변수
 * - 객체가 생성될 때 함께 생성되고, 객체가 소멸될 때 함께 소멸
 * - 자동 초기화: int는 0, boolean은 false, 참조형은 null
 *
 * 지역 변수란?
 * - 메서드 내부에 선언된 변수
 * - 메서드가 실행될 때 생성되고, 메서드가 끝나면 소멸
 * - 반드시 사용 전에 초기화해야 함 (자동 초기화 안됨)
 */
public class Counter {

    // TODO: 멤버 변수를 정의하세요
    // - count (int): 카운터 값
    // 힌트: 멤버 변수는 자동으로 0으로 초기화된다
    int count;


    /**
     * 카운터를 1 증가시키는 메서드.
     *
     * 이 메서드 내에서 선언된 변수는 '지역 변수'이다.
     * 메서드가 끝나면 지역 변수는 사라진다.
     */
    // TODO: increment 메서드를 완성하세요
    // - 지역 변수 increment를 선언하고 1을 대입
    // - count에 increment를 더함
    // - "increment 메서드 내부: 지역 변수 increment = " + increment 출력
    public void increment() {
        // 여기에 코드를 작성하세요
        int increment = 1;
        count += increment;
        System.out.println("increment 메서드 내부: 지역 변수 increment = " + increment);
        System.out.println("count = " + count);
    }
}
