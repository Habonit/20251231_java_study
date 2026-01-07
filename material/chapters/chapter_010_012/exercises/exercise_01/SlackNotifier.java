package chapters.chapter_010_012.exercises.exercise_01;

/**
 * 슬랙 알림 구현체.
 *
 * TODO: Notifier 인터페이스를 구현하세요
 * - notify 메서드를 오버라이드하세요
 * - "슬랙으로 알림: {message}" 형식으로 출력하세요
 */
public class SlackNotifier implements Notifier {

    // TODO: Notifier 인터페이스를 구현(implements)하세요

    // TODO: notify 메서드를 오버라이드하세요
    @Override
    public void notify(String message) {
        System.out.println("슬랙으로 알림: " + message);
    }
}
