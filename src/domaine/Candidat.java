package domaine;

import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author six
 *
 */
public class Candidat {

	private int idcand;
	private String nom;
	private String prenom;
	private Date datenais;
	private int rang;
	private double noteFinale;
	private List<Note> listeNotes;
	private Blob photo;
	private List<Voeu> listeVoeux;

	/**
	 * Constructeur du Candidat
	 * 
	 * @param idcand
	 * @param nom
	 * @param prenom
	 * @param datenais
	 * @param rang
	 * @param noteFinale
	 * @param photo
	 */
	public Candidat(final int idcand, final String nom, final String prenom, final Date datenais, final int rang,
			final double noteFinale, final Blob photo) {
		this.idcand = idcand;
		this.nom = nom;
		this.prenom = prenom;
		this.datenais = datenais;
		this.rang = rang;
		this.noteFinale = noteFinale;
		this.setPhoto(photo);
		this.listeNotes = new ArrayList<Note>();
		this.setListeVoeux(new ArrayList<Voeu>());
	}

	/**
	 * @param idcand
	 * @param nom
	 * @param prenom
	 * @param datenais
	 * @param rang
	 * @param noteFinale
	 */
	public Candidat(final int idcand, final String nom, final String prenom, final Date datenais, final int rang,
			final double noteFinale) {
		this.idcand = idcand;
		this.nom = nom;
		this.prenom = prenom;
		this.datenais = datenais;
		this.rang = rang;
		this.noteFinale = noteFinale;
		this.setPhoto(photo);
		this.listeNotes = new ArrayList<Note>();
		this.setListeVoeux(new ArrayList<Voeu>());
	}

	/**
	 * Constructeur vide
	 */
	public Candidat() {
	}

	public int getIdcand() {
		return idcand;
	}

	public void setIdcand(final int idcand) {
		this.idcand = idcand;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(final String nom) {
		this.nom = nom;
	}

	public Date getDatenais() {
		return datenais;
	}

	public void setDatenais(final Date datenais) {
		this.datenais = datenais;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	public int getRang() {
		return rang;
	}

	public void setRang(final int rang) {
		this.rang = rang;
	}

	public List<Note> getListeNotes() {
		return listeNotes;
	}

	public void setListeNotes(final List<Note> listeNotes) {
		this.listeNotes = listeNotes;
	}

	public double getNoteFinale() {
		return noteFinale;
	}

	public void setNoteFinale(final double noteFinale) {
		this.noteFinale = noteFinale;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(final Blob photo) {
		this.photo = photo;
	}

	public List<Voeu> getListeVoeux() {
		return listeVoeux;
	}

	public void setListeVoeux(final List<Voeu> listeVoeux) {
		this.listeVoeux = listeVoeux;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String infos = "ID CANDIDAT : " + this.idcand + "\nNOM : " + this.nom + "\nPRENOM : " + this.prenom
				+ "\nDATE DE NAISSANCE : " + this.datenais.toString() + "\n\nRANG DU CLASSEMENT : " + this.rang
				+ "\nMOYENNE AU CONCOURS : " + this.noteFinale + "\n\nNOTES OBTENUES AU CONCOURS : ";
				infos+="\n";
		for (Note note : this.listeNotes) {
			infos += note.toString() + "\n";
		}
		infos += "\n";
		infos += "VOEUX FORMULES : \n";
		for (Voeu voeu : this.listeVoeux) {
			infos += voeu.toString() + "\n";
		}
		return infos;
	}
}
