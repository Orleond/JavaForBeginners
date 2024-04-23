/**
 * Определение модуля appfuncs
*/
module appfuncs {
	// Экспорт пакета appfuncs.simplefuncs
	exports appfuncs.simplefuncs;

	// Требуется модуль appsupport, который будет транзитивным
	requires transitive appsupport;
}