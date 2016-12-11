package domaine;

/**
 * @author six
 *
 */
public class Voeu {

	private Candidat candidat;
	private Ecole ecole;
	private int numero_voeu;

	public Voeu(final Candidat candidat, final Ecole ecole, final int numero) {
		this.setCandidat(candidat);
		this.setEcole(ecole);
		this.setNumero_voeu(numero);
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(final Candidat candidat) {
		this.candidat = candidat;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(final Ecole ecole) {
		this.ecole = ecole;
	}

	public int getNumero_voeu() {
		return numero_voeu;
	}

	public void setNumero_voeu(final int numero_voeu) {
		this.numero_voeu = numero_voeu;
	}

	@Override
	public String toString() {
		return "VOEU N°" + this.numero_voeu + " : " + this.ecole.toString();
	}
}
