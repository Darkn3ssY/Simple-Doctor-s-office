
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;


 
public class login extends javax.swing.JFrame {
 
       Connection con; 
       PreparedStatement pst ; 
       ResultSet rs  ;
 
 
    public login() {
        initComponents();
    }

    public void Connect(){    // connection to the database 
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        rSButtonIconIBeanInfo1 = new rojerusan.RSButtonIconIBeanInfo();
        rSButtonIconIBeanInfo2 = new rojerusan.RSButtonIconIBeanInfo();
        rSButtonIconIBeanInfo3 = new rojerusan.RSButtonIconIBeanInfo();
        rSCalendarBeanInfo1 = new rojeru_san.componentes.RSCalendarBeanInfo();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtnom = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        rSMaterialButtonCircle1 = new rojerusan.RSMaterialButtonCircle();
        jLabel8 = new javax.swing.JLabel();
        txtmdp = new javax.swing.JPasswordField();
        rSMaterialButtonCircle2 = new rojerusan.RSMaterialButtonCircle();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 678, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 613, Short.MAX_VALUE)
        );

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CABINET KATARINA");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));

        txtnom.setBackground(new java.awt.Color(0, 204, 204));
        txtnom.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtnom.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtnom.setCaretColor(new java.awt.Color(255, 255, 255));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome ! ");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Login To Your Account ");

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password : ");

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Username : ");

        rSMaterialButtonCircle1.setBackground(new java.awt.Color(102, 102, 102));
        rSMaterialButtonCircle1.setForeground(new java.awt.Color(153, 255, 255));
        rSMaterialButtonCircle1.setText("QUIT");
        rSMaterialButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle1ActionPerformed(evt);
            }
        });

        txtmdp.setBackground(new java.awt.Color(0, 204, 204));
        txtmdp.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        txtmdp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtmdp.setCaretColor(new java.awt.Color(255, 255, 255));

        rSMaterialButtonCircle2.setBackground(new java.awt.Color(153, 255, 255));
        rSMaterialButtonCircle2.setForeground(new java.awt.Color(102, 102, 102));
        rSMaterialButtonCircle2.setText("ENTER");
        rSMaterialButtonCircle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMaterialButtonCircle2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rSMaterialButtonCircle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtmdp, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(54, 54, 54)
                .addComponent(rSMaterialButtonCircle2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSMaterialButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/a25cae304293292540c8a8ef3952da17.gif"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSMaterialButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_rSMaterialButtonCircle1ActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomActionPerformed

    private void rSMaterialButtonCircle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMaterialButtonCircle2ActionPerformed
        try{
            Connect(); 
            pst = con.prepareStatement("select * from login where nom=? and mdp=? "); //  kanakhdo mn database nom o mdp 
            pst.setString(1,txtnom.getText()); 
            pst.setString(2,txtmdp.getText());
            rs = pst.executeQuery(); // if pst correct  , rs string  
            if(rs.next()){ 
             login.super.dispose();
             MenuPrincipale pog = new MenuPrincipale();
             pog.setVisible(true);
             

}           else {
             JOptionPane.showMessageDialog(null ," PASSWORD OR USERNAME NOT CORRECT  ");  // if pst incorrect 
             txtnom.setText("");
             txtmdp.setText(""); 
} 


}   catch(Exception e ){
      e.printStackTrace();
}        
    }//GEN-LAST:event_rSMaterialButtonCircle2ActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JToggleButton jToggleButton1;
    private rojerusan.RSButtonIconIBeanInfo rSButtonIconIBeanInfo1;
    private rojerusan.RSButtonIconIBeanInfo rSButtonIconIBeanInfo2;
    private rojerusan.RSButtonIconIBeanInfo rSButtonIconIBeanInfo3;
    private rojeru_san.componentes.RSCalendarBeanInfo rSCalendarBeanInfo1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle1;
    private rojerusan.RSMaterialButtonCircle rSMaterialButtonCircle2;
    private javax.swing.JPasswordField txtmdp;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}
