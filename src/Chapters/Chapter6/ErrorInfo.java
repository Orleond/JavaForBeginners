package Chapters.Chapter6;
/*
 * Возврат объекта, определяемого разработчиком программы
 */
public class ErrorInfo {
    String[] msgs = {
            "Ошибка вывода",
            "Ошибка ввода",
            "Отсутствует место на диске",
            "Выход индекса за границы диапазона"
    };
    int[] howbad = {3, 3, 2, 4};

    Err getErrorInfo(int i) {
        if (i >= 0 & i < msgs.length)
            return new Err(msgs[i], howbad[i]);
        return new Err("Несуществующий код ошибки", 0);
    }
}
