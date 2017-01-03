package persistance.mapper;

import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import persistance.Oracle;
import domaine.Candidat;

/**
 * @author six Classe CandidatMapper : cette classe permet de faire le mapping
 *         entre la base de données et les objets.
 */
public class CandidatMapper {

	static CandidatMapper inst;
	int ID;

	private CandidatMapper() {
		ID = 0;
	}

	static public CandidatMapper getInstance() {
		if (inst == null)
			inst = new CandidatMapper();
		return inst;
	}

	/**
	 * @param id
	 *            du candidat
	 * @return l'objet Candidat correspondant à l'identifiant passé en paramètre
	 * @throws SQLException
	 */
	public Candidat findById(final int id) throws SQLException {
		String req = "SELECT * FROM CANDIDATS WHERE IDCAND=?";
		PreparedStatement ps = Oracle.getConnection().prepareStatement(req);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		Candidat candidat = new Candidat(id, rs.getString(2), rs.getNString(3),
				rs.getDate(4), rs.getInt(5), rs.getDouble(6) /*,this.findPhotoById(id)*/);
		NoteMapper noteMapper = NoteMapper.getInstance();
		candidat.setListeNotes(noteMapper.getListeNotesDunCandidat(candidat));
		VoeuMapper voeuMapper = VoeuMapper.getInstance();
		candidat.setListeVoeux(voeuMapper.getListeVoeuxDunCandidat(candidat));
		return candidat;
	}

	/**
	 * @param id
	 *            du candidat
	 * @return la photo du candidat dont on a passé l'id en paramètre Cette
	 *         méthode permet de récupérer la photo stockée en base d'un
	 *         candidat dont on a passé son identifiant en paramètre (utile pour
	 *         construire un candidat dans le findById)
	 * @throws SQLException 
	 */
	public Blob findPhotoById(final int id) throws SQLException {
		String req = "select PHOTOIDENT from CANDIDATS_PHOTOS where IDCANDIDAT=?";
		PreparedStatement ps = Oracle.getConnection().prepareStatement(req);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		rs.next();
		return rs.getBlob(1);
	}
}
