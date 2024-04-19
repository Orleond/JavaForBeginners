package Exercises.Exercises16;

/**
 * Упражнение 16.1
 *
 * Утилита сравнения файлов на основе swing
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
public class SwingFC implements ActionListener {

    JTextField jtfFirst;    // Хранит имя первого файла
    JTextField jtfSecond;   // Хранит имя второго файла

    JButton jbtnFirst;  // Кнопка для запуска операции сравнения файлов

    JLabel jlabFirst, jlabSecond;   // Метки, отображающие
                                    // подсказки для пользователя
    JLabel jlabResult;  // Метка для отображения результата
                        // сравнения и сообщений об ошибках

    SwingFC() {

        // Создать новй контейнер JFrame
        JFrame jfrm = new JFrame("Сравнить файлы");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jfrm.setSize(200, 190);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать поля для ввода имен файлов
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        // Задать команды действия для текстовых полей
        jtfFirst.setActionCommand("Файл А");
        jtfSecond.setActionCommand("Файл Б");

        // Создать кнопку сравнения
        JButton jbtnComp = new JButton("Сравнить");

        // Добавить слушателя событий для кнопки
        jbtnComp.addActionListener(this);

        // Создать метки
        jlabFirst = new JLabel("Первый файл:");
        jlabSecond = new JLabel("Второй файл:");
        jlabResult = new JLabel("");

        // Добавить компоненты на панель содержимого
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        // Отобразитьь фрейм
        jfrm.setVisible(true);
    }

    // Сравнить файлы после щелчка на кнопке
    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 0, j = 0;

        // Сначала убедимся в том, что введены имена обоих файлов
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("Отсутствует имя первого файла.");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("Отсутствует имя второго файла.");
            return;
        }

        // Сравнить файлы, используя инструкцию try с ресурсами
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            // Сравнение содержимое обоих файлов
            do {
                i = f1.read();
                j = f2.read();
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j)
                jlabResult.setText("Файлы отличаются");
            else
                jlabResult.setText("Файлы одинаковы.");
        } catch (IOException exc) {
            jlabResult.setText("Ошибка файла");
        }
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFC();
            }
        });
    }
}
