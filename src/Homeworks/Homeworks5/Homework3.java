package Homeworks.Homeworks5;
/**
 * Расширьте класс Encode таким образом, чтобы в
 * качестве ключа шифрования использовалась строка
 * из восьми символов
 */
public class Homework3 {
    public static void main(String[] args) {
        String msg = "Это просто текст";
        String encmsg = "";
        String decmsg = "";
        String key = "Abcdefgh";

        System.out.print("Исходное сообщение:");
        System.out.println(msg);

        // Шифрование сообщения
        for (int i = 0; i < msg.length(); i++){
            char ch = 0;
            for (int j = 0; j < key.length(); j++)
                ch = (char) (msg.charAt(i) ^ key.charAt(j));
            encmsg = encmsg + ch;
        }

        System.out.print("Зашифрованное сообщение: ");
        System.out.println(encmsg);

        // Дешифровка сообщения
        for (int i = 0; i < msg.length(); i++){
            char ch = 0;
            for (int j = 0; j < key.length(); j++)
                ch = (char) (encmsg.charAt(i) ^ key.charAt(j));
            decmsg = decmsg + ch;
        }

        System.out.print("Дешифрованное сообщение: ");
        System.out.println(decmsg);
    }
}
