package chapters.chapter07.exercises.exercise_02;

/**
 * 연습 문제 2: 구매한 자동차 수 - 메인 실행 클래스
 *
 * Car.java의 TODO를 모두 완성한 후 이 클래스를 실행하세요.
 *
 * 실행 방법:
 * 1. exercises 디렉토리로 이동
 * 2. 컴파일: javac exercise_02/*.java
 * 3. 실행: java exercise_02.CarMain
 *
 * 예상 출력:
 * 차량 구입, 이름: K3
 * 차량 구입, 이름: G80
 * 차량 구입, 이름: Model Y
 * 구매한 차량 수: 3
 */
public class CarMain {

    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        Car.showTotalCars();  // 구매한 차량 수를 출력하는 static 메서드
    }
}
