# 연습 문제 01: 상속 기본과 메서드 오버라이딩

## 학습 목표

- `extends` 키워드를 사용하여 상속 관계를 구현한다
- 부모 클래스의 메서드를 자식 클래스에서 오버라이딩한다
- `@Override` 어노테이션의 사용법을 익힌다
- `super` 키워드로 부모 클래스의 메서드를 호출한다

---

## 문제 설명

동물원 시스템을 만들어보자. `Animal` 부모 클래스와 `Dog`, `Cat` 자식 클래스를 구현한다.

### 클래스 구조

```
Animal (부모)
├── name: String
├── speak(): void - "동물이 소리를 냅니다."
└── move(): void - "동물이 이동합니다."

Dog (자식)
├── speak(): void - 오버라이딩 → "멍멍!"
└── fetch(): void - 고유 기능 → "공을 물어옵니다."

Cat (자식)
├── speak(): void - 오버라이딩 → "야옹~"
└── scratch(): void - 고유 기능 → "긁습니다."
```

---

## 파일 구조

```
exercise_01/
├── README.md          # 이 문서
├── Animal.java        # 부모 클래스 (TODO)
├── Dog.java           # 자식 클래스 (TODO)
├── Cat.java           # 자식 클래스 (TODO)
└── Main.java          # 실행 클래스
```

---

## TODO 과제

### Animal.java
1. `name` 필드 선언 (protected)
2. 생성자에서 name 초기화
3. `speak()` 메서드 구현 - "동물이 소리를 냅니다." 출력
4. `move()` 메서드 구현 - "[이름]이(가) 이동합니다." 출력

### Dog.java
1. `Animal` 클래스를 상속받는다
2. `speak()` 메서드를 오버라이딩하여 "멍멍!" 출력
3. `fetch()` 고유 메서드 구현 - "[이름]이(가) 공을 물어옵니다." 출력

### Cat.java
1. `Animal` 클래스를 상속받는다
2. `speak()` 메서드를 오버라이딩하여 "야옹~" 출력
3. `scratch()` 고유 메서드 구현 - "[이름]이(가) 긁습니다." 출력

---

## 예상 출력

```
=== 동물 생성 ===
바둑이 생성!
나비 생성!

=== speak() 호출 - 오버라이딩 확인 ===
멍멍!
야옹~

=== move() 호출 - 부모 메서드 사용 ===
바둑이이(가) 이동합니다.
나비이(가) 이동합니다.

=== 고유 기능 호출 ===
바둑이이(가) 공을 물어옵니다.
나비이(가) 긁습니다.
```

---

## 핵심 포인트

1. **extends**: 상속 관계 선언
   ```java
   public class Dog extends Animal { }
   ```

2. **@Override**: 부모 메서드 재정의 시 반드시 붙이기 (관례)
   ```java
   @Override
   public void speak() {
       System.out.println("멍멍!");
   }
   ```

3. **super**: 부모 클래스 접근
   ```java
   super.speak();  // 부모의 speak() 호출
   ```

4. **protected**: 자식 클래스에서 접근 가능한 접근 제어자
