package SelfTests.SelfTests17;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
/**
 * Демонстрация использования метода Platform.exit()
 */
public class JavaFXEventDemo extends Application {

    Label response;

    public static void main(String[] args) {

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    public void start(Stage myStage) throws Exception {

        // Задать заголовок окна приложения
        myStage.setTitle("Использование кнопок и событий JavaFX");

        // Использовать компоновку FlowPane для корневого узла.
        // В данном случае величина вертикального и горизонтального
        // зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Центрировать компоненты на сцене
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 100);

        // Установить сцену на платформе
        myStage.setScene(myScene);

        // Создать метку
        response = new Label("Нажмите кнопку");

        // Создать две кнопки
        Button btnUp = new Button("Выполнить");
        Button btnDown = new Button("Выход");

        // Обработать события действий для кнопки "Выполнить"
        btnUp.setOnAction(actionEvent ->
                response.setText("Вы нажали Выполнить."));

        // Обработка события действий для кнопки "Выход"
        btnDown.setOnAction((ae) -> Platform.exit());

        // Добавить метку и кнопки в граф сцены
        rootNode.getChildren().addAll(btnUp, btnDown, response);

        // Отобразить платформу вместе с ее сценой
        myStage.show();
    }
}
