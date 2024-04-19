package Chapters.Chapter16;

import javax.swing.*;

/**
 * ������� Swing-���������
 */
public class SwingDemo {
    SwingDemo() {
        // ������� ����� ��������� JFrame
        JFrame jfrm = new JFrame("������� ���������� Swing");

        // ���������� ��������� ������� ������
        jfrm.setSize(1000, 200);

        // ��������� ������ ���������, ����� ������������
        // ��������� ����������
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������� ��������� �����
        JLabel jlab = new JLabel("���������������� ���������� � ������� Swing.");

        // �������� ����� �� ������ �����������
        jfrm.add(jlab);

        // ���������� �����
        jfrm.setVisible(true);
    }

    public static void main(String[] args) {
        // ������� ����� � ������ ��������������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingDemo();
            }
        });
    }
}
