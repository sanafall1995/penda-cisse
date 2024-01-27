package com.primefaces.objets;

import java.awt.Color; // Importation du type Color
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Etudiant {
    private String matricule;
    private String nom;
    private String prenom;
    private Date dateNais;
    private String motivation;
    private List<String> images;
    private Color couleur;

    public Etudiant() {
        images = new ArrayList<>();
        images.add("fa.jpg");
        images.add("ist.jpg");
        images.add("istock.jpg");
        images.add("great.webp");
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getMotivation() {
        return motivation;
    }

    public void setMotivation(String motivation) {
        this.motivation = motivation;
    }

    public Color getCouleur() {
        return couleur;
    }

    public void setCouleur(Color couleur) {
        this.couleur = couleur;
    }

    public Etudiant(String matricule, String nom, String prenom, Date dateNais) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
    }

    // Getters et Setters

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
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

    public Date getDateNais() {
        return dateNais;
    }

    public void setDateNais(Date dateNais) {
        this.dateNais = dateNais;
    }
}