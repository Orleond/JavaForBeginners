package Exercises.Exercises17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Демонстрация использования флажков
 */
public class CheckBoxDemo extends Application {

    CheckBox cbSmartphone;
    CheckBox cbTablet;
    CheckBox cbNotebook;
    CheckBox cbDesktop;

    Label response;
    Label selected;

    String computers;

    public static void main(String[] args) {

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    @Override
    public void start(Stage myStage) throws Exception {

        // Задать заголовок окна приложения
        myStage.setTitle("Демонстрация фоажков");

        // Использовать компоновку FlowPane для корневого узла.
        // В данном случае величина вертикального и горизонтального
        // зазоров составляет 10.
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 10, 10);

        // Центрировать компоненты на сцене
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 230, 200);

        // Установить сцену на платформе
        myStage.setScene(myScene);

        Label heading = new Label("Какие у вас есть устройства?");

        // Создать метку, извещающую об изменении состояния флажка
        response = new Label("");

        // Создать метку, извещающую о выборе любого флажка
        selected = new Label("");

        // Создать флажки
        cbSmartphone = new CheckBox("Смартфон");
        cbSmartphone.setAllowIndeterminate(true);
        cbTablet = new CheckBox("Планшет");
        cbNotebook = new CheckBox("Ноутбук");
        cbDesktop = new CheckBox("ПК");

        // Обработка событий действий для флажков
        cbSmartphone.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbSmartphone.isIndeterminate())
                    response.setText("Состояние смартфона не определено");
                else if (cbSmartphone.isSelected())
                    response.setText("Был выбран смартфон.");
                else
                    response.setText("Выбор смартфона отменен.");

                showAll();
            }
        });

        cbTablet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbTablet.isSelected())
                    response.setText("Был выбран планшет.");
                else
                    response.setText("Выбор планшета отменен.");

                showAll();
            }
        });

        cbNotebook.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbNotebook.isSelected())
                    response.setText("Был выбран ноутбук.");
                else
                    response.setText("Выбор ноутбука отменен.");

                showAll();
            }
        });

        cbDesktop.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (cbDesktop.isSelected())
                    response.setText("Был выбран ПК.");
                else
                    response.setText("Выбор ПК отменен.");

                showAll();
            }
        });

        // Добавить копоненты в граф сцены
        rootNode.getChildren().addAll(heading, cbSmartphone, cbTablet,
                cbNotebook, cbDesktop, response, selected);

        // Отобразить платформу вместе с ее сценой
        myStage.show();

        showAll();
    }

    // Обновить и отобразить варианты выбора
    void showAll() {
        computers = "";
        if (cbSmartphone.isSelected()) computers += "Смартфон ";
        if (cbTablet.isSelected()) computers += "Планшет ";
        if (cbNotebook.isSelected()) computers += "Ноутбук ";
        if (cbDesktop.isSelected()) computers += "ПК";

        selected.setText("Выбраны устройства: " + computers);
    }
}
