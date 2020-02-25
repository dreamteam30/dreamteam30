/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface_agency;

import Business.Airliners;
import Business.Customer;
import Business.Flight;
import Business.MapStore;
import Business.Seat;
import Business.Ticket;
import com.sun.org.apache.bcel.internal.generic.FNEG;
import java.awt.CardLayout;
import java.awt.List;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author zhanghaojie
 */
public class ReserveJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReserveJPanel
     */
    private JPanel XJpanel;
    private MapStore mapstore;
    private Airliners airliners;
    
    public ReserveJPanel(JPanel XJpanel, MapStore mapstore, Airliners airliners) {
        initComponents();
        
//        java.util.List<Customer> i = new ArrayList<>(mapstore.getInstance().getCustomer().values());
//        java.util.List<Airliners> i2 = new ArrayList<>(mapstore.getInstance().getAirlinerMap().values());
//       
//        
        this.XJpanel = XJpanel;
        this.mapstore= mapstore;
        this.airliners = airliners;
        flightTextField1.setText(airliners.getAirlinerNumber());
        flightTextField1.setEditable(false);
//        System.out.println(i.get(0));
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        flightTextField1 = new javax.swing.JTextField();
        reservejButton = new javax.swing.JButton();
        flightTextField2 = new javax.swing.JTextField();
        flightTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 15)); // NOI18N
        jLabel1.setText("Flight Number :");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 2, 15)); // NOI18N
        jLabel2.setText("Seat Number:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 2, 15)); // NOI18N
        jLabel4.setText("Customer  ID:");

        reservejButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        reservejButton.setText("Reserve");
        reservejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reservejButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(flightTextField1)
                        .addComponent(flightTextField2)
                        .addComponent(flightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(flightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(flightTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flightTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(reservejButton)
                .addContainerGap(148, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void reservejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservejButtonActionPerformed
       
        
            int cID;
            int TID=airliners.getTicketcount();
            String flightnumber; 
            String seatnumber;
        
            cID = Integer.parseInt(flightTextField.getText());
            flightnumber= flightTextField1.getText(); 
            seatnumber= flightTextField2.getText();
         
            Ticket T = new Ticket(TID, cID, flightnumber, seatnumber);
            Map<Integer, Ticket> ticketmap= MapStore.getInstance().getTicketmap();       
//            if(!ticketmap.containsKey(cID)){
            ticketmap.put(TID, T);
            airliners.setTicketcount(TID++);
            JOptionPane.showMessageDialog(null, "Create successfully");
            
//        }else{
//            JOptionPane.showMessageDialog(null, "ID is already created");
//        }
       
       
    }//GEN-LAST:event_reservejButtonActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField flightTextField;
    private javax.swing.JTextField flightTextField1;
    private javax.swing.JTextField flightTextField2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton reservejButton;
    // End of variables declaration//GEN-END:variables
}