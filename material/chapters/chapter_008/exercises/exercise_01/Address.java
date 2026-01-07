package chapters.chapter08.exercises.exercise_01;

/**
 * 주소 정보를 담는 클래스.
 *
 * 주의: 이 클래스의 필드들은 final이 아니다.
 * 따라서 외부에서 값을 변경할 수 있다.
 */
public class Address {

    public String city;     // 시/도 (final 아님 - 변경 가능)
    public String district; // 구/군 (final 아님 - 변경 가능)

    public Address(String city, String district) {
        this.city = city;
        this.district = district;
    }

    /**
     * 주소 정보를 문자열로 반환한다.
     */
    public String getFullAddress() {
        return city + " " + district;
    }
}
