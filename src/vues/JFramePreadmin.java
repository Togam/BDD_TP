package vues;

import java.sql.SQLException;

import javax.swing.JFrame;

/**
 * @author six Classe qui gère et affiche la fenêtre de préadmission.
 */
public class JFramePreadmin extends JFrame {

	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur de la fenêtre de préadmission
	 * 
	 * @throws SQLException
	 */
	public JFramePreadmin() {
		this.setTitle("Pré-admission");
		this.setSize(400, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
