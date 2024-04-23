package Chapters.Chapter14;
/**
 * Генерация исключений в лямбда-выражениях
 */
public class LambdaExceptionDemo {
    public static void main(String[] args) {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        // Длинное блочное лямбда-выражение может генерировать
        // исключение IOException. Следовательно, это исключение
        // должно быть указано в спецификации throws метода
        // ioAction() функционального интерфейса MyIOAction.
        MyIOAction myIO = (rdr) -> {
            int ch = rdr.read();    // Может генерировать
            // исключение IOException
            // ...
            return true;
        };
    }
}
