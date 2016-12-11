package domaine;

/**
 * @author six
 *
 */
public class Note {

	private Candidat candidat;
	private Epreuve epreuve;
	private double note;

	public Note(final Candidat candidat, final Epreuve epreuve, final double note) {
		this.setCandidat(candidat);
		this.setEpreuve(epreuve);
		this.note = note;
	}

	public double getNote() {
		return note;
	}

	public void setNote(final double note) {
		this.note = note;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(final Candidat candidat) {
		this.candidat = candidat;
	}

	public Epreuve getEpreuve() {
		return epreuve;
	}

	public void setEpreuve(final Epreuve epreuve) {
		this.epreuve = epreuve;
	}

	@Override
	public String toString() {
		return "NOTE DE L'EPREUVE " + this.epreuve.toString() + " : " + this.note;
	}
}
