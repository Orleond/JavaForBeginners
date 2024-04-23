package userfuncs.binaryfuncs;

import userfuncs.binaryfuncs.BinaryFunc;
/*
 * Этот интерфейс определяет структуру провайдера службы,
 * который возвращает экземпляры BinaryFunc
 */

public interface BinFuncProvider {
	
	// Получение экземпляра BinaryFunc
	public BinaryFunc get();
}