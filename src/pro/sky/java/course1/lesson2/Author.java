package pro.sky.java.course1.lesson2;

public class Author {
    private String authorName;
    private String authorSurname;
    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    @Override
    public String toString() {
        return authorName + " " + authorSurname;
    }
}
