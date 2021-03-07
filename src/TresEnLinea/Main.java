package TresEnLinea;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String cssDark = getClass().getResource("resources/css/lightstyle.css").toExternalForm();
        Parent root = FXMLLoader.load(getClass().getResource("resources/layout.fxml"));

//        scene.getStylesheets().add("yourmom");

        Scene scene = new Scene(root);
        scene.getStylesheets().add(cssDark);

        primaryStage.setTitle("Tres en linea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
