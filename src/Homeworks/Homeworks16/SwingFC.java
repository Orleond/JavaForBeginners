package Homeworks.Homeworks16;

/**
 * �������� � ������� ��������� ������, ���������
 * � ���������� 16.1, ������ �� ��������� �������������
 * ��������: ���������� ������� �����������. ���� ����
 * ������ ����������, ��������� ������ ����������
 * �������, � ������� ���������� ������ �����������
 * � ���������� ������������ ������
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;

public class SwingFC implements ActionListener {

    JTextField jtfFirst;    // ������ ��� ������� �����
    JTextField jtfSecond;   // ������ ��� ������� �����

    JButton jbtnFirst;  // ������ ��� ������� �������� ��������� ������

    JLabel jlabFirst, jlabSecond;   // �����, ������������
                                    // ��������� ��� ������������
    JLabel jlabResult;  // ����� ��� ����������� ����������
                        // ��������� � ��������� �� �������
    JCheckBox check;

    SwingFC() {

        // ������� ���� ��������� JFrame
        JFrame jfrm = new JFrame("�������� �����");

        // ������ ������ FlowLayout ��� ��������� ����������
        jfrm.setLayout(new FlowLayout());

        // ������ �������� ������� ������
        jfrm.setSize(320, 250);

        // ���������� ������ ���������, ����
        // ������������ ��������� ����������
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������� ���� ��� ����� ���� ������
        jtfFirst = new JTextField(14);
        jtfSecond = new JTextField(14);

        // ������ ������� �������� ��� ��������� �����
        jtfFirst.setActionCommand("���� �");
        jtfSecond.setActionCommand("���� �");

        // ������� ������ ���������
        JButton jbtnComp = new JButton("��������");

        check = new JCheckBox("���������� ������� �����������");

        // �������� ��������� ������� ��� ������
        jbtnComp.addActionListener(this);

        // ������� �����
        jlabFirst = new JLabel("������ ����:");
        jlabSecond = new JLabel("������ ����:");
        jlabResult = new JLabel("");

        // �������� ���������� �� ������ �����������
        jfrm.add(check);
        jfrm.add(jlabFirst);
        jfrm.add(jtfFirst);
        jfrm.add(jlabSecond);
        jfrm.add(jtfSecond);
        jfrm.add(jbtnComp);
        jfrm.add(jlabResult);

        // ����������� �����
        jfrm.setVisible(true);
    }

    // �������� ����� ����� ������ �� ������
    @Override
    public void actionPerformed(ActionEvent e) {
        int i = 0, j = 0;
        int counter = 0;

        // ������� �������� � ���, ��� ������� ����� ����� ������
        if (jtfFirst.getText().equals("")) {
            jlabResult.setText("����������� ��� ������� �����.");
            return;
        }
        if (jtfSecond.getText().equals("")) {
            jlabResult.setText("����������� ��� ������� �����.");
            return;
        }

        // �������� �����, ��������� ���������� try � ���������
        try (FileInputStream f1 = new FileInputStream(jtfFirst.getText());
             FileInputStream f2 = new FileInputStream(jtfSecond.getText())) {
            // ��������� ���������� ����� ������
            do {
                i = f1.read();
                j = f2.read();
                counter++;
                if (i != j) break;
            } while (i != -1 && j != -1);

            if (i != j){
                jlabResult.setText("����� ����������");
                if (check.isSelected())
                    jlabResult.setText("����� ���������� �� " + counter + " �������");

            }
            else
                jlabResult.setText("����� ���������.");
        } catch (IOException exc) {
            jlabResult.setText("������ �����");
        }
    }

    public static void main(String[] args) {
        // ������� ����� � ������ ��������������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingFC();
            }
        });
    }
}
