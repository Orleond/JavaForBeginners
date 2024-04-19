package Chapters.Chapter17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 * ������������ �������� ��������, ���������������,
 * ��������� � �������� ����������
 */
public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;

    // ������� ��������� ������� �������������� � ��������
    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(1.0, 1.0, 1);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    // ������� ������
    Button btnRotate = new Button("���������");
    Button btnBlur = new Button("�������");
    Button btnScale = new Button("��������������");

    Label reflect = new Label("����������� ��������� ���������� �����");

    public static void main(String[] args) {
        // ��������� ���������� JavaFX, ������ ����� launch()
        launch(args);
    }

    // �������������� ����� start()
    @Override
    public void start(Stage myStage) throws Exception {

        // ������ ��������� ���� ����������
        myStage.setTitle("������������ �������� � ��������������");

        // ������������ ���������� FlowPane ��� ��������� ����.
        // � ������ ������ �������� ������������� � ���������������
        // ������ ���������� 20.
        FlowPane rootNode = new FlowPane(20, 20);

        // ������������ ���������� �� �����
        rootNode.setAlignment(Pos.CENTER);

        // ������� �����
        Scene myScene = new Scene(rootNode, 300, 120);

        // ���������� ����� �� ���������
        myStage.setScene(myScene);

        // �������� ������� � ������ �������������� ���
        // ������ "���������"
        btnRotate.getTransforms().add(rotate);

        // �������� ��������������� � ������ ��������������
        // ��� ������ "��������������"
        btnScale.getTransforms().add(scale);

        // ������ ������ ��������� ��� �����
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);

        // ���������� ������� �������� ��� ������ "���������"
        btnRotate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // ��� ������ ������� ������ ��� ��������������
                // �� 15 �������� ������ ������
                angle += 15.0;

                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth() / 2);
                rotate.setPivotY(btnRotate.getHeight() / 2);
            }
        });

        // ���������� ������� �������� ��� ������ "��������������"
        btnScale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // ��� ������ ������� ������ ���������� �� �������
                scaleFactor += 0.1;
                if (scaleFactor > 2.0) scaleFactor = 0.4;

                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });

        // ���������� ������� �������� ��� ������ "�������"
        btnBlur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // ��� ������ ������� ������ ����������
                // ������� �������� �� �����������
                if (blurVal == 10.0) {
                    blurVal = 1.0;
                    btnBlur.setEffect(null);
                    btnBlur.setText("�������� ��������");
                } else {
                    blurVal++;
                    btnBlur.setEffect(blur);
                    btnBlur.setText("�������� ��������");
                }
                blur.setWidth(blurVal);
                blur.setHeight(blurVal);
            }
        });

        // �������� ����� � ������ � ���� �����
        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);

        // ���������� ��������� ������ � �� ������
        myStage.show();
    }
}
