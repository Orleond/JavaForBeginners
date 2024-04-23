package appsupport.supportfuncs;
/*
 * Функции поддержки
 */
public class SupportFuncs {
	// Определить, является ли a множителем b
	public static boolean isFactor(int a, int b) {
		if ((b % a) == 0) return true;
		return false;
	}
}