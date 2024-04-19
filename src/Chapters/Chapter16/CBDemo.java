package Chapters.Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Демонстрация использования флажков
 */
public class CBDemo implements ItemListener {
    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Демонстрация флажков");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jfrm.setSize(560, 120);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать пустые метки
        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        // Создать флажки
        jcbAlpha = new JCheckBox("Альфа");
        jcbBeta = new JCheckBox("Бета");
        jcbGamma = new JCheckBox("Гамма");

        // События, генерируемые флажками, обрабатываются одним
        // методом itemStateChanged(), реализованным в классе CBDemo
        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        // Добавить флажки и метки на панель содержимого
        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabChanged);
        jfrm.add(jlabSelected);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    // Обработчик для флажков
    @Override
    public void itemStateChanged(ItemEvent ie) {
        String str = "";

        // Получить ссылку на флажок, с которым связано событие
        JCheckBox cb = (JCheckBox) ie.getItem();

        // Сообщить о том, состояние какого флажка изменилось
        if (cb.isSelected())
            jlabChanged.setText(cb.getText() + " был выбран.");
        else
            jlabChanged.setText(cb.getText() + " был сброшен.");

        // Сообщить обо всех установленных флажках
        if (jcbAlpha.isSelected())
            str += "Альфа ";
        if (jcbBeta.isSelected())
            str += "Бета ";
        if (jcbGamma.isSelected())
            str += "Гамма";

        jlabSelected.setText("Выбраны флажки: " + str);
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CBDemo();
            }
        });
    }
}
