package vues;

import javax.swing.JFrame;
import javax.swing.JLabel;

import domaine.Candidat;

/**
 * @author Margot
 *
 */
public class JFramePrincipale extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2288096867493671588L;

	public JFramePrincipale(final Candidat candidat) {
		setTitle("TP BDD");
		setSize(700,700);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		JLabel jLabel = new JLabel(candidat.toString());
		add(jLabel);
	}
}
