package Chapters.Chapter17;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.MultipleSelectionModel;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * ������������ ������������� ������
 */
public class ListViewDemo extends Application {

    Label response;

    public static void main(String[] args) {

        // ��������� ���������� JavaFX, ������ ����� launch()
        launch(args);
    }

    // �������������� ����� start()
    @Override
    public void start(Stage myStage) throws Exception {

        // ������ ��������� ���� ����������
        myStage.setTitle("������������ ������");

        // ������������ ���������� FlowPane ��� ��������� ����.
        // � ������ ������ �������� ������������� � ���������������
        // ������� ���������� 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // ������������ ���������� �� �����
        rootNode.setAlignment(Pos.CENTER);

        // ������� �����
        Scene myScene = new Scene(rootNode, 200, 120);

        // ���������� ����� �� ���������
        myStage.setScene(myScene);

        // ������� ������
        response = new Label("����� ����������");

        // ������� ������ ���� ObservableList ��� ������
        ObservableList<String> computerTypes =
                FXCollections.observableArrayList("��������", "�������",
                        "�������", "��");

        // ������� ������
        ListView<String> lvComputers =
                new ListView<>(computerTypes);

        // ������ ���������������� �������� ������ � ������
        lvComputers.setPrefSize(100, 70);

        // �������� ������ ������ �� ������
        MultipleSelectionModel<String> lvSelModel =
                lvComputers.getSelectionModel();

        // ������������ ��������� ��� ������������ �� ���������
        // ��������� ������ ������
        lvSelModel.selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {
                        // ���������� �����
                        response.setText("������� ����������: " + newVal);
                    }
                }
        );

        // �������� ����� � ������ � ���� �����
        rootNode.getChildren().addAll(lvComputers, response);

        // ���������� ��������� ������ � �� ������
        myStage.show();
    }
}
