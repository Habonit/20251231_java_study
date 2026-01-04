/**
 * 연습 문제 3: 변수 스코프와 생명주기
 *
 * 스코프(Scope)란?
 * - 변수가 유효한 범위 (접근 가능한 범위)
 * - Java에서는 {} 블록 단위로 스코프가 정해진다
 * - 블록을 벗어나면 변수에 접근할 수 없다
 *
 * 예시:
 * if (true) {
 *     int x = 10;  // x의 스코프: 이 블록 내부
 * }
 * // 여기서 x에 접근하면 컴파일 에러
 *
 * GC(Garbage Collection)란?
 * - 아무도 참조하지 않는 객체를 메모리에서 자동으로 제거
 * - 참조가 끊긴 객체 = GC의 수거 대상
 * - Java가 자동으로 처리하므로 개발자가 직접 메모리 해제 불필요
 */
public class Main {

    public static void main(String[] args) {

        // === 멤버 변수 vs 지역 변수 ===
        System.out.println("=== 멤버 변수 vs 지역 변수 ===");

        // TODO: Counter 객체를 생성하세요
        // 힌트: Counter counter = new Counter();
        Counter counter = new Counter();

        System.out.println("Counter 객체 생성 (멤버 변수 count는 자동으로 0으로 초기화)");

        // TODO: counter.count 값을 출력하세요 (초기값 확인)
        System.out.println("counter.count = " + counter.count);


        // TODO: counter.count를 5로 변경하세요
        counter.count = 5;


        System.out.println("counter.count를 5로 변경");

        // TODO: 변경된 counter.count 값을 출력하세요
        System.out.println("counter.count = " + counter.count);

        System.out.println("increment() 메서드 호출 (내부 지역 변수 사용)");

        // TODO: counter.increment()를 호출하세요
        counter.increment();


        // TODO: 증가된 counter.count 값을 출력하세요
        System.out.println("counter.count = " + counter.count);

        System.out.println();


        // === 블록 스코프 실험 ===
        System.out.println("=== 블록 스코프 실험 ===");

        // TODO: if 블록 내에서 int blockVar = 100을 선언하고 출력하세요
        if (true) {
            // 여기에 blockVar를 선언하고 출력
            int blockVar = 100;
            System.out.println("blockVar = " + blockVar);

        }

        // 아래 주석을 해제하면 컴파일 에러 발생 (스코프 밖)
        // System.out.println(blockVar);  // 에러: blockVar를 찾을 수 없음

        System.out.println("if 블록 외부: blockVar는 접근 불가 (컴파일 에러)\n");


        // === GC 대상 실험 ===
        System.out.println("=== GC 대상 실험 ===");

        // TODO: Counter 객체 data1을 생성하세요
        Counter data1 = new Counter();

        System.out.println("data1 객체 생성");

        // TODO: data1 = null로 참조를 끊으세요
        // 힌트: data1 = null;
        data1 = null;
        System.out.println("data1 = null (참조 끊음)");

        System.out.println("data1 = null (참조 끊음)");
        System.out.println("-> data1이 가리키던 객체는 이제 GC 대상");

        // 이 시점에서 원래 data1이 가리키던 객체는
        // 아무도 참조하지 않으므로 GC의 수거 대상이 된다
    }
}
