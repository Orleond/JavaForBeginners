package Homeworks.Homeworks17;

/**
 * Преобразуйте Swing-программу для сравнения файлов
 * из упражнения 16.1 в приложение JavaFX. При этом
 * воспользуйтесь предоставляемой в JavaFX возможностью
 * запускать события действий для кнопки программными
 * средствами. Это делается путем вызова fire() для
 * экземпляра кнопки. К примеру, если имеется экземпляр
 * класса Button, который вы навали myButton, то для
 * запуска события необходимо вызвать метод
 * myButton.fire(). Воспользуйтесь этим при реализации
 * обработчиков событий для текстовых полей, в которых
 * хранятся имена сравниваемых файлов. В тех случаях,
 * когда пользователь нажмет клавишу <ENTER> и при
 * этом фокус ввода находится в одном из указанных
 * текстовых полей, запускайте событие действия для
 * кнопки Сравнить. После этого код обработчика
 * событий для кнопки Сравнить должен выполнить
 * сравнение файлов.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaFXFC extends Application {

    TextField tfFirst;
    TextField tfSecond;

    Button btnFirst;

    Label labFirst, labSecond;
    Label labResult;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Сравнение файлов");
        FlowPane rootNode = new FlowPane(Orientation.VERTICAL, 20, 20);
        rootNode.setAlignment(Pos.CENTER);
        Scene scene = new Scene(rootNode, 500, 400);
        stage.setScene(scene);

        tfFirst = new TextField();
        tfFirst.setPrefColumnCount(14);
        tfSecond = new TextField();
        tfSecond.setPrefColumnCount(14);

        Button btnComp = new Button("Сравнить");

        tfFirst.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btnComp.fire();
            }
        });

        tfSecond.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                btnComp.fire();
            }
        });

        btnComp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int i = 0, j = 0;

                if (tfFirst.getText().isEmpty()) {
                    labResult.setText("Отсутствует имя первого файла.");
                    return;
                }
                if (tfSecond.getText().isEmpty()) {
                    labResult.setText("Отсутствует имя второго файла");
                    return;
                }

                try (FileInputStream f1 = new FileInputStream(tfFirst.getText());
                     FileInputStream f2 = new FileInputStream(tfSecond.getText())) {
                    do {
                        i = f1.read();
                        j = f2.read();
                        if (i != j) break;
                    } while (i != -1 && j != -1);

                    if (i != j)
                        labResult.setText("Файлы отличаются");
                    else
                        labResult.setText("Файлы одинаковы");
                } catch (IOException exc) {
                    labResult.setText("Ошибка файла");
                }
            }
        });
        labFirst = new Label("Первый файл:");
        labSecond = new Label("Второй файл: ");
        labResult = new Label("");

        rootNode.getChildren().addAll(labFirst, tfFirst,
                labSecond, tfSecond, btnComp, labResult);

        stage.show();
    }
}
