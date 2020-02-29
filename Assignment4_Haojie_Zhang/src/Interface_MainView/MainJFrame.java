/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_MainView;

import Business.MapStore;

import Interface_agency.TravelManageJPanel;
import Interface_airliner.AirlineManageJpanel;
import Interface_customer.CustomerManageJPanel;
import java.awt.CardLayout;

/**
 *
 * @author zhanghaojie
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private MapStore mapstore;
    public MainJFrame() {
        initComponents();
//        this.mapstore = TravelAgency.getTravelInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splitPane = new javax.swing.JSplitPane();
        BtnJPanel = new javax.swing.JPanel();
        TAjButton = new javax.swing.JButton();
        RAjButton = new javax.swing.JButton();
        MCjButton = new javax.swing.JButton();
        MainJPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TAjButton.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        TAjButton.setText("Travel Agency");
        TAjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TAjButtonActionPerformed(evt);
            }
        });

        RAjButton.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        RAjButton.setText("Register Airliners");
        RAjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAjButtonActionPerformed(evt);
            }
        });

        MCjButton.setFont(new java.awt.Font("Lucida Grande", 3, 18)); // NOI18N
        MCjButton.setText("Manage Customers");
        MCjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MCjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BtnJPanelLayout = new javax.swing.GroupLayout(BtnJPanel);
        BtnJPanel.setLayout(BtnJPanelLayout);
        BtnJPanelLayout.setHorizontalGroup(
            BtnJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtnJPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BtnJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TAjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RAjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MCjButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))
                .addContainerGap())
        );
        BtnJPanelLayout.setVerticalGroup(
            BtnJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BtnJPanelLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(TAjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(RAjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(MCjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        splitPane.setLeftComponent(BtnJPanel);

        MainJPanel.setForeground(new java.awt.Color(102, 102, 102));
        MainJPanel.setLayout(new java.awt.CardLayout());
        splitPane.setRightComponent(MainJPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(splitPane, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TAjButtonActionPerformed
       
        try { 
            MainJPanel.add(new TravelManageJPanel(MainJPanel, mapstore));
            CardLayout cLayout = (CardLayout) MainJPanel.getLayout();
            cLayout.next(MainJPanel);
            
        } catch (Exception e) {
        }
       
    }//GEN-LAST:event_TAjButtonActionPerformed

    private void RAjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAjButtonActionPerformed
        MainJPanel.add(new AirlineManageJpanel(MainJPanel, mapstore));
        CardLayout cLayout = (CardLayout) MainJPanel.getLayout();
        cLayout.next(MainJPanel);
    }//GEN-LAST:event_RAjButtonActionPerformed

    private void MCjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MCjButtonActionPerformed
        MainJPanel.add(new CustomerManageJPanel(MainJPanel, mapstore));
        CardLayout cLayout = (CardLayout) MainJPanel.getLayout();
        cLayout.next(MainJPanel);
    }//GEN-LAST:event_MCjButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BtnJPanel;
    private javax.swing.JButton MCjButton;
    private javax.swing.JPanel MainJPanel;
    private javax.swing.JButton RAjButton;
    private javax.swing.JButton TAjButton;
    private javax.swing.JSplitPane splitPane;
    // End of variables declaration//GEN-END:variables
}