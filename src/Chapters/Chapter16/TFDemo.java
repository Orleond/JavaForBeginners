package Chapters.Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * ������������� ���������� ����
 */
public class TFDemo implements ActionListener {

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPrompt, jlabContents;

    TFDemo() {
        // ������� ����� ��������� JFrame
        JFrame jfrm = new JFrame("������������� ���������� ����");

        // ������ ������ FlowLayout ��� ��������� ����������
        jfrm.setLayout(new FlowLayout());

        // ������ �������� ������� ������
        jfrm.setSize(480, 100);

        // ���������� ������ ���������, ����
        // ������������ ��������� ����������
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������� ��������� ����
        jtf = new JTextField(10);

        // ���������� ������� �������� ��� ���������� ����
        jtf.setActionCommand("myTF");

        // ������� ������
        JButton jbtnRev = new JButton("��������");

        // �������� ���������� ������� ��� ���������� ���� � ������
        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        // ������� �����
        jlabPrompt = new JLabel("������� �����");
        jlabContents = new JLabel("");

        // �������� ���������� �� ������ �����������
        jfrm.add(jlabPrompt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        // ���������� �����
        jfrm.setVisible(true);
    }

    // ���������� ������� ��������
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getActionCommand().equals("��������")) {
            // ���� ������ ������
            String orgStr = jtf.getText();
            String resStr = "";

            // �������� ������ � ��������� ����
            for (int i = orgStr.length() - 1; i >= 0; i--) {
                resStr += orgStr.charAt(i);

                // ��������� ���������� ������ � ��������� ����
                jtf.setText(resStr);
            }
        } else
            // ������� <Enter> ���� ������ � ��� ������, ����� �����
            // ����� ��������� � ��������� ����
            jlabContents.setText("�� ������ ENTER. �����: " +
                    jtf.getText());
    }

    public static void main(String[] args) {
        // ������� ����� � ������ ��������������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
}
