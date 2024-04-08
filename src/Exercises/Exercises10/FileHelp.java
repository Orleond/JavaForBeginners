package Exercises.Exercises10;
/*
 * Упражнение 10.2
 * Справочная система, использующая дисковый файл
 * для хранения информации
 */
public class FileHelp {
    public static void main(String[] args) {
        Help hlpObj = new Help("src/Exercises/Exercises10/helpfile.txt");
        String topic;

        System.out.println("Воспользуйтесь справочной системой.\n" +
                "Для выхода из системы введите 'stop'.");

        do {
            topic = hlpObj.getSelection();

            if (!hlpObj.helpOn((topic)))
                System.out.println("Тема не найдена.\n");
        } while (topic.compareTo("stop") != 0);
    }
}
