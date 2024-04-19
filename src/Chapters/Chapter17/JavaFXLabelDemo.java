package Chapters.Chapter17;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


/**
 * ������������ ������������� ����� JavaFX
 */
public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {

        // ��������� ���������� JavaFX, ������ ����� launch()
        launch(args);
    }

    // �������������� ����� start()

    @Override
    public void start(Stage myStage) throws Exception {

        // ������ ��������� ���� ����������
        myStage.setTitle("������������� ����� JavaFX");

        // ������������ ��������� FlowPane ��� ��������� ����
        FlowPane rootNode = new FlowPane();

        // ������� �����
        Scene myScene = new Scene(rootNode, 300, 200);

        // ���������� ����� �� ���������
        myStage.setScene(myScene);

        // ������� �����
        Label myLabel = new Label("JavaFX - ��� ������ GUI");
        // �������� ����� � ���� �����
        rootNode.getChildren().add(myLabel);

        // ���������� ��������� ������ � �� ������
        myStage.show();

    }
}
