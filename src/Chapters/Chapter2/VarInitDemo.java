package Chapters.Chapter2;
/**
 * Демонстрация времени жизни переменной
 */
public class VarInitDemo {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // Переменная y инициализируется
                        // при каждом входе в блок
            System.out.println("y: " + y);  // Всегда выводится
                                            // значение -1
            y = 100;
            System.out.println("Измененное значение y:" + y);
        }
    }
}
