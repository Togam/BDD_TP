package domaine;

/**
 * @author six
 *
 */
public class Epreuve {

	private int idep;
	private String intitule;
	private double coef;

	public Epreuve(final int idep, final String intitule, final double coef) {
		this.idep = idep;
		this.intitule = intitule;
		this.coef = coef;
	}

	public int getIdep() {
		return idep;
	}

	public void setIdep(final int idep) {
		this.idep = idep;
	}

	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(final String intitule) {
		this.intitule = intitule;
	}

	public double getCoef() {
		return coef;
	}

	public void setCoef(final double coef) {
		this.coef = coef;
	}

	@Override
	public String toString() {
		return this.idep + " " + this.intitule + " coeff " + this.coef;
	}
}
