package com.APP4;

public class Medicament {

	///////////////////////////////////////////////////////////////////////variable
		
	private String reference;
	private String libelle;
	private String description;
	private int quantite;
	private double prix;
	
	
	
	///////////////////////////////////////////////////////////////////////constructeur
	
	public Medicament(	String reference,
						String libelle,
						String description,
						int quantite,
						double prix) {
	
		this.reference = reference;
		this.libelle = libelle; 
		this.description = description;
		this.quantite = quantite;
		this.prix = prix;
	}
	
	
	
	///////////////////////////////////////////////////////////////////////getter
	public String getLibelle()		{return libelle;}
	public String getReference() 	{return reference;}
	public String getDescription() 	{return description;}
	public int getQuantite() 		{return quantite;}
	public double getPrix() 		{return prix;}

	///////////////////////////////////////////////////////////////////////setter
	public void setQuantite(int quantite) {this.quantite = quantite;}
	
	///////////////////////////////////////////////////////////////////////methode
	
	public String afficher() {
		String txt;
		txt = "Reference : " + reference;
		txt += "\n" + "Libellé : " + libelle;
		txt += "\n" + "Description :\n" + description;
		txt += "\n" + "Quantité : " + quantite;
		txt += "\n" + "Prix : " + prix;
		
		return txt;
	}
}
