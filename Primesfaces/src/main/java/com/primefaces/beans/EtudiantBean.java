package com.primefaces.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.primefaces.objets.Etudiant;

/**
 * Bean gérant les actions liées aux étudiants.
 */
@Named
@RequestScoped
public class EtudiantBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private Etudiant etudiant;
    private List<Etudiant> listeEtudiant;
    private String matricule;
    private String nom;
    private String prenom;
    private Date dateNais;
    private String motivation;
    

    /**
	 * @return the motivation
	 */
	public String getMotivation() {
		return motivation;
	}

	/**
	 * @param motivation the motivation to set
	 */
	public void setMotivation(String motivation) {
		this.motivation = motivation;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
     * Constructeur par défaut.
     */
    public EtudiantBean() {
        listeEtudiant = new ArrayList<>();
       
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

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public List<Etudiant> getListeEtudiant() {
        return listeEtudiant;
    }

    public void setListeEtudiant(List<Etudiant> listeEtudiant) {
        this.listeEtudiant = listeEtudiant;
    }
}