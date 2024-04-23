package userfuncsimp.binaryfuncsimp;

import userfuncs.binaryfuncs.*;
/*
 * Провайдер для функции AbsMinus
 */
public class AbsMinusProvider implements BinFuncProvider {

	// Предоставляет объект AbsMinus
	public BinaryFunc get() { return new AbsMinus(); }
}