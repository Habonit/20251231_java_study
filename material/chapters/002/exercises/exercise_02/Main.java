/**
 * 연습 문제 2: 참조형의 메서드 전달
 *
 * public static void의 의미:
 *
 * 1. public - 접근 제어자
 *    - 어디서든 이 메서드에 접근할 수 있다
 *    - Python에서는 기본적으로 모든 함수가 public이다
 *
 * 2. static - 정적 메서드
 *    - 객체 생성 없이 클래스명.메서드명()으로 호출 가능
 *    - Python의 @staticmethod와 유사 (self 매개변수 없음)
 *    - main 메서드에서 직접 호출하려면 static이어야 한다
 *
 * 3. void - 반환 타입
 *    - 반환값이 없음을 의미
 *    - Python에서 return이 없거나 return None과 같다
 *    - 반환값이 있으면 int, String 등의 타입을 명시
 */
public class Main {

    public static void main(String[] args) {

        // === 기본형 전달 실험 ===
        System.out.println("=== 기본형 전달 실험 ===");

        // TODO: int 변수 number를 선언하고 10을 대입하세요
        int number = 10;

        System.out.println("변경 전: number = " + number);
        System.out.println("메서드 호출 (내부에서 20으로 변경 시도)");

        // TODO: changePrimitive(number)를 호출하세요
        changePrimitive(number);

        // TODO: number 값을 출력하세요 (원본이 변경되었는지 확인)
        System.out.println("변경 후: number = " + number);


        System.out.println("-> 기본형은 복사되어 전달되므로 원본 불변\n");


        // === 참조형 전달 실험 ===
        System.out.println("=== 참조형 전달 실험 ===");

        // TODO: Student 객체를 생성하고 name="홍길동", score=60을 대입하세요
        Student student = new Student();
        student.name = "홍길동";
        student.score = 60;

        System.out.println("변경 전: student.score = " + student.score);
        System.out.println("메서드 호출 (내부에서 100으로 변경 시도)");

        // TODO: changeReference(student)를 호출하세요
        changeReference(student);

        // TODO: student.score를 출력하세요 (원본이 변경되었는지 확인)
        System.out.println("변경 후: student.score = " + student.score);


        System.out.println("-> 참조형은 같은 객체를 가리키므로 원본 변경됨");
    }

    /**
     * 기본형을 전달받아 값을 변경하는 메서드.
     *
     * @param value 변경할 값 (기본형 - 복사본이 전달됨)
     */
    // TODO: changePrimitive 메서드를 완성하세요
    // - 매개변수 value를 20으로 변경
    // - 메서드 내부에서 변경된 값 출력
    public static void changePrimitive(int value) {
        value = 20;
        System.out.println("  (메서드 내부) value = " + value);
    }

    /**
     * 참조형을 전달받아 객체의 값을 변경하는 메서드.
     *
     * @param student 변경할 학생 객체 (참조형 - 참조값이 전달됨)
     */
    // TODO: changeReference 메서드를 완성하세요
    // - student.score를 100으로 변경
    // - 메서드 내부에서 변경된 값 출력
    public static void changeReference(Student student) {
        student.score = 100;
        System.out.println("  (메서드 내부) student.score = " + student.score);
    }
}
