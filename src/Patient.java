
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
public class Patient extends javax.swing.JFrame {

   Connection con ; 
   PreparedStatement pst ; 
   ResultSet rs ; 
   
    public Patient() {
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
        txtadresse = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelephone = new javax.swing.JTextField();
        txtdat = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtsexe = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtalergie = new javax.swing.JTextField();
        buttonGradient37 = new ButtonGradient2();
        buttonGradient38 = new ButtonGradient2();
        jLabel1 = new javax.swing.JLabel();

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
        jLabel3.setText("NOM : ");

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
        jLabel4.setText("ADRESSE : ");

        txtadresse.setBackground(new java.awt.Color(0, 204, 204));
        txtadresse.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtadresse.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtadresse.setCaretColor(new java.awt.Color(255, 255, 255));
        txtadresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtadresseActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("TELEPHONE :");

        txttelephone.setBackground(new java.awt.Color(0, 204, 204));
        txttelephone.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txttelephone.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txttelephone.setCaretColor(new java.awt.Color(255, 255, 255));
        txttelephone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelephoneActionPerformed(evt);
            }
        });

        txtdat.setBackground(new java.awt.Color(0, 204, 204));
        txtdat.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtdat.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtdat.setCaretColor(new java.awt.Color(255, 255, 255));
        txtdat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdatActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("DATE DE NAISSANCE : ");

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("SEXE :");

        txtsexe.setBackground(new java.awt.Color(0, 204, 204));
        txtsexe.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtsexe.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtsexe.setCaretColor(new java.awt.Color(255, 255, 255));
        txtsexe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsexeActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("ALERGIE :");

        txtalergie.setBackground(new java.awt.Color(0, 204, 204));
        txtalergie.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtalergie.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtalergie.setCaretColor(new java.awt.Color(255, 255, 255));
        txtalergie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalergieActionPerformed(evt);
            }
        });

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
        jLabel1.setText("GESTION DE PATIENTS");

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
                    .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsexe, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(263, 263, 263))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtalergie, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonGradient22, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdat, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonGradient23, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
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
                                    .addComponent(txtdat, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(buttonGradient38, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(buttonGradient23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtsexe, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtadresse, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtalergie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelephone, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(buttonGradient37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonGradient22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
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

    private void buttonGradient22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient22ActionPerformed
       Patient.super.dispose(); 
       MenuPrincipale mp = new MenuPrincipale(); 
       mp.setVisible(true);
    }//GEN-LAST:event_buttonGradient22ActionPerformed

    private void buttonGradient23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient23ActionPerformed
            try {
        Connect(); 
        pst = con.prepareStatement("delete from patient where code=?");
        int code = jTable1.getSelectedRow(); 
        String selectionner = (String) jTable1.getValueAt(code, 0); 
        pst.setString(1, selectionner); 
        pst.executeUpdate(); 
        con.close(); 
        JOptionPane.showMessageDialog(null, "Patient Supprimé");
        table(); 

} catch(Exception e){

    e.printStackTrace();
}         
    }//GEN-LAST:event_buttonGradient23ActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtadresseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtadresseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtadresseActionPerformed

    private void txttelephoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelephoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelephoneActionPerformed

    private void txtdatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdatActionPerformed

    private void txtsexeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsexeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsexeActionPerformed

    private void txtalergieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalergieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalergieActionPerformed

    private void buttonGradient37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient37ActionPerformed
        txtnom.setText("");
        txttelephone.setText("");
        txtdat.setText("");
        txtadresse.setText("");
        txtsexe.setText("");
        txtalergie.setText("");

    }//GEN-LAST:event_buttonGradient37ActionPerformed

    private void buttonGradient38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient38ActionPerformed
        try {
        Connect(); 
        pst = con.prepareStatement("insert into patient(nom,telephone,adresse,dat,sexe,alergie)"
       + " values(?,?,?,?,?,?)");    // kandekhlo les valeurs 
       pst.setString(1,txtnom.getText().toUpperCase());
       pst.setString(2,txtadresse.getText().toUpperCase());
       pst.setString(3,txttelephone.getText().toUpperCase());
       pst.setString(4,txtdat.getText().toUpperCase());
       pst.setString(5,txtsexe.getText().toUpperCase());
       pst.setString(6,txtalergie.getText().toUpperCase());
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null , "Patient Ajouté");  
       table();    
} catch(Exception e ){
       e.printStackTrace();
       JOptionPane.showMessageDialog(null,"ERREUR"+e.getMessage()); 
}  
    }//GEN-LAST:event_buttonGradient38ActionPerformed

        public void table (){
              String []patient = {"CODE","NOM","TELEPHONE","ADRESSE","DATE","SEXE","ALERGIE"};
             String []montrer = new String[7];
             DefaultTableModel model = new DefaultTableModel(null,patient) ;
             String sql = "select * from patient " ;     
              try {
               Connect() ; 
                Statement st = con.createStatement();
                rs = st.executeQuery(sql); 
                while(rs.next()){
                montrer[0] =rs.getString("code");
                montrer[1] =rs.getString("nom");
                montrer[2] =rs.getString("telephone");
                montrer[3] =rs.getString("adresse");
                montrer[4] =rs.getString("dat");
                montrer[5] =rs.getString("sexe");
                montrer[6] =rs.getString("alergie");
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
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtadresse;
    private javax.swing.JTextField txtalergie;
    private javax.swing.JTextField txtdat;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtsexe;
    private javax.swing.JTextField txttelephone;
    // End of variables declaration//GEN-END:variables
}
