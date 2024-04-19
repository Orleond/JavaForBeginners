package Chapters.Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Использование текстового поля
 */
public class TFDemo implements ActionListener {

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Использование текстового поля");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jfrm.setSize(480, 100);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать текстовое поле
        jtf = new JTextField(10);

        // Установить команду действия для текстового поля
        jtf.setActionCommand("myTF");

        // Создать кнопку
        JButton jbtnRev = new JButton("Обратить");

        // Добавить слушателей событий для текстового поля и кнопки
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        // Создать метки
        jlabPrompt = new JLabel("Введите текст");
        jlabContents = new JLabel("");

        // Добавить компоненты на панель содержимого
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    // Обработать события действий
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("Обратить")) {
            // Была нажата кнопка
            String orgStr = jtf.getText();
            String resStr = "";

            // Обратить кнопку в текстовое поле
            for (int i = orgStr.length() - 1; i >= 0; i--) {
                resStr += orgStr.charAt(i);

                // Сохраняет обращенную строку в текстовое поле
                jtf.setText(resStr);
            }
        } else
            // Клавиша <Enter> была нажата в тот момент, когда фокус
            // ввода находился в текстовом поле
            jlabContents.setText("Вы нажали ENTER. Текст: " +
                    jtf.getText());
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
}
