package my.app.notifier;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.JavaFXBuilderFactory;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import my.app.notifier.controller.BasicController;
import my.app.notifier.controller.LoginController;

import java.io.InputStream;

public class App extends Application {

    private Stage stage;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        stage = primaryStage;
        goToLoginPage();
        primaryStage.show();
    }

    private void goToLoginPage() {
        try {
            System.out.println("Go to login page");
            LoginController login = (LoginController) replaceSceneContent("/login.fxml");
            login.setApp(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void goToBasicPage() {
        try {
            System.out.println("Go to basic page");
            BasicController basic = (BasicController) replaceSceneContent("/basic.fxml");
            basic.setApp(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Node replaceSceneContent(String fxml) {
        try {
            FXMLLoader loader = new FXMLLoader();
            InputStream in = getClass().getResourceAsStream(fxml);
            loader.setBuilderFactory(new JavaFXBuilderFactory());
            loader.setLocation(getClass().getResource(fxml));
            AnchorPane pane;
            try {
                pane = loader.load(in);
            } finally {
                in.close();
            }

            Scene scene = new Scene(pane);
            stage.setScene(scene);
            stage.sizeToScene();
            stage.setTitle("My app");
            return (Node) loader.getController();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
