package pro.sky.java.course1.lesson2;

public class Book {
    private final String bookName;
    private final Author authorFullName;
    private int yearPublishing;

    public Book(String bookName, Author authorFullName, int yearPublishing) {
        this.bookName = bookName;
        this.authorFullName = authorFullName;
        this.yearPublishing = yearPublishing;
    }
    public Author getAuthorFullName() {
        return authorFullName;
    }

    public String getBookName() {
        return this.bookName;
    }
    public int getYearPublishing() {
        return this.yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    @Override
    public String toString() {
        return getAuthorFullName().toString();
    }
}
