package persistance.mapper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import persistance.Oracle;
import domaine.Epreuve;

/**
 * @author six Classe EpreuveMapper qui permet de gérer le mapping entre les
 *         objets Epreuves et la base de donnée
 */
public class EpreuveMapper {

	static EpreuveMapper inst;
	int ID;

	private EpreuveMapper() {
		ID = 0;
	}

	static public EpreuveMapper getInstance() {
		if (inst == null)
			inst = new EpreuveMapper();
		return inst;
	}
	
	/**
	 * @param id
	 * @return l'objet Epreuve correspondant à l'identifiant passé en paramète
	 * @throws SQLException
	 *             Méthode permettant de construire une épreuve grâce à son
	 *             identifiant
	 */
	public Epreuve findById(final int id) throws SQLException {
		String req = "select * from EPREUVE where IDEP=?";
		PreparedStatement ps = Oracle.getConnection().prepareStatement(req);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return new Epreuve(rs.getInt(1), rs.getString(2), rs.getDouble(3));

	}

}
