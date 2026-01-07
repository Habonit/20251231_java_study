package chapters.chapter09.exercises.exercise_03;

/**
 * 영화 클래스 - Item을 상속받는 자식 클래스.
 *
 * 핵심 포인트:
 * - Item의 name, price를 상속받는다
 * - Movie만의 고유 속성: director, actor
 * - print()를 오버라이딩하여 super.print() + 고유 정보 출력
 */
public class Movie extends Item /* TODO: Item 상속 */ {

    // ==========================================================
    // TODO 1: Item 클래스를 상속받도록 클래스 선언 수정
    // ==========================================================

    // ==========================================================
    // TODO 2: 필드 선언
    // - director: String (private) - 감독
    // - actor: String (private) - 배우
    // ==========================================================
    private String director;
    private String actor;

    // ==========================================================
    // TODO 3: 생성자 구현
    // - 매개변수: String name, int price, String director, String actor
    // - 첫 줄에 super(name, price) 호출 (필수!)
    // - director, actor 필드 초기화
    // ==========================================================
    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    // ==========================================================
    // TODO 4: print() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 먼저 super.print() 호출
    // - 그 다음 "- 감독:[director], 배우:[actor]" 출력
    // ==========================================================
    @Override
    public void print() {
        super.print();
        System.out.println("- 감독:" + this.director + ", 배우:" + this.actor);
    }
}
