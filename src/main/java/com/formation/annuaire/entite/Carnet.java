package com.formation.annuaire.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Carnet {

    @Id
    @GeneratedValue
    private int      id;
    private Civilite civilite;
    private String   nom;
    private String   prenom;
    private String   dateDeNaissance;
    private String   numeroTel;
    private String   adresse;
    private String   codePostal;
    private String   ville;

    public Carnet() {

    }

    /**
     * Constructeur d'objet CARNET
     * @param id
     * @param civilite
     * @param nom
     * @param prenom
     * @param dateDeNaissance
     * @param tel
     * @param adresse
     * @param cp
     * @param ville
     */
    public Carnet(int id, Civilite civilite, String nom, String prenom, String dateDeNaissance, String tel, String adresse, String cp, String ville) {
        this.id = id;
        this.civilite = civilite;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.adresse = adresse;
        this.numeroTel = tel;
        this.codePostal = cp;
        this.ville = ville;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Civilite getCivilite() {
        return civilite;
    }

    public void setCivilite(Civilite civilite) {
        this.civilite = civilite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(String dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Carnet [id=" + id + ", civilite=" + civilite + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + ", numeroTel=" + numeroTel + ", email=" + adresse
                        + ", codePostal=" + codePostal + ", ville=" + ville + "]";
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

}
