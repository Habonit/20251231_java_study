# 연습 문제 2: 배열과 반복문

## 난이도: 응용

## 학습 목표

- 객체 배열을 선언하고 사용하는 방법을 익힌다
- 일반 for문의 구조를 이해한다
- 향상된 for문(Enhanced For Loop)의 구조를 이해한다

---

## 문제 설명

학생 성적 관리 프로그램을 만들려고 한다.
여러 학생의 정보를 배열로 관리하고, 반복문을 사용하여 출력하라.

---

## 요구 사항

1. `Student.java`에 `Student` 클래스를 정의하라
   - 이름 (`name`): String
   - 나이 (`age`): int
   - 성적 (`grade`): int

2. `Main.java`에서:
   - Student 객체 3개를 생성하라
   - Student 배열에 저장하라
   - **일반 for문**으로 학생 정보를 출력하라
   - **향상된 for문**으로 학생 정보를 다시 출력하라
   - 전체 학생의 **평균 성적**을 계산하여 출력하라

---

## 예상 출력

```
=== 일반 for문 출력 ===
이름: 김철수, 나이: 15, 성적: 85
이름: 이영희, 나이: 16, 성적: 92
이름: 박민수, 나이: 15, 성적: 78

=== 향상된 for문 출력 ===
이름: 김철수, 나이: 15, 성적: 85
이름: 이영희, 나이: 16, 성적: 92
이름: 박민수, 나이: 15, 성적: 78

평균 성적: 85.0
```

---

## 힌트

### 일반 for문 구조
```java
for (int i = 0; i < students.length; i++) {
    // i: 인덱스 변수 (0부터 시작)
    // students.length: 배열의 길이
    // i++: i를 1씩 증가
    Student s = students[i];
    System.out.println(s.name);
}
```

### 향상된 for문 구조
```java
for (Student s : students) {
    // students 배열의 각 요소가 차례로 s에 대입됨
    System.out.println(s.name);
}
```
