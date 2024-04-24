package Homeworks.Homeworks17;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.effect.Reflection;
import javafx.scene.layout.FlowPane;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

/**
 * Модифицируйте программу EffectsAndTransformsDemo таким образом,
 * чтобы размытие применялось также к кнопке Повернуть. Задайте для
 * ширины и высоты области размытия значение 5, а для счетчика итераций —
 * значение 2
 */
public class EffectsAndTransformsDemo extends Application {

    double angle = 0.0;
    double scaleFactor = 0.4;
    double blurVal = 1.0;

    // Создать начальные объекты преобразований и эффектов
    Reflection reflection = new Reflection();
    BoxBlur blur = new BoxBlur(5.0, 5.0, 2);
    Rotate rotate = new Rotate();
    Scale scale = new Scale(scaleFactor, scaleFactor);

    // оздать кнопки
    Button btnRotate = new Button("Повернуть");
    Button btnBlur = new Button("Размыть");
    Button btnScale = new Button("Масштабировать");

    Label reflect = new Label("Отображение добавляет визуальный блеск");

    public static void main(String[] args) {
        // Запустить приложение JavaFX, вызвав метод launch()
        launch(args);
    }

    // Переопределить метод start()
    @Override
    public void start(Stage myStage) throws Exception {

        // Задать заголовок окна приложения
        myStage.setTitle("Демонстрация эффектов и преобразований");

        // Использовать компоновку FlowPane для корневого узла.
        // В данном случае величина вертикального и горизонтального
        // зазора составляет 20.
        FlowPane rootNode = new FlowPane(20, 20);

        // Центрировать компоненты на сцене
        rootNode.setAlignment(Pos.CENTER);

        // Создать сцену
        Scene myScene = new Scene(rootNode, 300, 120);

        // Установить сцену на платформу
        myStage.setScene(myScene);

        // Добавить поворот в список преобразований для
        // кнопки "Повернуть"
        btnRotate.getTransforms().add(rotate);

        // Добавить масштабирование в список преобразований
        // для кнопки "Масштабировать"
        btnScale.getTransforms().add(scale);

        // Задать эффект отражения для метки
        reflection.setTopOpacity(0.7);
        reflection.setBottomOpacity(0.3);
        reflect.setEffect(reflection);

        // Обработать события действий для кнопки "Повернуть"
        btnRotate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // При каждом нажатии кнопки она поворачивается
                // на 15 градусов вокруг центра
                angle += 15.0;

                rotate.setAngle(angle);
                rotate.setPivotX(btnRotate.getWidth() / 2);
                rotate.setPivotY(btnRotate.getHeight() / 2);
            }
        });

        // Обработать события действий для кнопки "Масштабировать"
        btnScale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // При каждом нажатии кнопки изменяются ее размеры
                scaleFactor += 0.1;
                if (scaleFactor > 2.0) scaleFactor = 0.4;

                scale.setX(scaleFactor);
                scale.setY(scaleFactor);
            }
        });

        // Обработать события действий для кнопки "Размыть"
        btnBlur.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                // При каждом нажатии кнопки изменяется
                // степень размытия ее изображения
                if (blurVal == 10.0) {
                    blurVal = 1.0;
                    btnBlur.setEffect(null);
                    btnRotate.setEffect(null);
                    btnBlur.setText("Отменить размытие");
                } else {
                    blurVal++;
                    btnBlur.setEffect(blur);
                    btnRotate.setEffect(blur);
                    btnBlur.setText("Добавить размытие");
                }
                blur.setWidth(blurVal);
                blur.setHeight(blurVal);
            }
        });

        // Добавить метку и кнопки в граф сцены
        rootNode.getChildren().addAll(btnRotate, btnScale, btnBlur, reflect);

        // Отобразить платформу вместе с ее сценой
        myStage.show();
    }
}
