package appstart.mymodappdemo;

import appfuncs.simplefuncs.SimpleMathFuncs;
import appsupport.supportfuncs.SupportFuncs;
/**
 * Обновлен для использования класса SupportFuncs
 */
public class MyModAppDemo {
	public static void main(String[] args) {
		
		// Теперь на метод isFactor() ссылаются через класс
		// SupportFuncs, а не SimpleMathFuncs
		if (SupportFuncs.isFactor(2, 10))
			System.out.println("2 является множителем 10");
		
		System.out.println("Наименьшим общим множителем для 35 и 105 будет " +
			SimpleMathFuncs.lcf(35, 105));
			
		System.out.println("Наибольшим общим множителем для 35 и 105 будет " +
			SimpleMathFuncs.gcf(35, 105));
	}
}