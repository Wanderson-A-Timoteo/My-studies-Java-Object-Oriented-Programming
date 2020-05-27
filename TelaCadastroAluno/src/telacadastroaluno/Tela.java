package telacadastroaluno;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Tela extends JFrame {
    
    private JTextField txtNome;
    private JButton bttCadastrar;

    public Tela(){
    
    setSize(600, 400);
    setLocation(200, 200);
    setTitle("Cadastro Alunos");
    setResizable (false);
        
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    Container c = this.getContentPane();
    c.setLayout(null);
    c.setSize(600, 400);
    
    txtNome = new JTextField();
    txtNome.setSize(160, 40);
    txtNome.setLocation(180, 10);
    add(txtNome);
    
    bttCadastrar = new JButton();
    bttCadastrar.setSize(110, 40);
    bttCadastrar.setLocation(345, 10);
    bttCadastrar.setText("Cadastar");
    
    bttCadastrar.addActionListener(
new ActionListener() {
    @Override
    public void actionPerformed (ActionEvent e ) {
        cliqueBotao();
    }
}
    );

    bttCadastrar.addActionListener(
        e -> { cliqueBotao(); }
    );
    
    add(bttCadastrar);
    
    }
    
    public void cliqueBotao() {
        System.out.println("Você digitou:   "
                +txtNome.getText());
    }
    

}
    
    
    
    

    
