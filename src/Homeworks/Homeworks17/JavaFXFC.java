package Homeworks.Homeworks17;

/**
 * ������������ Swing-��������� ��� ��������� ������
 * �� ���������� 16.1 � ���������� JavaFX. ��� ����
 * �������������� ��������������� � JavaFX ������������
 * ��������� ������� �������� ��� ������ ������������
 * ����������. ��� �������� ����� ������ fire() ���
 * ���������� ������. � �������, ���� ������� ���������
 * ������ Button, ������� �� ������ myButton, �� ���
 * ������� ������� ���������� ������� �����
 * myButton.fire(). �������������� ���� ��� ����������
 * ������������ ������� ��� ��������� �����, � �������
 * �������� ����� ������������ ������. � ��� �������,
 * ����� ������������ ������ ������� <ENTER> � ���
 * ���� ����� ����� ��������� � ����� �� ���������
 * ��������� �����, ���������� ������� �������� ���
 * ������ ��������. ����� ����� ��� �����������
 * ������� ��� ������ �������� ������ ���������
 * ��������� ������.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaFXFC extends Application {

    TextField tfFirst;
    TextField tfSecond;

    Button btnFirst;

    Label labFirst, labSecond;
    Label labResult;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("��������� ������");
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 20, 20);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 500, 400);
        stage.setScene(scene);

        tfFirst = new TextField();
        tfFirst.setPrefColumnCount(14);
        tfSecond = new TextField();
        tfSecond.setPrefColumnCount(14);

        Button btnComp = new Button("��������");

        tfFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btnComp.fire();
            }
        });

        tfSecond.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btnComp.fire();
            }
        });

        btnComp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int i = 0, j = 0;

                if (tfFirst.getText().isEmpty()) {
                    labResult.setText("����������� ��� ������� �����.");
                    return;
                }
                if (tfSecond.getText().isEmpty()) {
                    labResult.setText("����������� ��� ������� �����");
                    return;
                }

                try (FileInputStream f1 = new FileInputStream(tfFirst.getText());
                     FileInputStream f2 = new FileInputStream(tfSecond.getText())) {
                    do {
                        i = f1.read();
                        j = f2.read();
                        if (i != j) break;
                    } while (i != -1 && j != -1);

                    if (i != j)
                        labResult.setText("����� ����������");
                    else
                        labResult.setText("����� ���������");
                } catch (IOException exc) {
                    labResult.setText("������ �����");
                }
            }
        });
        labFirst = new Label("������ ����:");
        labSecond = new Label("������ ����: ");
        labResult = new Label("");

        rootNode.getChildren().addAll(labFirst, tfFirst,
                labSecond, tfSecond, btnComp, labResult);

        stage.show();
    }
}
