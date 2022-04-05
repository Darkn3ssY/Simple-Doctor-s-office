
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author pc
 */
public class Traitement extends javax.swing.JFrame {

   Connection con ; 
   PreparedStatement pst ; 
   ResultSet rs ; 
   
    public Traitement() {
        initComponents();
       table(); 
    }

      public void Connect(){ 
        try {
         Class.forName("org.sqlite.JDBC"); 
         con = DriverManager.getConnection("jdbc:sqlite:cabinete.db");
    } catch(Exception e ){ 
           e.printStackTrace(); 

} 
 } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        buttonGradient22 = new ButtonGradient2();
        buttonGradient23 = new ButtonGradient2();
        jLabel3 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtprix = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtdose = new javax.swing.JTextField();
        txtmedicament = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        buttonGradient37 = new ButtonGradient2();
        buttonGradient38 = new ButtonGradient2();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setBackground(new java.awt.Color(255, 204, 204));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setRowHeight(26);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        buttonGradient22.setText("RETOUR");
        buttonGradient22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient22ActionPerformed(evt);
            }
        });

        buttonGradient23.setText("SUPPRIMER");
        buttonGradient23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient23ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NOM ");

        txtnom.setBackground(new java.awt.Color(0, 204, 204));
        txtnom.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtnom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtnom.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PRIX");

        txtprix.setBackground(new java.awt.Color(0, 204, 204));
        txtprix.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtprix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprix.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtprix.setCaretColor(new java.awt.Color(255, 255, 255));
        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DOSE");

        txtdose.setBackground(new java.awt.Color(0, 204, 204));
        txtdose.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtdose.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtdose.setCaretColor(new java.awt.Color(255, 255, 255));
        txtdose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdoseActionPerformed(evt);
            }
        });

        txtmedicament.setBackground(new java.awt.Color(0, 204, 204));
        txtmedicament.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtmedicament.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtmedicament.setCaretColor(new java.awt.Color(255, 255, 255));
        txtmedicament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmedicamentActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("MEDICAMENT");

        buttonGradient37.setText("ACTUALISER");
        buttonGradient37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient37ActionPerformed(evt);
            }
        });

        buttonGradient38.setText("AJOUTER");
        buttonGradient38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient38ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRAITEMENT");

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 255));
        jLabel2.setText("N'EST PAS ALERGIE AVEC LE MEDICAMENT");

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 255));
        jLabel6.setText("PRESCRIT POUR CE TRAITEMENT MERCI !!");

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 255));
        jLabel7.setText("FAUT TOUJOURS VERIFUER SI LE PATIENT ");

        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TABIB CABINET MEDICAL ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(buttonGradient37, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(buttonGradient38, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addComponent(jLabel8)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonGradient22, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtmedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonGradient23, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(225, 225, 225))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 639, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addComponent(buttonGradient38, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonGradient23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonGradient37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGradient22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGradient38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient38ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("insert into traitement(nom,prix,dose,medicament)"
                + " values(?,?,?,?)");
            pst.setString(1,txtnom.getText().toUpperCase());
            pst.setString(2,txtprix.getText().toUpperCase());
            pst.setString(3,txtdose.getText().toUpperCase());
            pst.setString(4,txtmedicament.getText().toUpperCase());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null , "Traitement Ajouté");
            table();
        } catch(Exception e ){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERREUR"+e.getMessage());
        }
    }//GEN-LAST:event_buttonGradient38ActionPerformed

    private void buttonGradient37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient37ActionPerformed
        txtnom.setText("");
        txtdose.setText("");
        txtmedicament.setText("");
        txtprix.setText("");
        
    }//GEN-LAST:event_buttonGradient37ActionPerformed

    private void txtmedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicamentActionPerformed

    private void txtdoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoseActionPerformed

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void buttonGradient23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient23ActionPerformed
        try {
            Connect();
            pst = con.prepareStatement("delete from traitement where code=?");
            int code = jTable1.getSelectedRow();
            String selectionner = (String) jTable1.getValueAt(code, 0);
            pst.setString(1, selectionner);
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(null, "Traitement est  Supprimé");
            table();

        } catch(Exception e){

            e.printStackTrace();
        }
    }//GEN-LAST:event_buttonGradient23ActionPerformed

    private void buttonGradient22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient22ActionPerformed
        Traitement.super.dispose();
        MenuPrincipale mp = new MenuPrincipale();
        mp.setVisible(true);
    }//GEN-LAST:event_buttonGradient22ActionPerformed

        public void table (){
              String []patient = {"CODE","NOM","PRIX","DOSE","MEDICAMENT"};
             String []montrer = new String[6];
             DefaultTableModel model = new DefaultTableModel(null,patient) ;
             String sql = "select * from traitement " ;     
              try {
               Connect() ; 
                Statement st = con.createStatement();
                rs = st.executeQuery(sql); 
                while(rs.next()){
                montrer[0] =rs.getString("code");
                montrer[1] =rs.getString("nom");
                montrer[2] =rs.getString("prix");
                montrer[3] =rs.getString("dose");
                montrer[4] =rs.getString("medicament");
                
                model.addRow(montrer); 
        


 
} 
                jTable1.setModel(model);
                 con.close();  
              
             
} catch(Exception e ){
      e.printStackTrace();
}  
 
}   
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
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ButtonGradient2 buttonGradient22;
    private ButtonGradient2 buttonGradient23;
    private ButtonGradient2 buttonGradient37;
    private ButtonGradient2 buttonGradient38;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtdose;
    private javax.swing.JTextField txtmedicament;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtprix;
    // End of variables declaration//GEN-END:variables
}
