package appfuncs.simplefuncs;

import appsupport.supportfuncs.SupportFuncs;
/**
 * Несколько простых математических функций.
 * На этот раз метод isFactor() удален.
*/
public class SimpleMathFuncs {
	
	// Вернуть меньший положительный
	// общий множитель для a и b
	public static int lcf(int a, int b) {
		// Вычисление множителя на основе положительных значений
		a = Math.abs(a);
		b = Math.abs(b);
		
		int min = a < b ? a : b;
		
		for (int i = 2; i <= min / 2; i++) {
			if (SupportFuncs.isFactor(i, a) && 
			    SupportFuncs.isFactor(i, b))
				return i;
		}
		
		return 1;
	}
	
	// Вернуть наибольший общий множитель для a и b
	public static int gcf(int a, int b) {
		// Вычисление множителя на основе положительных значений
		a = Math.abs(a);
		b = Math.abs(b);
		
		int min = a < b ? a : b;
		
		for (int i = min / 2; i >= 2; i--) {
			if (SupportFuncs.isFactor(i, a) && 
			    SupportFuncs.isFactor(i, b))
				return i;
		}
		return 1;
	}
}