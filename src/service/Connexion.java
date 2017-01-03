/**
 * 
 */
package service;

import javax.swing.JFrame;

import domaine.Candidat;
import persistance.mapper.CandidatMapper;
import proxy.CandidatProxy;
import vues.JFrameConnexion;
import vues.JFramePrincipale;

/**
 * @author six
 * Service concernant toutes les actions de connexion de l'application
 */
public class Connexion {

	/**
	 * permet de connecter un utilisateur
	 * @param identifiant identifiant tapé à la connexion
	 * @param mot_de_passe mot de passe tapé à la connexion
	 * @param frame pour les divers retour d'erreur
	 */
	public static void login(int identifiant,JFrameConnexion frame){
		
		try{
			CandidatMapper c = CandidatMapper.getInstance();
			Candidat candidat = c.findById(identifiant);
			CandidatProxy cp = new CandidatProxy(identifiant);
			
			System.out.println(candidat.toString());
			
			frame.dispose();
			new JFramePrincipale(candidat);
			
		}catch(Exception e){
			e.printStackTrace();
			frame.showError("Erreur lors de la tentative de connexion.");
		}
	}
	
	/**
	 * Permet de déconnecter un utilisateur connecté
	 * @param currentFrame la frame a détruire
	 */
	public static void logout(final JFrame currentFrame){
		currentFrame.dispose();
		new JFrameConnexion();
	}
}
