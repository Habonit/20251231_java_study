package counter;

/**
 * MaxCounter 테스트용 메인 클래스
 *
 * 예상 실행 결과:
 * 최대값을 초과할 수 없습니다.
 * 3
 */
public class CounterMain {

    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(3);
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        int count = counter.getCount();
        System.out.println(count);
    }
}
