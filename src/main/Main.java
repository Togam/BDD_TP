package main;

import java.sql.SQLException;

import domaine.Candidat;
import persistance.Oracle;
import persistance.mapper.CandidatMapper;
import vues.JFramePreadmin;

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
		
		CandidatMapper candidatMapper = CandidatMapper.getInstance();
		Candidat candidat = candidatMapper.findById(712);
		System.out.println(candidat.toString());
		
		JFramePreadmin framePreadmin = new JFramePreadmin();
	}

}
