package Chapters.Chapter8;
/*
 * Этот класс должен реализовывать все методы,
 * объявленные в интерфейсах A и В
 */
public class MyClass implements B {
    @Override
    public void meth1() {
        System.out.println("Реализация метода meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Реализация метода meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Реализация метода meth3().");
    }
}
