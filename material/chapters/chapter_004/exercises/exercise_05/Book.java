package chapters.chapter04.exercises.exercise_05;

public class Book {
    String title;
    String author;
    int page;

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public Book() {
        this("", "", 0);
    }

    public void displayInfo() {
        System.out.println("제목: " + this.title);
        System.out.println("저자: " + this.author);
        System.out.println("페이지: " + this.page);
    }
}
