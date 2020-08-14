package barosanu;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * Created by "Bartosz Chodyla" on 2020-08-14.
 */
public class Launcher extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {

        Parent parent = FXMLLoader.load(getClass().getResource("view/LoginWindow.fxml"));

        Scene scene = new Scene(parent, 383, 224);
        stage.setScene(scene);

        stage.show();

    }
}