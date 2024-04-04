package Chapters.Chapter5;
/*
 * Использование строк для управления инструкцией switch
 */
public class StringSwitch {
    public static void main(String[] args) {
        String command = "cancel";

        switch (command) {
            case "connect" -> System.out.println("Подключение");
            case "cancel" -> System.out.println("Отмена");
            case "disconnect" -> System.out.println("Отключение");
            default -> System.out.println("Неверная команда!");
        }
    }
}
