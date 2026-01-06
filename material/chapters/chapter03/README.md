# 챕터 3: 객체 지향 프로그래밍

> 학습 날짜: 2026-01-04

## 핵심 개념

### 절차 지향 vs 객체 지향

| 구분 | 절차 지향 | 객체 지향 |
|:----|:--------|:--------|
| 데이터 | 변수로 흩어져 있음 | 클래스로 묶여 있음 |
| 기능 | 별도 함수로 분리 | 메서드로 클래스에 포함 |
| 구조 | 데이터와 기능이 분리 | 데이터와 메서드가 하나로 묶임 |

### 객체 지향의 특징

1. **속성(데이터)**이 클래스로 묶여 있는가?
2. **기능(행동)**이 메서드로 클래스 안에 있는가?
3. **데이터와 메서드**가 하나로 묶여 있는가?

위 조건을 만족하면 객체 지향, 아니면 절차 지향.

---

## 예시 비교

### 절차 지향 방식

```java
// 데이터와 기능이 분리됨
int volume = 0;

public static void volumeUp(int vol) {
    return vol + 1;
}

volume = volumeUp(volume);
```

### 객체 지향 방식

```java
// 데이터와 기능이 하나의 클래스에 묶임
public class MusicPlayer {
    int volume = 0;

    public void volumeUp() {
        volume++;  // volume += 1 과 동일
    }
}
```

---

## 증감 연산자

```java
int volume = 0;
volume++;      // volume = 1 (volume += 1 과 동일)
volume--;      // volume = 0 (volume -= 1 과 동일)
```
