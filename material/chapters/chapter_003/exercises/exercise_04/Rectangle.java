package chapters.chapter03.exercises.exercise_04;

public class Rectangle {
    int width;
    int height;
    int area;
    int perimeter;
    boolean isSquare;


    void initRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    void setHeight(int height) {
        this.height = height;
    }

    int calculateArea() {
        int tempArea = this.width * this.height;
        System.out.println("area = " + tempArea);
        return tempArea;
    }

    int calculatePerimeter() {
        int tempPerimeter = 2 * (this.width + this.height);
        System.out.println("perimeter = " + tempPerimeter);
        return tempPerimeter;
    }

    boolean isSquare() {
        return this.width == this.height;
    }

}
