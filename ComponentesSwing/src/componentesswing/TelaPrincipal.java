/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentesswing;

/**
 *
 * @author Jivago
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        barraDeMenuPrincipal = new javax.swing.JMenuBar();
        menuA = new javax.swing.JMenu();
        itemMenuAbrirPanel = new javax.swing.JMenuItem();
        menuB = new javax.swing.JMenu();
        itemMenuAbrirDialog = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuA.setText("Menu A");

        itemMenuAbrirPanel.setText("Abrir JPanel");
        itemMenuAbrirPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAbrirPanelActionPerformed(evt);
            }
        });
        menuA.add(itemMenuAbrirPanel);

        barraDeMenuPrincipal.add(menuA);

        menuB.setText("Menu B");

        itemMenuAbrirDialog.setText("Abrir JDialog");
        itemMenuAbrirDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMenuAbrirDialogActionPerformed(evt);
            }
        });
        menuB.add(itemMenuAbrirDialog);

        barraDeMenuPrincipal.add(menuB);

        setJMenuBar(barraDeMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemMenuAbrirPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAbrirPanelActionPerformed
        TelaJPanel panel = new TelaJPanel();
        panel.setVisible(true);
        this.setContentPane(panel);
        this.revalidate();
    }//GEN-LAST:event_itemMenuAbrirPanelActionPerformed

    private void itemMenuAbrirDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMenuAbrirDialogActionPerformed
        TelaJDialog dialog = new TelaJDialog(this,true);
        dialog.setVisible(true);
    }//GEN-LAST:event_itemMenuAbrirDialogActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraDeMenuPrincipal;
    private javax.swing.JMenuItem itemMenuAbrirDialog;
    private javax.swing.JMenuItem itemMenuAbrirPanel;
    private javax.swing.JMenu menuA;
    private javax.swing.JMenu menuB;
    // End of variables declaration//GEN-END:variables
}
