/**
 * 연습 문제 2: 배열과 반복문
 *
 * for문 구조 설명 (note.md 질문 기반):
 *
 * for (int i = 0; i < students.length; i++) { ... }
 *     ↑        ↑                      ↑
 *     |        |                      |
 *  초기화    조건식                 증감식
 *
 * - int i = 0: 반복 변수 i를 0으로 초기화
 * - i < students.length: i가 배열 길이보다 작으면 반복
 * - i++: 반복마다 i를 1씩 증가
 *
 * 향상된 for문 (Enhanced For Loop):
 *
 * for (Student s : students) { ... }
 *         ↑         ↑
 *         |         |
 *     각 요소    순회할 배열
 *
 * - students 배열의 각 요소가 순서대로 s에 대입된다.
 * - 인덱스가 필요 없을 때 더 간결하게 작성할 수 있다.
 */
/** 
public class Main {

    public static void main(String[] args) {

        // TODO: Student 배열을 선언하세요 (크기 3)
        // 힌트: Student[] students = new Student[3];


        // TODO: 첫 번째 학생 생성 및 배열에 저장
        // - 이름: "김철수", 나이: 15, 성적: 85


        // TODO: 두 번째 학생 생성 및 배열에 저장
        // - 이름: "이영희", 나이: 16, 성적: 92


        // TODO: 세 번째 학생 생성 및 배열에 저장
        // - 이름: "박민수", 나이: 15, 성적: 78


        // TODO: 일반 for문으로 학생 정보 출력
        // 힌트: for (int i = 0; i < students.length; i++) { ... }
        System.out.println("=== 일반 for문 출력 ===");


        // TODO: 향상된 for문으로 학생 정보 출력
        // 힌트: for (Student s : students) { ... }
        System.out.println("\n=== 향상된 for문 출력 ===");


        // TODO: 전체 학생의 평균 성적을 계산하여 출력
        // 힌트: 총합을 구한 후 학생 수로 나누기
        // 주의: 정수 나눗셈이 아닌 실수 나눗셈을 위해 (double) 캐스팅 필요


    }
}
*/
public class Main {
    public static void main (String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();

        students[0].name = "김철수";
        students[0].age = 15;
        students[0].grade = 85;

        students[1].name = "이영희";
        students[1].age = 16;
        students[1].grade = 92;

        students[2].name = "박민수";
        students[2].age = 15;
        students[2].grade = 78;

        System.out.println("=== 일반 for문 출력 ===");
        for (int i = 0; i < students.length; i++) {
            System.out.println("이름: " + students[i].name + ", 나이: " + students[i].age + ", 성적: " + students[i].grade);
        }

        System.out.println("\n=== 향상된 for문 출력 ===");
        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }

        double total = 0;
        for (Student s : students) {
            total += s.grade;
        }
        double average = total / students.length;
        System.out.println("\n전체 학생의 평균 성적: " + average);
    }
}