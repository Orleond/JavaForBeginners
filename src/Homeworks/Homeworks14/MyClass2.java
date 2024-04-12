package Homeworks.Homeworks14;
/*
 * Предположим, имеется класс MyClass, содержащий
 * объектный метод myInstMethod(), и относящийся
 * к этому классу объект mcObj. Продемонстрируйте,
 * как можно создать ссылку на метод myInstMethod(),
 * ассоциированный с объектом mcObj
 */
public class MyClass2 {
    void myInstMethod() {

    }

    public static void main(String[] args) {
        MyClass2 mcObj = new MyClass2();

        HomeworkInterface6and7 h = mcObj::myInstMethod;
    }
}
