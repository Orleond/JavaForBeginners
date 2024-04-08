package Chapters.Chapter10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * В этой версии программы те ее части, которые отвечают
 * за открытие файла и получение доступа к нему, помещены
 * в один блок try. Файл закрывается в блоке finally
 */
public class ShowFile2 {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;

        // Сначала нужно убедиться в том, что программе
        // передается имя файла
        if (args.length != 1) {
            System.out.println("Использование: ShowFile2 имя_файла");
            return;
        }

        // Открытие файла, чтение из него символов, пока
        // не встретится признак конца файла EOF, и
        // последующее закрытие файла в блоке finally
        try {
            fin = new FileInputStream((args[0]));

            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while (i != -1);
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден");
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода");
        } finally {
            // Файл закрывается в любом случае
            try {
                if (fin != null) fin.close();
            } catch (IOException exc) {
                System.out.println("Ошибка при закрытии файла");
            }
        }
    }
}
