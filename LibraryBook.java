public class LibraryBook {
    private String bookTitle;
    private String author;
    private int pages;
    public LibraryBook() {
        this.bookTitle = "Unknown";
        this.author = "Unknown";
        this.pages = 1;
    }
    public LibraryBook(String bookTitle, String author, int pages) {
        this.bookTitle = bookTitle;
        this.author = author;
        setPages(pages);
    }
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isThick() {
        return pages > 500;
    }
}
