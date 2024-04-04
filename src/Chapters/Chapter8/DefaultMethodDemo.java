package Chapters.Chapter8;
/*
 * Использование интерфейсного метода по умолчанию
 */
public class DefaultMethodDemo {
    public static void main(String[] args) {
        MyIFImp obj = new MyIFImp();

        // Вызов метода getUserID() возможнен, поскольку он явно
        // реализован классом MyIFImp
        System.out.println("Идентификатор пользователя " +
                obj.getUserID());

        // Вызов метода getAdminID также возможен, поскольку
        // предоставляется его реализация по умолчанию
        System.out.println("Идентификатор администратора: " +
                obj.getAdminID());
    }
}
