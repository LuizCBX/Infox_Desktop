package br.com.infox.frames;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import com.toedter.calendar.JDateChooser;
import com.toedter.components.JLocaleChooser;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.toedter.calendar.JCalendar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reports extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reports frame = new Reports();
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
	public Reports() {
		setResizable(false);
		setTitle("Relat\u00F3rios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 378);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pdfClientes();
			}
		});
		btnNewButton.setToolTipText("Clientes");
		btnNewButton.setIcon(new ImageIcon(Reports.class.getResource("/br/com/infox/icons/relatorio clientes.png")));
		btnNewButton.setBounds(54, 46, 64, 64);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("");
		button.setIcon(new ImageIcon(Reports.class.getResource("/br/com/infox/icons/relatorio faturamento.png")));
		button.setToolTipText("Faturamento");
		button.setBounds(54, 183, 64, 64);
		contentPane.add(button);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(306, 162, 191, 153);
		contentPane.add(calendar);
	}//fim do construtor
	//método para imprimir relatório de clientes
	private void pdfClientes() {
		Document document = new Document();
		//gerar o documento (armazenado no workspace)
		try {
			PdfWriter.getInstance(document, new FileOutputStream("clientes.pdf"));
			document.open();
			document.add(new Paragraph("Clientes cadastrados"));
		} catch (Exception e) {
			System.out.println(e);
		} finally{
			document.close();
		}
		//abrir automatomaticamente o pdf no leitor padrão
		try {
			Desktop.getDesktop().open(new File("clientes.pdf"));
		} catch (Exception e2) {
			System.out.println(e2);
		}
	}
}
