package Chapters.Chapter6;

public class Test {
    // Этот метод не может изменить значения аргументов,
    // передаваемых ему при вызове
    void noChange(int i, int j) {
        i += j;
        j = -j;
    }
    int a, b;
    Test() { }
    Test(int i, int j) {
        a = i;
        b = j;
    }

    // Передача объекта методу. Теперь переменные ob.a и ob.b
    // объекта, используемого при вызове, также будут изменяться
    void change(Test ob) {
        ob.a = ob.a + ob.b;
        ob.b = -ob.b;
    }
}