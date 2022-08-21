package graphs.bookreviews.exeptions;

public class CsvParseException extends RuntimeException {

    public CsvParseException(final String message) {
        super(message);
    }

    public CsvParseException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
