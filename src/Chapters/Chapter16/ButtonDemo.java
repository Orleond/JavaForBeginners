package Chapters.Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ������������ �������� ������ � ��������� ������� ��������
 */
public class ButtonDemo implements ActionListener {

    JLabel jlab;

    ButtonDemo() {

        // ������� ����� ��������� JFrame
        JFrame jfrm = new JFrame("������ ������");

        // ������ ������ FlowLayout ��� ��������� ����������
        jfrm.setLayout(new FlowLayout());

        // ������ �������� ������� ������
        jfrm.setSize(1000, 500);

        // ���������� ������ ���������, ����
        // ������������ ��������� ����������
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������� ��� ������
        JButton jbtnUp = new JButton("��������");
        JButton jbtnDown = new JButton("������");

        // �������� ���������� ��������
        jbtnUp.addActionListener(this);
        jbtnDown.addActionListener(this);

        // �������� ������ �� ������ �����������
        jfrm.add(jbtnUp);
        jfrm.add(jbtnDown);

        // ������� �����
        jlab = new JLabel("������ ������.");

        // �������� ����� �� �����
        jfrm.add(jlab);

        // ���������� �����
        jfrm.setVisible(true);
    }

    @Override
    // ��������� ������� ������
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("��������"))
            jlab.setText("������ ��������.");
        else
            jlab.setText("������ ������.");
    }

    public static void main(String[] args) {
        // ������� ����� � ������ ��������������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });
    }
}
