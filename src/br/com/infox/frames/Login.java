package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.sql.*;
import br.com.infox.dal.ConnectionModule;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	Connection con = ConnectionModule.conector();
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JPanel contentPane;
	private JTextField txtUser;
	private JPasswordField txtPassword;	
	private JButton btnLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setResizable(false);
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 406, 236);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsurio = new JLabel("Usu\u00E1rio");
		lblUsurio.setBounds(41, 36, 48, 14);
		contentPane.add(lblUsurio);

		txtUser = new JTextField();
		txtUser.setBounds(99, 33, 169, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(41, 79, 48, 14);
		contentPane.add(lblSenha);

		txtPassword = new JPasswordField();
		txtPassword.setBounds(99, 76, 169, 20);
		contentPane.add(txtPassword);

		btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				login();
			}
		});
		btnLogin.setBounds(153, 141, 89, 23);
		contentPane.add(btnLogin);

		JLabel lblStatus = new JLabel("");
		lblStatus.setIcon(new ImageIcon(Login.class.getResource("/br/com/infox/icons/dberror.png")));
		lblStatus.setBounds(328, 33, 32, 32);
		contentPane.add(lblStatus);

		con = ConnectionModule.conector();
		if (con != null) {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/dbok.png")));
		} else {
			lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/infox/icons/dberror.png")));
		}
		// <enter> automático
			getRootPane().setDefaultButton(btnLogin);
	}//fim do construtor

	// login
	private void login() {
		String read = "select * from tb_usuarios where loginUsuario = ? and senhaUsuario = ?";
		try {
			pst = con.prepareStatement(read);
			pst.setString(1, txtUser.getText());
			pst.setString(2, txtPassword.getText());
			rs = pst.executeQuery();
			
			if(rs.next()) {
				//ler o perfil dp usuario
				String perfil = rs.getString(6);
				if(perfil.equals("admin")) {
			}
				Principal principal = new Principal();
				// centralizar o jframe
				principal.setLocationRelativeTo(null);
				principal.setVisible(true);
				principal.btnRelatorios.setEnabled(true);
				principal.btnUsuarios.setEnabled(true);
				principal.panel.setBackground(Color.red);
				this.dispose();
			} else {
				JOptionPane.showMessageDialog(null, "usuário e/ou senha inválido(s)");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
