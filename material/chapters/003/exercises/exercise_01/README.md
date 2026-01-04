# 연습 문제 1: 절차 지향에서 객체 지향으로

## 난이도: 기초

## 학습 목표

- 절차 지향 프로그래밍과 객체 지향 프로그래밍의 차이를 이해한다
- 데이터와 기능을 하나의 클래스로 묶는 방법을 익힌다
- 객체가 자신의 데이터를 스스로 관리하는 구조를 이해한다

---

## 핵심 개념

### 절차 지향 vs 객체 지향

| 구분 | 절차 지향 | 객체 지향 |
|:-----|:-----|:-----|
| 데이터 | 분리되어 있음 | 클래스에 묶여있음 |
| 기능 | 외부 함수로 처리 | 메서드로 클래스 내부에 포함 |
| 특징 | 데이터를 함수에 전달 | 객체가 스스로 처리 |

### 예시 비교

```java
// 절차 지향 - 데이터와 기능이 분리됨
int volume = 0;
volume = increaseVolume(volume);  // 외부 함수에 데이터 전달

// 객체 지향 - 데이터와 기능이 하나로 묶임
MusicPlayer player = new MusicPlayer();
player.volumeUp();  // 객체가 스스로 처리
```

---

## 문제 설명

아래의 **절차 지향** 코드를 **객체 지향**으로 리팩토링하라.

### 절차 지향 코드 (Before)

```java
public class ProceduralMain {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;
        
        // 기능이 외부에서 처리됨
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다");
        
        volume = volume + 1;
        System.out.println("볼륨: " + volume);
        
        volume = volume + 1;
        System.out.println("볼륨: " + volume);
        
        volume = volume - 1;
        System.out.println("볼륨: " + volume);
        
        System.out.println("음악 플레이어 상태: " + isOn);
        
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다");
    }
}
```

---

## 요구 사항

1. `MusicPlayer.java`에 `MusicPlayer` 클래스를 정의하라
   - volume (int): 볼륨
   - isOn (boolean): 전원 상태
   - on(): 전원 켜기
   - off(): 전원 끄기
   - volumeUp(): 볼륨 올리기
   - volumeDown(): 볼륨 내리기
   - showStatus(): 상태 출력

2. `Main.java`에서 MusicPlayer 객체를 사용하라

---

## 예상 출력

```
음악 플레이어를 시작합니다
볼륨: 1
볼륨: 2
볼륨: 1
음악 플레이어 상태: 켜짐, 볼륨: 1
음악 플레이어를 종료합니다
```

---

## 힌트

- 데이터(volume, isOn)를 클래스의 멤버 변수로
- 기능(켜기, 끄기, 볼륨조절)을 클래스의 메서드로
- 객체가 자신의 데이터를 직접 관리하도록 설계
