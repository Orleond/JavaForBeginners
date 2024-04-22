package Homeworks.Homeworks9;
/**
 * Отвечая на вопрос 3 в конце главы 6, вы создали
 * класс Stack. Добавьте в него пользовательские
 * исключения, чтобы программа нужным образом
 * реагировала на попытку поместить элемент в
 * переполненный стек и извлечь элемент из пустого
 * стека.
 */
public class Homework1 {
    public static void main(String[] args) {
        Stack st1 = new Stack(10);

        // Помещение ряда символов в очередь q1
        for (int i = 0; i < 11; i++) {
            try {
                st1.push((char) ('A' + i));
            } catch (FullStackException e) {
                System.out.println(e);
            }
        }

        // Отображение очередей
        System.out.print("Содержимое st1: ");
        for (int i = 0; i < 11; i++) {
            try {
                System.out.print(st1.pop() + " ");
            } catch (EmptyStackException e) {
                System.out.println(e);
            }
        }
    }
}
