package vues;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import domaine.Candidat;

/**
 * @author Margot
 *
 */
public class JFramePrincipale extends JFrame {

	private static final long serialVersionUID = 2288096867493671588L;
	final static String INTRO = "INFORMATIONS DU CANDIDAT \n\n";

	public JFramePrincipale(final Candidat candidat) {
		setTitle("TP BDD");
		setSize(700,700);
		setResizable(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		JTextArea label = new JTextArea();
		label.setText(INTRO+candidat.toString());
		label.setEnabled(false);
		add(label);
	}
}
