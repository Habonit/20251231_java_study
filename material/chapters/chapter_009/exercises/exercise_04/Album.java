package chapters.chapter09.exercises.exercise_04;

/**
 * 앨범 클래스 - Item을 상속받는 자식 클래스.
 *
 * exercise_03의 Album과 동일하다.
 */
public class Album extends Item {

    // ==========================================================
    // TODO 1: Item 클래스를 상속받도록 클래스 선언 수정
    // ==========================================================

    // ==========================================================
    // TODO 2: 필드 선언
    // - artist: String (private)
    // ==========================================================
    private String artist;

    // ==========================================================
    // TODO 3: 생성자 구현
    // - 매개변수: String name, int price, String artist
    // - 첫 줄에 super(name, price) 호출
    // - artist 필드 초기화
    // ==========================================================
    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    // ==========================================================
    // TODO 4: print() 메서드 오버라이딩
    // - @Override 어노테이션 필수!
    // - 먼저 super.print() 호출
    // - 그 다음 "- 아티스트:[artist]" 출력
    // ==========================================================
    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }
}
