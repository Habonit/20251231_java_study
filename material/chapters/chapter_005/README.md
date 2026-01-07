# 챕터 5: 패키지

> 학습 날짜: 2026-01-04

## 핵심 개념

### 패키지란?

클래스를 분류하기 위한 **디렉토리(폴더)** 개념이다.

```
com/
└── helloshop/
    ├── user/
    │   └── User.java
    ├── product/
    │   └── Product.java
    └── order/
        └── Order.java
```

---

## package와 import

### package

현재 자바 파일이 위치한 경로를 선언한다.

```java
package com.helloshop.user;  // 이 파일은 com/helloshop/user/ 에 있음

public class User {
    // ...
}
```

### import

다른 패키지의 클래스를 가져와서 사용할 때 쓴다.

```java
package com.helloshop.order;

import com.helloshop.user.User;      // 특정 클래스 import
import com.helloshop.product.*;       // 패키지 내 모든 클래스 import

public class Order {
    User user;  // import 덕분에 패키지명 생략 가능
}
```

---

## 패키지 규칙

| 규칙 | 필수/관례 |
|:----|:--------|
| 패키지 이름과 폴더 위치가 일치해야 함 | 필수 |
| 패키지 이름은 모두 소문자 | 관례 |
| 회사 도메인의 역순으로 시작 | 관례 |

```java
// 도메인: helloshop.com → 패키지: com.helloshop
package com.helloshop.user;
```

도메인 역순을 사용하면 다른 라이브러리와 패키지명이 겹치지 않는다.

---

## 접근 제어자와 패키지

`public`을 붙여야 **다른 패키지**에서도 클래스를 사용할 수 있다.

```java
// com.helloshop.user 패키지
public class User {           // 다른 패키지에서 접근 가능
    public User() { }         // 생성자도 public이어야 호출 가능
}
```

---

## 패키지 vs 라이브러리

| 개념 | 설명 |
|:----|:----|
| 패키지 | 하나의 디렉토리 경로 (클래스 분류 단위) |
| 라이브러리 | 여러 패키지가 모인 배포 단위 |
