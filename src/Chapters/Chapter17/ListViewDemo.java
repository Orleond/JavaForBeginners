package Chapters.Chapter17;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.beans.value.*;
import javafx.collections.*;
/**
 * Демонстрация использования списка
 */
public class ListViewDemo extends Application {

    Label response;

    public static void main(String[] args) {

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    @Override
    public void start(Stage myStage) throws Exception {

        // Задать заголовок окна приложения
        myStage.setTitle("Демонстрация списка");

        // Использовать компоновку FlowPane для корневого узла.
        // В данном случае величина вертикального и горизонтального
        // зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Центрировать компоненты на сцене
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 200, 120);

        // Установить сцену на платформе
        myStage.setScene(myScene);

        // Создать мметку
        response = new Label("Выбор устройства");

        // Создать объект типа ObservableList для списка
        ObservableList<String> computerTypes =
                FXCollections.observableArrayList("Смартфон", "Планшет",
                        "Ноутбук", "ПК");

        // Создать список
        ListView<String> lvComputers =
                new ListView<>(computerTypes);

        // Задать предпочтительные значения высоты и ширины
        lvComputers.setPrefSize(100, 70);

        // Получить модель выбора из списка
        MultipleSelectionModel<String> lvSelModel =
                lvComputers.getSelectionModel();

        // Использовать слушатель для реагирования на изменения
        // выделения внутри списка
        lvSelModel.selectedItemProperty().addListener(
                new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> changed, String oldVal, String newVal) {
                        // Отобразить выбор
                        response.setText("Выбрано устройство: " + newVal);
                    }
                }
        );

        // Добавить метку и список в граф сцены
        rootNode.getChildren().addAll(lvComputers, response);

        // Отобразить платформу вместе с ее сценой
        myStage.show();
    }
}
