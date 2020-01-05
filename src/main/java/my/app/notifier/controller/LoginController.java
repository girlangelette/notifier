package my.app.notifier.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import my.app.notifier.App;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController extends AnchorPane implements Initializable {

    private static final String LOGIN = "admin";
    private static final String PASS = "pass";

    private App app;

    @FXML TextField loginInput;
    @FXML TextField passwordInput;
    @FXML Button enterButton;
    @FXML Label errorMessage;

    public void initialize(URL location, ResourceBundle resources) {}

    public void enter() {
        if (LOGIN.equals(loginInput.getText()) && PASS.equals(passwordInput.getText())) {
            app.goToBasicPage();

        } else {
            errorMessage.setText("Invalid login or password. Try again!");
        }
    }

    public void setApp(App app) {
        this.app = app;
    }
}
