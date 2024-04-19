package Chapters.Chapter16;

import javax.swing.*;

/**
 * Простая Swing-программа
 */
public class SwingDemo {
    SwingDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Простое приложение Swing");

        // Установить начальные размеры фрейма
        jfrm.setSize(1000, 200);

        // Завершить работу программы, когда пользователь
        // закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать текстовую метку
        JLabel jlab = new JLabel("Программирование интерфейса с помощью Swing.");

        // Добавить метку на панель содержимого
        jfrm.add(jlab);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
