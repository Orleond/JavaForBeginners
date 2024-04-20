package SelfTests.SelfTests5;

/**
 * Улучшенный вариант программы шифрования сообщений
 * с помощью побитовой операции исключающего ИЛИ
 */
public class Encode {
    public static void main(String args[]) {
        String msg = "This is a test";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.print("Исходное сообщение; ");
        System.out.println(msg);

        // Шифрование сообщение
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        // Дешифровка сообщения
        j = 0;
        for (int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if (j == 8) j = 0;
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
