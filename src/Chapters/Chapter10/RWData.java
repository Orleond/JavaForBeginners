package Chapters.Chapter10;

import java.io.*;
/**
 * Запись и чтение двоичных данных
 */
public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // Запись ряда значение
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) {
            System.out.println("Записано: " + i);
            dataOut.writeInt(i);

            System.out.println("Записано: " + d);
            dataOut.writeDouble(d);

            System.out.println("Записано: " + b);
            dataOut.writeBoolean(b);

            System.out.println("Записано: " + 12.2 * 7.4);
            dataOut.writeDouble(12.2 * 7.4);
        } catch (IOException exc) {
            System.out.println("Ошибка при записи");
            return;
        }

        System.out.println();

        // А теперь прочитать записанные значения
        try (DataInputStream dattaIn = new DataInputStream(new FileInputStream("testdata"))){
            i = dattaIn.readInt();
            System.out.println("Прочитано: " + i);

            d = dattaIn.readDouble();
            System.out.println("Прочитано: " + d);

            b = dattaIn.readBoolean();
            System.out.println("Прочитано: " + b);

            d = dattaIn.readDouble();
            System.out.println("Прочитано: " + d);
        } catch (IOException exc) {
            System.out.println("Ошибка при чтении");
        }
    }
}
