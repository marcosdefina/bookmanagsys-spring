package hello;

public class Book {

    private final long id;
    private final String bookName;
    private final String bookExcerpt;

    public Book(long id, String bookName, String bookExcerpt) {
        this.id = id;
        this.bookName = bookName;
        this.bookExcerpt = bookExcerpt;
    }

    public long getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookExcerpt() {
        return bookExcerpt;
    }
}
