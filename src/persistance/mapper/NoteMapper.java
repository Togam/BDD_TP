package persistance.mapper;

import Oracle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import domaine.Candidat;
import domaine.Note;

/**
 * @author six Classer NoteMapper : elle permet de faire le mapping entre les
 *         objets et les données de la base
 */
public class NoteMapper {

	static NoteMapper inst;
	int ID;

	private NoteMapper() {
		ID = 0;
	}

	static public NoteMapper getInstance() {
		if (inst == null)
			inst = new NoteMapper();
		return inst;
	}

	/**
	 * @param candidat
	 * @return la liste des notes du candidat passé en paramètre
	 * @throws SQLException
	 *             Cette méthode permet de récupérer une liste constituée
	 *             d'objets note que possède le candidat passé en paramètre
	 */
	public List<Note> getListeNotesDunCandidat(final Candidat candidat)
			throws SQLException {
		List<Note> listeNotes = new ArrayList<Note>();

		String req = "select * from NOTES where IDCAND=?";
		PreparedStatement ps = Oracle.getConnection().prepareStatement(req);
		ps.setInt(1, candidat.getIdcand());
		ResultSet rs = ps.executeQuery();
		EpreuveMapper epreuveMapper = EpreuveMapper.getInstance();
		while (rs.next()) {
			listeNotes.add(new Note(candidat, epreuveMapper.findById(rs
					.getInt(2)), rs.getDouble(3)));
		}
		return listeNotes;
	}

}
