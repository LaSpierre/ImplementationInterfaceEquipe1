package ca.project.bluepar2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private TextField nomUtilisateur;

    @FXML
    private PasswordField motDePasse;

    @FXML
    Text message;

    @FXML
    public void check(MouseEvent event) {
        if (nomUtilisateur.getText().isBlank() || motDePasse.getText().isBlank()) {
            message.setText("Veuillez entrer un nom d'utilisateur et un mot de passe");
        } else {
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("application.fxml"));
                Stage stage = new Stage();
                stage.setTitle("Parc Aquatique");
                stage.setScene(new Scene(root, 800, 600));
                stage.show();
                // Hide this current window (if this is what you want)
                ((Node)(event.getSource())).getScene().getWindow().hide();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}