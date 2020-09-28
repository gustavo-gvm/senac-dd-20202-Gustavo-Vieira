package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.text.MaskFormatter;

import javax.swing.UIManager;
import javax.swing.JFormattedTextField;

public class CadastroPessoa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputNome;
	private JTextField inputSobrenome;
	private JTextField inputInstituicao;
	private JCheckBox checkbxPesquisador;
	private JLabel lblInstituicao;
	
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPessoa frame = new CadastroPessoa();
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
	public CadastroPessoa() {
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 610);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(UIManager.getBorder("ProgressBar.border"));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome = new JLabel("Nome");
		nome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		nome.setBounds(118, 100, 144, 14);
		contentPane.add(nome);
		
		JLabel sobrenome = new JLabel("Sobrenome");
		sobrenome.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sobrenome.setBounds(118, 166, 121, 14);
		contentPane.add(sobrenome);
		
		JLabel sexo = new JLabel("Sexo");
		sexo.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sexo.setBounds(118, 232, 46, 14);
		contentPane.add(sexo);
		
		JLabel inputCPF = new JLabel("CPF");
		inputCPF.setFont(new Font("Tahoma", Font.PLAIN, 17));
		inputCPF.setBounds(118, 285, 46, 14);
		contentPane.add(inputCPF);
		
		JPanel panel_background = new JPanel();
		panel_background.setBackground(new Color(102, 102, 204));
		panel_background.setBounds(0, -1, 490, 89);
		contentPane.add(panel_background);
		panel_background.setLayout(null);
		
		JLabel cadastroPessoa = new JLabel("Cadastro  Pessoa");
		cadastroPessoa.setBounds(106, 12, 297, 67);
		panel_background.add(cadastroPessoa);
		cadastroPessoa.setBackground(Color.DARK_GRAY);
		cadastroPessoa.setHorizontalAlignment(SwingConstants.CENTER);
		cadastroPessoa.setFont(new Font("Tahoma", Font.BOLD, 24));
		cadastroPessoa.setForeground(Color.WHITE);
		
		inputNome = new JTextField();
		inputNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inputNome.setBounds(118, 124, 250, 30);
		contentPane.add(inputNome);
		inputNome.setColumns(10);
		
		inputSobrenome = new JTextField();
		inputSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		inputSobrenome.setBounds(118, 191, 250, 30);
		contentPane.add(inputSobrenome);
		inputSobrenome.setColumns(10);
		
		JRadioButton radioSexoMasculino = new JRadioButton("Masculino");
		radioSexoMasculino.setBackground(new Color(255, 255, 255));
		radioSexoMasculino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioSexoMasculino.setSelected(true);
		radioSexoMasculino.setBounds(138, 253, 109, 23);
		contentPane.add(radioSexoMasculino);
		
		JRadioButton radioSexoFeminino = new JRadioButton("Feminino");
		radioSexoFeminino.setBackground(new Color(255, 255, 255));
		radioSexoFeminino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioSexoFeminino.setBounds(250, 253, 121, 23);
		contentPane.add(radioSexoFeminino);
		
		checkbxPesquisador = new JCheckBox("Pesquisador");
		checkbxPesquisador.setBackground(new Color(255, 255, 255));
		checkbxPesquisador.setHorizontalTextPosition(SwingConstants.RIGHT);
		checkbxPesquisador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(checkbxPesquisador.isSelected()) {
					inputInstituicao.setEnabled(true);
					lblInstituicao.setEnabled(true);
				} else {
					inputInstituicao.setEnabled(false);
					lblInstituicao.setEnabled(false);
				}
			}
		});
		checkbxPesquisador.setToolTipText("");
		checkbxPesquisador.setHorizontalAlignment(SwingConstants.LEFT);
		checkbxPesquisador.setFont(new Font("Tahoma", Font.PLAIN, 17));
		checkbxPesquisador.setBounds(118, 410, 144, 23);
		contentPane.add(checkbxPesquisador);
		
		lblInstituicao = new JLabel("Instituição");
		lblInstituicao.setEnabled(false);
		lblInstituicao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblInstituicao.setBounds(118, 440, 121, 30);
		contentPane.add(lblInstituicao);
		
		inputInstituicao = new JTextField();
		inputInstituicao.setEnabled(false);
		inputInstituicao.setBounds(118, 469, 250, 30);
		contentPane.add(inputInstituicao);
		inputInstituicao.setColumns(10);
		
		JLabel voluntario = new JLabel("Voluntário");
		voluntario.setFont(new Font("Tahoma", Font.PLAIN, 17));
		voluntario.setBounds(118, 351, 101, 14);
		contentPane.add(voluntario);
		
		JRadioButton radioVoluntarioSim = new JRadioButton("Sim");
		radioVoluntarioSim.setBackground(new Color(255, 255, 255));
		radioVoluntarioSim.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioVoluntarioSim.setBounds(118, 374, 52, 23);
		contentPane.add(radioVoluntarioSim);
		
		JRadioButton radioVoluntarioNao = new JRadioButton("N\u00E3o");
		radioVoluntarioNao.setBackground(new Color(255, 255, 255));
		radioVoluntarioNao.setFont(new Font("Tahoma", Font.PLAIN, 14));
		radioVoluntarioNao.setBounds(178, 374, 53, 23);
		contentPane.add(radioVoluntarioNao);
		
		ButtonGroup radioSexo = new ButtonGroup();
		radioSexo.add(radioSexoMasculino);
		radioSexo.add(radioSexoFeminino);
		
		ButtonGroup radioVoluntario = new ButtonGroup();
		radioVoluntario.add(radioVoluntarioSim);
		radioVoluntario.add(radioVoluntarioNao);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setForeground(SystemColor.text);
		btnCadastrar.setBackground(SystemColor.desktop);
		btnCadastrar.setFont(new Font("Dialog", Font.BOLD, 14));
		btnCadastrar.setBounds(178, 521, 121, 36);
		contentPane.add(btnCadastrar);
		
		
		MaskFormatter maskCPF;
		try {
			maskCPF = new MaskFormatter("###.###.###-##");
			JFormattedTextField txtCPF = new JFormattedTextField(maskCPF);
			txtCPF.setText("");
			txtCPF.setBounds(118, 310, 121, 30);
			contentPane.add(txtCPF);
		} catch (ParseException e) {
			JOptionPane.showMessageDialog(null, "Campo CPF é obrigatório\nErro: " + e.getMessage());
		}

	}
}
