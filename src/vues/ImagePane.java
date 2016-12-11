package vues;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author six Classe permettant de dessiner les images.
 */
public class ImagePane extends JPanel {

	private static final long serialVersionUID = 1L;

	protected BufferedImage buffer;

	public ImagePane(final String filename) throws Exception {
		buffer = ImageIO.read(new File(filename));
		this.setPreferredSize(new Dimension(buffer.getWidth(), buffer.getHeight()));
	}

	public void paintComponent(final Graphics g) {
		g.drawImage(buffer, 0, 0, null);
	}
}
