package Chapters.Chapter14;

import java.io.*;
/**
 * Генерация исключений в лямбда-выражениях
 */
public interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}
