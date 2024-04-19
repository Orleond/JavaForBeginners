package Chapters.Chapter17;

/**
 * Каркас приложения JavaFX
 */
import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class JavaFXSkel extends Application {

    public static void main(String[] args) {
        System.out.println("Запуск приложения JavaFX");

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод init()
    @Override
    public void init() throws Exception {
        System.out.println("В теле метода init");
    }

    // Переопределить метода start()
    @Override
    public void start(Stage myStage) throws Exception {
        System.out.println("В теле метода start()");

        // Задать заголовок окна приложения
        myStage.setTitle("Каркас приложения JavaFX");

        // Создать корневой узел. В данном случае
        // используется плавающая компоновка, но
        // возможны и другие варианты
        FlowPane rootNode = new FlowPane();

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        // Установить сцену на платформе
        myStage.setScene(myScene);

        // Отобразить платформу вместе со сценой
        myStage.show();
    }

    // Переопределить метод stop()

    @Override
    public void stop() throws Exception {
        super.stop();
        System.out.println("В теле метода stop()");
    }
}
