package Chapters.Chapter8.bookpackext2;

import Chapters.Chapter8.bookpack3.*;
/**
 * Использование ключевого слова import
 */
public class UseBook {
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

        for (int i = 0; i < books.length; i++) books[i].show();
    }
}
