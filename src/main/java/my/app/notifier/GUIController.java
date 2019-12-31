package my.app.notifier;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class GUIController implements Initializable {

    @FXML
    Label label1;

    @FXML
    Label label2;

    @FXML
    Button signInButton;



    public void initialize(URL location, ResourceBundle resources) {

        label2.setText("Urrah");

    }
}
