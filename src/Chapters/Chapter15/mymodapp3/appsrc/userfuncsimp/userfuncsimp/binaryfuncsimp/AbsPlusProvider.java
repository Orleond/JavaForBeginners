package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;
/*
 * Провайдер для функции AbsPlus
 */
public class AbsPlusProvider implements BinFuncProvider {

	// Предоставляет объект AbsPlus
	public BinaryFunc get() { return new AbsPlus(); }
}