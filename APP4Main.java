package com.APP4;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class APP4Main {
	///////////////////////////////////////////////////////////////////////variable
	
	//fenetre
	public static final int LARGEUR_FENETRE = 1000;
	public static final int HAUTEUR_FENETRE = 700;
	public static Fenetre fenetre;
	
	//boucle principale
	private static boolean continuer;
	private static final int PAUSE = 10;
	
	//autre
	private static ArrayList<Client> clients;
	private static ArrayList<Medicament> medicaments;

		
	
	
	///////////////////////////////////////////////////////////////////////main
	
	public static void main(String[] args) {
		
		///////////////////////////////////////////////////////////////////////initialisation variable
		
		//fenetre
		fenetre = new Fenetre(LARGEUR_FENETRE, HAUTEUR_FENETRE);
		
		//boucle principale
		continuer = true;
		
		//autre
		clients = new ArrayList<Client>();
		clients.add(new Client("MICHEAL", 	"Mich-Mich", 	"0000", 	"Paris", 						"06 00 00 00 00"));
		clients.add(new Client("JOE", 		"George", 		"1111", 	"A cote de la boulangerie", 	"06 11 11 11 11"));

		medicaments = new ArrayList<Medicament>();
		medicaments.add(new Medicament("000", "med1", "je suis le med 1", 0, 	100.));
		medicaments.add(new Medicament("111", "med2", "je suis le med 2", 12,	150.));
		
		
		
		///////////////////////////////////////////////////////////////////////boucle principale
		
		while(continuer) {
			
			// pause
			try {Thread.sleep(PAUSE);} 
			catch (InterruptedException e) {e.printStackTrace();}
		}
		
		//on ferme la fenetre
		fenetre.dispose();
	}
	
	
	
	///////////////////////////////////////////////////////////////////////fonction
	public static void afficherUnClient(String numSecuSoc, JTextArea zoneTexte) {
		for (Client client : clients) {
			
			if(client.getNumSecuSoc().equals(numSecuSoc)) {
				
				zoneTexte.setText(client.afficher());
				return;
			}
		}
		zoneTexte.setText("Aucun client ayant pour numéro de sécurité sociale " + numSecuSoc + " n'à été trouvé.");
	}
	
	public static void afficherTousClients(JTextArea zoneTexte) {
		
		String txt = "";
		
		for (Client client : clients) {
			txt += client.afficher();
			txt += "\n\n";
		}
		zoneTexte.setText(txt);
	}
	
	public static void approvisionnerMedicament(String ref, int quantite) {
		
		if(quantite < 0) {return;}
		
		for (Medicament medicament : medicaments) {
			if(medicament.getReference().equals(ref)) {
				medicament.setQuantite(medicament.getQuantite() + quantite);
			}
		}
	}

	public static void afficherTousMedicaments(JTextArea zoneTexte) {
		
		String txt = "";
		
		for (Medicament medicament : medicaments) {
			txt += medicament.afficher();
			txt += "\n\n";
		}
		zoneTexte.setText(txt);
	}

	public static void ajouterClient(	String nom,
										String prenom,
										String numSecuSoc,
										String adresse,
										String numTel) {
		
		clients.add(new Client(nom, prenom, numSecuSoc, adresse, numTel));
	}
	
	public static void ajouterMedicament(	String ref,
											String lib,
											String desc,
											int quantite,
											double prix) {

		medicaments.add(new Medicament(ref, lib, desc, quantite, prix));
	}
	
	public static void achatClient(	String num,
									String ref,
									int quantite) {

		boolean achat = false;
		Medicament medicament = new Medicament("", "", "", 0, 0);

		for (Medicament med : medicaments) {
			
			if(!achat && med.getReference().equals(ref)) {
				if(med.getQuantite() - quantite >= 0) {
					
					achat = true;
					med.setQuantite(med.getQuantite() - quantite);
					
					medicament = new Medicament(med.getReference(), med.getLibelle(), med.getDescription(), quantite, med.getPrix());
				}
				else {
					JOptionPane.showMessageDialog(null, "Quantité insufisante", "Problème", JOptionPane.ERROR_MESSAGE);
				}
			}
		}

		if(achat) {
			for (Client client : clients) {
				if(client.getNumSecuSoc().equals(num)) {
					client.getMedicamentsAchetes().add(medicament);
				}
			}
		}
	}
	
	public static void modiferInfoClient(	String numSecuSoc,
											String modif,
											String champ) {

		for (Client client : clients) {
			
			if(client.getNumSecuSoc().equals(numSecuSoc)) {
				
				switch (champ) {
				case "nom":
					client.setNom(modif);
					break;

				case "prenom":
					client.setPrenom(modif);
					break;
					
				case "numSecuSoc":
					client.setNumSecuSoc(modif);
					break;
					
				case "adresse":
					client.setAdresse(modif);
					break;
					
				case "numTel":
					client.setNumTel(modif);
					break;
					
				default:
					break;
				}
			}
		}
	}
}
