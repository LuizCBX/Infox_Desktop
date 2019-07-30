package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Usuarios extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtUsuario;
	private JTextField txtFone;
	private JTextField txtLogin;
	private JTextField txtSenha;
	private JTextField txtPerfill;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usuarios frame = new Usuarios();
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
	public Usuarios() {
		setTitle("Usu\u00E1rios");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 640, 382);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("* id");
		lblId.setBounds(47, 46, 48, 14);
		contentPane.add(lblId);
		
		txtId = new JTextField();
		txtId.setBounds(80, 43, 96, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("* Campos obrigat\u00F3rios");
		lblNewLabel.setBounds(443, 32, 139, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblUsurio = new JLabel("* Usu\u00E1rio");
		lblUsurio.setBounds(10, 86, 60, 14);
		contentPane.add(lblUsurio);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(80, 83, 487, 20);
		contentPane.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblFone = new JLabel("fone");
		lblFone.setBounds(33, 129, 48, 14);
		contentPane.add(lblFone);
		
		txtFone = new JTextField();
		txtFone.setBounds(80, 126, 187, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		JLabel lblLogin = new JLabel("* login");
		lblLogin.setBounds(22, 173, 48, 14);
		contentPane.add(lblLogin);
		
		txtLogin = new JTextField();
		txtLogin.setBounds(80, 170, 187, 20);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		JLabel lblSenha = new JLabel("senha");
		lblSenha.setBounds(308, 176, 48, 14);
		contentPane.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setBounds(368, 173, 199, 20);
		contentPane.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnCreate = new JButton("");
		btnCreate.setIcon(new ImageIcon(Usuarios.class.getResource("/br/com/infox/icons/create.png")));
		btnCreate.setToolTipText("Adicionar usu\u00E1rio");
		btnCreate.setBounds(144, 237, 64, 64);
		contentPane.add(btnCreate);
		
		JButton btnRead = new JButton("");
		btnRead.setIcon(new ImageIcon(Usuarios.class.getResource("/br/com/infox/icons/read.png")));
		btnRead.setToolTipText("pesquisar usu\u00E1rios");
		btnRead.setBounds(228, 237, 64, 64);
		contentPane.add(btnRead);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.setIcon(new ImageIcon(Usuarios.class.getResource("/br/com/infox/icons/update.png")));
		btnUpdate.setToolTipText("editar usu\u00E1rio");
		btnUpdate.setBounds(309, 237, 64, 64);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("");
		btnDelete.setIcon(new ImageIcon(Usuarios.class.getResource("/br/com/infox/icons/delete.png")));
		btnDelete.setToolTipText("remover usu\u00E1rio");
		btnDelete.setBounds(393, 237, 64, 64);
		contentPane.add(btnDelete);
		
		JLabel lblPerfil = new JLabel("PERFIL");
		lblPerfil.setBounds(308, 129, 48, 14);
		contentPane.add(lblPerfil);
		
		txtPerfill = new JTextField();
		txtPerfill.setBounds(368, 126, 192, 20);
		contentPane.add(txtPerfill);
		txtPerfill.setColumns(10);
	}
}
