package Chapters.Chapter17;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * ������������ ������������� ���������� ����
 */
public class TextFieldDemo extends Application {

    TextField tf;
    Label response;

    public static void main(String[] args) {
        // ��������� ���������� JavaFX, ������ ����� launch()
        launch(args);
    }

    // �������������� ����� start()
    @Override
    public void start(Stage myStage) throws Exception {

        // ������ ��������� ���� ����������
        myStage.setTitle("������������ ���������� ����");

        // ������������ ���������� FlowPane ��� ��������� ����.
        // � ������ ������ �������� ������������� � ���������������
        // ������� ���������� 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // ������������ ���������� �� �����
        rootNode.setAlignment(Pos.CENTER);

        // ������� �����
        Scene myScene = new Scene(rootNode, 230, 140);

        // ���������� ����� �� ���������
        myStage.setScene(myScene);

        // ������� �����
        response = new Label("�������� ���.");

        // ������� ������, ����������� ���������� ������
        Button btnGetText = new Button("�������� ���");

        // ������� ��������� ����
        tf = new TextField();

        // ������ ���������
        tf.setPromptText("������� ���.");

        // ������ ���������������� ���������� ��������
        tf.setPrefColumnCount(15);

        // ������������ ������-���������, ��������������
        // ������� �������� ��� ���������� ����. �������
        // �������� ������������ ��� ������� ������� <ENTER>
        // � �� �����, ����� ����� ����� ��������� � ���������
        // ����. � ������ ������ ��������� ������� �����������
        // � ��������� � ����������� ������.
        tf.setOnAction((ae) -> response.setText("�������. ���: " +
                tf.getText()));

        // ������������ ������-��������� ��� ��������� ������ ��
        // ���������� ���� ��� ������� ������
        btnGetText.setOnAction((ae) ->
                response.setText("������ ������. ���: " + tf.getText()));

        // ������������ ����������� ��� ������ ����������� ������
        Separator separator = new Separator();
        separator.setPrefWidth(180);

        // �������� ���������� � ���� �����
        rootNode.getChildren().addAll(tf, btnGetText, separator, response);

        // ���������� ��������� ������ � �� ������
        myStage.show();
    }
}
