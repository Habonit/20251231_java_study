package chapters.chapter_010_012.exercises.exercise_01;

/**
 * 알림 시스템 실행 클래스.
 *
 * 이 클래스는 수정하지 않아도 됩니다.
 * 위의 Notifier, EmailNotifier, KakaoNotifier, SlackNotifier를
 * 올바르게 구현하면 아래 코드가 정상 동작합니다.
 */
public class NotifyMain {

    public static void main(String[] args) {
        // 다형적 참조: 부모 타입(Notifier)으로 자식 인스턴스들을 참조
        Notifier[] notifiers = {
            new EmailNotifier(),
            new KakaoNotifier(),
            new SlackNotifier()
        };

        String message = "서버 점검 안내";

        System.out.println("=== 전체 알림 발송 ===");
        for (Notifier notifier : notifiers) {
            // 오버라이드된 메서드가 호출된다
            notifier.notify(message);
        }
    }
}
