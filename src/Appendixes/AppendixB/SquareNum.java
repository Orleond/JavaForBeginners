package Appendixes.AppendixB;

import java.io.*;
/**
 * �����, ��������������� �������������
 * ��������������� ������������.
 * @author Herbert Schildt
 * @version 1.2
 */
public class SquareNum {
    /**
     * ���� ����� ���������� ������� �������� ��������� num.
     * ������ �������� ������� �� ���������� �����. ����� �����
     * �� ��������������.
     * @param num ��������, ������� ��������� �������� � �������.
     * @return ������� ��������� �������� ��������� num.
     */
    public double square(double num) {
        return num * num;
    }

    /**
     * ���� ����� �������� ��������, ��������� �������������.
     * @return ��������� �������� ���� double.
     * @exception IOException ���������� ��� ������ �����.
     * @see IOException
     */
    public double getNumber() throws IOException {
        // ������� ����� BufferedReader �� ������������
        // ������ System.in
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader inData = new BufferedReader(isr);
        String str;

        str = inData.readLine();
        return (new Double(str)).doubleValue();
    }

    /**
     * � ���� ������ ��������������� ���������� ������ square().
     * @param args �� ������������
     * @exception IOException ���������� ��� ������ �����
     * @see IOException
     */
    public static void main(String[] args) throws IOException {
        SquareNum ob = new SquareNum();
        double val;
        System.out.println("������� �������� ��� ����������" +
                "� �������: ");
        val = ob.getNumber();
        val = ob.square(val);

        System.out.println("������� ���������� �������� " + val);
    }
}
