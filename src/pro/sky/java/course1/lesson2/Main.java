package pro.sky.java.course1.lesson2;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("Михаил", "Булгаков");
        Author author1 = new Author("Михаил", "Толстой");
        Book book = new Book("Война и Мир", author, 1932);
        Book book1 = new Book("Война и Мир", author1, 1850);
        System.out.println("Автор: " + book.getAuthorFullName());
        System.out.println("Книга: " + book.getBookName());
        System.out.println("Год публикации: " + book.getYearPublishing());
        System.out.println("Автор: " + book1.getAuthorFullName());
        System.out.println("Книга: " + book1.getBookName());
        System.out.println("Год публикации: " + book1.getYearPublishing());
        book.setYearPublishing(2023);
        System.out.println("Новый год публикации: " + book.getYearPublishing());
        if (author.equals(author1)) {
            System.out.println("ООООО НЕЕЕЕТ!!!!!! Вы ввели одинаковые имена/фамилии авторов");
        }
        if (book.equals(book1)) {
            System.out.println("ООООО НЕЕЕЕТ!!!!!! Вы ввели одинаковые названия книг");
        }
    }
}
