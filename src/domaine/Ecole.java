package domaine;

/**
 * @author six
 *
 */
public class Ecole {

	private int ideco;
	private String sigle;
	private String nomComplet;
	private int nbPlace;

	public Ecole(final int ideco, final String sigle, final String nomComplet,
			final int nbPlace) {
		this.ideco = ideco;
		this.sigle = sigle;
		this.nomComplet = nomComplet;
		this.nbPlace = nbPlace;
	}

	public int getIdeco() {
		return ideco;
	}

	public void setIdeco(final int ideco) {
		this.ideco = ideco;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(final String sigle) {
		this.sigle = sigle;
	}

	public String getNomComplet() {
		return nomComplet;
	}

	public void setNomComplet(final String nomComplet) {
		this.nomComplet = nomComplet;
	}

	public int getNbPlace() {
		return nbPlace;
	}

	public void setNbPlace(final int nbPlace) {
		this.nbPlace = nbPlace;
	}

	@Override
	public String toString() {
		return "ECOLE : "+this.ideco+" / "+this.nomComplet+" / "+this.sigle;
	}
}
