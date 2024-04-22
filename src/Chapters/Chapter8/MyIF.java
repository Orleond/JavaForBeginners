package Chapters.Chapter8;
/**
 * Использование метода по умолчанию
 */
public interface MyIF {
    // Объявление обычного метода интерфейса, которое НЕ включает
    // определение реализации по умолчанию
    int getUserID();

    // Объявление метода по умолчанию, включающее его реализацию
    default int getAdminID() {
        return 1;
    }

    // Объявление статического метода интерфейса
    static int getUniversalID() {
        return 0;
    }
}
