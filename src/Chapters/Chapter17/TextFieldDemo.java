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
 * Демонстрация использования текстового поля
 */
public class TextFieldDemo extends Application {

    TextField tf;
    Label response;

    public static void main(String[] args) {
        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    @Override
    public void start(Stage myStage) throws Exception {

        // Задать заголовок окна приложения
        myStage.setTitle("Демонстрация текстового поля");

        // Использовать компоновку FlowPane для корневого узла.
        // В данном случае величина вертикального и горизонтального
        // зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Центрировать компоненты на сцене
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 230, 140);

        // Установить сцену на платформе
        myStage.setScene(myScene);

        // Создать метку
        response = new Label("Получить имя.");

        // Создать кнопку, управляющую получением текста
        Button btnGetText = new Button("Получить имя");

        // Создать текстовое поле
        tf = new TextField();

        // Задать подсказку
        tf.setPromptText("Введите имя.");

        // Задать предпочтительное количество столбцов
        tf.setPrefColumnCount(15);

        // Использовать лямбда-выражение, обрабатывающее
        // события действий для текстового поля. События
        // действий генерируются при нажатии клавиши <ENTER>
        // в то время, когда фокус ввода находится в текстовом
        // поле. В данном случае обработка события заключается
        // в получении и отображении текста.
        tf.setOnAction((ae) -> response.setText("Введено. Имя: " +
                tf.getText()));

        // Использовать лямбда-выражение для получения текста из
        // текстового поля при нажатии кнопки
        btnGetText.setOnAction((ae) ->
                response.setText("Кнопка нажата. Имя: " + tf.getText()));

        // Использовать разделитель для лучшей организации вывода
        Separator separator = new Separator();
        separator.setPrefWidth(180);

        // Добавить компоненты в грац сцены
        rootNode.getChildren().addAll(tf, btnGetText, separator, response);

        // Отобразить платформу вместе с ее сценой
        myStage.show();
    }
}
