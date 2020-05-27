package aplicacao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import fachada.Sistema;
import modelo.Produto;
import java.awt.Font;

public class TelaCadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNome;
	private JLabel lblQuantidade;
	private JButton btnCriar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadastroProduto frame = new TelaCadastroProduto();
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
	public TelaCadastroProduto() {
		setTitle("Cadastrar Produto");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 387, 199);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(96, 26, 171, 27);
		contentPane.add(textField);
		textField.setColumns(10);

		lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNome.setBounds(10, 39, 46, 14);
		contentPane.add(lblNome);

		lblQuantidade = new JLabel("Quantidade");
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblQuantidade.setBounds(10, 83, 76, 21);
		contentPane.add(lblQuantidade);

		textField_1 = new JTextField();
		textField_1.setBounds(96, 77, 171, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		btnCriar = new JButton("Cadastrar");
		btnCriar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCriar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String nome = textField.getText();
					int qtde = Integer.parseInt(textField_1.getText());
					Produto p = Sistema.cadastrarProduto(nome,qtde);
					JOptionPane.showMessageDialog(null,"Produto cadastrado " + p.getNome());
					
					textField.setText("");
					textField_1.setText("");
					textField.requestFocus();
				}
				catch(Exception erro){
					JOptionPane.showMessageDialog(null,erro.getMessage());
				}
			}
		});
		btnCriar.setBounds(243, 136, 115, 23);
		contentPane.add(btnCriar);
	}
}
