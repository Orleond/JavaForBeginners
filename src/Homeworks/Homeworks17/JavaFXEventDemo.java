package Homeworks.Homeworks17;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
/**
 * Одним из способов прекращения работы автономного
 * приложения JavaFX является вызов метода
 * Platform.exit(). Класс Platform находится в пакете
 * javafx.Application. При вызове метода exit() работа
 * программы немедленно прекращается. Учитывая это,
 * измените программу JavaFXEventDemo, представленную
 * в этой главе, таким образом, чтобы она отображала
 * две кнопки: Выполнить и Выход. При нажатии кнопки
 * Выполнить программа должна вывести соответствующее
 * сообщение в метке. При нажатии кнопки Выход
 * приложение должно завершить свою работу. В
 * обработчике событий используйте лямбда-выражения.
 */
public class JavaFXEventDemo extends Application {

    Label response;

    public static void main(String[] args) {

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    @Override
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
        btnUp.setOnAction(actionEvent -> response.setText("Вы нажали Выполнить."));

        // Обработка события действий для кнопки "Выход"
        btnDown.setOnAction(actionEvent -> Platform.exit());

        // Добавить метку и кнопки в граф сцены
        rootNode.getChildren().addAll(btnUp, btnDown, response);

        // Отобразить платформу вместе с ее сценой
        myStage.show();
    }
}
