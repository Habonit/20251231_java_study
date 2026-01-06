# 챕터 7: 자바 메모리 구조와 static

> 교안: `material/pdf/7. 자바 메모리 구조와 static.pdf`

---

## 1. 학습 목표

- 자바 메모리 구조(메서드 영역, 스택 영역, 힙 영역)의 역할과 차이를 이해한다
- 변수의 종류(지역 변수, 인스턴스 변수, 클래스 변수)와 각각이 저장되는 메모리 영역을 이해한다
- `static` 키워드의 의미와 활용 방법을 익힌다
- 정적 메서드와 인스턴스 메서드의 차이를 이해한다

---

## 2. 핵심 개념

### 2.1 자바 메모리 구조

자바의 메모리 구조는 크게 **3개 영역**으로 나뉜다:

```
┌─────────────────────────────────────────────────────────────┐
│                        JVM 메모리                            │
├─────────────────┬─────────────────┬─────────────────────────┤
│   메서드 영역    │    스택 영역     │        힙 영역          │
│  (Method Area)  │  (Stack Area)   │     (Heap Area)        │
├─────────────────┼─────────────────┼─────────────────────────┤
│ - 클래스 정보    │ - 스택 프레임    │ - 객체(인스턴스)        │
│ - static 변수   │ - 지역 변수     │ - 배열                  │
│ - 런타임 상수 풀 │ - 매개변수      │                        │
│ - 메서드 코드   │ - 참조값        │                        │
└─────────────────┴─────────────────┴─────────────────────────┘
```

#### 메서드 영역 (Method Area)

- **역할**: 프로그램 실행에 필요한 공통 데이터를 관리하는 공간
- **저장 내용**:
  - **클래스 정보**: 클래스의 실행 코드(바이트 코드), 필드, 메서드, 생성자 코드 등
  - **static 영역**: `static` 변수들을 보관
  - **런타임 상수 풀**: 프로그램 실행에 필요한 공통 리터럴 상수
- **특징**: 프로그램의 모든 영역에서 공유됨

#### 스택 영역 (Stack Area)

- **역할**: 실제 프로그램이 실행되는 영역
- **저장 내용**:
  - **스택 프레임**: 메서드 호출 시마다 하나씩 생성
  - **지역 변수**: 매개변수 포함
  - **중간 연산 결과**
- **특징**: 후입선출(LIFO) 구조, 메서드 종료 시 스택 프레임과 함께 지역 변수도 제거

#### 힙 영역 (Heap Area)

- **역할**: 객체(인스턴스)와 배열이 생성되는 영역
- **저장 내용**:
  - `new` 키워드로 생성된 모든 객체
  - 배열
- **특징**: 가비지 컬렉션(GC)이 이루어지는 주요 영역, 참조되지 않는 객체는 GC에 의해 제거

---

### 2.2 변수의 종류와 메모리 영역

```java
public class Example {
    // 클래스 변수 (정적 변수) - 메서드 영역의 static 영역에 저장
    public static int classVariable;

    // 인스턴스 변수 - 힙 영역에 저장 (객체 내부)
    public int instanceVariable;

    public void method() {
        // 지역 변수 - 스택 영역에 저장
        int localVariable = 10;
    }
}
```

| 변수 종류 | 저장 위치 | 생성 시점 | 소멸 시점 |
|:---------|:---------|:---------|:---------|
| 지역 변수 | 스택 영역 | 메서드 호출 시 | 메서드 종료 시 |
| 인스턴스 변수 | 힙 영역 | `new` 로 객체 생성 시 | GC에 의해 제거 시 |
| 클래스 변수 | 메서드 영역 (static) | JVM 클래스 로딩 시 | JVM 종료 시 |

**용어 정리**:
- **멤버 변수** = 인스턴스 변수 + 클래스 변수 (필드에 선언된 변수)
- **인스턴스 변수**: `static`이 붙지 않은 멤버 변수
- **클래스 변수** (= 정적 변수 = static 변수): `static`이 붙은 멤버 변수

---

### 2.3 스택 영역의 동작 원리

스택 영역은 **스택(Stack) 자료구조** 방식으로 동작한다:

- **후입선출 (LIFO, Last In First Out)**: 나중에 넣은 것이 먼저 나옴
- 메서드 호출 시 스택 프레임이 **쌓이고**, 메서드 종료 시 **제거**됨

```java
public class StackExample {
    public static void main(String[] args) {
        System.out.println("main start");
        method1();
        System.out.println("main end");
    }

    static void method1() {
        System.out.println("method1 start");
        method2();
        System.out.println("method1 end");
    }

    static void method2() {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
```

실행 결과:
```
main start
method1 start
method2 start
method2 end
method1 end
main end
```

스택 프레임 변화:
```
호출 순서:                    종료 순서:
┌──────────────┐             ┌──────────────┐
│  method2()   │  ← 3번째     │  (제거됨)    │  ← 1번째 종료
├──────────────┤             ├──────────────┤
│  method1()   │  ← 2번째     │  method1()   │  ← 2번째 종료
├──────────────┤             ├──────────────┤
│   main()     │  ← 1번째     │   main()     │  ← 3번째 종료
└──────────────┘             └──────────────┘
```

---

### 2.4 static 변수

#### static 변수가 필요한 이유

인스턴스 변수는 각 인스턴스마다 **별도로 생성**되므로, 인스턴스 간에 값을 공유할 수 없다.
`static` 변수를 사용하면 모든 인스턴스가 **하나의 변수를 공유**할 수 있다.

```java
public class Counter {
    public String name;
    public static int count;  // 모든 인스턴스가 공유

    public Counter(String name) {
        this.name = name;
        count++;  // 인스턴스 생성 시마다 증가
    }
}
```

```java
Counter c1 = new Counter("A");  // count = 1
Counter c2 = new Counter("B");  // count = 2
Counter c3 = new Counter("C");  // count = 3

System.out.println(Counter.count);  // 출력: 3
```

#### static 변수 접근 방법

```java
// 권장: 클래스명으로 접근
System.out.println(Counter.count);

// 비권장: 인스턴스로 접근 (오해의 소지가 있음)
System.out.println(c1.count);
```

**클래스명으로 접근하는 것이 권장됨** - 정적 변수임을 명확히 알 수 있기 때문

---

### 2.5 static 메서드

#### 정적 메서드 vs 인스턴스 메서드

| 구분 | 정적 메서드 (클래스 메서드) | 인스턴스 메서드 |
|:-----|:--------------------------|:---------------|
| 선언 | `static` 키워드 사용 | `static` 없음 |
| 호출 | 클래스명으로 바로 호출 가능 | 인스턴스 생성 후 호출 |
| 접근 가능 | static 변수, static 메서드만 | 모든 변수, 모든 메서드 |

```java
public class Calculator {
    private int instanceValue;
    private static int staticValue;

    // 정적 메서드: static만 접근 가능
    public static int add(int a, int b) {
        // instanceValue++;  // 컴파일 에러!
        staticValue++;       // OK
        return a + b;
    }

    // 인스턴스 메서드: 모두 접근 가능
    public void printAll() {
        instanceValue++;     // OK
        staticValue++;       // OK
    }
}
```

#### 정적 메서드가 인스턴스를 사용할 수 없는 이유

정적 메서드는 클래스명으로 직접 호출되므로, **어떤 인스턴스의 데이터를 사용해야 하는지 알 수 없다**.
참조값의 개념이 없기 때문에 인스턴스 변수나 인스턴스 메서드에 접근할 수 없다.

---

### 2.6 static import

`static import`를 사용하면 클래스명 없이 정적 메서드/변수를 사용할 수 있다:

```java
import static java.lang.Math.abs;
import static java.lang.Math.max;
// 또는 import static java.lang.Math.*;

public class Example {
    public static void main(String[] args) {
        // Math.abs(-10) 대신
        int result = abs(-10);

        // Math.max(5, 10) 대신
        int bigger = max(5, 10);
    }
}
```

---

### 2.7 main() 메서드가 static인 이유

`main()` 메서드는 프로그램의 시작점이다. 프로그램 시작 시점에는 아직 어떤 인스턴스도 생성되지 않았으므로,
**인스턴스 생성 없이 호출 가능한 정적 메서드**로 선언되어야 한다.

```java
public class Main {
    public static void main(String[] args) {  // static!
        // 프로그램 시작점
    }
}
```

---

## 3. 실무 활용 사례

### 유틸리티 클래스

인스턴스 변수 없이 **순수하게 기능만 제공**하는 클래스는 정적 메서드로 구현한다:

```java
public class MathUtils {
    // 인스턴스 생성 방지
    private MathUtils() {}

    public static int sum(int[] array) {
        int total = 0;
        for (int value : array) {
            total += value;
        }
        return total;
    }

    public static int max(int[] array) {
        int maxValue = array[0];
        for (int value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }
}

// 사용
int[] numbers = {1, 2, 3, 4, 5};
System.out.println(MathUtils.sum(numbers));  // 15
System.out.println(MathUtils.max(numbers));  // 5
```

---

## 4. 핵심 정리

| 개념 | 설명 |
|:-----|:-----|
| 메서드 영역 | 클래스 정보, static 변수, 메서드 코드 저장 |
| 스택 영역 | 지역 변수, 매개변수, 스택 프레임 저장 (LIFO) |
| 힙 영역 | 객체(인스턴스), 배열 저장, GC 대상 |
| static 변수 | 모든 인스턴스가 공유, 메서드 영역에 저장 |
| static 메서드 | 인스턴스 생성 없이 호출 가능, static만 접근 가능 |
| 인스턴스 메서드 | 인스턴스 생성 후 호출, 모든 변수/메서드 접근 가능 |

---

## 5. 연습 문제

- `exercises/` 디렉토리의 연습 문제를 풀어보세요
- TODO 주석을 따라 코드를 완성하면 됩니다

---

## 6. 참고 자료

- 강의 노트: `material/chapters/007/note.md`
- 교안 PDF: `material/pdf/7. 자바 메모리 구조와 static.pdf`
