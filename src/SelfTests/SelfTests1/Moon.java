package SelfTests.SelfTests1;

/**
 * ���������� ���� �� ����
 *
 * ��������� ����� ����� ��� Moon.java
 */
public class Moon {
    public static void main(String[] args) {
        double earthweight; // ��� �� �����
        double moonweight;  // ��� �� ����

        earthweight = 165;  // ��� �� ����� � ������

        moonweight = earthweight * 0.17;

        System.out.println(earthweight + " ������ ������" +
                " ������������ " + moonweight +
                " ������ ������.");
    }
}
