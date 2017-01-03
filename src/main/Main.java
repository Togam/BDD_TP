package main;

import java.sql.SQLException;

import domaine.Candidat;
import persistance.Oracle;
import persistance.mapper.CandidatMapper;
import vues.JFrameConnexion;

/**
 * @author six Classe Main
 */
public class Main {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {

		Oracle.setPassword("g6xgg1ya");
		Oracle.setUsername("six");
		
		JFrameConnexion framePreadmin = new JFrameConnexion();
	}

}
