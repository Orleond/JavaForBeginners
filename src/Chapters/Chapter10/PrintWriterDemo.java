package Chapters.Chapter10;

import java.io.PrintWriter;

/*
 * Использование класса PrintWriter
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 10;
        double d = 123.65;

        pw.println("Использование класса PrintWriter");
        pw.println(i);
        pw.println(d);

        pw.println(i + " + " + d + " = " + (i + d));
    }
}
