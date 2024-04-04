package Chapters.Chapter8.bookpack;
/*
 * Простая программа, демонстрирующая применение пакетов
 */

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: руководство для начинающих," +
                "7-е издание", "Герберт Шилдт", 2018);
        books[1] = new Book("Java: полное руководство, 10-е издание",
                "Герберт Шилдт", 2005);
        books[2] = new Book("Искусство программирования на Java",
                "Герберт Шилдт", 2005);
        books[3] = new Book("Красный шторм поднимается",
                "Том Клэнси", 2006);
        books[4] = new Book("В дороге", "Джек Керуак", 2012);

        for (Book b: books) b.show();
    }
}
