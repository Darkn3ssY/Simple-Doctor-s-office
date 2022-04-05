
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
public class Preinscription extends javax.swing.JFrame {

   Connection con ; 
   PreparedStatement pst ; 
   ResultSet rs ; 
   
    public Preinscription() {
        initComponents();
       
       Traitement();
       Patient(); 
       table(); 
    }
        public void Patient(){      // had i 
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

    public void Traitement(){ 
        try { 
        Connect(); 
        String sql = "select nom from traitement";
        pst = con.prepareStatement(sql);
        

     
        rs = pst.executeQuery(); 
        while (rs.next()){
            txttraitement.addItem(rs.getString("nom"));
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
        txtprix = new javax.swing.JTextField();
        buttonGradient37 = new ButtonGradient2();
        buttonGradient38 = new ButtonGradient2();
        jLabel1 = new javax.swing.JLabel();
        txtpatient = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        rDVbotton1 = new RDVbotton();
        jLabel7 = new javax.swing.JLabel();
        txttraitement = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtalergie = new javax.swing.JTextField();
        rDVbotton2 = new RDVbotton();
        txtmedicament = new javax.swing.JTextField();
        txtdose = new javax.swing.JTextField();

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

        buttonGradient22.setText("MENU PRINCIPALE");
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

        txtprix.setBackground(new java.awt.Color(0, 204, 204));
        txtprix.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtprix.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtprix.setText("PRIX");
        txtprix.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtprix.setCaretColor(new java.awt.Color(255, 255, 255));
        txtprix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprixActionPerformed(evt);
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
        jLabel1.setText("CONSULTATION");

        txtpatient.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtpatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpatientActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("MEDICAMENT");

        rDVbotton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDVbotton1ActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("TRAITEMENT");

        txttraitement.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("PATIENT S'ILS ONE PAS D'AUTRE TRUC A MODIFIER.");

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 0));
        jLabel5.setText("POUR LES PRESCRIPTION DEMANDE AUX ");

        txtalergie.setBackground(new java.awt.Color(0, 204, 204));
        txtalergie.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        txtalergie.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtalergie.setCaretColor(new java.awt.Color(255, 255, 255));
        txtalergie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtalergieActionPerformed(evt);
            }
        });

        rDVbotton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rDVbotton2ActionPerformed(evt);
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

        txtdose.setBackground(new java.awt.Color(0, 204, 204));
        txtdose.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        txtdose.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtdose.setText("DOSE");
        txtdose.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        txtdose.setCaretColor(new java.awt.Color(255, 255, 255));
        txtdose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdoseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(196, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(buttonGradient37, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(buttonGradient23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buttonGradient38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtalergie, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(rDVbotton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(19, 19, 19)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                            .addComponent(txttraitement, javax.swing.GroupLayout.Alignment.TRAILING, 0, 269, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
                                            .addComponent(txtmedicament)))
                                    .addComponent(txtprix, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(rDVbotton2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonGradient22, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(buttonGradient23, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(buttonGradient37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(txtmedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtprix, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtdose, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(rDVbotton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonGradient22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtpatient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rDVbotton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttraitement, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtalergie, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonGradient38, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(140, 140, 140))))
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
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGradient22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient22ActionPerformed
       Preinscription.super.dispose();
       MenuPrincipale mp = new MenuPrincipale(); 
       mp.setVisible(true);
    }//GEN-LAST:event_buttonGradient22ActionPerformed

    private void buttonGradient23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient23ActionPerformed
            try {
        Connect(); 
        pst = con.prepareStatement("delete from prescription where code=?");
        int code = jTable1.getSelectedRow(); 
        String selectionner = (String) jTable1.getValueAt(code, 0); 
        pst.setString(1, selectionner); 
        pst.executeUpdate(); 
        con.close(); 
        JOptionPane.showMessageDialog(null, "Prescription est Supprimé");
        table(); 

} catch(Exception e){

    e.printStackTrace();
}         
    }//GEN-LAST:event_buttonGradient23ActionPerformed

    private void txtprixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprixActionPerformed

    private void buttonGradient37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient37ActionPerformed
       txtprix.setText("");
       txtmedicament.setText("");
      
   

    }//GEN-LAST:event_buttonGradient37ActionPerformed

    private void buttonGradient38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient38ActionPerformed
        try {
        Connect(); 
        pst = con.prepareStatement("insert into prescription(patient,alergie,traitement,medicament,prix,dose)"
       + " values(?,?,?,?,?,?)");
       pst.setString(1,txtpatient.getSelectedItem().toString().toUpperCase());
       pst.setString(2,txtprix.getText().toUpperCase());
       pst.setString(3,txtalergie.getText().toUpperCase());
       pst.setString(4,txtdose.getText().toUpperCase());
       pst.setString(5,txttraitement.getSelectedItem().toString().toUpperCase());
       pst.setString(6,txtmedicament.getText().toUpperCase());
       pst.executeUpdate();
       JOptionPane.showMessageDialog(null , "Prescription est Ajouté");  
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
            txtprix.setText(rs.getString("alergie"));
}
    con.close();
} catch(Exception e){
     e.printStackTrace();
}       
    }//GEN-LAST:event_rDVbotton1ActionPerformed

    private void txtalergieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtalergieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtalergieActionPerformed

    private void rDVbotton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rDVbotton2ActionPerformed

try { 
        Connect(); 
        String sql = "select medicament,prix,dose from traitemet where nom=?";
        pst = con.prepareStatement(sql); 
        pst.setString(1,txttraitement.getSelectedItem().toString());
        rs = pst.executeQuery(); 
        while (rs.next()){
            txtmedicament.setText(rs.getString("medicament"));
            txtprix.setText(rs.getString("prix"));
            txtdose.setText(rs.getString("dose"));
}
    con.close();
} catch(Exception e){
     e.printStackTrace();
}      }//GEN-LAST:event_rDVbotton2ActionPerformed

    private void txtpatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpatientActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpatientActionPerformed

    private void txtmedicamentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmedicamentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmedicamentActionPerformed

    private void txtdoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdoseActionPerformed

        public void table (){
             String []patient = {"CODE","PATIENT","ALERGIE","MEDICAMENT","TRAITEMENT","PRIX","DOSE"};
             String []montrer = new String[5];
             DefaultTableModel model = new DefaultTableModel(null,patient) ;
             String sql = "select * from prescription " ;     
              try {
               Connect() ; 
                Statement st = con.createStatement();
                rs = st.executeQuery(sql); 
                while(rs.next()){
                montrer[0] =rs.getString("code");
                montrer[1] =rs.getString("patient");
                montrer[2] =rs.getString("alergie");
                montrer[3] =rs.getString("traitement");         
                montrer[4] =rs.getString("prix");
                montrer[4] =rs.getString("dose");
      
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
    private RDVbotton rDVbotton2;
    private javax.swing.JTextField txtalergie;
    private javax.swing.JTextField txtdose;
    private javax.swing.JTextField txtmedicament;
    private javax.swing.JComboBox<String> txtpatient;
    private javax.swing.JTextField txtprix;
    private javax.swing.JComboBox<String> txttraitement;
    // End of variables declaration//GEN-END:variables
}
