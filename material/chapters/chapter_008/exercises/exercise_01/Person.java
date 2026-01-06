package chapters.chapter08.exercises.exercise_01;

/**
 * 사람 정보를 담는 클래스.
 *
 * 핵심 포인트:
 * - address 필드는 final로 선언되어 있다.
 * - 따라서 address에 새로운 Address 객체를 할당하는 것은 불가능하다.
 * - 그러나 address가 가리키는 Address 객체 내부의 필드(city, district)는
 *   final이 아니므로 변경이 가능하다.
 */
public class Person {

    private final String name;       // 이름 (final - 변경 불가)
    public final Address address;    // 주소 (final 참조형 - 참조값 변경 불가, 내부 필드는 변경 가능)

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    /**
     * Person 정보를 출력한다.
     */
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("주소: " + address.getFullAddress());
    }
}
