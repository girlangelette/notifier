package my.app.notifier.controller;

import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import my.app.notifier.App;

import java.net.URL;
import java.util.ResourceBundle;

public class BasicController extends AnchorPane implements Initializable {

    private App app;

    public void initialize(URL location, ResourceBundle resources) {}

    public void setApp(App app) {
        this.app = app;
    }
}
