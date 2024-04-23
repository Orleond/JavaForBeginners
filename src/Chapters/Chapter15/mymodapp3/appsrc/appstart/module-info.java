/**
 * Определение модуля для главного модуля приложения.
 * Теперь используется интерфейс BinFuncProvider.
*/
module appstart {
	// Требуются модули appfuncs и userfuncs
	requires appfuncs;
	requires userfuncs;

	// Модуль appstart теперь использует интерфейс BinFuncProvider
	uses userfuncs.binaryfuncs.BinFuncProvider;
}