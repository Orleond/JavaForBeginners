package Chapters.Chapter8;

public class MyIFImp2 implements MyIF {
    // Предоставляются реализации обоих методов -
    // getUserIF() и getAdminID()
    @Override
    public int getUserID() {
        return 100;
    }
    @Override
    public int getAdminID() {
        return 42;
    }
}
