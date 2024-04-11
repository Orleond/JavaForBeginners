package Chapters.Chapter13;
/*
 * Демонстрация использования обобщенного класса
 */
public class GenDemo {
    public static void main(String[] args) {
        // Создать обобщенную ссылку на целочисленное значение
        Gen<Integer> iOb;

        // Создать объект типа Gen<Integer> и присвоить ссылку
        // на него переменной iOb. Обратите внимание на
        // автоупаковку при инкапсуляции значения 88 в объекте
        // типа Integer
        iOb = new Gen<Integer>(88);

        // Отобразить тип данных, используемый в объекте iOb
        iOb.showType();

        // Получить значение из объекта iOb. Обратите внимание
        // на то, что приведение типов здесь не требуется.
        int v = iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // Создать объект типа Gen для строк
        Gen<String> strOb = new Gen<String>("Тестирование обобщений");

        // Отобразить тип данных, используемый в объекте strOb
        strOb.showType();

        // Получить значение из объекта strOb. Заметьте,
        // что приведение типов здесь также не требуется.
        String str = strOb.getOb();
        System.out.println("Значение: " + str);
    }
}
