package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.ButtonGroup;

public class Os extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Os frame = new Os();
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
	public Os() {
		setTitle("OS");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel.setBounds(10, 11, 314, 123);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblOs = new JLabel("OS");
		lblOs.setBounds(10, 11, 48, 14);
		panel.add(lblOs);
		
		JLabel lblData = new JLabel("Data");
		lblData.setBounds(120, 11, 48, 14);
		panel.add(lblData);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(10, 36, 82, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEnabled(false);
		textField_1.setBounds(120, 36, 180, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Or\u00E7amento");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(10, 77, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OS");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(120, 77, 109, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(Color.LIGHT_GRAY, 1, true));
		panel_1.setBounds(334, 11, 437, 208);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(10, 11, 48, 14);
		panel_1.add(lblCliente);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 30, 263, 20);
		panel_1.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblId = new JLabel("* id");
		lblId.setBounds(342, 33, 48, 14);
		panel_1.add(lblId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(369, 30, 58, 20);
		panel_1.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/pesquisar.png")));
		lblNewLabel.setBounds(283, 18, 32, 32);
		panel_1.add(lblNewLabel);
		
		table = new JTable();
		table.setBounds(10, 71, 417, 126);
		panel_1.add(table);
		
		JLabel lblSituao = new JLabel("* Situa\u00E7\u00E3o");
		lblSituao.setBounds(10, 159, 84, 14);
		contentPane.add(lblSituao);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Aguardando aprova\u00E7\u00E3o do cliente", "Or\u00E7amento reprovado", "Aguardando pe\u00E7as", "Na bancada", "Equipamento pronto aguardando retirada", "Equipamento entregue", "Equipamento devolvido sem manuten\u00E7\u00E3o", "Garantia"}));
		comboBox.setBounds(10, 184, 314, 22);
		contentPane.add(comboBox);
		
		JLabel lblEquipamento = new JLabel("* Equipamento");
		lblEquipamento.setBounds(10, 266, 84, 14);
		contentPane.add(lblEquipamento);
		
		textField_4 = new JTextField();
		textField_4.setBounds(103, 263, 668, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblDefeito = new JLabel("* Defeito");
		lblDefeito.setBounds(20, 294, 64, 14);
		contentPane.add(lblDefeito);
		
		textField_5 = new JTextField();
		textField_5.setBounds(103, 291, 668, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblServio = new JLabel("Servi\u00E7o");
		lblServio.setBounds(43, 325, 48, 14);
		contentPane.add(lblServio);
		
		textField_6 = new JTextField();
		textField_6.setBounds(103, 322, 668, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblTcnico = new JLabel("T\u00E9cnico");
		lblTcnico.setBounds(43, 356, 48, 14);
		contentPane.add(lblTcnico);
		
		textField_7 = new JTextField();
		textField_7.setBounds(103, 353, 221, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setBounds(365, 356, 48, 14);
		contentPane.add(lblTotal);
		
		textField_8 = new JTextField();
		textField_8.setBounds(408, 353, 230, 20);
		contentPane.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblObservaes = new JLabel("Observa\u00E7\u00F5es");
		lblObservaes.setBounds(23, 399, 77, 14);
		contentPane.add(lblObservaes);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(113, 387, 659, 45);
		contentPane.add(textPane);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/create.png")));
		btnNewButton.setToolTipText("Emitir OS");
		btnNewButton.setBounds(191, 471, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/read.png")));
		button.setToolTipText("Pesquisar OS");
		button.setBounds(270, 471, 64, 64);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/update.png")));
		button_1.setToolTipText("Editar OS");
		button_1.setBounds(349, 471, 64, 64);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/delete.png")));
		button_2.setToolTipText("Excluir OS");
		button_2.setBounds(432, 471, 64, 64);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setIcon(new ImageIcon(Os.class.getResource("/br/com/infox/icons/print.png")));
		button_3.setToolTipText("Imprimir OS");
		button_3.setBounds(517, 471, 64, 64);
		contentPane.add(button_3);
	}
}
