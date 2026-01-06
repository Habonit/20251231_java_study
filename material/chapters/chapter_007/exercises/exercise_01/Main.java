package chapters.chapter07.exercises.exercise_01;

/**
 * 연습 문제 1: 학생 성적 관리 시스템 - 메인 실행 클래스
 *
 * 이 클래스는 Student 클래스가 올바르게 구현되었는지 테스트합니다.
 * Student.java의 TODO를 모두 완성한 후 이 클래스를 실행하세요.
 *
 * 실행 방법:
 * 1. exercises 디렉토리로 이동
 * 2. 컴파일: javac exercise_01/*.java
 * 3. 실행: java exercise_01.Main
 *
 * 예상 출력:
 * --------------------------------------
 * === 학생 등록 ===
 * 학생 등록: 김철수, 점수: 85
 * 학생 등록: 이영희, 점수: 92
 * 학생 등록: 박민수, 점수: 78
 *
 * === 개별 학생 정보 (인스턴스 메서드 호출) ===
 * 이름: 김철수, 점수: 85
 * 이름: 이영희, 점수: 92
 * 이름: 박민수, 점수: 78
 *
 * === 전체 통계 (클래스 메서드 호출) ===
 * === 전체 통계 ===
 * 전체 학생 수: 3명
 * 전체 점수 합계: 255점
 * 전체 평균 점수: 85.0점
 *
 * === 메모리 구조 이해 확인 ===
 * Student.getTotalCount() 호출 (클래스명으로 접근 - 권장): 3
 * student1.getInfo() 호출 (인스턴스로 접근 - 인스턴스 메서드): 이름: 김철수, 점수: 85
 * --------------------------------------
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== 학생 등록 ===");

        // 학생 인스턴스 생성 (힙 영역에 객체 생성)
        // student1, student2, student3은 지역 변수로 스택 영역에 저장됨 (참조값만)
        // 실제 Student 객체는 힙 영역에 저장됨
        Student student1 = new Student("김철수", 85);
        Student student2 = new Student("이영희", 92);
        Student student3 = new Student("박민수", 78);

        System.out.println();
        System.out.println("=== 개별 학생 정보 (인스턴스 메서드 호출) ===");

        // 인스턴스 메서드 호출: 각 객체의 고유 데이터 출력
        // 인스턴스 메서드는 반드시 인스턴스를 통해 호출해야 함
        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());

        System.out.println();
        System.out.println("=== 전체 통계 (클래스 메서드 호출) ===");

        // 클래스 메서드(static 메서드) 호출: 클래스명으로 직접 호출
        // static 메서드는 인스턴스 생성 없이 클래스명으로 호출 가능
        Student.printStatistics();

        System.out.println();
        System.out.println("=== 메모리 구조 이해 확인 ===");

        // static 메서드는 클래스명으로 접근하는 것이 권장됨
        System.out.println("Student.getTotalCount() 호출 (클래스명으로 접근 - 권장): "
                + Student.getTotalCount());

        // 인스턴스 메서드는 인스턴스를 통해 접근
        System.out.println("student1.getInfo() 호출 (인스턴스로 접근 - 인스턴스 메서드): "
                + student1.getInfo());

        /*
         * 추가 학습: 다음 코드의 차이점을 생각해보세요
         *
         * 1. Student.getTotalCount()  <- 클래스 메서드 호출 (권장)
         * 2. student1.getTotalCount() <- 인스턴스를 통한 클래스 메서드 호출 (비권장, 오해의 소지)
         *
         * 둘 다 같은 결과를 반환하지만, 1번이 코드의 의도를 더 명확하게 전달합니다.
         * static 메서드/변수는 클래스에 속하므로 클래스명으로 접근하는 것이 바람직합니다.
         */
    }
}
