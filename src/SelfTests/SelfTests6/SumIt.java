package SelfTests.SelfTests6;
/**
 * Суммирование переданных чисел
 */
public class SumIt {
    int sum(int ... n) {
        int result = 0;
        for (int i = 0; i < n.length; i++)
            result += n[i];
        return result;
    }
}
