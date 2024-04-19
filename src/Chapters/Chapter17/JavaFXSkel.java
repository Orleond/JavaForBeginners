package Chapters.Chapter17;

/**
 * ������ ���������� JavaFX
 */
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {

    public static void main(String[] args) {
        System.out.println("������ ���������� JavaFX");

        // ��������� ���������� JavaFX, ������ ����� launch()
        launch(args);
    }

    // �������������� ����� init()
    @Override
    public void init() throws Exception {
        System.out.println("� ���� ������ init");
    }

    // �������������� ������ start()
    @Override
    public void start(Stage myStage) throws Exception {
        System.out.println("� ���� ������ start()");

        // ������ ��������� ���� ����������
        myStage.setTitle("������ ���������� JavaFX");

        // ������� �������� ����. � ������ ������
        // ������������ ��������� ����������, ��
        // �������� � ������ ��������
        FlowPane rootNode = new FlowPane();

        // ������� �����
        Scene myScene = new Scene(rootNode, 300, 200);

        // ���������� ����� �� ���������
        myStage.setScene(myScene);

        // ���������� ��������� ������ �� ������
        myStage.show();
    }

    // �������������� ����� stop()

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("� ���� ������ stop()");
    }
}
