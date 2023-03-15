package pro.sky.java.course1.lesson2;
import java.util.Objects;
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
        return bookName;
    }
    public int getYearPublishing() {
        return yearPublishing;
    }
    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }
    @Override
    public String toString() {
        return getAuthorFullName().toString();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookName, book.bookName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName);
    }
}
