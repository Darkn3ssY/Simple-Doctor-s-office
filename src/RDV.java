
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
public class RDV extends javax.swing.JFrame {

   Connection con ; 
   PreparedStatement pst ; 
   ResultSet rs ; 
   
    public RDV() {
        initComponents();
       
       patient(); 
       table(); 
    }

    public void patient(){ 
        try { 
        Connect(); 
        String sql = "select nom from patient";
        pst = con.prepareStatement(sql);
        

     
        rs = pst.executeQuery(); 
        while (rs.next()){
            txtpatient.addItem(rs.getString("nom"));
}
    con.close();
} catch(Exception e){
     e.printStackTrace();
}
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
        jLabel4 = new javax.swing.JLabel();
        txtalergie = new javax.swing.JTextField();
        buttonGradient37 = new ButtonGradient2();
        buttonGradient38 = new ButtonGradient2();
        jLabel1 = new javax.swing.JLabel();
        txtpatient = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rDVbotton1 = new RDVbotton();
        jLabel7 = new javax.swing.JLabel();
        txtheure = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtdate = new javax.swing.JFormattedTextField();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTable1MouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
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
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Patient");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("ALERGIE:");

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
        jLabel1.setText("GESTION DES RENDEZ-VOUS");

        txtpatient.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("DATE");

        rDVbotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDVbotton1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("HEURE");

        txtheure.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtheure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8H", "9H", "10H", "11H", "13H", "14H", "15H", "16H", " " }));

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("N'HESITEZ A NOUS DEMENDER VOS SERVICES MERCI.");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("LES PATIENTS DOIVENT PRESENTER TOUJOURS LEURS TICKETS DE RENDEZ-VOUS MERCI.");

        txtdate.setBackground(new java.awt.Color(0, 204, 204));
        txtdate.setForeground(new java.awt.Color(255, 255, 255));
        try {
            txtdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtdate.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonGradient38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonGradient37, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtalergie, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(txtpatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rDVbotton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(txtheure, 0, 269, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                            .addComponent(txtdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonGradient22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonGradient23, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(31, 31, 31)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(445, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonGradient38, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGradient22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rDVbotton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtheure, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGradient37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGradient23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtalergie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(txtdate, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(346, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)))
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
       RDV.super.dispose();
       MenuPrincipale mp = new MenuPrincipale(); 
       mp.setVisible(true);
    }//GEN-LAST:event_buttonGradient22ActionPerformed

    private void buttonGradient23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient23ActionPerformed
            try {
        Connect(); 
        pst = con.prepareStatement("delete from RDV where code=?");
        int code = jTable1.getSelectedRow(); 
        String selectionner = (String) jTable1.getValueAt(code, 0); 
        pst.setString(1, selectionner); 
        pst.executeUpdate(); 
        con.close(); 
        JOptionPane.showMessageDialog(null, "Rendez-vous est Supprimé");
        table(); 

} catch(Exception e){

    e.printStackTrace();
}         
    }//GEN-LAST:event_buttonGradient23ActionPerformed

    private void txtalergieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalergieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalergieActionPerformed

    private void buttonGradient37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient37ActionPerformed
       txtalergie.setText("");
       txtdate.setText(""); 
   

    }//GEN-LAST:event_buttonGradient37ActionPerformed

    private void buttonGradient38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient38ActionPerformed
        try {
        Connect(); 
        pst = con.prepareStatement("insert into RDV(nom,alergie,heure,dat)"
       + " values(?,?,?,?)");
       pst.setString(1,txtpatient.getSelectedItem().toString().toUpperCase());
       pst.setString(2,txtalergie.getText().toUpperCase());
       pst.setString(3,txtdate.getText().toUpperCase());
       pst.setString(4,txtheure.getSelectedItem().toString().toUpperCase());
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null , "Rendez-vous est Ajouté");  
       table();    
} catch(Exception e ){
       e.printStackTrace();
       JOptionPane.showMessageDialog(null,"ERREUR"+e.getMessage()); 
}  
    }//GEN-LAST:event_buttonGradient38ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseReleased

    private void rDVbotton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDVbotton1ActionPerformed



try { 
        Connect(); 
        String sql = "select alergie from patient where nom=?";
        pst = con.prepareStatement(sql); 
        pst.setString(1,txtpatient.getSelectedItem().toString());
        rs = pst.executeQuery(); 
        while (rs.next()){
            txtalergie.setText(rs.getString("alergie"));
}
    con.close();
} catch(Exception e){
     e.printStackTrace();
}       
    }//GEN-LAST:event_rDVbotton1ActionPerformed

        public void table (){
              String []patient = {"CODE","PATIENT","HEURE","ALERGIE","DATE"};
             String []montrer = new String[5];
             DefaultTableModel model = new DefaultTableModel(null,patient) ;
             String sql = "select * from RDV " ;     
              try {
               Connect() ; 
                Statement st = con.createStatement();
                rs = st.executeQuery(sql); 
                while(rs.next()){
                montrer[0] =rs.getString("code");
                montrer[1] =rs.getString("nom");
                montrer[2] =rs.getString("heure");
                montrer[3] =rs.getString("date");         
                montrer[4] =rs.getString("alergie");
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private RDVbotton rDVbotton1;
    private javax.swing.JTextField txtalergie;
    private javax.swing.JFormattedTextField txtdate;
    private javax.swing.JComboBox<String> txtheure;
    private javax.swing.JComboBox<String> txtpatient;
    // End of variables declaration//GEN-END:variables
}
