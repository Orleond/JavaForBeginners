package Chapters.Chapter16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * ������������ ������������� �������
 */
public class CBDemo implements ItemListener {
    JLabel jlabSelected;
    JLabel jlabChanged;
    JCheckBox jcbAlpha;
    JCheckBox jcbBeta;
    JCheckBox jcbGamma;

    CBDemo() {
        // ������� ����� ��������� JFrame
        JFrame jfrm = new JFrame("������������ �������");

        // ������ ������ FlowLayout ��� ��������� ����������
        jfrm.setLayout(new FlowLayout());

        // ������ �������� ������� ������
        jfrm.setSize(560, 120);

        // ���������� ������ ���������, ����
        // ������������ ��������� ����������
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // ������� ������ �����
        jlabSelected = new JLabel("");
        jlabChanged = new JLabel("");

        // ������� ������
        jcbAlpha = new JCheckBox("�����");
        jcbBeta = new JCheckBox("����");
        jcbGamma = new JCheckBox("�����");

        // �������, ������������ ��������, �������������� �����
        // ������� itemStateChanged(), ������������� � ������ CBDemo
        jcbAlpha.addItemListener(this);
        jcbBeta.addItemListener(this);
        jcbGamma.addItemListener(this);

        // �������� ������ � ����� �� ������ �����������
        jfrm.add(jcbAlpha);
        jfrm.add(jcbBeta);
        jfrm.add(jcbGamma);
        jfrm.add(jlabChanged);
        jfrm.add(jlabSelected);

        // ���������� �����
        jfrm.setVisible(true);
    }

    // ���������� ��� �������
    @Override
    public void itemStateChanged(ItemEvent ie) {
        String str = "";

        // �������� ������ �� ������, � ������� ������� �������
        JCheckBox cb = (JCheckBox) ie.getItem();

        // �������� � ���, ��������� ������ ������ ����������
        if (cb.isSelected())
            jlabChanged.setText(cb.getText() + " ��� ������.");
        else
            jlabChanged.setText(cb.getText() + " ��� �������.");

        // �������� ��� ���� ������������� �������
        if (jcbAlpha.isSelected())
            str += "����� ";
        if (jcbBeta.isSelected())
            str += "���� ";
        if (jcbGamma.isSelected())
            str += "�����";

        jlabSelected.setText("������� ������: " + str);
    }

    public static void main(String[] args) {
        // ������� ����� � ������ ��������������� �������
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CBDemo();
            }
        });
    }
}
