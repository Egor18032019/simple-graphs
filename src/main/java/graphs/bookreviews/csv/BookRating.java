package graphs.bookreviews.csv;

public class BookRating {
    String userId;
    String isbn;
    int rating;
    public BookRating(String userId, String isbn, int rating) {
        this.userId= userId;
        this.isbn= isbn;
        this.rating= rating;
    }

    public String getUserId() {
        return userId;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getRating() {
        return rating;
    }
}
