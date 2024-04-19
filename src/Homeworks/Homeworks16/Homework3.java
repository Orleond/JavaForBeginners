package Homeworks.Homeworks16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

/**
 * ������� ���������� ���������. ������������ �����
 * Help, ��������� � ���������� 4.1, � ���������
 * Swing � ����������� ���������������� �����������.
 * �������� � �������� ������ (for, while, switch �
 * ��.) ������ ������������ � ������� ���������� JList.
 * ��� ������ ������������� �������� ������ ������
 * ���������� �������� ���������� ���������� ���������
 * �����. ��� ����������� �������������� ������ ������
 * ����� ����� ������������ �������� HTML. � ���� ������
 * ����� ������ ���������� � ����������� <html> �
 * ����������� ������������ </html>. � ����� ����� �����
 * ������������� �������� � ���� HTML-���������. ������
 * ������ �����������, ����� �������� ������ ���������
 * ��������� ������������� �����. � �������� �������
 * ���� ��������� ������ ����, � ������� ���������
 * �����, ������������ ��� ��������� ������: ������
 * ��������� ������ "���", � ��� ��� - ������ "Bottom".
 *      JLabel jlabhtml = new JLabel("<html>Top<br>
 *      Bottom</html>");
 */

public class Homework3 implements ListSelectionListener {

    private JList helpMenu;
    private JLabel labelSelect;
    private JLabel labelResult;
    private JScrollPane scrollPane;
    private Map<String, String> listTopic;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Homework3();
            }
        });
    }

    public Homework3() {
        File filePath = Path.of("src", "Homeworks", "Homeworks16", "helpfile.txt").toFile();
        JFrame frame = new JFrame("���������� ������ ��������� Help");
        frame.setLayout(new FlowLayout());
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        listTopic = getListTopics(filePath);
        helpMenu = new JList<>(listTopic.keySet().toArray());
        helpMenu.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        scrollPane = new JScrollPane(helpMenu);
        scrollPane.setPreferredSize(new Dimension(120, 90));
        helpMenu.addListSelectionListener(this);

        labelSelect = new JLabel("�������� �������: ");
        labelResult = new JLabel();

        frame.add(labelSelect);
        frame.add(scrollPane);
        frame.add(labelResult);
    }

    private HashMap<String, String> getListTopics(File filePath) {
        int ch;
        String topic, info;
        StringBuilder fullInfo;
        HashMap<String, String> mapTopic = new HashMap<>();
        try (BufferedReader helpReader = new BufferedReader(new FileReader(filePath))) {
            do {
                ch = helpReader.read();
                fullInfo = new StringBuilder();

                if (ch == '#') {
                    topic = helpReader.readLine().trim();
                    do {
                        info = helpReader.readLine();
                        if (info != null) {
                            fullInfo.append(info);
                            fullInfo.append("<br>");
                        }
                    } while ((info != null) && (info.compareTo("") != 0));
                    mapTopic.put(topic, fullInfo.toString());
                }
            } while (ch != -1);
            return mapTopic;
        } catch (IOException exc) {
            return new HashMap<>() {{
                put("������", "������ �����-������");
            }};
        }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String id = helpMenu.getSelectedValue().toString();
        if (!id.isEmpty()) {
            labelResult.setText(String.format("<html>%s</html>", listTopic.get(id)));
        }
        else
            labelResult.setText("������ ������");
    }
}
