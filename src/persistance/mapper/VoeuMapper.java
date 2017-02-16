package persistance.mapper;

import Oracle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import domaine.Candidat;
import domaine.Voeu;

/**
 * @author six Classe VoeuMapper : permet le mapping entre la base de données et
 *         les objets
 */
public class VoeuMapper {

	static VoeuMapper inst;
	int ID;

	private VoeuMapper() {
		ID = 0;
	}

	static public VoeuMapper getInstance() {
		if (inst == null)
			inst = new VoeuMapper();
		return inst;
	}
	
	/**
	 * @param candidat
	 * @return la liste des voeux du candidat passé en paramètre Cette méthode
	 *         permet de récupérer une liste d'objets Voeux qui correspondent
	 *         aux voeux du candidat passé en paramètre
	 * @throws SQLException 
	 */
	public List<Voeu> getListeVoeuxDunCandidat(final Candidat candidat) throws SQLException {
		List<Voeu> listeVoeux = new ArrayList<Voeu>();
		
		String req = "select * from VOEUX where IDCAND=?";
		PreparedStatement ps = Oracle.getConnection().prepareStatement(req);
		ps.setInt(1, candidat.getIdcand());
		ResultSet rs = ps.executeQuery();
		EcoleMapper mapper = EcoleMapper.getInstance();
		while(rs.next()){
			listeVoeux.add(new Voeu(candidat, mapper.findById(rs.getInt(2)), rs.getInt(3)));
		}
		
		return listeVoeux;
	}
}
