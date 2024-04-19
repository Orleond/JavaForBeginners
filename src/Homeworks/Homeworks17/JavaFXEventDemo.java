package Homeworks.Homeworks17;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * ����� �� �������� ����������� ������ �����������
 * ���������� JavaFX �������� ����� ������
 * Platform.exit(). ����� Platform ��������� � ������
 * javafx.Application. ��� ������ ������ exit() ������
 * ��������� ���������� ������������. �������� ���,
 * �������� ��������� JavaFXEventDemo, ��������������
 * � ���� �����, ����� �������, ����� ��� ����������
 * ��� ������: ��������� � �����. ��� ������� ������
 * ��������� ��������� ������ ������� ���������������
 * ��������� � �����. ��� ������� ������ �����
 * ���������� ������ ��������� ���� ������. �
 * ����������� ������� ����������� ������-���������.
 */
public class JavaFXEventDemo extends Application {

    Label response;

    public static void main(String[] args) {

        // ��������� ���������� JavaFX, ������ ����� launch()
        launch(args);
    }

    // �������������� ����� start()
    @Override
    public void start(Stage myStage) throws Exception {

        // ������ ��������� ���� ����������
        myStage.setTitle("������������� ������ � ������� JavaFX");

        // ������������ ���������� FlowPane ��� ��������� ����.
        // � ������ ������ �������� ������������� � ���������������
        // ������� ���������� 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // ������������ ���������� �� �����
        rootNode.setAlignment(Pos.CENTER);

        // ������� �����
        Scene myScene = new Scene(rootNode, 300, 100);

        // ���������� ����� �� ���������
        myStage.setScene(myScene);

        // ������� �����
        response = new Label("������� ������");

        // ������� ��� ������
        Button btnUp = new Button("���������");
        Button btnDown = new Button("�����");

        // ���������� ������� �������� ��� ������ "�����"
        btnUp.setOnAction(actionEvent -> response.setText("�� ������ ���������."));

        // ��������� ������� �������� ��� ������ "����"
        btnDown.setOnAction(actionEvent -> Platform.exit());

        // �������� ����� � ������ � ���� �����
        rootNode.getChildren().addAll(btnUp, btnDown, response);

        // ���������� ��������� ������ � �� ������
        myStage.show();
    }
}
