package Chapters.Chapter9;
/**
 * Использование специально создаваемого исключения
 */
public class NonIntResultException extends Exception {
    int n;
    int d;

    NonIntResultException(int i, int j) {
        n = i;
        d = j;
    }

    @Override
    public String toString() {
        return "Результат операции " + n + " / " + d +
                " не является целым числом";
    }
}