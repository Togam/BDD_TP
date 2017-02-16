package vues;

import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import persistance.mapper.CandidatMapper;
import domaine.Candidat;

/**
 * @author six
 * 
 */
public class JPanelCandidat extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4539987860735415274L;

//	private JTextArea text;
	private ImagePane panel_photo;
	final static String INTRO = "INFORMATIONS DU CANDIDAT \n\n";

	/**
	 * @param ecoles
	 */
	public JPanelCandidat(final Candidat candidat) {

		CandidatMapper candidatMapper = CandidatMapper.getInstance();

		JTextArea label = new JTextArea();
		label.setText(INTRO + candidat.toString());
		// label.setEnabled(false);
		add(label);

		File fileOut = new File("file.pdf");
		try {
			;
			FileOutputStream fos = new FileOutputStream(fileOut);
			fos.write(candidatMapper.findPhotoById(candidat.getIdcand())
					.getBytes(
							1,
							(int) candidatMapper.findPhotoById(
									candidat.getIdcand()).length()));
			fos.close();
			panel_photo = new ImagePane(fileOut);
		} catch (Exception e) {
			e.printStackTrace();
		}

		add(panel_photo);

	}

}
