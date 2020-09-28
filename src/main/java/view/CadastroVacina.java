package view;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import com.github.lgooddatepicker.components.DatePicker;
import com.github.lgooddatepicker.components.DatePickerSettings;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.UIManager;

public class CadastroVacina extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField inputPais;
	private JPanel contentPane;
	private DatePicker data;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVacina frame = new CadastroVacina();
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
	public CadastroVacina() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(UIManager.getBorder("ProgressBar.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_background = new JPanel();
		panel_background.setBackground(new Color(102, 102, 204));
		panel_background.setBounds(0, -1, 490, 89);
		contentPane.add(panel_background);
		panel_background.setLayout(null);
		
		JLabel title = new JLabel("Cadastro de Vacina");
		title.setBackground(Color.WHITE);
		title.setBounds(93, 12, 324, 67);
		title.setForeground(Color.WHITE);
		title.setFont(new Font("Tahoma", Font.BOLD, 24));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		panel_background.add(title);
		
		DatePickerSettings dateSettings = new DatePickerSettings();
		dateSettings.setAllowKeyboardEditing(false);
		dateSettings.setFormatForDatesCommonEra("dd/MM/yyyy");
		dateSettings.setFontValidDate(new Font("Tahoma", Font.BOLD, 17));
		
		data = new DatePicker(dateSettings);
		data.getComponentDateTextField().setFont(new Font("Tahoma", Font.PLAIN, 11));
		data.setBounds(118, 260, 250, 36);
		getContentPane().add(data);

		
		JLabel labelNome = new JLabel("Nome do pesquisador");
		labelNome.setBounds(118, 133, 309, 21);
		labelNome.setFont(new Font("Dialog", Font.PLAIN, 17));
		getContentPane().add(labelNome);
		
		JFormattedTextField inputNomePesquisador = new JFormattedTextField();
		inputNomePesquisador.setFont(new Font("Tahoma", Font.PLAIN, 16));
		inputNomePesquisador.setBounds(118, 166, 250, 30);
		getContentPane().add(inputNomePesquisador);
		
		JLabel labelData = new JLabel("Data");
		labelData.setBounds(118, 223, 250, 14);
		labelData.setFont(new Font("Tahoma", Font.PLAIN, 17));
		getContentPane().add(labelData);
		
		JLabel labelPais = new JLabel("País");
		labelPais.setFont(new Font("Tahoma", Font.PLAIN, 17));
		labelPais.setBounds(118, 319, 36, 14);
		getContentPane().add(labelPais);
		
		inputPais = new JTextField();
		inputPais.setFont(new Font("Tahoma", Font.PLAIN, 16));
		inputPais.setBounds(118, 345, 250, 30);
		getContentPane().add(inputPais);
		inputPais.setColumns(10);
		
		JLabel labelPesquisa = new JLabel("Estágio da pesquisa");
		labelPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		labelPesquisa.setBounds(118, 406, 250, 21);
		getContentPane().add(labelPesquisa);
		
		JRadioButton radioInicial = new JRadioButton("Inicial");
		radioInicial.setBackground(new Color(255, 255, 255));
		radioInicial.setFont(new Font("Tahoma", Font.PLAIN, 17));
		radioInicial.setBounds(118, 434, 83, 23);
		getContentPane().add(radioInicial);
		
		JRadioButton radioTestes = new JRadioButton("Testes");
		radioTestes.setBackground(new Color(255, 255, 255));
		radioTestes.setFont(new Font("Tahoma", Font.PLAIN, 17));
		radioTestes.setBounds(205, 435, 86, 23);
		getContentPane().add(radioTestes);
		
		JRadioButton radioAplicação = new JRadioButton("Aplica\u00E7\u00E3o");
		radioAplicação.setBackground(new Color(255, 255, 255));
		radioAplicação.setFont(new Font("Tahoma", Font.PLAIN, 17));
		radioAplicação.setBounds(287, 434, 105, 23);
		getContentPane().add(radioAplicação);
		
		ButtonGroup rbtnGroupEstagio = new ButtonGroup();
		rbtnGroupEstagio.add(radioInicial);
		rbtnGroupEstagio.add(radioTestes);
		rbtnGroupEstagio.add(radioAplicação);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(SystemColor.text);
		btnCadastrar.setBackground(SystemColor.desktop);
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCadastrar.setBounds(178, 521, 121, 36);
		contentPane.add(btnCadastrar);
		
	}
}