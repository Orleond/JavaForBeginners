package Homeworks.Homeworks13;
/**
 * Допустим, обобщенный интерфейс объявлен так:
 * interface IGenIF<T, V extends T> { //... }
 * Напишите объявление класса MyClass, который
 * реализует интерфейс IGenIF
 */
public class MyClass<T, V extends T> implements IGenIF<T, V> {
}
