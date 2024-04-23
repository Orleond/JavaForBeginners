package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.BinaryFunc;
/**
 * Класс AbsPlus обеспечивает конкретную реализацию интерфейса
 * BinaryFunc. Он возвращает результат abs(a) + abs(b).
 */
public class AbsPlus implements BinaryFunc {

	// Возвращает имя функции
	public String getName() {
		return "absPlus";
	}

	// Реализация функции AbsPlus
	public int func(int a, int b) { return Math.abs(a) + Math.abs(b); }
}