# 연습 문제 5: Scanner를 이용한 사용자 입력

## 학습 목표

- Scanner 클래스를 사용하여 사용자 입력을 받는 방법을 익힌다
- nextInt(), nextLine() 등 입력 메서드의 차이를 이해한다
- 입력 버퍼 처리 방법을 익힌다

---

## Scanner란?

Java에서 **사용자 입력을 받기 위한 클래스**이다.
Python의 `input()`과 유사하지만, 타입별로 메서드가 분리되어 있다.

---

## Scanner 사용법

### 1. import 선언

```java
import java.util.Scanner;
```

- Scanner는 `java.util` 패키지에 있다
- 파일 최상단에 선언해야 한다
- Python의 `from module import class`와 유사

### 2. Scanner 객체 생성

```java
Scanner scanner = new Scanner(System.in);
```

| 구성 요소 | 설명 |
|:-----|:-----|
| `Scanner` | 클래스 타입 |
| `scanner` | 변수명 (자유롭게 지정) |
| `new Scanner()` | 객체 생성 |
| `System.in` | 표준 입력 (키보드) |

Python 비교:
```python
# Python은 별도 객체 생성 불필요
user_input = input()
```

### 3. 입력 메서드

| 메서드 | 반환 타입 | 설명 | Python 비교 |
|:-----|:-----|:-----|:-----|
| `nextLine()` | String | 한 줄 전체 읽기 (엔터까지) | `input()` |
| `nextInt()` | int | 정수 읽기 | `int(input())` |
| `nextDouble()` | double | 실수 읽기 | `float(input())` |
| `next()` | String | 공백 전까지 한 단어 읽기 | `input().split()[0]` |

### 4. Scanner 닫기

```java
scanner.close();
```

- 사용이 끝나면 리소스 해제
- 안 해도 동작하지만, 권장 사항

---

## 코드에 적용된 Scanner 문법

### 전체 흐름

```java
import java.util.Scanner;  // 1. import

public class ProductOrderMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // 2. 객체 생성

        int n = scanner.nextInt();      // 3. 정수 입력
        scanner.nextLine();             // 4. 버퍼 비우기

        String name = scanner.nextLine();  // 5. 문자열 입력

        scanner.close();                // 6. 리소스 해제
    }
}
```

### 상세 설명

#### 정수 입력 받기
```java
System.out.println("상품 개수를 입력하세요: ");
int n = scanner.nextInt();
```
- `nextInt()`: 입력에서 정수만 읽음
- 엔터(\n)는 버퍼에 남아있음

#### 버퍼 비우기 (중요!)
```java
scanner.nextLine();  // 버퍼에 남은 엔터 제거
```

**왜 필요한가?**

```
사용자 입력: "3" + [Enter]
           ↑     ↑
       nextInt() 읽음  버퍼에 남음
```

`nextInt()` 후 바로 `nextLine()`을 호출하면 버퍼의 엔터를 읽어서 빈 문자열이 반환된다.

```java
// 문제 상황
int n = scanner.nextInt();       // "3" 읽음, "\n" 남음
String name = scanner.nextLine(); // "\n" 읽음 -> 빈 문자열!

// 해결
int n = scanner.nextInt();
scanner.nextLine();              // "\n" 제거
String name = scanner.nextLine(); // 정상적으로 입력 받음
```

#### 문자열 입력 받기
```java
System.out.println("상품 이름을 입력하세요: ");
String productName = scanner.nextLine();
```
- `nextLine()`: 엔터 전까지 한 줄 전체를 읽음
- 공백 포함 가능 (예: "김치 볶음밥")

---

## Python과 Java 비교

### 정수 입력

```python
# Python
n = int(input("개수: "))
```

```java
// Java
System.out.println("개수: ");
int n = scanner.nextInt();
scanner.nextLine();  // 버퍼 비우기
```

### 문자열 입력

```python
# Python
name = input("이름: ")
```

```java
// Java
System.out.println("이름: ");
String name = scanner.nextLine();
```

### 반복문에서 입력

```python
# Python
for i in range(n):
    name = input(f"{i+1}번째 상품: ")
    price = int(input("가격: "))
```

```java
// Java
for (int i = 0; i < n; i++) {
    System.out.println((i+1) + "번째 상품: ");
    String name = scanner.nextLine();

    System.out.println("가격: ");
    int price = scanner.nextInt();
    scanner.nextLine();  // 버퍼 비우기
}
```

---

## 자주 하는 실수

### 1. nextInt() 후 nextLine() 누락

```java
// 잘못된 코드
int n = scanner.nextInt();
String name = scanner.nextLine();  // 빈 문자열이 들어감!

// 올바른 코드
int n = scanner.nextInt();
scanner.nextLine();  // 버퍼 비우기
String name = scanner.nextLine();
```

### 2. import 누락

```java
// 에러: Scanner를 찾을 수 없음
Scanner scanner = new Scanner(System.in);

// 해결: 파일 상단에 import 추가
import java.util.Scanner;
```

### 3. close() 후 사용

```java
scanner.close();
scanner.nextLine();  // 에러: Scanner가 닫혀있음
```

---

## 실행 예시

```
상품 개수를 입력하세요:
2
1번째 상품 이름을 입력하세요:
두부
1번째 상품 수량을 입력하세요:
2
1번째 상품 가격을 입력하세요:
2000
2번째 상품 이름을 입력하세요:
김치
2번째 상품 수량을 입력하세요:
1
2번째 상품 가격을 입력하세요:
5000
두부
2
2000
김치
1
5000
totalAmount = 9000
```
