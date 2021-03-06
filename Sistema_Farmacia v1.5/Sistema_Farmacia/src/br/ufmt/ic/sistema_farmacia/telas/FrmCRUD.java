/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.sistema_farmacia.telas;

import javax.swing.JOptionPane;

/**
 *
 * @author wanderson Timoteo, Roberto Passos e Rodrigo Moura
 */
public class FrmCRUD extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Principal
     */
    public FrmCRUD() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrarFuncionario = new javax.swing.JMenu();
        jMenuCadastrarCliente = new javax.swing.JMenuItem();
        CadastrarFuncionario = new javax.swing.JMenuItem();
        jMenuCadastrarMedicamento = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuListarCliente = new javax.swing.JMenuItem();
        jMenuListarFuncionario = new javax.swing.JMenuItem();
        jMenuListarMedicamento = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuDesenvolvedores = new javax.swing.JMenuItem();
        jMenuSairSistema = new javax.swing.JMenu();
        jMenuFecharSistema = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal do Sistema_Farmacia");

        jLabel1.setText("Usuário: ");

        jLabelUser.setText("Nome");

        jLabelData.setText("Data: ");

        jLabelHora.setText("Hora: ");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Pharmacy_icon-icons.com_74919.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/medicine-2_icon-icons.com_66043.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        jLabel4.setText("Farma Hígia ");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Frase.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jMenuCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Adicionar48.png"))); // NOI18N
        jMenuCadastrarFuncionario.setText("Cadastrar");
        jMenuCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarFuncionarioActionPerformed(evt);
            }
        });

        jMenuCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/ClienteAdd.png"))); // NOI18N
        jMenuCadastrarCliente.setText("Cliente");
        jMenuCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuCadastrarFuncionario.add(jMenuCadastrarCliente);

        CadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/FuncionarioAdd.png"))); // NOI18N
        CadastrarFuncionario.setText("Funcionário");
        CadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFuncionarioActionPerformed(evt);
            }
        });
        jMenuCadastrarFuncionario.add(CadastrarFuncionario);

        jMenuCadastrarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/MedicamentoAdd.png"))); // NOI18N
        jMenuCadastrarMedicamento.setText("Medicamento");
        jMenuCadastrarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarMedicamentoActionPerformed(evt);
            }
        });
        jMenuCadastrarFuncionario.add(jMenuCadastrarMedicamento);

        jMenuBar1.add(jMenuCadastrarFuncionario);

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/pesquisar48.png"))); // NOI18N
        jMenu1.setText("Listar");

        jMenuListarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/ClienteAdd.png"))); // NOI18N
        jMenuListarCliente.setText("Cliente");
        jMenuListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarClienteActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListarCliente);

        jMenuListarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/FuncionarioAdd.png"))); // NOI18N
        jMenuListarFuncionario.setText("Funcionario");
        jMenuListarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListarFuncionario);

        jMenuListarMedicamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/MedicamentoAdd.png"))); // NOI18N
        jMenuListarMedicamento.setText("Medicamento");
        jMenuListarMedicamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuListarMedicamentoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuListarMedicamento);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Venda48.png"))); // NOI18N
        jMenu2.setText("Vendas");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/cestinha32.png"))); // NOI18N
        jMenuItem1.setText("Efetuar Vendas");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Relatorio48.png"))); // NOI18N
        jMenu3.setText("Relatórios");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Relatorio32.png"))); // NOI18N
        jMenuItem2.setText("Relatório");
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Java48.png"))); // NOI18N
        jMenu4.setText("Sobre");

        jMenuDesenvolvedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Aluno32.png"))); // NOI18N
        jMenuDesenvolvedores.setText("Desenvolvedores");
        jMenuDesenvolvedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuDesenvolvedoresActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuDesenvolvedores);

        jMenuBar1.add(jMenu4);

        jMenuSairSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Sair48.png"))); // NOI18N
        jMenuSairSistema.setText("Sair");
        jMenuSairSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairSistemaActionPerformed(evt);
            }
        });

        jMenuFecharSistema.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/ufmt/ic/sistema_farmacia/icones/Sair32.png"))); // NOI18N
        jMenuFecharSistema.setText("Fechar o Sistema_Farmacia");
        jMenuFecharSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuFecharSistemaActionPerformed(evt);
            }
        });
        jMenuSairSistema.add(jMenuFecharSistema);

        jMenuBar1.add(jMenuSairSistema);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelUser)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelData)
                        .addGap(68, 68, 68)
                        .addComponent(jLabelHora))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabelUser)
                    .addComponent(jLabelData)
                    .addComponent(jLabelHora))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1091, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarClienteActionPerformed
        // TODO add your handling code here:
        
        FrmCadastroCliente frmcliente = new FrmCadastroCliente();
        frmcliente.setVisible(true);
        
    }//GEN-LAST:event_jMenuCadastrarClienteActionPerformed

    private void CadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        
        FrmCadastroFuncionario frmfun = new FrmCadastroFuncionario();
        frmfun.setVisible(true);
                
    }//GEN-LAST:event_CadastrarFuncionarioActionPerformed

    private void jMenuSairSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairSistemaActionPerformed
        // TODO add your handling code here:
                     
    }//GEN-LAST:event_jMenuSairSistemaActionPerformed

    private void jMenuDesenvolvedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuDesenvolvedoresActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"UFMT - Instituto de Computação"+"\n"+"Projeto Final da disciplina Algoritmos III"+"\n"+
                "Prof.MSc. Jivago Medeiros"+"\n Alunos:\n"+"Wanderson de Almeida Timóteo"+"\n"+"Roberto Passos"+"\n"+"Rodrigo Moura");
    }//GEN-LAST:event_jMenuDesenvolvedoresActionPerformed

    private void jMenuFecharSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuFecharSistemaActionPerformed
        // TODO add your handling code here:
        
        System.exit(0);
        
    }//GEN-LAST:event_jMenuFecharSistemaActionPerformed

    private void jMenuCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarFuncionarioActionPerformed
        // TODO add your handling code here:
        FrmCadastroFuncionario frmfun = new FrmCadastroFuncionario();
        frmfun.setVisible(true);
        
    }//GEN-LAST:event_jMenuCadastrarFuncionarioActionPerformed

    private void jMenuCadastrarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarMedicamentoActionPerformed
        // TODO add your handling code here:
        
        FrmCadastroMedicamento novoMedic = new FrmCadastroMedicamento();
        //jDesktopPane1.add(novoMedic);
        novoMedic.setVisible(true);
        
    }//GEN-LAST:event_jMenuCadastrarMedicamentoActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        
        FrmVenda venda = new FrmVenda();
        venda.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarClienteActionPerformed
        // TODO add your handling code here:
        
        FrmListaCliente listaCliente = new FrmListaCliente();
        listaCliente.setVisible(true);
        
    }//GEN-LAST:event_jMenuListarClienteActionPerformed

    private void jMenuListarMedicamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarMedicamentoActionPerformed
        // TODO add your handling code here:
        
        FrmListaMedicamento listaMedicamento = new FrmListaMedicamento();
        listaMedicamento.setVisible(true);
        
    }//GEN-LAST:event_jMenuListarMedicamentoActionPerformed

    private void jMenuListarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuListarFuncionarioActionPerformed
        // TODO add your handling code here:
        
        FrmListaFuncionario listaFuncionario = new FrmListaFuncionario();
        listaFuncionario.setVisible(true);
        
    }//GEN-LAST:event_jMenuListarFuncionarioActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCRUD.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCRUD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CadastrarFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCadastrarCliente;
    private javax.swing.JMenu jMenuCadastrarFuncionario;
    private javax.swing.JMenuItem jMenuCadastrarMedicamento;
    private javax.swing.JMenuItem jMenuDesenvolvedores;
    private javax.swing.JMenuItem jMenuFecharSistema;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuListarCliente;
    private javax.swing.JMenuItem jMenuListarFuncionario;
    private javax.swing.JMenuItem jMenuListarMedicamento;
    private javax.swing.JMenu jMenuSairSistema;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
