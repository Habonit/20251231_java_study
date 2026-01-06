해당 문제는 3. 객체 지향 프로그래밍의 15p의 1번 문제입니다.

---

## `this` 키워드 개념 정리

### `this`란?

`this`는 **현재 객체 자신을 가리키는 참조 변수**이다.

메서드나 생성자 내부에서 `this`를 사용하면, 해당 메서드를 호출한 객체의 인스턴스를 참조한다.

### 왜 `this`가 필요한가?

#### 1. 매개변수와 필드 이름이 같을 때 구분

```java
int width;  // 필드(인스턴스 변수)

void initRectangle(int width, int height) {  // 매개변수
    this.width = width;  // this.width = 필드, width = 매개변수
    this.height = height;
}
```

- `width`만 쓰면 → **매개변수**를 가리킴 (가까운 스코프 우선)
- `this.width`라고 쓰면 → **필드(인스턴스 변수)**를 가리킴

#### 2. 현재 객체의 필드에 명시적으로 접근

```java
int calculateArea() {
    int tempArea = this.width * this.height;  // 현재 객체의 width, height 사용
    return tempArea;
}
```

### 코드에서의 `this` 사용 예시

| 코드 | 설명 |
|:-----|:-----|
| `this.width = width;` | 필드 `width`에 매개변수 `width` 값을 대입 |
| `this.height = height;` | 필드 `height`에 매개변수 `height` 값을 대입 |
| `this.width * this.height` | 현재 객체의 `width`와 `height`를 곱함 |
| `this.width == this.height` | 현재 객체의 `width`와 `height`가 같은지 비교 |

### `this`를 생략할 수 있는 경우

매개변수와 필드 이름이 **다를 때**는 `this`를 생략할 수 있다:

```java
int w;  // 필드 이름: w
int h;  // 필드 이름: h

void initRectangle(int width, int height) {  // 매개변수 이름: width, height
    w = width;   // this.w = width 와 동일 (이름이 달라서 혼동 없음)
    h = height;  // this.h = height 와 동일
}
```

하지만 **가독성과 명확성**을 위해 `this`를 명시적으로 사용하는 것이 좋다.

### 핵심 요약

| 개념 | 설명 |
|:-----|:-----|
| `this` | 현재 객체 자신을 가리키는 참조 |
| 사용 이유 | 매개변수와 필드 이름이 같을 때 구분 |
| 권장 사항 | 필드 접근 시 `this`를 명시적으로 사용하면 코드가 명확해짐 | 