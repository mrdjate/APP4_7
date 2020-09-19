package com.APP4;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class Fenetre extends JFrame {

	///////////////////////////////////////////////////////////////////////variable
		
	//bouton	
	private JButton mpBoutAffUnClient;
	private JButton mpBoutAffTousClients;
	private JButton mpBoutAjoutClient;
	private JButton mpBoutAffTousMedicaments;
	private JButton mpBoutAjoutMedicament;
	private JButton mpBoutApprovisionnertMedicament;
	private JButton mpBoutClientAchat;
	private JButton mpBoutClientModif;

	private JButton enssBoutOK;
	
	private JButton ztBoutMenu;

	private JButton encBoutOK;
	
	private JButton enmBoutOK;

	private JButton amBoutOK;
	
	private JButton acBoutOK;

	private JButton cmBoutModifNom;
	private JButton cmBoutModifPrenom;
	private JButton cmBoutModifNumSecuSoc;
	private JButton cmBoutModifAdresse;
	private JButton cmBoutModifNumTel;

	//texte	
	private JLabel enssTxt;	
	private JTextArea ztTxt;
	
	private JLabel encTxtNom;	
	private JLabel encTxtPrenom;	
	private JLabel encTxtNumSecuSoc;	
	private JLabel encTxtAdresse;	
	private JLabel encTxtNumTel;	

	private JLabel enmTxtRef;	
	private JLabel enmTxtLib;	
	private JLabel enmTxtDesc;	
	private JLabel enmTxtQuantite;	
	private JLabel enmTxtPrix;
	
	private JLabel amTxtRef;
	private JLabel amTxtQuantite;

	private JLabel acTxtNumSoc;
	private JLabel acTxtRef;
	private JLabel acTxtQuantite;
	
	private JLabel cmTxtNumSoc;
	private JLabel cmTxtModif;

	//saisi de texte
	private JTextField enssSaisiTxt;

	private JTextField encSaisiTxtNom;	
	private JTextField encSaisiTxtPrenom;	
	private JTextField encSaisiTxtNumSecuSoc;	
	private JTextField encSaisiTxtAdresse;	
	private JTextField encSaisiTxtNumTel;	
	
	private JTextField enmSaisiTxtRef;	
	private JTextField enmSaisiTxtLib;	
	private JTextArea enmSaisiTxtDesc;	
	private JTextField enmSaisiTxtQuantite;	
	private JTextField enmSaisiTxtPrix;
	
	private JTextField amSaisiTxtRef;
	private JTextField amSaisiTxtQuantite;
	
	private JTextField acSaisiTxtNumSoc;
	private JTextField acSaisiTxtRef;
	private JTextField acSaisiTxtQuantite;
	
	private JTextField cmSaisiTxtNumSoc;
	private JTextField cmSaisiTxtModif;

	//JPannel
	private JPanel menuPricipale;
	private JPanel entrerNumSoc;
	private JPanel zoneTexte;
	private JPanel entrerNouvClient;
	private JPanel entrerNouvMedicament;
	private JPanel approvisionerMedicament;
	private JPanel achatClient;
	private JPanel modifierClient;

	//container
	private JPanel container;

	

	///////////////////////////////////////////////////////////////////////constructeur
	
	public Fenetre(int largeur, int hauteur){
				
		//bouton
		this.mpBoutAffUnClient = new JButton("Afficher un client");
		this.mpBoutAffUnClient.addActionListener(new AffUnClient());

		this.mpBoutAffTousClients = new JButton("Afficher tous les clients");
		this.mpBoutAffTousClients.addActionListener(new AffTousClients());
		
		this.mpBoutAjoutClient = new JButton("Ajouter un client");
		this.mpBoutAjoutClient.addActionListener(new AjoutClient());
		
		this.mpBoutAffTousMedicaments = new JButton("Afficher tous les médicaments");
		this.mpBoutAffTousMedicaments.addActionListener(new AffTousMedicaments());
		
		this.mpBoutApprovisionnertMedicament = new JButton("Approvisionner médicament");
		this.mpBoutApprovisionnertMedicament.addActionListener(new ApprovisionnerMedicament());
		
		this.mpBoutClientAchat = new JButton("Achat client");
		this.mpBoutClientAchat.addActionListener(new AchatClient());
		
		this.mpBoutClientModif = new JButton("Modifier client");
		this.mpBoutClientModif.addActionListener(new ModifClient());
		
		this.enssBoutOK = new JButton("OK");
		this.enssBoutOK.addActionListener(new ActionEnssBoutOK());

		this.ztBoutMenu = new JButton("Menu");
		this.ztBoutMenu.addActionListener(new ActionZtBoutMenu());
		
		this.encBoutOK = new JButton("OK");
		this.encBoutOK.addActionListener(new ActionEncBoutOK());

		this.mpBoutAjoutMedicament = new JButton("Ajouter un médicament");
		this.mpBoutAjoutMedicament.addActionListener(new AjoutMedicament());
		
		this.enmBoutOK = new JButton("OK");
		this.enmBoutOK.addActionListener(new ActionEnmBoutOK());
		
		this.amBoutOK = new JButton("OK");
		this.amBoutOK.addActionListener(new ActionAmBoutOK());
		
		this.acBoutOK = new JButton("OK");
		this.acBoutOK.addActionListener(new ActionAcBoutOK());
		
		
		
		this.cmBoutModifNom = new JButton("Nom");
		this.cmBoutModifNom.addActionListener(new CmBoutModifNom());

		this.cmBoutModifPrenom = new JButton("Prenom");
		this.cmBoutModifPrenom.addActionListener(new CmBoutModifPrenom());

		this.cmBoutModifNumSecuSoc = new JButton("Numéro de sécurité sociale");
		this.cmBoutModifNumSecuSoc.addActionListener(new CmBoutModifNumSecuSoc());

		this.cmBoutModifAdresse = new JButton("Adresse");
		this.cmBoutModifAdresse.addActionListener(new CmBoutModifAdresse());

		this.cmBoutModifNumTel = new JButton("Numéro de téléphone");
		this.cmBoutModifNumTel.addActionListener(new CmBoutModifNumTel());
		
		//texte	
		this.enssTxt = new JLabel("Entrez votre numéro de sécurité social : ");		
		this.ztTxt = new JTextArea();
		
		this.encTxtNom = new JLabel("Nom : ");		
		this.encTxtPrenom = new JLabel("Prenom : ");		
		this.encTxtNumSecuSoc = new JLabel("Numéro de sécurité sociale : ");		
		this.encTxtAdresse = new JLabel("Adresse : ");		
		this.encTxtNumTel = new JLabel("Numéro de téléphone : ");		

		this.enmTxtRef = new JLabel("Référence : ");		
		this.enmTxtLib = new JLabel("Libellé : ");		
		this.enmTxtDesc = new JLabel("Description");		
		this.enmTxtQuantite = new JLabel("Quantité : ");		
		this.enmTxtPrix = new JLabel("Prix : ");	
	
		this.amTxtRef = new JLabel("Reference : ");	
		this.amTxtQuantite = new JLabel("Quantite : ");	

		this.acTxtNumSoc = new JLabel("Numéro de sécurité social : ");	
		this.acTxtRef = new JLabel("Reference : ");	
		this.acTxtQuantite = new JLabel("Quantite : ");	
		
		this.cmTxtNumSoc = new JLabel("Numéro de sécurité social : ");	
		this.cmTxtModif = new JLabel("Modification : ");	

		//saisi de texte
		this.enssSaisiTxt = new JTextField();
		this.enssSaisiTxt.setPreferredSize(new Dimension(150, 30));
		
		this.encSaisiTxtNom = new JTextField();
		this.encSaisiTxtNom.setPreferredSize(new Dimension(150, 30));
		this.encSaisiTxtPrenom = new JTextField();	
		this.encSaisiTxtPrenom.setPreferredSize(new Dimension(150, 30));
		this.encSaisiTxtNumSecuSoc = new JTextField();
		this.encSaisiTxtNumSecuSoc.setPreferredSize(new Dimension(150, 30));
		this.encSaisiTxtAdresse = new JTextField();
		this.encSaisiTxtAdresse.setPreferredSize(new Dimension(150, 30));
		this.encSaisiTxtNumTel = new JTextField();	
		this.encSaisiTxtNumTel.setPreferredSize(new Dimension(150, 30));

		this.enmSaisiTxtRef = new JTextField();
		this.enmSaisiTxtRef.setPreferredSize(new Dimension(150, 30));
		this.enmSaisiTxtLib = new JTextField();	
		this.enmSaisiTxtLib.setPreferredSize(new Dimension(150, 30));
		this.enmSaisiTxtDesc = new JTextArea();
		this.enmSaisiTxtDesc.setPreferredSize(new Dimension(150, 150));
		this.enmSaisiTxtQuantite = new JTextField();
		this.enmSaisiTxtQuantite.setPreferredSize(new Dimension(150, 30));
		this.enmSaisiTxtPrix = new JTextField();	
		this.enmSaisiTxtPrix.setPreferredSize(new Dimension(150, 30));

		this.amSaisiTxtRef = new JTextField();	
		this.amSaisiTxtRef.setPreferredSize(new Dimension(150, 30));
		this.amSaisiTxtQuantite = new JTextField();	
		this.amSaisiTxtQuantite.setPreferredSize(new Dimension(150, 30));

		this.acSaisiTxtNumSoc = new JTextField();	
		this.acSaisiTxtNumSoc.setPreferredSize(new Dimension(150, 30));
		this.acSaisiTxtRef = new JTextField();	
		this.acSaisiTxtRef.setPreferredSize(new Dimension(150, 30));
		this.acSaisiTxtQuantite = new JTextField();	
		this.acSaisiTxtQuantite.setPreferredSize(new Dimension(150, 30));
		
		this.cmSaisiTxtNumSoc = new JTextField();	
		this.cmSaisiTxtNumSoc.setPreferredSize(new Dimension(150, 30));
		this.cmSaisiTxtModif = new JTextField();	
		this.cmSaisiTxtModif.setPreferredSize(new Dimension(150, 30));
		
		//jPannel   
		
		//menu principale
	    this.menuPricipale = new JPanel();
	    this.menuPricipale.setVisible(true);
	    
	    this.menuPricipale.setLayout(new BoxLayout(this.menuPricipale, BoxLayout.PAGE_AXIS));
	    this.menuPricipale.add(this.mpBoutAffUnClient);
	    this.menuPricipale.add(this.mpBoutAffTousClients);
	    this.menuPricipale.add(this.mpBoutAjoutClient);
	    this.menuPricipale.add(this.mpBoutAffTousMedicaments);
	    this.menuPricipale.add(this.mpBoutAjoutMedicament);
	    this.menuPricipale.add(this.mpBoutApprovisionnertMedicament);
	    this.menuPricipale.add(this.mpBoutClientAchat);
	    this.menuPricipale.add(this.mpBoutClientModif);

	    //entrer num soc
	    this.entrerNumSoc = new JPanel();
	    this.entrerNumSoc.setVisible(false);
	    
	    this.entrerNumSoc.setLayout(new BoxLayout(this.entrerNumSoc, BoxLayout.LINE_AXIS));
	    this.entrerNumSoc.add(this.enssTxt);
	    this.entrerNumSoc.add(this.enssSaisiTxt);
	    this.entrerNumSoc.add(this.enssBoutOK);
	    
	    //zone de texte
	    this.zoneTexte = new JPanel();
	    this.zoneTexte.setVisible(false);
	    
	    this.zoneTexte.setLayout(new BoxLayout(this.zoneTexte, BoxLayout.PAGE_AXIS));
	    this.zoneTexte.add(ztTxt);
	    this.zoneTexte.add(ztBoutMenu);

	    //entrer nouv client
	    JPanel ligne1 = new JPanel();
	    ligne1.setLayout(new BoxLayout(ligne1, BoxLayout.LINE_AXIS));
	    ligne1.add(this.encTxtNom);
	    ligne1.add(this.encSaisiTxtNom);
	    
	    JPanel ligne2 = new JPanel();
	    ligne2.setLayout(new BoxLayout(ligne2, BoxLayout.LINE_AXIS));
	    ligne2.add(this.encTxtPrenom);
	    ligne2.add(this.encSaisiTxtPrenom);
	    
	    JPanel ligne3 = new JPanel();
	    ligne3.setLayout(new BoxLayout(ligne3, BoxLayout.LINE_AXIS));
	    ligne3.add(this.encTxtNumSecuSoc);
	    ligne3.add(this.encSaisiTxtNumSecuSoc);
	    
	    JPanel ligne4 = new JPanel();
	    ligne4.setLayout(new BoxLayout(ligne4, BoxLayout.LINE_AXIS));
	    ligne4.add(this.encTxtAdresse);
	    ligne4.add(this.encSaisiTxtAdresse);
	    
	    JPanel ligne5 = new JPanel();
	    ligne5.setLayout(new BoxLayout(ligne5, BoxLayout.LINE_AXIS));
	    ligne5.add(this.encTxtNumTel);
	    ligne5.add(this.encSaisiTxtNumTel);
	    
	    this.entrerNouvClient = new JPanel();
	    this.entrerNouvClient.setVisible(false);
	    
	    this.entrerNouvClient.setLayout(new BoxLayout(this.entrerNouvClient, BoxLayout.PAGE_AXIS));
	    this.entrerNouvClient.add(ligne1);
	    this.entrerNouvClient.add(ligne2);
	    this.entrerNouvClient.add(ligne3);
	    this.entrerNouvClient.add(ligne4);
	    this.entrerNouvClient.add(ligne5);

	    this.entrerNouvClient.add(this.encBoutOK);

	    //entrer nouv client
	    JPanel ligne6 = new JPanel();
	    ligne6.setLayout(new BoxLayout(ligne6, BoxLayout.LINE_AXIS));
	    ligne6.add(this.enmTxtRef);
	    ligne6.add(this.enmSaisiTxtRef);
	    
	    JPanel ligne7 = new JPanel();
	    ligne7.setLayout(new BoxLayout(ligne7, BoxLayout.LINE_AXIS));
	    ligne7.add(this.enmTxtLib);
	    ligne7.add(this.enmSaisiTxtLib);
	    
	    JPanel ligne8 = new JPanel();
	    ligne8.setLayout(new BoxLayout(ligne8, BoxLayout.LINE_AXIS));
	    ligne8.add(this.enmTxtQuantite);
	    ligne8.add(this.enmSaisiTxtQuantite);
	    
	    JPanel ligne9 = new JPanel();
	    ligne9.setLayout(new BoxLayout(ligne9, BoxLayout.LINE_AXIS));
	    ligne9.add(this.enmTxtPrix);
	    ligne9.add(this.enmSaisiTxtPrix);
	    
	    this.entrerNouvMedicament = new JPanel();
	    this.entrerNouvMedicament.setVisible(false);
	    
	    this.entrerNouvMedicament.setLayout(new BoxLayout(this.entrerNouvMedicament, BoxLayout.PAGE_AXIS));
	    this.entrerNouvMedicament.add(ligne6);
	    this.entrerNouvMedicament.add(ligne7);
	    this.entrerNouvMedicament.add(this.enmTxtDesc);
	    this.entrerNouvMedicament.add(this.enmSaisiTxtDesc);
	    this.entrerNouvMedicament.add(ligne8);
	    this.entrerNouvMedicament.add(ligne9);
	    this.entrerNouvMedicament.add(this.enmBoutOK);
	    
	    //approvisionner medicament
	    JPanel ligne10 = new JPanel();
	    ligne10.setLayout(new BoxLayout(ligne10, BoxLayout.LINE_AXIS));
	    ligne10.add(this.amTxtRef);
	    ligne10.add(this.amSaisiTxtRef);
	    
	    JPanel ligne11 = new JPanel();
	    ligne11.setLayout(new BoxLayout(ligne11, BoxLayout.LINE_AXIS));
	    ligne11.add(this.amTxtQuantite);
	    ligne11.add(this.amSaisiTxtQuantite);

	    this.approvisionerMedicament = new JPanel();
	    this.approvisionerMedicament.setVisible(false);
	    
	    this.approvisionerMedicament.setLayout(new BoxLayout(this.approvisionerMedicament, BoxLayout.PAGE_AXIS));
	    this.approvisionerMedicament.add(ligne10);
	    this.approvisionerMedicament.add(ligne11);
	    this.approvisionerMedicament.add(this.amBoutOK);
	    
	    //achat client
	    JPanel ligne12 = new JPanel();
	    ligne12.setLayout(new BoxLayout(ligne12, BoxLayout.LINE_AXIS));
	    ligne12.add(this.acTxtNumSoc);
	    ligne12.add(this.acSaisiTxtNumSoc);
	    
	    JPanel ligne13 = new JPanel();
	    ligne13.setLayout(new BoxLayout(ligne13, BoxLayout.LINE_AXIS));
	    ligne13.add(this.acTxtRef);
	    ligne13.add(this.acSaisiTxtRef);
	    
	    JPanel ligne14 = new JPanel();
	    ligne14.setLayout(new BoxLayout(ligne14, BoxLayout.LINE_AXIS));
	    ligne14.add(this.acTxtQuantite);
	    ligne14.add(this.acSaisiTxtQuantite);
	    
	    this.achatClient = new JPanel();
	    this.achatClient.setVisible(false);
	    
	    this.achatClient.setLayout(new BoxLayout(this.achatClient, BoxLayout.PAGE_AXIS));
	    this.achatClient.add(ligne12);
	    this.achatClient.add(ligne13);
	    this.achatClient.add(ligne14);
	    this.achatClient.add(this.acBoutOK);
	    
		//modifier client
	    JPanel ligne15 = new JPanel();
	    ligne15.setLayout(new BoxLayout(ligne15, BoxLayout.LINE_AXIS));
	    ligne15.add(this.cmTxtNumSoc);
	    ligne15.add(this.cmSaisiTxtNumSoc);
	    
	    JPanel ligne16 = new JPanel();
	    ligne16.setLayout(new BoxLayout(ligne16, BoxLayout.LINE_AXIS));
	    ligne16.add(this.cmTxtModif);
	    ligne16.add(this.cmSaisiTxtModif);
	    
	    this.modifierClient = new JPanel();
	    this.modifierClient.setVisible(false);
	    
	    this.modifierClient.setLayout(new BoxLayout(this.modifierClient, BoxLayout.PAGE_AXIS));
	    this.modifierClient.add(ligne15);
	    this.modifierClient.add(ligne16);
	    this.modifierClient.add(this.cmBoutModifNom);
	    this.modifierClient.add(this.cmBoutModifPrenom);
	    this.modifierClient.add(this.cmBoutModifNumSecuSoc);
	    this.modifierClient.add(this.cmBoutModifAdresse);
	    this.modifierClient.add(this.cmBoutModifNumTel);

		//container
	    this.container = new JPanel();
		this.container.add(this.menuPricipale);
		this.container.add(this.entrerNumSoc);
		this.container.add(this.zoneTexte);
		this.container.add(this.entrerNouvClient);
		this.container.add(this.entrerNouvMedicament);
		this.container.add(this.approvisionerMedicament);
		this.container.add(this.achatClient);
		this.container.add(this.modifierClient);

		//propriete fenetre
		this.setTitle("APP4");
	    this.setSize(largeur, hauteur);
	    this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	    this.setContentPane(this.container);
	    this.setVisible(true);
	}
	
	
	
	///////////////////////////////////////////////////////////////////////classe

	//propriete bouton
	class AffUnClient implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			entrerNumSoc.setVisible(true);
		}
	}
	
	class AffTousClients implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			zoneTexte.setVisible(true);
			APP4Main.afficherTousClients(ztTxt);
		}
	}     
	
	class AjoutClient implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			entrerNouvClient.setVisible(true);
		}
	}  
	
	class AjoutMedicament implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			entrerNouvMedicament.setVisible(true);
		}
	} 
	
	class AffTousMedicaments implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			zoneTexte.setVisible(true);
			APP4Main.afficherTousMedicaments(ztTxt);
		}
	}  
	
	class ApprovisionnerMedicament implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			approvisionerMedicament.setVisible(true);
		}
	}  
	
	class AchatClient implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			achatClient.setVisible(true);
		}
	}  
	
	class ActionAmBoutOK implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			approvisionerMedicament.setVisible(false);
			menuPricipale.setVisible(true);
			
			APP4Main.approvisionnerMedicament(amSaisiTxtRef.getText(), Integer.parseInt(amSaisiTxtQuantite.getText()));
			
			amSaisiTxtRef.setText("");
			amSaisiTxtQuantite.setText("");
		}
	}  
	
	class ActionEncBoutOK implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			APP4Main.ajouterClient(
					encSaisiTxtNom.getText(),
					encSaisiTxtPrenom.getText(),
					encSaisiTxtNumSecuSoc.getText(),
					encSaisiTxtAdresse.getText(),
					encSaisiTxtNumTel.getText());
			
			JOptionPane.showMessageDialog(null, encSaisiTxtNom.getText() + " " + encSaisiTxtPrenom.getText() + " à bien été enregistré", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
			
			encSaisiTxtNom.setText("");
			encSaisiTxtPrenom.setText("");
			encSaisiTxtNumSecuSoc.setText("");
			encSaisiTxtAdresse.setText("");
			encSaisiTxtNumTel.setText("");
			
		    entrerNouvClient.setVisible(false);
		    menuPricipale.setVisible(true);	
		}
	}  
	
	class ActionEnmBoutOK implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			int quantite = 0;
			double prix = 0;
			
			if(enmSaisiTxtQuantite.getText() 	!= "") 	{quantite 	= Integer.parseInt(enmSaisiTxtQuantite.getText());}
			if(enmSaisiTxtPrix.getText() 		!= "") 	{prix 		= Double.parseDouble(enmSaisiTxtPrix.getText());}

			APP4Main.ajouterMedicament(
					enmSaisiTxtRef.getText(),
					enmSaisiTxtLib.getText(),
					enmSaisiTxtDesc.getText(),
					quantite,
					prix);
			
			JOptionPane.showMessageDialog(null, "Le médicament " + enmSaisiTxtLib.getText() + " à bien été enregistré", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
			
			enmSaisiTxtRef.setText("");
			enmSaisiTxtLib.setText("");
			enmSaisiTxtDesc.setText("");
			enmSaisiTxtQuantite.setText("");
			enmSaisiTxtPrix.setText("");
			
		    entrerNouvMedicament.setVisible(false);
		    menuPricipale.setVisible(true);	
		}
	}  
	
	class ActionEnssBoutOK implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			entrerNumSoc.setVisible(false);
			zoneTexte.setVisible(true);
			APP4Main.afficherUnClient(enssSaisiTxt.getText(), ztTxt);
			enssSaisiTxt.setText("");
		}
	}  
	
	class ModifClient implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuPricipale.setVisible(false);
			modifierClient.setVisible(true);
		}
	}  
	
	class ActionZtBoutMenu implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			zoneTexte.setVisible(false);
			menuPricipale.setVisible(true);
			ztTxt.setText("");
		}
	}  
	
	class ActionAcBoutOK implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			achatClient.setVisible(false);
			menuPricipale.setVisible(true);
			
			APP4Main.achatClient(acSaisiTxtNumSoc.getText(), acSaisiTxtRef.getText(), Integer.parseInt(acSaisiTxtQuantite.getText()));
			
			acSaisiTxtNumSoc.setText("");
			acSaisiTxtRef.setText("");
			acSaisiTxtQuantite.setText("");
		}
	}  
	
	class CmBoutModifNom implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			APP4Main.modiferInfoClient(cmSaisiTxtNumSoc.getText(), cmSaisiTxtModif.getText(), "nom");
			modifierClient.setVisible(false);
			menuPricipale.setVisible(true);
			cmSaisiTxtNumSoc.setText("");
			cmSaisiTxtModif.setText("");
		}
	}  
	
	class CmBoutModifPrenom implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			APP4Main.modiferInfoClient(cmSaisiTxtNumSoc.getText(), cmSaisiTxtModif.getText(), "prenom");
			modifierClient.setVisible(false);
			menuPricipale.setVisible(true);
			cmSaisiTxtNumSoc.setText("");
			cmSaisiTxtModif.setText("");
		}
	}  
	
	class CmBoutModifNumSecuSoc implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			APP4Main.modiferInfoClient(cmSaisiTxtNumSoc.getText(), cmSaisiTxtModif.getText(), "numSecuSoc");
			modifierClient.setVisible(false);
			menuPricipale.setVisible(true);
			cmSaisiTxtNumSoc.setText("");
			cmSaisiTxtModif.setText("");
		}
	}  
	
	class CmBoutModifAdresse implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			APP4Main.modiferInfoClient(cmSaisiTxtNumSoc.getText(), cmSaisiTxtModif.getText(), "adresse");
			modifierClient.setVisible(false);
			menuPricipale.setVisible(true);
			cmSaisiTxtNumSoc.setText("");
			cmSaisiTxtModif.setText("");
		}
	}  
	
	class CmBoutModifNumTel implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			
			APP4Main.modiferInfoClient(cmSaisiTxtNumSoc.getText(), cmSaisiTxtModif.getText(), "numTel");
			modifierClient.setVisible(false);
			menuPricipale.setVisible(true);
			cmSaisiTxtNumSoc.setText("");
			cmSaisiTxtModif.setText("");
		}
	}  
}
