package chapters.chapter01.exercises.exercise_04;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview movieReview = new MovieReview();
        movieReview.title = "The Dark Knight";
        movieReview.review = "The Dark Knight is a great movie.";

        System.out.println(movieReview.title);
        System.out.println(movieReview.review);
    }
}