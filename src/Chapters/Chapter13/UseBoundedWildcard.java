package Chapters.Chapter13;

class A {
    // ...
}

class B extends A {
    // ...
}

class C extends A {
    // ...
}

// Обратите внимание на то, что D не является подклассом A
class D {
    // ...
}

// Пример класса, демонстрирующий типы объектов класса
// Gen, которые могут быть переданы методу test()
public class UseBoundedWildcard {
    // Здесь знак ? устанавливает соответствие
    // классу А или производным от него подклассам.
    static void test(Gen<? extends A> o) {
        // ...
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen<A> w = new Gen<>(a);
        Gen<B> w2 = new Gen<>(b);
        Gen<C> w3 = new Gen<>(c);
        Gen<D> w4 = new Gen<>(d);

        // Эти вызовы метода test() допустимы
        test(w);
        test(w2);
        test(w3);

        // А этот вызов метода test() недопустим, так как
        // объект w4 не относится к подклассу А
        // test(w4);   // Ошибка!
    }
}
