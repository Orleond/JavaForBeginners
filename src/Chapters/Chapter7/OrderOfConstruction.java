package Chapters.Chapter7;
/*
 * Демонстрация очередности вызова конструкторов
 */

// Создание суперкласса
class A2 {
    A2() {
        System.out.println("Конструктор А");
    }
}

// Создание подкласса в результате расширения класса А
class B2 extends A2 {
    B2() {
        System.out.println("Конструктор B");
    }
}

// Создание подкласса в результате расширения класса B2
class C2 extends B2 {
    C2() {
        System.out.println("Конструктор C");
    }
}
public class OrderOfConstruction {
    public static void main(String[] args) {
        C2 c = new C2();
    }
}
