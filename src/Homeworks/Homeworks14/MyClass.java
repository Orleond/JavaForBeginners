package Homeworks.Homeworks14;
/**
 * Предположим, имеется класс MyClass, содержащий
 * статический метод myStaticMethod().
 * Продемонстрируйте, каким образом можно указать
 * ссылку на метод myStaticMethod().
 */
public class MyClass {
    static void myStaticMethod() {

    }

    public static void main(String[] args) {
        HomeworkInterface6and7 h = MyClass::myStaticMethod;
    }
}
