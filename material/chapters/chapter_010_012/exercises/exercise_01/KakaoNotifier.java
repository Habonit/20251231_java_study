package chapters.chapter_010_012.exercises.exercise_01;

/**
 * 카카오톡 알림 구현체.
 *
 * TODO: Notifier 인터페이스를 구현하세요
 * - notify 메서드를 오버라이드하세요
 * - "카카오톡으로 알림: {message}" 형식으로 출력하세요
 */
public class KakaoNotifier implements Notifier {

    // TODO: Notifier 인터페이스를 구현(implements)하세요

    // TODO: notify 메서드를 오버라이드하세요
    @Override
    public void notify(String message) {
        System.out.println("카카오톡으로 알림: " + message);
    }
}
