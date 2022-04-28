package ca.project.bluepar2;

import java.util.Date;

public class Employe {
    private String nomUsager;
    private String nomFamille;
    private String prenom;
    private Date dateDebut;
    private Date dateFin;
    private String noEmploye;

    public Employe(String nomUsager, String nomFamille, String prenom, Date dateDebut, Date dateFin, String noEmploye) {
        this.nomUsager = nomUsager;
        this.nomFamille = nomFamille;
        this.prenom = prenom;
        this.noEmploye = noEmploye;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public String getNomUsager() {
        return nomUsager;
    }

    public void setNomUsager(String nomUsager) {
        this.nomUsager = nomUsager;
    }

    public String getNomFamille() {
        return nomFamille;
    }

    public void setNomFamille(String nomFamille) {
        this.nomFamille = nomFamille;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getNoEmploye() {
        return noEmploye;
    }

    public void setNoEmploye(String noEmploye) {
        this.noEmploye = noEmploye;
    }
}
