package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.PreparedStatement;

import br.com.infox.cep.CepWebService;
import br.com.infox.dal.ConnectionModule;
import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Clientes extends JFrame {
	
	
	Connection con = ConnectionModule.conector();
	PreparedStatement pst = null;
	ResultSet rs = null;

	private JPanel contentPane;
	private JTextField txtPesquisar;
	private JTable tblClientes;
	private JTextField txtNome;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtComplemento;
	private JTextField txtBairro;
	private JTextField txtCidade;
	private JLabel lblNewLabel_3;
	private JTextField txtFone1;
	private JLabel lblNewLabel_4;
	private JTextField txtFone2;
	private JLabel lblNewLabel_5;
	private JTextField txtCpf;
	private JLabel lblNewLabel_6;
	private JTextField txtEmail;
	private JTextField txtCep;
	private JComboBox cboUf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clientes frame = new Clientes();
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
	public Clientes() {
		setResizable(false);
		setTitle("Clientes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtPesquisar = new JTextField();
		txtPesquisar.setBounds(20, 27, 288, 20);
		txtPesquisar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				//KeyReleased
				pesquisarCliente();
			}
		});
		txtPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}

		});
		contentPane.setLayout(null);
		contentPane.add(txtPesquisar);
		txtPesquisar.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(327, 15, 32, 32);
		lblNewLabel.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/pesquisar.png")));
		contentPane.add(lblNewLabel);
		
		JLabel lblCamposObrigatrios = new JLabel("* Campos obrigat\u00F3rios");
		lblCamposObrigatrios.setBounds(586, 27, 182, 14);
		contentPane.add(lblCamposObrigatrios);
		
		JLabel lblNome = new JLabel("* Nome");
		lblNome.setBounds(20, 267, 48, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setBounds(78, 264, 409, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblEndereo = new JLabel("* Endere\u00E7o");
		lblEndereo.setBounds(10, 343, 67, 14);
		contentPane.add(lblEndereo);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setBounds(78, 340, 369, 20);
		contentPane.add(txtLogradouro);
		txtLogradouro.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setBounds(522, 340, 75, 20);
		contentPane.add(txtNumero);
		txtNumero.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("* N\u00FAmero");
		lblNewLabel_1.setBounds(457, 343, 55, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(609, 343, 80, 14);
		contentPane.add(lblComplemento);
		
		txtComplemento = new JTextField();
		txtComplemento.setBounds(701, 337, 67, 20);
		contentPane.add(txtComplemento);
		txtComplemento.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("* Bairro");
		lblNewLabel_2.setBounds(20, 382, 48, 14);
		contentPane.add(lblNewLabel_2);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(79, 379, 261, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("* cidade");
		lblCidade.setBounds(350, 382, 48, 14);
		contentPane.add(lblCidade);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(408, 379, 242, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblUf = new JLabel("* UF");
		lblUf.setBounds(678, 382, 32, 14);
		contentPane.add(lblUf);
		
		cboUf = new JComboBox();
		cboUf.setBounds(720, 378, 48, 22); 
		cboUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"}));
		contentPane.add(cboUf);
		
		lblNewLabel_3 = new JLabel("* Fone 1");
		lblNewLabel_3.setBounds(20, 418, 48, 14);
		contentPane.add(lblNewLabel_3);
		
		txtFone1 = new JTextField();
		txtFone1.setBounds(78, 415, 96, 20);
		contentPane.add(txtFone1);
		txtFone1.setColumns(10);
		
		lblNewLabel_4 = new JLabel("Fone 2");
		lblNewLabel_4.setBounds(194, 418, 48, 14);
		contentPane.add(lblNewLabel_4);
		
		txtFone2 = new JTextField();
		txtFone2.setBounds(243, 415, 96, 20);
		contentPane.add(txtFone2);
		txtFone2.setColumns(10);
		
		lblNewLabel_5 = new JLabel("CPF");
		lblNewLabel_5.setBounds(504, 267, 37, 14);
		contentPane.add(lblNewLabel_5);
		
		txtCpf = new JTextField();
		txtCpf.setBounds(544, 264, 224, 20);
		contentPane.add(txtCpf);
		txtCpf.setColumns(10);
		
		lblNewLabel_6 = new JLabel("* E-mail");
		lblNewLabel_6.setBounds(350, 418, 48, 14);
		contentPane.add(lblNewLabel_6);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(408, 415, 360, 20);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(256, 469, 64, 64);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adicionarCliente();
			}
		});
		btnNewButton.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/create.png")));
		btnNewButton.setToolTipText("Adicionar Cliente");
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setBounds(351, 469, 64, 64);
		button.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/update.png")));
		button.setToolTipText("Editar Cliente");
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBounds(448, 469, 64, 64);
		button_1.setIcon(new ImageIcon(Clientes.class.getResource("/br/com/infox/icons/delete.png")));
		button_1.setToolTipText("Excluir Cliente");
		contentPane.add(button_1);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(20, 307, 48, 14);
		contentPane.add(lblCep);
		
		txtCep = new JTextField();
		txtCep.setBounds(63, 304, 137, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JButton btnBuscarCep = new JButton("Buscar CEP");
		btnBuscarCep.setBounds(208, 303, 112, 23);
		btnBuscarCep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				buscarCep();
			}
		});
		contentPane.add(btnBuscarCep);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 67, 748, 189);
		contentPane.add(scrollPane);
		
		tblClientes = new JTable();
		tblClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				setarCampos();
			}
			
		});
		scrollPane.setViewportView(tblClientes);
	}// fim do construtor
	
	
	// método para buscar o CEP
	private void buscarCep() {
		try {
			String cep = txtCep.getText();
			CepWebService cepWebService = new CepWebService(cep);
			if (cepWebService.getResultado() == 1) {
				txtLogradouro.setText(cepWebService.getTipo_logradouro() + " " + cepWebService.getLogradouro());
				txtBairro.setText(cepWebService.getBairro());
				txtCidade.setText(cepWebService.getCidade());
				cboUf.setSelectedItem(cepWebService.getUf());
			} else {
				JOptionPane.showMessageDialog(null, "Não foi possível obter o CEP");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		
		private void limpar() {
			txtNome.setText(null);
			txtCpf.setText(null);
			txtEmail.setText(null);
			txtCep.setText(null);
			txtLogradouro.setText(null);
			txtNumero.setText(null);
			txtComplemento.setText(null);
			txtBairro.setText(null);
			txtCidade.setText(null);
			cboUf.setSelectedItem(null);
			txtFone1.setText(null);
			txtFone2.setText(null);
		}
	
			
		private void adicionarCliente() {
			String create = "insert into tb_clientes (nomeCli,cpfCli,emailCli,cep,logradouro,numero,complemento,bairro,cidade,uf,fone1,fone2) values(?,?,?,?,?,?,?,?,?,?,?,?)";
			try {
				pst = (PreparedStatement) con.prepareStatement(create);
				// passagem de parâmetros
				pst.setString(1, txtNome.getText());
				pst.setString(2, txtCpf.getText());
				pst.setString(3, txtEmail.getText());
				pst.setString(4, txtCep.getText());
				pst.setString(5, txtLogradouro.getText());
				pst.setString(6, txtNumero.getText());
				pst.setString(7, txtComplemento.getText());
				pst.setString(8, txtBairro.getText());
				pst.setString(9, txtCidade.getText());
				pst.setString(10, cboUf.getSelectedItem().toString());
				pst.setString(11, txtFone1.getText());
				pst.setString(12, txtFone2.getText());
				
				int r = pst.executeUpdate();
				if (r > 0) {
					JOptionPane.showMessageDialog(null, "Cliente adicionado com sucesso");
					limpar();
				} // fim do if
				else {
					JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar");
				} // fim do else
			} // fim do try
			catch (Exception e) {
				System.out.println(e);
			} // fim do catch

		}// fim do construtor
		
		
		//METODO PESQUISAR CLIENTES PELO NOME COM FILTRO
		private void pesquisarCliente() {
	        String read = "select * from tb_clientes where nomeCli like ?";
	        try {
	            pst = (PreparedStatement) con.prepareStatement(read);
	            //atenção ao "%" - continuação da String sql
	            pst.setString(1, txtPesquisar.getText() + "%");
	            rs = pst.executeQuery();
	            // a linha abaixo usa a biblioteca rs2xml.jar para preencher a tabela
	            tblClientes.setModel(DbUtils.resultSetToTableModel(rs));

	        } catch (Exception e) {
				System.out.println(e);
			}
	    }
		
		
		//METODO PARA SETAR OS CAMPOS DO FORMULARIO COM O CONTEUDO
		public void setarCampos() {
			int setar = tblClientes.getSelectedRow();
			txtNome.setText(tblClientes.getModel().getValueAt(setar, 1).toString());
			txtCep.setText(tblClientes.getModel().getValueAt(setar, 2).toString());
			txtLogradouro.setText(tblClientes.getModel().getValueAt(setar, 3).toString());
			txtNumero.setText(tblClientes.getModel().getValueAt(setar, 4).toString());
			txtComplemento.setText(tblClientes.getModel().getValueAt(setar, 5).toString());
			txtBairro.setText(tblClientes.getModel().getValueAt(setar, 6).toString());
			txtCidade.setText(tblClientes.getModel().getValueAt(setar, 7).toString());
			cboUf.setSelectedItem(tblClientes.getModel().getValueAt(setar, 8).toString());
			txtFone1.setText(tblClientes.getModel().getValueAt(setar, 9).toString());
			txtFone2.setText(tblClientes.getModel().getValueAt(setar, 10).toString());
			txtEmail.setText(tblClientes.getModel().getValueAt(setar, 11).toString());
			
			
			
		}
		
	}



