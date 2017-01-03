package proxy;

import java.sql.SQLException;

import domaine.Candidat;
import persistance.mapper.CandidatMapper;

/**
 * @author Margot
 *
 */
public class CandidatProxy {

	private int id;
	
	public CandidatProxy(final int identifiant) {
		this.id = identifiant;
	}
	
	public Candidat create(){
		CandidatMapper cm = CandidatMapper.getInstance();
		Candidat c = new Candidat();
		try {
			c = cm.findById(id);
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}
}
