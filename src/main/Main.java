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

		Oracle.setPassword("");
		Oracle.setUsername("");
		
//		CandidatMapper candidatMapper = CandidatMapper.getInstance();
//		Candidat candidat = candidatMapper.findById(712);
//		System.out.println(candidat.toString());
		
		JFrameConnexion framePreadmin = new JFrameConnexion();
	}

}
