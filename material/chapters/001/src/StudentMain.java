/**
 * Student 클래스 사용 예제
 *
 * 이 예제에서 배우는 것:
 * 1. 클래스를 사용하여 객체를 생성하는 방법
 * 2. 객체의 멤버 변수에 값을 대입하는 방법
 * 3. 객체 배열을 사용하는 방법
 * 4. 향상된 for문으로 객체 배열을 순회하는 방법
 */
public class StudentMain {

    /**
     * main 메서드 - Java 프로그램의 시작점
     *
     * public: 어디서든 접근 가능
     * static: 클래스 레벨에 속함 (객체 생성 없이 호출 가능)
     * void: 반환값 없음
     * String[] args: 명령줄 인자를 배열로 받음
     */
    public static void main(String[] args) {

        // ========================================
        // 1. 객체 생성과 값 대입
        // ========================================
        System.out.println("=== 1. 객체 생성 ===");

        // Student 타입 변수 선언 + 객체 생성
        // 같은 패키지에 있기 때문에 Student 클래스를 import하지 않아도 된다. 
        // new Student()는 메모리에 Student 객체를 생성하고 참조값을 반환
        Student student1 = new Student();

        // .(dot) 연산자로 멤버 변수에 접근하여 값 대입
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        // 객체 정보 출력
        System.out.println("이름: " + student1.name + ", 나이: " + student1.age + ", 성적: " + student1.grade);
        System.out.println("이름: " + student2.name + ", 나이: " + student2.age + ", 성적: " + student2.grade);

        // ========================================
        // 2. 객체 배열 사용
        // ========================================
        System.out.println("\n=== 2. 객체 배열 ===");

        // Student 타입을 담을 수 있는 배열 생성
        Student[] students = new Student[2];

        // 배열에 참조값 저장 (객체 자체가 아닌 참조값이 복사됨)
        students[0] = student1;
        students[1] = student2;

        // ========================================
        // 3. 일반 for문으로 순회
        // ========================================
        System.out.println("\n=== 3. 일반 for문 ===");

        // for (초기화; 조건; 증감) { ... }
        // i = 0, 1 순서로 반복
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }

        // ========================================
        // 4. 향상된 for문으로 순회
        // ========================================
        System.out.println("\n=== 4. 향상된 for문 ===");

        // for (타입 변수 : 배열) { ... }
        // 배열의 각 요소가 순서대로 변수에 대입됨
        for (Student s : students) {
            System.out.println("이름: " + s.name + ", 나이: " + s.age + ", 성적: " + s.grade);
        }

        // ========================================
        // 5. 참조값 확인
        // ========================================
        System.out.println("\n=== 5. 참조값 확인 ===");

        // 객체를 출력하면 참조값(패키지.클래스@16진수주소) 형태로 출력됨
        System.out.println("student1 참조값: " + student1);
        System.out.println("student2 참조값: " + student2);
        System.out.println("students[0] 참조값: " + students[0]);
        System.out.println("students[1] 참조값: " + students[1]);

        // student1과 students[0]은 같은 참조값을 가짐 (같은 객체를 가리킴)
        System.out.println("\nstudent1 == students[0]: " + (student1 == students[0]));
    }
}
