package Chapters.Chapter8.bookpackext;
/**
 * Пример использования модификатора protected
 */
public class ExtBook extends Chapters.Chapter8.bookpack3.Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    // Следующие конструкции допустимы, поскольку подклассы имеют
    // право доступа к членам класса, объявленными защищенными
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPubDate() {
        return pubDate;
    }
    public void setPubDate(int pubDate) {
        this.pubDate = pubDate;
    }
}
