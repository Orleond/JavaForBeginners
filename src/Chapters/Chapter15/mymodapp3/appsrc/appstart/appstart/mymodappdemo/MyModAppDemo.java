package appstart.mymodappdemo;

import java.util.ServiceLoader;
import appfuncs.simplefuncs.SimpleMathFuncs;
import userfuncs.binaryfuncs.*;
/**
 * Модульное приложение, демонстрирующее использование
 * служб и провайдеров служб
 */
public class MyModAppDemo {
	public static void main(String[] args) {
		
		// Сначала используются встроенные службы, как и прежде
		if (SimpleMathFuncs.isFactor(2, 10))
			System.out.println("2 является множителем 10");
		
		System.out.println("Наименьшим общим множителем для 35 и 105 будет " +
			SimpleMathFuncs.lcf(35, 105));
			
		System.out.println("Наибольшим общим множителем для 35 и 105 будет " +
			SimpleMathFuncs.gcf(35, 105));

		// Теперь используем основанные на службах
		// пользовательские операции.

		// Получение загрузчика службы для бинарных функций
		ServiceLoader<BinFuncProvider> ldr = ServiceLoader.load(BinFuncProvider.class);

		BinaryFunc binOp = null;

		// Поиск провайдера для функции absPlus и получение функции
		for(BinFuncProvider bfp : ldr) {
			if (bfp.get().getName().equals("absPlus")) {
				binOp = bfp.get();
				break;
			}
		}

		if (binOp != null)
			System.out.println("Результат выполнения функции absPlus: " + binOp.func(12, -4));
		else
			System.out.println("Функция absPlus не найдена");

		binOp = null;

		// Теперь ищем провайдера для функции absMinus и получаем функцию
		for(BinFuncProvider bfp : ldr) {
			if (bfp.get().getName().equals("absMinus")) {
				binOp = bfp.get();
				break;
			}
		}

		if (binOp != null)
			System.out.println("Результат выполнения функции absMinus: " + binOp.func(12, -4));
		else
			System.out.println("Функция absMinus не найдена");
	}
}