package Chapters.Chapter6;
/**
 * Возврат объекта, определяемого разработчиком программы
 */
public class Err {
    String msg; // Сообщение об ошибке
    int severity;   // Уровень серьезности ошибки

    Err(String m, int s) {
        msg = m;
        severity = s;
    }
}
