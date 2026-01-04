public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview[] reviews = new MovieReview[2];
        
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "Inception is a great movie.";

        MovieReview darkKnight = new MovieReview();
        darkKnight.title = "The Dark Knight";
        darkKnight.review = "The Dark Knight is a great movie.";
        
        reviews[0] = inception;
        reviews[1] = darkKnight;
        
        for (MovieReview review : reviews) {
            System.out.println(review.title);
            System.out.println(review.review);
        }
    }
}