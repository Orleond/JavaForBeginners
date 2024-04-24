package Chapters.Chapter17;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
/**
 * Демонстрация использования меток JavaFX
 */
public class JavaFXLabelDemo extends Application {

    public static void main(String[] args) {

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()

    @Override
    public void start(Stage myStage) throws Exception {

        // Задать заголовок окна приложения
        myStage.setTitle("Использование метки JavaFX");

        // Использовать компоновку FlowPane для корневого узла
        FlowPane rootNode = new FlowPane();

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 200);

        // Установить сцену на платформе
        myStage.setScene(myScene);

        // Создать метку
        Label myLabel = new Label("JavaFX - это мощный GUI");
        // Добавить метку в граф сцены
        rootNode.getChildren().add(myLabel);

        // Отобразить платформу вместе с ее сценой
        myStage.show();

    }
}
