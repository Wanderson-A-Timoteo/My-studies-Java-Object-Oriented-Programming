package cadastroaluno;

/**
 *
 * @author wanderson
 */

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaCadastro extends JFrame {
    
    private JButton bttCadastrar;
    private JTextField txtNome;
    private JLabel lbNome;
    
    public TelaCadastro() {
        
        setSize(600,200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Cadastro Aluno");
        
        Container cont = getContentPane();
        cont.setLayout(null);
        cont.setSize(600,200);
        
        bttCadastrar = new JButton();
        bttCadastrar.setText("Cadastrar");
        bttCadastrar.setSize(110, 40);
        bttCadastrar.setLocation(160,40);
        /*bttCadastrar.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        cadastrarAluno();
                    }
                }
        );*/
        bttCadastrar.addActionListener(e -> cadastrarAluno());
        add(bttCadastrar);
        
        txtNome = new JTextField();
        txtNome.setSize(250, 20);
        txtNome.setLocation(100, 10);
        add(txtNome);
        
        lbNome = new JLabel();
        lbNome.setText("Nome: ");
        lbNome.setSize(70, 10);
        lbNome.setLocation(10,10);
        add(lbNome);
        
        
    }
    
    public void cadastrarAluno() {
        String texto = txtNome.getText();
        System.out.println("Você digitou: "+texto);        
    }
    
}