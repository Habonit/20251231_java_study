package chapters.chapter09.exercises.exercise_01;

/**
 * 연습 문제 01: 상속 기본과 메서드 오버라이딩 - 실행 클래스.
 *
 * Animal.java, Dog.java, Cat.java의 TODO를 모두 완성한 후 실행하세요.
 *
 * 예상 출력:
 * =============
 * === 동물 생성 ===
 * 바둑이 생성!
 * 나비 생성!
 *
 * === speak() 호출 - 오버라이딩 확인 ===
 * 멍멍!
 * 야옹~
 *
 * === move() 호출 - 부모 메서드 사용 ===
 * 바둑이이(가) 이동합니다.
 * 나비이(가) 이동합니다.
 *
 * === 고유 기능 호출 ===
 * 바둑이이(가) 공을 물어옵니다.
 * 나비이(가) 긁습니다.
 * =============
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("=== 동물 생성 ===");

        // Dog와 Cat 인스턴스 생성
        // 자식 클래스 인스턴스 생성 시, 힙 메모리에 부모(Animal)와 자식(Dog/Cat)이 함께 생성됨
        Dog dog = new Dog("바둑이");
        Cat cat = new Cat("나비");

        System.out.println();
        System.out.println("=== speak() 호출 - 오버라이딩 확인 ===");

        // speak() 호출 - 오버라이딩된 자식 메서드가 호출됨
        // Dog의 speak() -> "멍멍!"
        // Cat의 speak() -> "야옹~"
        dog.speak();
        cat.speak();

        System.out.println();
        System.out.println("=== move() 호출 - 부모 메서드 사용 ===");

        // move() 호출 - 자식에 없으므로 부모(Animal)의 메서드가 호출됨
        // 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 거슬러 올라감
        dog.move();
        cat.move();

        System.out.println();
        System.out.println("=== 고유 기능 호출 ===");

        // 각 자식 클래스의 고유 기능 호출
        dog.fetch();
        cat.scratch();
    }
}
