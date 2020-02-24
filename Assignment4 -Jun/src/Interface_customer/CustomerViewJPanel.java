/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_customer;

import Business.Airliners;
import Business.Customer;
import Business.MapStore;
import Business.Ticket;
import java.awt.CardLayout;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author wang
 */
public class CustomerViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerViewJPanel
     */
    private JPanel RightJPanel;
    private Customer customer;
    private MapStore mapstore;
    public CustomerViewJPanel(JPanel RightJPanel,MapStore mapstore,Customer customer) {
        initComponents();
        this.RightJPanel = RightJPanel;
        this.customer = customer;
         this.mapstore= mapstore;
//        this.mapstore = mapstore;
        populate();
        System.out.println("Interface_customer.CustomerViewJPanel.<init>()");
    }
    
   private void populate() {
        AirlinerTable.removeAll();
            DefaultTableModel dtm= (DefaultTableModel)AirlinerTable.getModel();
            dtm.setRowCount(0);
               
            
                for (Map.Entry<Integer, Ticket> T : mapstore.getInstance().getTicketmap().entrySet()) {
                     Ticket ticket = T.getValue();
                               
//                        Customer a = mapstore.getInstance().getCustomer();

                   if(customer.getUserID()==ticket.getCustomerID()){
          
                    Object[]row = new Object[dtm.getColumnCount()];
                   row [0] = customer.getUserID();
                    row [1] = ticket.getFN();
                    row [2] = ticket.getSN();

                    dtm.addRow(row);
                
                     System.out.println("Interface_airliner.AirlineManageJpanel.populate()");
                
                }
                    
                }
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
        BackBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        AirlinerTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText("View  Customer");

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        AirlinerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "User number", "Flight number", "SeatNumber", "Departure City", "Arrival City"
            }
        ));
        jScrollPane2.setViewportView(AirlinerTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(BackBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(BackBtn))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        RightJPanel.remove(this);
        CardLayout cLayout = (CardLayout) RightJPanel.getLayout();
        cLayout.previous(RightJPanel);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable AirlinerTable;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
