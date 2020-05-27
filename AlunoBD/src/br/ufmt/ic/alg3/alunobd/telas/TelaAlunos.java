/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufmt.ic.alg3.alunobd.telas;

import br.ufmt.ic.alg3.alunobd.AlunoBD;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda
 */

public class TelaAlunos extends javax.swing.JInternalFrame {
    public AlunoBD aluno;

        DefaultTableModel dtm = new DefaultTableModel(
                
            new Object[][]{},
            new Object[]{"Código", "Nome", "Endereço", "CPF", "Idade"})
        {  
         boolean[] canEdit = new boolean []{    
             false, false, false,false,false
         };    
         @Override    
         public boolean isCellEditable(int rowIndex, int columnIndex) {    
             return canEdit [columnIndex];    
         }  
 };
    public TelaAlunos() {
        initComponents();
        aluno = new AlunoBD();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbAlunos = new javax.swing.JTable();
        lbAlunosCadastrados = new javax.swing.JLabel();
        btnListarAlunos = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        tbAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Endereço", "CPF", "Idade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbAlunos);
        if (tbAlunos.getColumnModel().getColumnCount() > 0) {
            tbAlunos.getColumnModel().getColumn(0).setResizable(false);
            tbAlunos.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        lbAlunosCadastrados.setText("Lista de Alunos");
        lbAlunosCadastrados.setFont(new Font("Courier", Font.BOLD, 20));

        btnListarAlunos.setText("Listar");
        btnListarAlunos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarAlunosActionPerformed(evt);
            }
        });

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formularios/Icones/book_delete.png"))); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbAlunosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAlunosCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListarAlunos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListarAlunosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarAlunosActionPerformed

            
        
try {
            /* Criando um ArrayList<Emprestimo> vazio
             para receber o ArrayList com os dados */
             ArrayList<AlunoBD> listaAluno = new ArrayList();
             listaAluno = AlunoBD.buscarTodos(); 
            /* Limpando qualquer dado existente 
             na tabela */
            limparTabela();
            /* For que preenche o modelo de tabela (dtm) buscando 
               dados do ArrayList chamado p. */
            for (int i = 0; i < listaAluno.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(listaAluno.get(i).getId()),
                    String.valueOf(listaAluno.get(i).getNome()),
                    String.valueOf(listaAluno.get(i).getEndereco()),
                    String.valueOf(listaAluno.get(i).getCpf()),
                    String.valueOf(listaAluno.get(i).getIdade()),
                   
                });
            }//fecha for
            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            tbAlunos.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
            con.desconecta();
        }
    }//GEN-LAST:event_btnListarAlunosActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
    int k = tbAlunos.getSelectedRow();
    String id = (String) tbAlunos.getValueAt(k, 0);    
    int resposta = 0;
    resposta = JOptionPane.showConfirmDialog (null, "Certeza que deseja excluir?","Confirmação", resposta);       
    if(resposta == JOptionPane.YES_OPTION) {            
        aluno.buscar(Integer.parseInt(id));
        
        aluno.excluir();
        
        if (tbAlunos.getSelectedRow() >= 0){
            dtm.removeRow(tbAlunos.getSelectedRow());
        }
    }

    }//GEN-LAST:event_btnExcluirActionPerformed
        private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
         linhas para zero no default table model */
        dtm.setNumRows(0);}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListarAlunos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAlunosCadastrados;
    private javax.swing.JTable tbAlunos;
    // End of variables declaration//GEN-END:variables

    private static class con {

        private static void desconecta() {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public con() {
        }
    }
}
