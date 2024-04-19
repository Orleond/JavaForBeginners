package Chapters.Chapter16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * Демонстрация использования простого списка JList
 */
public class ListDemo implements ListSelectionListener {

    JList<String> jlist;
    JLabel jlab;
    JScrollPane jscrlp;

    // Создать массив имен
    String[] names = { "Мария", "Иван", "Светлана",
        "Алесандр", "Евгения", "Наталья",
        "Аркадий", "Валентина", "Борис",
        "Андрей", "Степан", "Владислав" };

    ListDemo() {
        // Создать новый контейнер JFrame
        JFrame jfrm = new JFrame("Демонстрация списка");

        // Задать объект FlowLayout для менеджера компоновки
        jfrm.setLayout(new FlowLayout());

        // Задать исходные размеры фрейма
        jfrm.setSize(200, 160);

        // Прекратить работу программы, если
        // пользователь закрывает приложение
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создать объект JList
        jlist = new JList<>(names);

        // Задать режим выбора одиночных элементов
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Добавить список на панель с полосами прокрутки
        jscrlp = new JScrollPane(jlist);

        // Задать предпочтительные размеры прокручиваемой панели
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // Создать метку для отображения результатов выбора
        jlab = new JLabel("Выберите имя");

        // Добавить обработчик для событий списка
        jlist.addListSelectionListener(this);

        // Добавить список и метку на панель содержимого
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // Отобразить фрейм
        jfrm.setVisible(true);
    }

    // Обработка событий списка
    @Override
    public void valueChanged(ListSelectionEvent e) {
        // Получить индекс элемента, сосояние выбора
        // которого было изменено
        int idx = jlist.getSelectedIndex();

        // Отобразить результат выбора, если элемент был выбран
        if (idx != -1)
            jlab.setText("Текущее выделение: " + names[idx]);
        else // Иначе еще раз предложить сделать выбор
            jlab.setText("Выберите имя");
    }

    public static void main(String[] args) {
        // Создать фрейм в потоке диспетчеризации событий
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
