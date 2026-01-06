# 연습 문제 02: super 생성자와 초기화 순서

## 학습 목표

- `super()` 키워드로 부모 생성자를 호출하는 방법을 익힌다
- 상속 관계에서 생성자 호출 순서를 이해한다
- 부모 클래스에 기본 생성자가 없을 때 `super()`가 필수임을 이해한다

---

## 문제 설명

직원 관리 시스템을 만들어보자.
`Employee` 부모 클래스와 `Developer`, `Manager` 자식 클래스를 구현한다.

### 클래스 구조

```
Employee (부모)
├── name: String
├── salary: int
├── Employee(name, salary): 생성자
└── getInfo(): String

Developer (자식)
├── programmingLanguage: String
├── Developer(name, salary, programmingLanguage): 생성자
└── getInfo(): String (오버라이딩 + super.getInfo() 활용)

Manager (자식)
├── teamSize: int
├── Manager(name, salary, teamSize): 생성자
└── getInfo(): String (오버라이딩 + super.getInfo() 활용)
```

---

## 파일 구조

```
exercise_02/
├── README.md          # 이 문서
├── Employee.java      # 부모 클래스 (TODO)
├── Developer.java     # 자식 클래스 (TODO)
├── Manager.java       # 자식 클래스 (TODO)
└── Main.java          # 실행 클래스
```

---

## TODO 과제

### Employee.java
1. `name`, `salary` 필드 선언
2. 생성자에서 name, salary 초기화 + "Employee 생성자 호출" 출력
3. `getInfo()` 메서드 - "이름: [name], 급여: [salary]원" 반환

### Developer.java
1. `Employee` 상속
2. `programmingLanguage` 필드 선언
3. 생성자에서 `super(name, salary)` 호출 + 고유 필드 초기화 + "Developer 생성자 호출" 출력
4. `getInfo()` 오버라이딩 - `super.getInfo()` + ", 언어: [programmingLanguage]" 반환

### Manager.java
1. `Employee` 상속
2. `teamSize` 필드 선언
3. 생성자에서 `super(name, salary)` 호출 + 고유 필드 초기화 + "Manager 생성자 호출" 출력
4. `getInfo()` 오버라이딩 - `super.getInfo()` + ", 팀원: [teamSize]명" 반환

---

## 예상 출력

```
=== Developer 생성 ===
Employee 생성자 호출
Developer 생성자 호출

=== Manager 생성 ===
Employee 생성자 호출
Manager 생성자 호출

=== 직원 정보 출력 ===
이름: 김개발, 급여: 5000원, 언어: Java
이름: 박매니저, 급여: 6000원, 팀원: 5명
```

---

## 핵심 포인트

### 1. 생성자 호출 순서

자식 생성자 첫 줄에서 `super(...)`를 호출하기 때문에,
**부모 생성자가 먼저 실행**되고 그 다음 자식 생성자가 실행된다.

```
Developer dev = new Developer(...);

실행 순서:
1. Developer 생성자 호출
2. super(name, salary) 실행 → Employee 생성자로 이동
3. Employee 생성자 코드 실행 ("Employee 생성자 호출" 출력)
4. Employee 생성자 완료 → Developer 생성자로 돌아옴
5. Developer 생성자 나머지 코드 실행 ("Developer 생성자 호출" 출력)
```

### 2. super() 필수 상황

부모 클래스에 **기본 생성자(파라미터 없음)가 없으면**, 자식 생성자에서 `super(...)`를 **반드시 명시적으로 호출**해야 한다.

```java
public class Employee {
    public Employee(String name, int salary) {  // 기본 생성자 없음!
        // ...
    }
}

public class Developer extends Employee {
    public Developer(String name, int salary, String lang) {
        super(name, salary);  // 필수! 생략하면 컴파일 오류
        // ...
    }
}
```

### 3. super.메서드() 활용

오버라이딩 시 부모의 기능을 완전히 대체하지 않고, **부모 기능에 추가**할 수 있다.

```java
@Override
public String getInfo() {
    return super.getInfo() + ", 언어: " + programmingLanguage;
}
```
