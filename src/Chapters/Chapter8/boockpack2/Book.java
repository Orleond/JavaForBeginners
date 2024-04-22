package Chapters.Chapter8.boockpack2;
/**
 * Класс Book, видоизмененный для открытого доступа
 */
public class Book {
    private String title;
    private String author;
    private int pubDate;

    // Теперь конструктор стал открытым
    public Book(String t, String a, int d) {
        title = t;
        author = a;
        pubDate = d;
    }

    // Теперь метод стал открытым
    public void show() {
        System.out.println(title);
        System.out.println(author);
        System.out.println(pubDate);
        System.out.println();
    }
}