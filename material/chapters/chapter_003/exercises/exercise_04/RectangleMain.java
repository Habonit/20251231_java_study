package chapters.chapter03.exercises.exercise_04;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.initRectangle(5, 8);
        rectangle.perimeter = rectangle.calculatePerimeter();
        rectangle.area = rectangle.calculateArea();
        rectangle.isSquare = rectangle.isSquare();
        System.out.println("너비: " + rectangle.width);
        System.out.println("높이: " + rectangle.height);
        System.out.println("둘레: " + rectangle.perimeter);
        System.out.println("넓이: " + rectangle.area);
        System.out.println("정사각형: " + rectangle.isSquare);
    }
}
