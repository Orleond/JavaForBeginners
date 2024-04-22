package Chapters.Chapter5;
/**
 * Применение метода substring()
 */
public class SubStr {
    public static void main(String[] args) {
        String orgStr = "Java - двигатель Интернета.";

        // Сформировать подстроку
        String subStr = orgStr.substring(7, 26);

        System.out.println("orgStr: " + orgStr);
        System.out.println("subStr: " + subStr);
    }
}
