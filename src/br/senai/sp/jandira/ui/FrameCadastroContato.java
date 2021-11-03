package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;

public class FrameCadastroContato extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private final ButtonGroup buttonGroupSexo = new ButtonGroup();
	
	/**
	 * Create the frame.
	 */
	public FrameCadastroContato() {
		setTitle("Meus contatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(6, 91, 92, 26);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Arial", Font.PLAIN, 12));
		textField.setBounds(6, 117, 354, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblEmail.setBounds(6, 143, 92, 26);
		contentPane.add(lblEmail);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_1.setColumns(10);
		textField_1.setBounds(6, 168, 354, 26);
		contentPane.add(textField_1);
		
		JLabel lblTelefone = new JLabel("Telefone:");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblTelefone.setBounds(6, 191, 92, 26);
		contentPane.add(lblTelefone);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setHorizontalAlignment(SwingConstants.LEFT);
		lblCidade.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblCidade.setBounds(198, 191, 92, 26);
		contentPane.add(lblCidade);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_2.setColumns(10);
		textField_2.setBounds(6, 214, 130, 26);
		contentPane.add(textField_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setToolTipText("");
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Barueri", "Carapicu\u00EDba", "Cotia", "Jandira", "Itapevi"}));
		comboBox_1.setFont(new Font("Arial", Font.PLAIN, 12));
		comboBox_1.setBounds(198, 214, 130, 26);
		contentPane.add(comboBox_1);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setHorizontalAlignment(SwingConstants.LEFT);
		lblSexo.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblSexo.setBounds(6, 239, 92, 26);
		contentPane.add(lblSexo);
		
		JRadioButton rdbtnFeminino = new JRadioButton("Feminino");
		buttonGroupSexo.add(rdbtnFeminino);
		rdbtnFeminino.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnFeminino.setBounds(6, 265, 130, 23);
		contentPane.add(rdbtnFeminino);
		
		JLabel lblDataDeNascimento = new JLabel("Data de nascimento:");
		lblDataDeNascimento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDataDeNascimento.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		lblDataDeNascimento.setBounds(198, 239, 130, 26);
		contentPane.add(lblDataDeNascimento);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Arial", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(198, 265, 130, 26);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Vasco");
				
			}
		});
		btnNewButton.setFont(new Font("Microsoft Sans Serif", Font.BOLD, 12));
		btnNewButton.setBounds(198, 302, 130, 28);
		contentPane.add(btnNewButton);
		
		JRadioButton rdbtnMasculino = new JRadioButton("Masculino");
		buttonGroupSexo.add(rdbtnMasculino);
		rdbtnMasculino.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnMasculino.setBounds(6, 291, 130, 23);
		contentPane.add(rdbtnMasculino);
		
		JPanel Header = new JPanel();
		Header.setBackground(new Color(255, 255, 255));
		Header.setBounds(6, 11, 354, 60);
		contentPane.add(Header);
		Header.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Meus contatos:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 11, 152, 38);
		Header.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(FrameCadastroContato.class.getResource("/br/senai/sp/jandira/images/contact-book.png")));
		lblNewLabel_2.setBounds(295, 11, 49, 38);
		Header.add(lblNewLabel_2);
		
		JRadioButton rdbtnPrefiroNoInformar = new JRadioButton("Prefiro n\u00E3o informar");
		buttonGroupSexo.add(rdbtnPrefiroNoInformar);
		rdbtnPrefiroNoInformar.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnPrefiroNoInformar.setBounds(6, 317, 171, 23);
		contentPane.add(rdbtnPrefiroNoInformar);
		
		JRadioButton rdbtnOutroporFavor = new JRadioButton("Outro (Por favor, especifique)");
		buttonGroupSexo.add(rdbtnOutroporFavor);
		rdbtnOutroporFavor.setFont(new Font("Arial", Font.PLAIN, 12));
		rdbtnOutroporFavor.setBounds(6, 343, 217, 23);
		contentPane.add(rdbtnOutroporFavor);
	}
}
