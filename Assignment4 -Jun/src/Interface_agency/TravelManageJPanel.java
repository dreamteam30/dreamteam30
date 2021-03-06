/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_agency;

import Business.MapStore;
import Business.TravelAgency;
import Interface_customer.CustomerInformationJPanel;
//import Interface_airliner.AirlinerInfoJPanel;
//import Interface_customer.CustomerInfoJPanel;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author zhanghaojie
 */
  
public class TravelManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TravelManageJPanel
     */
    private JPanel XJpanel;
  
    private MapStore mapstore;
    public TravelManageJPanel (JPanel XJpanel, MapStore mapstore) {
        initComponents();
        this.XJpanel = XJpanel;
        this.mapstore=mapstore;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airlinerjButton = new javax.swing.JButton();
        customerjButton = new javax.swing.JButton();

        airlinerjButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        airlinerjButton.setText("One-Way");
        airlinerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                airlinerjButtonActionPerformed(evt);
            }
        });

        customerjButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        customerjButton.setText("Multiple-City");
        customerjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(customerjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(airlinerjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(airlinerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(customerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void airlinerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_airlinerjButtonActionPerformed
       this.XJpanel.add(new AirlinerInfoJPanel(this.XJpanel, mapstore));
        CardLayout cLayout = (CardLayout) this.XJpanel.getLayout();
        cLayout.next(this.XJpanel);
    }//GEN-LAST:event_airlinerjButtonActionPerformed

    private void customerjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerjButtonActionPerformed
       this.XJpanel.add(new MultiCityMode(this.XJpanel, mapstore));
        CardLayout cLayout = (CardLayout) this.XJpanel.getLayout();
        cLayout.next(this.XJpanel);
    }//GEN-LAST:event_customerjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton airlinerjButton;
    private javax.swing.JButton customerjButton;
    // End of variables declaration//GEN-END:variables
}
