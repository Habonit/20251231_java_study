/**
 * 연습 문제 1: this 키워드 이해하기
 *
 * 학습 목표:
 * - this 키워드가 왜 필요한지 이해한다
 * - 매개변수와 멤버변수의 이름이 같을 때 this로 구분하는 방법을 익힌다
 * - this 키워드의 의미(인스턴스 자신의 참조값)를 이해한다
 *
 * 배경 설명:
 * - 매개변수와 멤버변수의 이름이 같으면 매개변수가 우선순위를 가진다
 * - 멤버변수에 접근하려면 this.을 붙여야 한다
 * - this는 인스턴스 자신의 참조값을 가리킨다
 */
public class Student {

    // 멤버 변수 (필드)
    String name;
    int age;
    int score;

    /**
     * TODO 1: initStudent 메서드를 완성하세요.
     *
     * 요구사항:
     * - 매개변수로 받은 값을 멤버변수에 저장해야 한다
     * - 매개변수 이름과 멤버변수 이름이 같으므로 this 키워드를 사용해야 한다
     *
     * 힌트:
     * - this.name은 멤버변수 name을 의미한다
     * - name만 쓰면 매개변수 name을 의미한다
     *
     * @param name  학생 이름
     * @param age   학생 나이
     * @param score 학생 점수
     */
    void initStudent(String name, int age, int score) {
        // TODO: 아래 코드를 완성하세요
        // this.___ = ___;
        // this.___ = ___;
        // this.___ = ___;
        this.name = name;
        this.age = age;
        this.score = score;
    }

    /**
     * TODO 2: 학생 정보를 출력하는 메서드를 완성하세요.
     *
     * 요구사항:
     * - "이름: {name}, 나이: {age}, 점수: {score}" 형식으로 출력
     *
     * 힌트:
     * - 멤버변수에 접근할 때 this를 생략해도 되지만, 명시적으로 써도 좋다
     */
    void displayInfo() {
        // TODO: 학생 정보를 출력하세요
        System.out.println("이름: " + this.name + ", 나이: " + this.age + ", 점수: " + this.score);
    }
}
