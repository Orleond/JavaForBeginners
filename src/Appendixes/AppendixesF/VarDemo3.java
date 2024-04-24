package Appendixes.AppendixesF;
/**
 * При использовании наследования выведенный тип является
 * объявленным типом инициализатора и может отличаться от типа
 * объекта, на который в реальности ссылается инициализатор.
 */
public class VarDemo3 {

    // Вернуть объект одного из типов MyClass2
    static MyClass2 getObj(int which) {
        switch (which) {
            case 0: return new MyClass2();
            case 1: return new FirstDerivedClass();
            default: return new SecondDerivedClass();
        }
    }

    public static void main(String[] args) {
        // Несмотря на то что метод getObj() возвращает разные типы
        // объектов в иерархии наследования MyClass, его объявленный
        // тип возвращаемого значения - MyClass. В результате во всех
        // трех случаях выводится тип MyClass, хотя при этом получаются
        // разные производные типы объектов.

        // Здесь метод getObj() возвращает объект MyClass
        var mc = getObj(0);

        // В этом случае возвращается объект FirstDerivedClass
        var mc2 = getObj(1);

        // А в этом случае возвращается объект SecondDerivedClass
        var mc3 = getObj(2);

        // Поскольку типы переменных mc2 и mc3 выведены как MyClass
        // (это тип значения, возвращаемого методом getObj()), ни
        // объект mc2, ни объект mc3 не могут получить доступ к полям,
        // объявленным в подразумеваемых классах FirstDerivedClass
        // и SecondDerivedClass
//        mc2.x = 10;   // некорректно, поскольку в классе MyClass нет поля x
//        mc3.y = 10;   // некорректно, поскольку в классе MyClass нет поля y
    }
}
