package counter;

/**
 * 연습 문제 2: 최대 카운터와 캡슐화
 *
 * 최대값을 지정하고 최대값까지만 값이 증가하는 카운터를 만드세요.
 *
 * 요구사항:
 * - 접근 제어자를 사용해서 데이터를 캡슐화하세요.
 * - 해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
 */
public class MaxCounter {

    // TODO: 다음 필드들을 적절한 접근 제어자로 선언하세요
    // - count (int): 내부에서 사용하는 숫자, 초기값 0
    // - max (int): 최대값, 생성자를 통해 입력
    private int count;
    private int max;

    // TODO: 생성자를 작성하세요
    // - 매개변수: max (최대값)
    public MaxCounter(int max) {
        this.max = max;
    }

    // TODO: increment() 메서드를 작성하세요
    // - 숫자를 하나 증가시킵니다.
    // - 최대값 이상이면 "최대값을 초과할 수 없습니다." 출력 후 증가하지 않음
    public void increment() {
        if (this.count >= this.max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }
        this.count++;
    }

    
    // TODO: getCount() 메서드를 작성하세요
    // - 현재까지 증가한 값을 반환합니다.
    public int getCount() {
        return this.count;
    }
}
