package Chapters.Chapter5;
/*
 * Преобразование прописных букв английского языка в строчные
 */
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            // В результате установки в единицу шестого бита
            // значения переменной ch она всегда будет
            // содержать прописную букву
            ch = (char) ((int) ch | 32);
            System.out.print(ch + " ");
        }
    }
}
