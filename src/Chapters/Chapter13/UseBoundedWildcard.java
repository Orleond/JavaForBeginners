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

// Простой обобщенный класс
class Gen2<T> {
    T ob;

    Gen2(T o) {
        ob = o;
    }
}

// Пример класса, демонстрирующий типы объектов класса
// Gen, которые могут быть переданы методу test()
public class UseBoundedWildcard {
    // Здесь знак ? устанавливает соответствие
    // классу А или производным от него подклассам.
    static void test(Gen2<? extends A> o) {
        // ...
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        Gen2<A> w = new Gen2<>(a);
        Gen2<B> w2 = new Gen2<>(b);
        Gen2<C> w3 = new Gen2<>(c);
        Gen2<D> w4 = new Gen2<>(d);

        // Эти вызовы метода test() допустимы
        test(w);
        test(w2);
        test(w3);

        // А этот вызов метода test() недопустим, так как
        // объект w4 не относится к подклассу А
        // test(w4);   // Ошибка!
    }
}
