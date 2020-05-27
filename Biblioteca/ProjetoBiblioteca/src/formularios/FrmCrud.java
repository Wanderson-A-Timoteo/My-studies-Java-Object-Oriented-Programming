package formularios;

import biblioteca.Aluno;
import biblioteca.Biblioteca;
import static biblioteca.Biblioteca.con;
import biblioteca.Estado;;
import javax.swing.JOptionPane;
import biblioteca.Idao;import conexaomysql.ConexaoMySql;
import java.sql.Connection;
import java.sql.Date;import java.sql.ResultSet;
;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PEDROHENRIQUE
 */
public class FrmCrud extends javax.swing.JFrame {

    //public Idao daoObject; 
    private Estado estado;
    
    public Aluno aluno;
    
    

    public FrmCrud() {
        initComponents();
        this.aluno = new Aluno();
        estado = Estado.visualizacao;
        atualizarEstadoBotoes();

    }
    
    public FrmCrud(Biblioteca aThis, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    protected void alterar(){       
        estado = Estado.edicao;                
        atualizarEstadoBotoes();
    };
    
    protected void cancelar(){
        estado = Estado.visualizacao;        
        atualizarEstadoBotoes();
    }
    
    protected void adicionar(){
        estado = Estado.insercao;        
        atualizarEstadoBotoes();
        txtAluno.setText("");
        txtCpf.setText("");
        txtIdade.setText("");
        txtEndereco.setText("");
    }
    
    protected void buscar(){
        if (txtCodigo.getText().trim().equals("")){
           JOptionPane.showMessageDialog(null,
              "Favor informar o código do aluno!",
              "Alerta!",
              JOptionPane.INFORMATION_MESSAGE); 
        }    
        else{
            int id = Integer.parseInt(txtCodigo.getText());
            aluno.buscar(id);
            txtAluno.setText(aluno.getNome());
            txtCpf.setText(aluno.getCpf());
            txtEndereco.setText(aluno.getEndereco());
            Integer idade = aluno.getIdade();
            txtIdade.setText(idade.toString());
        }
    }
    
    protected void excluir(){
        int resposta = JOptionPane.YES_NO_OPTION; 
        JOptionPane.showConfirmDialog (null, "Certeza que deseja excluir?","Confirmação", resposta);
            if(resposta == JOptionPane.YES_OPTION) {            
                estado = Estado.visualizacao;
            }
            
        atualizarEstadoBotoes();
             
    }
    
    protected void confirmar(){

        if (!txtAluno.getText().trim().equals("") || !txtEndereco.getText().trim().equals("") 
            || !txtIdade.getText().trim().equals("")) {
            
            aluno.setNome(txtAluno.getText());
            aluno.setCpf(txtCpf.getText());
            aluno.setEndereco(txtEndereco.getText());

            aluno.setIdade(Integer.parseInt(txtIdade.getText()));

            if (estado == Estado.insercao) {
                aluno.inserir();
                JOptionPane.showMessageDialog(null,
                  "Aluno cadastrado com sucesso!!!",
                  "Sucesso!",
                  JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                aluno.atualizar();
                JOptionPane.showMessageDialog(null,
                  "Dados do aluno atualizados com sucesso!!!",
                  "Sucesso!",
                  JOptionPane.INFORMATION_MESSAGE);
            }
            

        } else {
            JOptionPane.showMessageDialog(null,
                    "Preencha todos os campos!",
                    "Erro!",
                    JOptionPane.ERROR_MESSAGE);                
        }   
        
        estado = Estado.visualizacao;
        atualizarEstadoBotoes();
    }
    
    private void atualizarEstadoBotoes(){
        btnConfirmar.setEnabled((estado == Estado.edicao) || estado == Estado.insercao);
        btnCancelar.setEnabled((estado == Estado.edicao) || estado == Estado.insercao);
        
        btnExcluir.setEnabled(estado == Estado.visualizacao);
        btnAdicionar.setEnabled(estado == Estado.visualizacao);
        btnAlterar.setEnabled(estado == Estado.visualizacao);
        
        txtAluno.setEnabled(estado != Estado.visualizacao);
        txtCpf.setEnabled(estado != Estado.visualizacao);
        txtEndereco.setEnabled(estado != Estado.visualizacao);
        txtIdade.setEnabled(estado != Estado.visualizacao);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        lbAluno = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        txtAluno = new javax.swing.JTextField();
        txtCpf = new javax.swing.JFormattedTextField();
        lbEndereco = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lbImagem = new javax.swing.JLabel();
        jbNascimento = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        btnAlterar = new javax.swing.JButton();
        btnAdicionar = new javax.swing.JButton();
        btnConfirmar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnInserirLivro = new javax.swing.JMenu();
        mniNovo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mnEmprestimo = new javax.swing.JMenu();
        mniVerifEmprestimo = new javax.swing.JMenuItem();
        minLivrosDisponiveis = new javax.swing.JMenuItem();
        btnemprest = new javax.swing.JMenuItem();
        mnAlunos = new javax.swing.JMenu();
        mniVerAlunos = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();
        mniAutores = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        mnSair = new javax.swing.JMenu();
        mniFechar = new javax.swing.JMenuItem();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setAutoscrolls(true);

        jDesktopPane1.setBackground(new java.awt.Color(240, 240, 240));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("CADASTRO"));
        jDesktopPane1.setForeground(new java.awt.Color(240, 240, 240));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbAluno.setBackground(new java.awt.Color(0, 0, 0));
        lbAluno.setText("ALUNO:");

        lbCpf.setText("CPF:");

        txtAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAlunoActionPerformed(evt);
            }
        });

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCpfActionPerformed(evt);
            }
        });

        lbEndereco.setText("ENDEREÇO:");

        txtEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoActionPerformed(evt);
            }
        });

        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });

        jLabel4.setText("CODIGO:");

        lbImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/neeeew.png"))); // NOI18N
        lbImagem.setText("jLabel7");

        jbNascimento.setText("IDADE:");

        txtIdade.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIdade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdadeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 320, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lbCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jbNascimento)
                        .addGap(30, 30, 30)
                        .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbAluno)
                            .addComponent(txtAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEndereco)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCpf)
                            .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbNascimento))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(173, Short.MAX_VALUE))
        );

        jDesktopPane1.setLayer(jPanel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/book_edit.png"))); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/cd_add.png"))); // NOI18N
        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        btnConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/book_previous.png"))); // NOI18N
        btnConfirmar.setText("Confirmar");
        btnConfirmar.setEnabled(false);
        btnConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarActionPerformed(evt);
            }
        });

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/book_delete.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setEnabled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/arrow_rotate_anticlockwise.png"))); // NOI18N
        btnExcluir.setText("Buscar");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mnInserirLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/book_previous.png"))); // NOI18N
        mnInserirLivro.setText("Inserir");

        mniNovo.setText("Livro");
        mniNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNovoActionPerformed(evt);
            }
        });
        mnInserirLivro.add(mniNovo);

        jMenuItem1.setText("Funcionário");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnInserirLivro.add(jMenuItem1);

        jMenuBar1.add(mnInserirLivro);

        mnEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/book_open.png"))); // NOI18N
        mnEmprestimo.setText("Emprestimos");

        mniVerifEmprestimo.setText("Verificar livros emprestados");
        mniVerifEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVerifEmprestimoActionPerformed(evt);
            }
        });
        mnEmprestimo.add(mniVerifEmprestimo);

        minLivrosDisponiveis.setText("Livros cadastrados");
        minLivrosDisponiveis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minLivrosDisponiveisActionPerformed(evt);
            }
        });
        mnEmprestimo.add(minLivrosDisponiveis);

        btnemprest.setText("Novo Emprestimo");
        btnemprest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnemprestActionPerformed(evt);
            }
        });
        mnEmprestimo.add(btnemprest);

        jMenuBar1.add(mnEmprestimo);

        mnAlunos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/user.png"))); // NOI18N
        mnAlunos.setText("Alunos");
        mnAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlunosActionPerformed(evt);
            }
        });

        mniVerAlunos.setText("Ver Alunos...");
        mniVerAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniVerAlunosActionPerformed(evt);
            }
        });
        mnAlunos.add(mniVerAlunos);

        jMenuBar1.add(mnAlunos);

        mnSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/coins.png"))); // NOI18N
        mnSobre.setText("Sobre");
        mnSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSobreActionPerformed(evt);
            }
        });

        mniAutores.setText("Autores...");
        mniAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAutoresActionPerformed(evt);
            }
        });
        mnSobre.add(mniAutores);

        jMenuItem2.setText("Multa...");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnSobre.add(jMenuItem2);

        jMenuBar1.add(mnSobre);

        mnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/cancel.png"))); // NOI18N
        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });

        mniFechar.setText("Fechar sistema");
        mniFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniFecharActionPerformed(evt);
            }
        });
        mnSair.add(mniFechar);

        jMenuBar1.add(mnSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarActionPerformed
        confirmar();
    }//GEN-LAST:event_btnConfirmarActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
         
         adicionar(); 

    }//GEN-LAST:event_btnAdicionarActionPerformed
            
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        cancelar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        buscar();
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void mniVerifEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVerifEmprestimoActionPerformed
        
        TelaDeEmprestimos TelaEmprestimo = new TelaDeEmprestimos();
        jDesktopPane1.add(TelaEmprestimo);
        TelaEmprestimo.setVisible(true);
                

    }//GEN-LAST:event_mniVerifEmprestimoActionPerformed

    private void mnSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSobreActionPerformed

    }//GEN-LAST:event_mnSobreActionPerformed

    private void minLivrosDisponiveisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minLivrosDisponiveisActionPerformed
        TelaLivrosCadastrados TelaDisponiveis = new TelaDisponiveis();
        jDesktopPane1.add(TelaDisponiveis);
        TelaDisponiveis.setVisible(true);
        
    }//GEN-LAST:event_minLivrosDisponiveisActionPerformed

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
            
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlunosActionPerformed
  
       
    }//GEN-LAST:event_mnAlunosActionPerformed

    private void mniVerAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniVerAlunosActionPerformed
            
        TelaAlunos telalunos = new TelaAlunos();
        jDesktopPane1.add(telalunos);
        telalunos.setVisible(true);
        
    }//GEN-LAST:event_mniVerAlunosActionPerformed

    private void mniFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniFecharActionPerformed
            System.exit(0);
    }//GEN-LAST:event_mniFecharActionPerformed

    private void mniNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNovoActionPerformed
        NovoLivro novolvr = new NovoLivro();
        jDesktopPane1.add(novolvr);
        novolvr.setVisible(true);

    }//GEN-LAST:event_mniNovoActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoActionPerformed

    private void txtCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCpfActionPerformed

    private void txtAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAlunoActionPerformed

    }//GEN-LAST:event_txtAlunoActionPerformed

    private void mniAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAutoresActionPerformed
        JOptionPane.showMessageDialog(null,"Erik Bruno"+"\n"+"Meyr Fernando"+"\n"+"Pedro Barbiero");
    }//GEN-LAST:event_mniAutoresActionPerformed

    private void txtIdadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdadeKeyTyped
        int numero=2;
        if(txtIdade.getText().length()>=numero){
            evt.consume();
        }
    }//GEN-LAST:event_txtIdadeKeyTyped

    private void btnemprestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnemprestActionPerformed
        PegarLivro formlivro = new PegarLivro();
        jDesktopPane1.add(formlivro);
        formlivro.setVisible(true);

    }//GEN-LAST:event_btnemprestActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        FuncioBibli cadfun = new FuncioBibli();
        jDesktopPane1.add(cadfun);
        cadfun.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         JOptionPane.showMessageDialog(null,"Multa no valor R$ 3,99");
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCrud().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConfirmar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JMenuItem btnemprest;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel jbNascimento;
    private javax.swing.JLabel lbAluno;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbImagem;
    private javax.swing.JMenuItem minLivrosDisponiveis;
    private javax.swing.JMenu mnAlunos;
    private javax.swing.JMenu mnEmprestimo;
    private javax.swing.JMenu mnInserirLivro;
    private javax.swing.JMenu mnSair;
    private javax.swing.JMenu mnSobre;
    private javax.swing.JMenuItem mniAutores;
    private javax.swing.JMenuItem mniFechar;
    private javax.swing.JMenuItem mniNovo;
    private javax.swing.JMenuItem mniVerAlunos;
    private javax.swing.JMenuItem mniVerifEmprestimo;
    private javax.swing.JTextField txtAluno;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdade;
    // End of variables declaration//GEN-END:variables
}
