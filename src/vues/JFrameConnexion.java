package vues;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import service.Connexion;

/**
 * 
 * @author six
 * la fenetre de connexion
 */
public class JFrameConnexion extends JFrame implements ActionListener,KeyListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1511263417777898704L;
	private JPanel panel_area = new JPanel();
	private JPanel panel_button = new JPanel();
	private JLabel labelid;
	private JTextField zoneid ;
	private JButton button = new JButton("connexion");
	private JLabel labelError = new JLabel();
	
	
	public JFrameConnexion(){
		labelid = new JLabel("identifiant de connexion: ");
		zoneid = new JTextField();
		setTitle("TP BDD");
		setSize(new Dimension(400,400));
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
				
		panel_area.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.anchor = GridBagConstraints.FIRST_LINE_START;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.gridheight = 4;
		panel_area.add(labelid,gbc);
		zoneid.setColumns(10);
		
		gbc.gridx = 4;
		gbc.gridy = 0;
		gbc.gridwidth = 3;
		gbc.gridheight = 4;
		panel_area.add(zoneid,gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 5;
		gbc.gridwidth = 3;
		gbc.gridheight = 4;
		
		gbc.gridx = 4;
		gbc.gridy = 5;
		gbc.gridwidth = 3;
		gbc.gridheight = 4;
		
		gbc.gridx = 3;
		gbc.gridy = 10;
		gbc.gridwidth = 3;
		gbc.gridheight = 4;
		panel_area.add(labelError,gbc);
		
		
		button.addActionListener(this);
		panel_button.add(button);
		panel_button.setBackground(Color.gray);
		
		getContentPane().add(panel_area,BorderLayout.CENTER);
		getContentPane().add(panel_button,BorderLayout.SOUTH);

		setVisible(true);
	}

	/**
	 * Permet d'afficher une erreur sur la fenetre
	 * @param string le message d'erreur
	 */
	public void showError(String string) {
		labelError.setText(string);
		validate();
	}
	/**
	 *  associe le clique sur le bouton au service de connexion
	 */
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button){
			Connexion.login(Integer.parseInt(zoneid.getText()),this);
		}
	}

	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}

