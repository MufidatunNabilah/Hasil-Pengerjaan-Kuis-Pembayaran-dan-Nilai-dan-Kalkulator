/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mufidatun Nabilah
 */
public class Frame2 extends javax.swing.JFrame {

    /**
     * Creates new form Frame2
     */
    public Frame2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Jurusan = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        TKJ = new javax.swing.JRadioButton();
        RPL = new javax.swing.JRadioButton();
        Programing = new javax.swing.JCheckBox();
        Teknisi = new javax.swing.JCheckBox();
        Animator = new javax.swing.JCheckBox();
        Designer = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(49, 57, 38, 14);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(49, 103, 38, 14);

        jLabel4.setText("Jurusan");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(49, 147, 50, 14);

        jLabel5.setText("Hobi");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(49, 178, 50, 14);
        getContentPane().add(Nama);
        Nama.setBounds(105, 50, 237, 29);
        getContentPane().add(Absen);
        Absen.setBounds(105, 94, 237, 32);

        TKJ.setBackground(new java.awt.Color(204, 255, 255));
        Jurusan.add(TKJ);
        TKJ.setText("TKJ");
        getContentPane().add(TKJ);
        TKJ.setBounds(166, 143, 80, 23);

        RPL.setBackground(new java.awt.Color(204, 255, 255));
        Jurusan.add(RPL);
        RPL.setText("RPL");
        getContentPane().add(RPL);
        RPL.setBounds(105, 143, 60, 23);

        Programing.setBackground(new java.awt.Color(204, 255, 255));
        Programing.setText("Programing");
        getContentPane().add(Programing);
        Programing.setBounds(105, 174, 90, 23);

        Teknisi.setBackground(new java.awt.Color(204, 255, 255));
        Teknisi.setText("Teknisi");
        Teknisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeknisiActionPerformed(evt);
            }
        });
        getContentPane().add(Teknisi);
        Teknisi.setBounds(192, 174, 90, 23);

        Animator.setBackground(new java.awt.Color(204, 255, 255));
        Animator.setText("Animator");
        getContentPane().add(Animator);
        Animator.setBounds(105, 197, 90, 23);

        Designer.setBackground(new java.awt.Color(204, 255, 255));
        Designer.setText("Designer");
        Designer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignerActionPerformed(evt);
            }
        });
        getContentPane().add(Designer);
        Designer.setBounds(192, 197, 100, 23);

        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(49, 268, 293, 132);

        jLabel6.setText("Hasil");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(49, 248, 60, 14);

        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(393, 0, 0, 0);

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Formulir");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Hapus");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton2.setText("Keluar");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(193, 193, 193)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jToggleButton1)
                    .addComponent(jToggleButton2))
                .addContainerGap(226, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 400, 470);

        setBounds(0, 0, 410, 506);
    }// </editor-fold>//GEN-END:initComponents

    private void DesignerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesignerActionPerformed

    private void TeknisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeknisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeknisiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nama = Nama.getText();
        String absen = Absen.getText();
        String jurusan;
        String hobi="";
        
        if(RPL.isSelected())
            jurusan="RPL";
        else if(TKJ.isSelected())
            jurusan="TKJ";
        else
            jurusan="Tidak diketahui";
        
        if(Programing.isSelected())
            hobi+=Programing.getText()+"";
        else if(Animator.isSelected())
            hobi+=Animator.getText()+"";
        else if(Teknisi.isSelected())
            hobi+=Teknisi.getText()+"";
        else if(Designer.isSelected())
            hobi+=Designer.getText()+"";
        else
            hobi="Tidak diketahui";
                        
        TA.append("Nama Siswa : "+nama+"\n"+"Absen :"+absen+"\n"+"Jurusan : "+jurusan+"\n"+"Hobi : "+hobi);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        Nama.setText("");
        Absen.setText("");
        Jurusan.clearSelection();
        Programing.setSelected(false);
        Animator.setSelected(false);
        Designer.setSelected(false);
        Teknisi.setSelected(false);
        
        TA.setText("");
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JCheckBox Animator;
    private javax.swing.JCheckBox Designer;
    private javax.swing.ButtonGroup Jurusan;
    private javax.swing.JTextField Nama;
    private javax.swing.JCheckBox Programing;
    private javax.swing.JRadioButton RPL;
    private javax.swing.JTextArea TA;
    private javax.swing.JRadioButton TKJ;
    private javax.swing.JCheckBox Teknisi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
