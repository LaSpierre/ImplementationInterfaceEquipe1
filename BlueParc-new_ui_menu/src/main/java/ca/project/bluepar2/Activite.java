package ca.project.bluepar2;

public class Activite {
    private String periodeLibre;
    private String cours;
    private String  jour;
    private String  certification;
    private String titre;
    private String  periodeJournee;
    private float prix;
/*Si on veut utiliser les enums
    public Activite(String titre, enumPeriodeLibre periodeLibre, enumCours cours, enumJour jour, enumCertification certification, enumPeriodeJour periodeJour, float prix) {
        this.periodeLibre = periodeLibre;
        this.cours = cours;
        this.jour = jour;
        this.certification = certification;
        this.titre = titre;
        this.periodeJour = periodeJour;
        this.prix = prix;
    }
    public enum enumCours{
        ADULTE,
        ENFANT,
        AGEDOR,
        AUCUN
    }
    public enum enumJour{
        DIMANCHE,
        LUNDI,
        MARDI,
        MERCREDI,
        JEUDI,
        VENDREDI,
        SAMEDI
    }
    public enum enumCertification{
        NIVEAU1,
        NIVEAU2,
        NIVEAU3,
        AUCUN
    }
    public enum enumPeriodeLibre{
        ADULTE,
        ENFANT,
        AGEDOR,
        AUCUN
    };
    public enum enumPeriodeJour{
        MATIN,
        MIDI,
        SOIR
    }
*/

    public Activite(String periodeLibre, String cours, String jour, String certification, String titre, String periodeJournee, float prix) {
        this.periodeLibre = periodeLibre;
        this.cours = cours;
        this.jour = jour;
        this.certification = certification;
        this.titre = titre;
        this.periodeJournee = periodeJournee;
        this.prix = prix;
    }

    public String getPeriodeLibre() {
        return periodeLibre;
    }

    public void setPeriodeLibre(String periodeLibre) {
        this.periodeLibre = periodeLibre;
    }

    public String getCours() {
        return cours;
    }

    public void setCours(String cours) {
        this.cours = cours;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getCertification() {
        return certification;
    }

    public void setCertification(String certification) {
        this.certification = certification;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getPeriodeJournee() {
        return periodeJournee;
    }

    public void setPeriodeJournee(String periodeJournee) {
        this.periodeJournee = periodeJournee;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
}