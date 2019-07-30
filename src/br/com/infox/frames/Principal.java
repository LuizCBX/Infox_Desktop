package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JLabel lblData;
	public JButton btnUsuarios;
	public JButton btnRelatorios;
	public JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				alterarLabel();
			}
		});
		setTitle("infoX - Sistema para controle de OS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.inactiveCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/x.png")));
		lblNewLabel.setBounds(528, 247, 256, 256);
		contentPane.add(lblNewLabel);
		
		JButton btnSobre = new JButton("");
		btnSobre.setBackground(UIManager.getColor("Button.background"));
		btnSobre.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/about.png")));
		btnSobre.setToolTipText("Sobre");
		btnSobre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About sobre = new About();
				sobre.setVisible(true);
			}
		});
		btnSobre.setBounds(687, 29, 64, 64);
		contentPane.add(btnSobre);
		
		JButton btnCliente = new JButton("");
		btnCliente.setToolTipText("Clientes");
		btnCliente.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/cliente.png")));
		btnCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Clientes cliente = new Clientes();
				cliente.setVisible(true);
			}
		});
		btnCliente.setBounds(104, 97, 128, 128);
		contentPane.add(btnCliente);
		
		JButton btnOs = new JButton("");
		btnOs.setToolTipText("OS");
		btnOs.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/printer.png")));
		btnOs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Os os = new Os();
				os.setVisible(true);
			}
		});
		btnOs.setBounds(305, 97, 128, 128);
		contentPane.add(btnOs);
		
		btnRelatorios = new JButton("");
		btnRelatorios.setEnabled(false);
		btnRelatorios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Reports report = new Reports();
				report.setVisible(true);
			}
		});
		btnRelatorios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/report2.png")));
		btnRelatorios.setToolTipText("Relat\u00F3rios");
		btnRelatorios.setBounds(305, 304, 128, 128);
		contentPane.add(btnRelatorios);
		
		btnUsuarios = new JButton("");
		btnUsuarios.setEnabled(false);
		btnUsuarios.setToolTipText("Usu\u00E1rios");
		btnUsuarios.setIcon(new ImageIcon(Principal.class.getResource("/br/com/infox/icons/users.png")));
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuarios usuario = new Usuarios();
				usuario.setVisible(true);
			}
		});
		btnUsuarios.setBounds(104, 304, 128, 128);
		contentPane.add(btnUsuarios);
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 120, 215));
		panel.setBounds(0, 514, 794, 57);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblData = new JLabel("New label");
		lblData.setForeground(SystemColor.text);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblData.setBounds(22, 21, 446, 14);
		panel.add(lblData);
	}
	private void alterarLabel() {
		Date data = new Date();
		DateFormat formatador = DateFormat.getDateInstance(DateFormat.FULL);
		lblData.setText(formatador.format(data));
	}
}




