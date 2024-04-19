package Chapters.Chapter16;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

/**
 * ������������ ������������� �������� ������ JList
 */
public class ListDemo implements ListSelectionListener {

    JList<String> jlist;
    JLabel jlab;
    JScrollPane jscrlp;

    // ������� ������ ����
    String[] names = { "�����", "����", "��������",
        "��������", "�������", "�������",
        "�������", "���������", "�����",
        "������", "������", "���������" };

    ListDemo() {
        // ������� ����� ��������� JFrame
        JFrame jfrm = new JFrame("������������ ������");

        // ������ ������ FlowLayout ��� ��������� ����������
        jfrm.setLayout(new FlowLayout());

        // ������ �������� ������� ������
        jfrm.setSize(200, 160);

        // ���������� ������ ���������, ����
        // ������������ ��������� ����������
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������� ������ JList
        jlist = new JList<>(names);

        // ������ ����� ������ ��������� ���������
        jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // �������� ������ �� ������ � �������� ���������
        jscrlp = new JScrollPane(jlist);

        // ������ ���������������� ������� �������������� ������
        jscrlp.setPreferredSize(new Dimension(120, 90));

        // ������� ����� ��� ����������� ����������� ������
        jlab = new JLabel("�������� ���");

        // �������� ���������� ��� ������� ������
        jlist.addListSelectionListener(this);

        // �������� ������ � ����� �� ������ �����������
        jfrm.add(jscrlp);
        jfrm.add(jlab);

        // ���������� �����
        jfrm.setVisible(true);
    }

    // ��������� ������� ������
    @Override
    public void valueChanged(ListSelectionEvent e) {
        // �������� ������ ��������, �������� ������
        // �������� ���� ��������
        int idx = jlist.getSelectedIndex();

        // ���������� ��������� ������, ���� ������� ��� ������
        if (idx != -1)
            jlab.setText("������� ���������: " + names[idx]);
        else // ����� ��� ��� ���������� ������� �����
            jlab.setText("�������� ���");
    }

    public static void main(String[] args) {
        // ������� ����� � ������ ��������������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ListDemo();
            }
        });
    }
}
