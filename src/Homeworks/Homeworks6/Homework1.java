package Homeworks.Homeworks6;
/**
 * Помимо очереди, в программах часто используется
 * структура данных, которая называется стеком.
 * Обращение к стеку осуществляется по принципу
 * "первым пришел - последним обслужен". Стек можно
 * сравнить со стопкой тарелок, стоящих на столе.
 * Последней берется тарелка, поставленная на стол
 * первой. Создайте класс Stack, реализующий стек для
 * хранения символов. Используйте методы push() и
 * pop() для манипулирования содержимым стека.
 * Пользователь класса Stack должен иметь возможность
 * задавать размер стека при его создании. Все члены
 * класса Stack, кроме методов push() и pop(), должны
 * быть объявлены как private. (Подсказка: в качестве
 * заготовки можете воспользоваться классом Queue,
 * изменив в нем лишь способ доступа к данным.)
 *
 */
public class Homework1 {
    public static void main(String[] args) {
        Stack st1 = new Stack(10);

        // Помещение ряда символов в очередь q1
        for (int i = 0; i < 11; i++) {
            st1.push((char) ('A' + i));
        }

        // Отображение очередей
        System.out.print("Содержимое st1: ");
        for (int i = 0; i < 11; i++) {
            System.out.print(st1.pop() + " ");
        }
    }
}
