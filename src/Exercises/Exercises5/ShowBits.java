package Exercises.Exercises5;
/**
 * Упражнение 5.3
 * Создание класса для отображения значений в двоичном виде
 */
public class ShowBits {
    int numBits;

    ShowBits(int numBits) {
        this.numBits = numBits;
    }

    void show(long val) {
        long mask = 1;

        // Сдвиг значения 1 влево на нужную позицию
        mask <<= numBits-1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
