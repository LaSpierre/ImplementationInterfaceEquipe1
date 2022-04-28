package ca.project.bluepar2;
/*
Projet réalisé oar équipe 1:
Mohand Said Belkacemi
Martin Couture
Albert-Mary Dorcé
Louis-Alexandre St-Pierre
 */
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RechercheActivitesController implements Initializable {
    @FXML
    private Button btnRetourFenPrincipale;
    @FXML
    private TableView<Activite> tableVue;
    @FXML
    private TableColumn<Activite, String> titre;
    @FXML
    private TableColumn<Activite, String> jour;
    @FXML
    private TableColumn<Activite, String> periodeLibre;
    @FXML
    private TableColumn<Activite, String> cours;
    @FXML
    private TableColumn<Activite, String> certification;
    @FXML
    private TableColumn<Activite, Float> prix;
    @FXML
    private TableColumn<Activite, String> periodeJournee;
    @FXML
    private Button bntRecherher;
    @FXML
    private Button btnEffaceFormulaire;
    @FXML
    private CheckBox chkPeriodeLibreAdulte;
    @FXML
    private CheckBox chkPeriodeLibreEnfant;
    @FXML
    private CheckBox chkPeriodeLibreAgeOr;
    @FXML
    private CheckBox chkCoursAgeOr;
    @FXML
    private CheckBox chkCoursEnfant;
    @FXML
    private CheckBox chkCoursAdulte;
    @FXML
    private CheckBox chkCertificationNiv1;
    @FXML
    private CheckBox chkCertificationNiv2;
    @FXML
    private CheckBox chkCertificationNiv3;
    @FXML
    private CheckBox chkPeriodeJourMatin;
    @FXML
    private CheckBox chkPeriodeJourApresMidi;
    @FXML
    private CheckBox chkPeriodeJourSoir;
    @FXML
    private CheckBox chkJoursDimanche;
    @FXML
    private CheckBox chkJoursLundi;
    @FXML
    private CheckBox chkJoursMardi;
    @FXML
    private CheckBox chkJoursMercredi;
    @FXML
    private CheckBox chkJoursJeudi;
    @FXML
    private CheckBox chkJoursVendredi;
    @FXML
    private CheckBox chkJoursSamedi;



    public void switchToHub(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("application.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    ObservableList<Activite> listActivites= FXCollections.observableArrayList(
            //TODO->mettre des listes pour les jours, type de période libre.
            new Activite("Adulte", "", "Vendredi", "", "Bain libre", "Soir", 0),
            new Activite("", "Adulte", "Vendredi", "Niveau 1", "Intro sauveteur", "Soir", 20),
            new Activite("", "Adulte", "Jeudi", "Niveau 1", "Intro sauveteur", "Soir", 20)
    );

    private boolean rechercher(int i){
        if (chkCertificationNiv1.isSelected()){
            if(listActivites.get(i).getCertification() == "Niveau 1"){
                return true;
            }
        }

        if (chkCertificationNiv2.isSelected()){
            if(listActivites.get(i).getCertification() == "Niveau 2"){
                return true;
            }
        }

        if (chkCertificationNiv3.isSelected()){
            if(listActivites.get(i).getCertification() == "Niveau 3"){
                return true;
            }
        }

        if (chkJoursDimanche.isSelected()){
            if(listActivites.get(i).getJour() == "Dimanche"){
                return true;
            }
        }

        if (chkJoursLundi.isSelected()){
            if(listActivites.get(i).getJour() == "Lundi"){
                return true;
            }
        }

        if (chkJoursMardi.isSelected()){
            if(listActivites.get(i).getJour() == "Mardi"){
                return true;
            }
        }

        if (chkJoursMercredi.isSelected()){
            if(listActivites.get(i).getJour() == "Mercredi"){
                return true;
            }
        }

        if (chkJoursJeudi.isSelected()){
            if(listActivites.get(i).getJour() == "Jeudi"){
                return true;
            }
        }

        if (chkJoursVendredi.isSelected()){
            if(listActivites.get(i).getJour() == "Vendredi"){
                return true;
            }
        }

        if (chkJoursSamedi.isSelected()){
            if(listActivites.get(i).getJour() == "Samedi"){
                return true;
            }
        }

        if (chkJoursDimanche.isSelected()){
            if(listActivites.get(i).getJour() == "Dimanche"){
                return true;
            }
        }

        if (chkCoursAdulte.isSelected()){
            if(listActivites.get(i).getCours() == "Adulte"){
                return true;
            }
        }

        if (chkCoursEnfant.isSelected()){
            if(listActivites.get(i).getCours() == "Enfant"){
                return true;
            }
        }

        if (chkCoursAgeOr.isSelected()){
            if(listActivites.get(i).getCours() == "Age d'or"){
                return true;
            }
        }

        if (chkPeriodeLibreAdulte.isSelected()){
            if(listActivites.get(i).getPeriodeLibre() == "Adulte"){
                return true;
            }
        }

        if (chkPeriodeLibreEnfant.isSelected()){
            if(listActivites.get(i).getPeriodeLibre() == "Enfant"){
                return true;
            }
        }

        if (chkPeriodeLibreAgeOr.isSelected()){
            if(listActivites.get(i).getPeriodeLibre() == "Age d'or"){
                return true;
            }
        }

        if (chkPeriodeJourSoir.isSelected()){
            if(listActivites.get(i).getPeriodeJournee() == "Soir"){
                return true;
            }
        }

        if (chkPeriodeJourMatin.isSelected()){
            if(listActivites.get(i).getPeriodeJournee() == "Matin"){
                return true;
            }
        }

        if (chkPeriodeJourApresMidi.isSelected()){
            if(listActivites.get(i).getPeriodeJournee() == "Après-Midi"){
                return true;
            }
        }
        return false;
    }
    private void effacerFormulaire(){
        chkCertificationNiv1.setSelected(false);
        chkCertificationNiv2.setSelected(false);
        chkCertificationNiv3.setSelected(false);
        chkJoursDimanche.setSelected(false);
        chkJoursLundi.setSelected(false);
        chkJoursMardi.setSelected(false);
        chkJoursMercredi.setSelected(false);
        chkJoursJeudi.setSelected(false);
        chkJoursVendredi.setSelected(false);
        chkJoursSamedi.setSelected(false);
        chkJoursDimanche.setSelected(false);
        chkCoursAdulte.setSelected(false);
        chkCoursEnfant.setSelected(false);
        chkCoursAgeOr.setSelected(false);
        chkPeriodeLibreAdulte.setSelected(false);
        chkPeriodeLibreEnfant.setSelected(false);
        chkPeriodeLibreAgeOr.setSelected(false);
        chkPeriodeJourSoir.setSelected(false);
        chkPeriodeJourMatin.setSelected(false);
        chkPeriodeJourApresMidi.setSelected(false);
        tableVue.getSelectionModel().clearSelection();
    }


    private void selectionRechercher(){
        tableVue.getSelectionModel().clearSelection();

        for (int i=0; i<listActivites.size(); i++){
            if (rechercher(i)){
                tableVue.getSelectionModel().select(i);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        TableView.TableViewSelectionModel<Activite> selectionModel =
                tableVue.getSelectionModel();
        selectionModel.setSelectionMode(SelectionMode.MULTIPLE);

        //TableView aide via ce tuto: https://www.youtube.com/watch?v=fnU1AlyuguE
        titre.setCellValueFactory(new PropertyValueFactory<Activite, String>("titre"));
        jour.setCellValueFactory(new PropertyValueFactory<Activite, String>("jour"));
        periodeLibre.setCellValueFactory(new PropertyValueFactory<Activite, String>("periodeLibre"));
        cours.setCellValueFactory(new PropertyValueFactory<Activite, String>("cours"));
        certification.setCellValueFactory(new PropertyValueFactory<Activite, String>("certification"));
        periodeJournee.setCellValueFactory(new PropertyValueFactory<Activite, String>("periodeJournee"));
        prix.setCellValueFactory(new PropertyValueFactory<Activite, Float>("prix"));


        //Lien avec la liste observable
        tableVue.setItems(listActivites);

        bntRecherher.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                selectionRechercher();
            }
        });
        btnEffaceFormulaire.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                effacerFormulaire();
            }
        });

        btnRetourFenPrincipale.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    switchToHub(actionEvent);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}