package my.app.notifier;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader = new FXMLLoader();
        URL url = getClass().getResource("/GUI.fxml");
        loader.setBuilderFactory(new JavaFXBuilderFactory());
        loader.setLocation(url);

        Parent content = loader.load(getClass().getResourceAsStream("/GUI.fxml"));

        Scene scene = new Scene(content);

        primaryStage.setTitle("My app");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    }
}
