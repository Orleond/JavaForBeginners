package Homeworks.Homeworks6;
/*
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
public class Stack {
    private final int size;
    private final char[] array;
    private int numSymbol;

    Stack(int size) {
        this.size = size;
        array = new char[size];
        numSymbol = -1;
    }

    public void push(char symbol) {
        if (numSymbol == size - 1)
            System.out.println("Стек переполнен!");
        else
            array[++numSymbol] = symbol;
    }

    public char pop() {
        if (numSymbol == -1) {
            System.out.print("Стек пуст!");
            return ' ';
        } else {
            return array[numSymbol--];
        }
    }
}
