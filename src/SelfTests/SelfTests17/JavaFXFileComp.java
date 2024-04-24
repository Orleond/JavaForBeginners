package SelfTests.SelfTests17;

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.geometry.*;
import java.io.*;
/**
 * Реализация средствами JavaFX версии утилиты сравнения файлов,
 * представленной в упражнении 16.1
 */
public class JavaFXFileComp extends Application {

    TextField tfFirst;  // Хранит имя первого файла
    TextField tfSecond; // Хранить имя второго файла

    Button btnComp; // Кнопка для запуска операции сравнения файлов

    Label labFirst, labSecond;  // Метки, отображающие
                                // подсказки для пользователя
    Label labResult;    // Метка для отображения результата
                        // сравнения и сообщений об ошибках

    public static void main(String[] args) {

        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    public void start(Stage myStage) throws Exception {

        // Задать заголовок окна приложения
        myStage.setTitle("Сравнить файлы");

        // Использовать компоновку FlowPane для корневого узла.
        // В данном случае величина вертикального и горизонтального
        // зазоров составляет 10.
        FlowPane rootNode = new FlowPane(10, 10);

        // Центрировать компоненты на сцене
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 180, 180);

        // Установить сцену на платформу
        myStage.setScene(myScene);

        // Создать текстовые поля для имен файлов
        tfFirst = new TextField();
        tfSecond = new TextField();

        // Задать предпочтительные размеры столбцов
        tfFirst.setPrefColumnCount(12);
        tfSecond.setPrefColumnCount(12);

        // Задать подсказки для имен файорв
        tfFirst.setPromptText("Введите имя файла.");
        tfSecond.setPromptText("Введите имя файла.");

        // Создать кнопку сравнения
        btnComp = new Button("Сравнить");

        // Создать метки
        labFirst = new Label("Первый файл: ");
        labSecond = new Label("Второй файл: ");
        labResult = new Label("");

        // Использовать лямбда-выражения для обработки событий
        // действий, связанных с текстовыми полями. Эти обработчики
        // просто запускают событие для кнопки "Сравнить".
        tfFirst.setOnAction((ae) -> btnComp.fire());
        tfSecond.setOnAction((ae) -> btnComp.fire());

        // Обработать события действий для кнопки "Сравнить"
        btnComp.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ae) {
                int i = 0, j = 0;

                // Сначала убедиться в том, что введены
                // имена обоих файлов
                if (tfFirst.getText().equals("")) {
                    labResult.setText("Отсутствует имя первого файла.");
                    return;
                }
                if (tfSecond.getText().equals("")) {
                    labResult.setText("Отсутствует имя второго файла.");
                    return;
                }

                // Сравнить файлы, используя инструкцию try с ресурсами
                try (FileInputStream f1 =
                             new FileInputStream(tfFirst.getText());
                     FileInputStream f2 =
                             new FileInputStream(tfSecond.getText()))
                {
                    // Сравнить содержимое обоих файлов
                    do {
                        i = f1.read();
                        j = f2.read();
                        if (i != j) break;
                    } while (i != -1 && j != -1);

                    if (i != j)
                        labResult.setText("Файлы отличаются");
                    else
                        labResult.setText("Файлы одинаковы.");

                } catch (IOException exc) {
                    labResult.setText("Ошибка файла");
                }
            }
        });

        // Добавить компоненты в граф сцены
        rootNode.getChildren().addAll(labFirst, tfFirst, labSecond,
                tfSecond, btnComp, labResult);

        // Отобразить платформу вместе с ее сценой
        myStage.show();
    }
}
