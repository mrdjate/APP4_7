package com.APP4;

import java.util.ArrayList;

public class Client {

	///////////////////////////////////////////////////////////////////////variable
	
	private String nom;
	private String prenom;
	private String numSecuSoc;
	private String adresse;
	private String numTel;
	private ArrayList<Medicament> medicamentsAchetes;

	
	
	///////////////////////////////////////////////////////////////////////constructeur

	public Client(	String nom,
					String prenom,
					String numSecuSoc,
					String adresse,
					String numTel) {
		
		this.nom = nom;
		this.prenom = prenom; 
		this.numSecuSoc = numSecuSoc;
		this.adresse = adresse;
		this.numTel = numTel;
		this.medicamentsAchetes = new ArrayList<Medicament>();
	}
	
	
	
	///////////////////////////////////////////////////////////////////////getter
	public String getNumSecuSoc() 							{return numSecuSoc;}
	public ArrayList<Medicament> getMedicamentsAchetes() 	{return medicamentsAchetes;}

	///////////////////////////////////////////////////////////////////////setter
	public void setNom(String nom) 					{this.nom = nom;}
	public void setPrenom(String prenom) 			{this.prenom = prenom;}
	public void setNumSecuSoc(String numSecuSoc) 	{this.numSecuSoc = numSecuSoc;}
	public void setAdresse(String adresse) 			{this.adresse = adresse;}
	public void setNumTel(String numTel) 			{this.numTel = numTel;}

	///////////////////////////////////////////////////////////////////////methode
	
	public String afficher() {
		String txt;
		txt = "Nom et prenom : " + nom + " " + prenom;
		txt += "\n" + "Numéro de sécurité social : " + numSecuSoc;
		txt += "\n" + "adresse : " + adresse;
		txt += "\n" + "numéro de téléphone : " + numTel;
		txt += "\n" + "liste de médicaments achetés : ";
		
		for (Medicament medicament : medicamentsAchetes) {
			txt += "\n" + medicament.getQuantite() + " x " + medicament.getLibelle();
		}
		
		return txt;
	}
}
