package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			About dialog = new About();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		setTitle("Sobre");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("infoX - Sistema para controle de Ordem de Servi\u00E7os.");
		lblNewLabel.setBounds(36, 11, 341, 57);
		contentPanel.add(lblNewLabel);
		
		JLabel lblDesenvolvidoPorJos = new JLabel("Desenvolvido por Jos\u00E9 de Assis");
		lblDesenvolvidoPorJos.setBounds(36, 68, 232, 14);
		contentPanel.add(lblDesenvolvidoPorJos);
		
		JLabel lblVerso = new JLabel("Vers\u00E3o 1.0");
		lblVerso.setBounds(36, 105, 84, 14);
		contentPanel.add(lblVerso);
		
		JLabel lblSobALicena = new JLabel("Sob a licen\u00E7a GPL");
		lblSobALicena.setBounds(36, 141, 135, 14);
		contentPanel.add(lblSobALicena);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(About.class.getResource("/br/com/infox/icons/gpl.png")));
		lblNewLabel_1.setBounds(342, 140, 64, 64);
		contentPanel.add(lblNewLabel_1);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
}
