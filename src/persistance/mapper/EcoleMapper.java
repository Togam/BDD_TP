package persistance.mapper;

import Oracle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domaine.Ecole;

/**
 * @author six Classe EcoleMapper : cette classer permet de faire le mapping
 *         entre les données en base et les objets
 */
public class EcoleMapper {

	static EcoleMapper inst;
	int ID;

	private EcoleMapper() {
		ID = 0;
	}

	static public EcoleMapper getInstance() {
		if (inst == null)
			inst = new EcoleMapper();
		return inst;
	}
	
	/**
	 * @param id
	 * @return l'école correspondant à l'identifiant passé en paramètre Cette
	 *         méthode permet de construire une objet Ecole à partir de son
	 *         identifiant
	 * @throws SQLException
	 */
	public Ecole findById(final int id) throws SQLException {
		String req = "select * from ECOLES where IDECO=?";
		PreparedStatement ps = Oracle.getConnection().prepareStatement(req);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return new Ecole(id, rs.getString(2), rs.getString(3), rs.getInt(4));
	}

}
