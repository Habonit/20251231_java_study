package chapters.chapter04.exercises.exercise_01;

/**
 * 연습 문제 1: this 키워드 이해하기 - 실행 파일
 *
 * 실행 방법:
 * 1. exercise_01 디렉토리에서 실행
 * 2. javac *.java
 * 3. java Main
 *
 * 예상 출력:
 * 이름: 홍길동, 나이: 20, 점수: 85
 * 이름: 김철수, 나이: 22, 점수: 90
 */
public class Main {

    public static void main(String[] args) {
        // 학생 객체 생성
        Student student1 = new Student();
        student1.initStudent("홍길동", 20, 85);

        Student student2 = new Student();
        student2.initStudent("김철수", 22, 90);

        // 학생 정보 출력
        student1.displayInfo();
        student2.displayInfo();
    }
}
