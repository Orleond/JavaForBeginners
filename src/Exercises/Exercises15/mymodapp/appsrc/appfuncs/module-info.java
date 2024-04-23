/**
 * Определение модуля, которое использует предложение to
*/
module appfuncs {
	// Экспорт пакета appfuncs.simplefuncs
	exports appfuncs.simplefuncs;

	// Требуется модуль appsupport, который будет транзитивным
	requires transitive appsupport;
}