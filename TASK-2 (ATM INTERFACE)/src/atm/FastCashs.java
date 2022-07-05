/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package atm;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class FastCashs extends javax.swing.JFrame {

    /**
     * Creates new form FastCashs
     */
    public FastCashs() {
        initComponents();
    }

    int MyAccNum;
    public FastCashs(int AccNum) {
        initComponents();
        MyAccNum = AccNum;
       // AccNumLbl.setText(""+AccNum);
        GetBalance();
    }
Connection Con = null;
      PreparedStatement Add = null, Add1=null;
      ResultSet Rs = null,Rs1=null;
      Statement St = null,St1=null;
      int OldBalance;
    private void GetBalance()
    {
        String Query = "select * from Accounttbl where AccNum='"+MyAccNum+"'";
        try{
            Con = (Connection) conn.getCon();
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery(Query);
            if(Rs1.next()){
            OldBalance = Rs1.getInt(8);
            //BallLbl.setText("Rs"+OldBalance);
            }else
            {
            
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DepositBTN = new javax.swing.JButton();
        DepositBTN1 = new javax.swing.JButton();
        DepositBTN2 = new javax.swing.JButton();
        DepositBTN3 = new javax.swing.JButton();
        DepositBTN4 = new javax.swing.JButton();
        DepositBTN5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel2.setText("XYZ BANK");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 51));
        jLabel7.setText("X");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel4.setText("FAST CASH");

        DepositBTN.setBackground(new java.awt.Color(204, 255, 255));
        DepositBTN.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        DepositBTN.setText("Rs 100");
        DepositBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBTNMouseClicked(evt);
            }
        });

        DepositBTN1.setBackground(new java.awt.Color(204, 255, 255));
        DepositBTN1.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        DepositBTN1.setText("Rs 500");
        DepositBTN1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBTN1MouseClicked(evt);
            }
        });

        DepositBTN2.setBackground(new java.awt.Color(204, 255, 255));
        DepositBTN2.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        DepositBTN2.setText("Rs 1000");
        DepositBTN2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBTN2MouseClicked(evt);
            }
        });

        DepositBTN3.setBackground(new java.awt.Color(204, 255, 255));
        DepositBTN3.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        DepositBTN3.setText("Rs 2000");
        DepositBTN3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBTN3MouseClicked(evt);
            }
        });

        DepositBTN4.setBackground(new java.awt.Color(204, 255, 255));
        DepositBTN4.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        DepositBTN4.setText("Rs 5000");
        DepositBTN4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBTN4MouseClicked(evt);
            }
        });

        DepositBTN5.setBackground(new java.awt.Color(204, 255, 255));
        DepositBTN5.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        DepositBTN5.setText("Rs 10000");
        DepositBTN5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DepositBTN5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 51));
        jLabel6.setText("LOGOUT");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DepositBTN2)
                    .addComponent(DepositBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DepositBTN4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(DepositBTN5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(DepositBTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(DepositBTN3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(101, 101, 101))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositBTN)
                    .addComponent(DepositBTN1))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositBTN2)
                    .addComponent(DepositBTN3))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DepositBTN5)
                    .addComponent(DepositBTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DepositBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBTNMouseClicked
        if(OldBalance < 100)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = (Connection) conn.getCon();
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-100);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
               // new MainMenu().setVisible(true);
                this.dispose();
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");      
            }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
            }
    }//GEN-LAST:event_DepositBTNMouseClicked

    private void DepositBTN1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBTN1MouseClicked
       if(OldBalance < 500)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = (Connection) conn.getCon();
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-500);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
                this.dispose();
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");      
            }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
            }
    }//GEN-LAST:event_DepositBTN1MouseClicked

    private void DepositBTN2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBTN2MouseClicked
       if(OldBalance < 1000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = (Connection) conn.getCon();
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-1000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
                this.dispose();
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");      
            }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
            }
    }//GEN-LAST:event_DepositBTN2MouseClicked

    private void DepositBTN3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBTN3MouseClicked
        if(OldBalance < 2000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = (Connection) conn.getCon();
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-2000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
                this.dispose();
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");      
            }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
            }
    }//GEN-LAST:event_DepositBTN3MouseClicked

    private void DepositBTN4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBTN4MouseClicked
       if(OldBalance < 5000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = (Connection) conn.getCon();
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-5000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
                this.dispose();
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");      
            }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
            }
    }//GEN-LAST:event_DepositBTN4MouseClicked

    private void DepositBTN5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositBTN5MouseClicked
       if(OldBalance < 10000)
        {
            JOptionPane.showMessageDialog(this, "No Enough Balance");
        }
        {
            try{
            String Query = "Update AccountTbl set Balance=? where AccNum=?";
            Con = (Connection) conn.getCon();
            PreparedStatement ps = Con.prepareStatement(Query);
            ps.setInt(1, OldBalance-10000);
            ps.setInt(2,MyAccNum);
            if(ps.executeUpdate() == 1)
            {
                JOptionPane.showMessageDialog(this, "Balance Updated");
                new MainMenu().setVisible(true);
                this.dispose();
            }else
            {
              JOptionPane.showMessageDialog(this, "Missing Information");      
            }
            
            }catch(Exception e){
                JOptionPane.showMessageDialog(this, e);
            }
            }
    }//GEN-LAST:event_DepositBTN5MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        //new MainMenu().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       System.exit(1);
    }//GEN-LAST:event_jLabel7MouseClicked

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
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FastCashs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FastCashs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DepositBTN;
    private javax.swing.JButton DepositBTN1;
    private javax.swing.JButton DepositBTN2;
    private javax.swing.JButton DepositBTN3;
    private javax.swing.JButton DepositBTN4;
    private javax.swing.JButton DepositBTN5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
