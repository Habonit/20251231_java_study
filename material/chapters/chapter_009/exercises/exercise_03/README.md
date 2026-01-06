# 연습 문제 03: 상속 관계 상품 (기본)

## 문제 설명

쇼핑몰의 판매 상품을 상속을 활용하여 만들어보자.

`Book`, `Album`, `Movie` 3가지 상품 클래스를 만들어야 한다.
코드 중복 없이 상속 관계를 사용하며, 부모 클래스는 `Item`이다.

## 클래스 구조

```
Item (부모)
├── Book (자식)
├── Album (자식)
└── Movie (자식)
```

## 속성 정의

| 클래스 | 공통 속성 | 고유 속성 |
|:-------|:----------|:----------|
| Item | name, price | - |
| Book | (상속) | author, isbn |
| Album | (상속) | artist |
| Movie | (상속) | director, actor |

## 예상 출력

```
이름:JAVA, 가격:10000
- 저자:han, isbn:12345
이름:앨범1, 가격:15000
- 아티스트:seo
이름:영화1, 가격:18000
- 감독:감독1, 배우:배우1
상품 가격의 합: 43000
```

## 학습 포인트

1. **상속으로 중복 제거**: name, price는 Item에만 선언
2. **super() 생성자**: 자식이 부모의 필드를 초기화
3. **super.print()**: 부모의 메서드를 재사용하여 중복 제거
4. **private 필드**: 부모의 필드가 private이어도 super()로 초기화 가능

## 파일 구조

```
exercise_03/
├── README.md
├── Item.java      ← 부모 클래스 (TODO)
├── Book.java      ← 자식 클래스 (TODO)
├── Album.java     ← 자식 클래스 (TODO)
├── Movie.java     ← 자식 클래스 (TODO)
└── ShopMain.java  ← 실행 클래스 (완성됨)
```
