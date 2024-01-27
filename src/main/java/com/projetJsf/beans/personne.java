/**
 * 
 */
package com.projetJsf.beans;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
/**
 * 
 */
@RequestScoped
@Named
public class personne{
	private String nom;
	private String prenom;
	private String ville;
	private String pays;
	private List<String>listePays;
	private String password;
	private String adresse;
	
	/**
	 * le constructeur sans argument
	 */
	public personne() {
		//initialisation de la liste
		this.listePays=new ArrayList<String>();
		//ajout de quelques pays dans la liste
		this.listePays.add("sénégal");
		this.listePays.add("Gambie");
		this.listePays.add("Guinée Bissau");
		this.listePays.add("Mali");
		this.listePays.add("Angleterre");
}
	
	
	
	
	
	/**
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}





	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}





	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}





	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}





	/**
	 * @return the pays
	 */
	public String getPays() {
		return pays;
	}




	/**
	 * @param pays the pays to set
	 */
	public void setPays(String pays) {
		this.pays = pays;
	}




	/**
	 * @return the listePays
	 */
	public List<String> getListePays() {
		return listePays;
	}




	/**
	 * @param listePays the listePays to set
	 */
	public void setListePays(List<String> listePays) {
		this.listePays = listePays;
	}




	/**
	 * @return the ville
	 */
	public String getVille() {
		return ville;
	}


	/**
	 * @param ville the ville to set
	 */
	public void setVille(String ville) {
		this.ville = ville;
	}


	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
