package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;
/**
 * Класс AbsMinus обеспечивает конкретную реализацию интерфейса
 * BinaryFunc. Он возвращает результат abs(a) - abs(b).
 */
public class AbsMinus implements BinaryFunc {

	// Возвращает имя функции
	public String getName() {
		return "absMinus";
	}

	// Реализация функции AbsMinus
	public int func(int a, int b) { return Math.abs(a) - Math.abs(b); }
}