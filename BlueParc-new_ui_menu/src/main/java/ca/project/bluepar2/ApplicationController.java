package ca.project.bluepar2;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationController {

    @FXML
    Button accueil;

    @FXML
    Button employe;

    @FXML
    Button activite;

    @FXML
    Button client;

    @FXML
    Button close;

    @FXML
    VBox homeVb;
    @FXML
    ImageView homeImg;
    @FXML
    Text homeTxt;

    @FXML
    VBox employeVb;
    @FXML
    ImageView employeImg;
    @FXML
    Text employeTxt;

    @FXML
    VBox activiteVb;
    @FXML
    ImageView activiteImg;
    @FXML
    Text activiteTxt;

    @FXML
    VBox deconnexionVb;
    @FXML
    ImageView deconnexionImg;
    @FXML
    Text deconnexionTxt;

    public void quitter(ActionEvent actionEvent) {
    }


    public void openWindow(Event event){
        if(activite.equals(event.getTarget())){
            openPane("RechercheActivites", event);
        }else if(employe.equals(event.getTarget())){
            openPane("gestionEmploye", event);
        }else if(close.equals(event.getTarget())){
            openPane("login-view", event);
        }
    }

    public void openPaneCallBack(Event event){
        openWindow(event);
        event.consume();
    }
    @FXML
    public void initialize(){

    }
    public void openPane(String file, Event event){
        Parent root;
        try {

            root = FXMLLoader.load(getClass().getResource(file+".fxml"));
            Stage stage = new Stage();
            stage.setTitle("Parc Aquatique");
            stage.setScene(new Scene(root, 900, 700));
            stage.show();
            // Hide this current window (if this is what you want)
            ((Node)(event.getSource())).getScene().getWindow().hide();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void test(ActionEvent actionEvent) {
        System.out.println(actionEvent.getTarget());
    }
}
