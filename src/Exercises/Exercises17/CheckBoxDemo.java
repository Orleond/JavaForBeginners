package Exercises.Exercises17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * ������������ ������������� �������
 */
public class CheckBoxDemo extends Application {

    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;

    Label response;
    Label selected;

    String computers;

    public static void main(String[] args) {

        // ��������� ���������� JavaFX, ������ ����� launch()
        launch(args);
    }

    // �������������� ����� start()
    @Override
    public void start(Stage myStage) throws Exception {

        // ������ ��������� ���� ����������
        myStage.setTitle("������������ �������");

        // ������������ ���������� FlowPane ��� ��������� ����.
        // � ������ ������ �������� ������������� � ���������������
        // ������� ���������� 10.
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);

        // ������������ ���������� �� �����
        rootNode.setAlignment(Pos.CENTER);

        // ������� �����
        Scene myScene = new Scene(rootNode, 230, 200);

        // ���������� ����� �� ���������
        myStage.setScene(myScene);

        Label heading = new Label("����� � ��� ���� ����������?");

        // ������� �����, ���������� �� ��������� ��������� ������
        response = new Label("");

        // ������� �����, ���������� � ������ ������ ������
        selected = new Label("");

        // ������� ������
        cbSmartphone = new CheckBox("��������");
        cbSmartphone.setAllowIndeterminate(true);
        cbTablet = new CheckBox("�������");
        cbNotebook = new CheckBox("�������");
        cbDesktop = new CheckBox("��");

        // ��������� ������� �������� ��� �������
        cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbSmartphone.isIndeterminate())
                    response.setText("��������� ��������� �� ����������");
                else if (cbSmartphone.isSelected())
                    response.setText("��� ������ ��������.");
                else
                    response.setText("����� ��������� �������.");

                showAll();
            }
        });

        cbTablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbTablet.isSelected())
                    response.setText("��� ������ �������.");
                else
                    response.setText("����� �������� �������.");

                showAll();
            }
        });

        cbNotebook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbNotebook.isSelected())
                    response.setText("��� ������ �������.");
                else
                    response.setText("����� �������� �������.");

                showAll();
            }
        });

        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbDesktop.isSelected())
                    response.setText("��� ������ ��.");
                else
                    response.setText("����� �� �������.");

                showAll();
            }
        });

        // �������� ��������� � ���� �����
        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet,
                cbNotebook, cbDesktop, response, selected);

        // ���������� ��������� ������ � �� ������
        myStage.show();

        showAll();
    }

    // �������� � ���������� �������� ������
    void showAll() {
        computers = "";
        if (cbSmartphone.isSelected()) computers += "�������� ";
        if (cbTablet.isSelected()) computers += "������� ";
        if (cbNotebook.isSelected()) computers += "������� ";
        if (cbDesktop.isSelected()) computers += "��";

        selected.setText("������� ����������: " + computers);
    }
}
