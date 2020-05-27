/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import static biblioteca.Biblioteca.con;
import biblioteca.Emprestimo;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda
 */
public class TelaDeEmprestimos extends javax.swing.JInternalFrame {

 DefaultTableModel dtm = new DefaultTableModel(
                
            new Object[][]{},
            new Object[]{"Código", "Nome", "CPF","Título do Livro"})
        {  
         boolean[] canEdit = new boolean []{    
             false, false, false,false
         };    
         @Override    
         public boolean isCellEditable(int rowIndex, int columnIndex) {    
             return canEdit [columnIndex];    
         }  
 };
    public TelaDeEmprestimos() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbEmprestimos = new javax.swing.JTable();
        lbLvEmprestimos = new javax.swing.JLabel();
        btnListarEmprestimos = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        tbEmprestimos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Título do Livro"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbEmprestimos);
        if (tbEmprestimos.getColumnModel().getColumnCount() > 0) {
            tbEmprestimos.getColumnModel().getColumn(0).setResizable(false);
            tbEmprestimos.getColumnModel().getColumn(0).setPreferredWidth(50);
        }

        lbLvEmprestimos.setText("Empréstimos");
        lbLvEmprestimos.setFont(new Font("Courier", Font.BOLD, 20));

        btnListarEmprestimos.setText("LISTA");
        btnListarEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarEmprestimosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLvEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnListarEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLvEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnListarEmprestimos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formAncestorAdded

    private void btnListarEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarEmprestimosActionPerformed

try {
            /* Criando um ArrayList<Emprestimo> vazio
             para receber o ArrayList com os dados */
            ArrayList<Emprestimo> listaLivro = new ArrayList();
            listaLivro = Emprestimo.buscarTodos();  
            /* Limpando qualquer dado existente 
             na tabela */
            limparTabela();
            /* For que preenche o modelo de tabela (dtm) buscando 
               dados do ArrayList chamado p. */
            for (int i = 0; i < listaLivro.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(listaLivro.get(i).getAluno().getId()),
                    String.valueOf(listaLivro.get(i).getAluno().getNome()),
                    String.valueOf(listaLivro.get(i).getAluno().getCpf()),
                    String.valueOf(listaLivro.get(i).getLivro().getTitulo()),
                   
                });
            }//fecha for
            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            tbEmprestimos.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
            con.desconecta();
        }
    }//GEN-LAST:event_btnListarEmprestimosActionPerformed
        private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
         linhas para zero no default table model */
        dtm.setNumRows(0);}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnListarEmprestimos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLvEmprestimos;
    private javax.swing.JTable tbEmprestimos;
    // End of variables declaration//GEN-END:variables
}
