package Homeworks.Homeworks13;
/**
 * Видоизмените ответ на вопрос 10 в упражнении
 * для самопроверки из главы 9 таким образом, чтобы
 * сделать класс обобщенным. Для этого создайте
 * интерфейс стека IGenStack, объявив в нем обобщенные
 * методы push() и pop()
 */
public class Homework2 {
    public static void main(String[] args) {
        Character[] a = new Character[10];
        Stack<Character> st1 = new Stack<>(a);

        // Помещение ряда символов в очередь q1
        for (int i = 0; i < 11; i++) {
            try {
                st1.push((char)('A' + i));
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
