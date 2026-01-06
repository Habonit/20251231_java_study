# 연습 문제 04: 상속 관계 상품 (심화 - 할인 기능)

## 문제 설명

exercise_03의 확장 버전이다.
기존 상품 시스템에 **할인 기능**을 추가한다.

## 추가 요구사항

1. **Item 클래스에 할인율 적용 기능 추가**
   - `getDiscountedPrice(int discountPercent)` 메서드 추가
   - 할인된 가격을 반환 (정수 계산)

2. **DiscountBook 클래스 신규 생성**
   - Book을 상속받는다 (3단계 상속: Item -> Book -> DiscountBook)
   - 고정 할인율(`discountPercent`)을 필드로 가진다
   - `getPrice()` 메서드를 오버라이딩하여 할인 적용된 가격 반환
   - `print()` 메서드를 오버라이딩하여 할인율 정보도 출력

## 클래스 구조

```
Item (최상위 부모)
├── Book
│   └── DiscountBook (3단계 상속!)
├── Album
└── Movie
```

## 예상 출력

```
=== 일반 상품 ===
이름:JAVA, 가격:10000
- 저자:han, isbn:12345
이름:앨범1, 가격:15000
- 아티스트:seo

=== 할인 상품 ===
이름:할인책, 가격:8000 (20% 할인 적용)
- 저자:kim, isbn:99999

=== 가격 합계 ===
일반 가격 합계: 25000
할인 적용 후 합계: 23000
```

## 학습 포인트

1. **다단계 상속**: Item -> Book -> DiscountBook (3단계)
2. **메서드 오버라이딩 체인**: 각 단계에서 super 활용
3. **super.super는 불가**: Java는 super.super.method() 지원 안 함
4. **설계의 유연성**: 기존 코드 수정 없이 새 기능 추가

## 파일 구조

```
exercise_04/
├── README.md
├── Item.java         ← 부모 클래스 + getDiscountedPrice() 추가 (TODO)
├── Book.java         ← exercise_03과 동일 (TODO)
├── Album.java        ← exercise_03과 동일 (TODO)
├── DiscountBook.java ← Book 상속, 할인 기능 (TODO - 신규!)
└── ShopMain.java     ← 실행 클래스 (완성됨)
```
