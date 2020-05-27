/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import static biblioteca.Biblioteca.con;
import biblioteca.Emprestimo;
import biblioteca.Livro;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernanda
 */
public class TelaLivrosCadastrados extends javax.swing.JInternalFrame {

DefaultTableModel dtm = new DefaultTableModel(
                
            new Object[][]{},
            new Object[]{"Código Livro", "Título", "Autor","Editora","Lançamento","Edição"})
        {  
         boolean[] canEdit = new boolean []{    
             false, false, false,false
         };    
         @Override    
         public boolean isCellEditable(int rowIndex, int columnIndex) {    
             return canEdit [columnIndex];    
         }  
 };
    public TelaLivrosCadastrados() {
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
        tbLvCadastrados = new javax.swing.JTable();
        lbLvDisponiveis = new javax.swing.JLabel();
        btnLvCadastrados = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);

        tbLvCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Livro", "Título", "Autor", "Editora", "Lançamento", "Edição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbLvCadastrados);
        if (tbLvCadastrados.getColumnModel().getColumnCount() > 0) {
            tbLvCadastrados.getColumnModel().getColumn(0).setResizable(false);
            tbLvCadastrados.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbLvCadastrados.getColumnModel().getColumn(1).setResizable(false);
            tbLvCadastrados.getColumnModel().getColumn(2).setResizable(false);
            tbLvCadastrados.getColumnModel().getColumn(3).setResizable(false);
            tbLvCadastrados.getColumnModel().getColumn(4).setResizable(false);
            tbLvCadastrados.getColumnModel().getColumn(5).setResizable(false);
            tbLvCadastrados.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        lbLvDisponiveis.setText("LIVROS CADASTRADOS");
        lbLvDisponiveis.setFont(new Font("Courier", Font.BOLD, 20));

        btnLvCadastrados.setText("Listar");
        btnLvCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLvCadastradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbLvDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLvCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLvDisponiveis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLvCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLvCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLvCadastradosActionPerformed
        try {
            /* Criando um ArrayList<Emprestimo> vazio
             para receber o ArrayList com os dados */
            ArrayList<Livro> listaLivro = new ArrayList();
            listaLivro = Livro.buscarTodos();  
            /* Limpando qualquer dado existente 
             na tabela */
            limparTabela();
            /* For que preenche o modelo de tabela (dtm) buscando 
               dados do ArrayList chamado p. */
            for (int i = 0; i < listaLivro.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(listaLivro.get(i).getId()),
                    String.valueOf(listaLivro.get(i).getTitulo()),
                    String.valueOf(listaLivro.get(i).getAutor()),
                    String.valueOf(listaLivro.get(i).getEditora()),
                    String.valueOf(listaLivro.get(i).getDataLancamento()),
                    String.valueOf(listaLivro.get(i).getEdicao()),
                   
                });
            }//fecha for
            /* Adicionando o modelo de tabela 
             com os dados na tabela produto */
            tbLvCadastrados.setModel(dtm);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Erro! " + e.getMessage());
            con.desconecta();
        }
    }//GEN-LAST:event_btnLvCadastradosActionPerformed
        private void limparTabela() {
        /* Para limpar a tabela temos que setar o número de
         linhas para zero no default table model */
        dtm.setNumRows(0);}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLvCadastrados;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbLvDisponiveis;
    private javax.swing.JTable tbLvCadastrados;
    // End of variables declaration//GEN-END:variables
}
