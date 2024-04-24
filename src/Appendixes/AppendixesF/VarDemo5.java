package Appendixes.AppendixesF;
/**
 * Демонстрация использования счетчиков из класса Runtime.Version
 */
public class VarDemo5 {
    public static void main(String args[]) {
        Runtime.Version ver = Runtime.version();

        // Отображение отдельных счетчиков
        System.out.println("Счетчик функциональных выпусков: " +
                ver.feature());
        System.out.println("Счетчик промежуточных версий: " +
                ver.interim());
        System.out.println("Счетчик выпусков обновлений: " +
                ver.update());
        System.out.println("Счетчик выпусков исправлений: " +
                ver.patch());
    }
}
