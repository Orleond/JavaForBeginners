package Chapters.Chapter6;
/**
 * Демонстрация использования метода
 * с переменным числом аргументов
 */
public class VarAargs {

    // Метод vaTest() допускает переменное число аргументов
    static void vaTest(int ... v) {
        System.out.println("Количество аргументов: " + v.length);
        System.out.println("Содержимое: ");

        for (int i = 0; i < v.length; i++) {
            System.out.println(" arg " + i + ": " + v[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Метод vaTest() может вызываться с
        // переменным числом аргументов
        vaTest(10); // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(); // Без аргументов
    }
}
