package Chapters.Chapter4;

/**
 * Применение метода с двумя параметрами
 */
public class IsFact {
    public static void main(String[] args) {
        Factor x = new Factor();

        if (x.isFactor(2, 20)) System.out.println("2 - делитель");
        if (x.isFactor(3, 20)) System.out.println("эта строка не будет" +
                "выведена");
    }
}
