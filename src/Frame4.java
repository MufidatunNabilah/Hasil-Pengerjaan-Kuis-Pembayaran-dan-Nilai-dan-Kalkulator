/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mufidatun Nabilah
 */
public class Frame4 extends javax.swing.JFrame {

    /**
     * Creates new form Frame4
     */
    public Frame4() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Absen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Mapel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Nilai = new javax.swing.JTextField();
        Proses = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Penilaian Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(64, 11, 245, 14);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(64, 43, 49, 14);
        getContentPane().add(Nama);
        Nama.setBounds(123, 43, 194, 27);

        jLabel3.setText("Absen");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(64, 87, 49, 14);
        getContentPane().add(Absen);
        Absen.setBounds(123, 81, 194, 30);

        jLabel4.setText("Mapel");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(64, 137, 28, 14);
        getContentPane().add(Mapel);
        Mapel.setBounds(123, 129, 194, 31);

        jLabel5.setText("Nilai");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(64, 186, 19, 14);
        getContentPane().add(Nilai);
        Nilai.setBounds(123, 178, 194, 31);

        Proses.setText("Proses");
        Proses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProsesActionPerformed(evt);
            }
        });
        getContentPane().add(Proses);
        Proses.setBounds(153, 227, 90, 23);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(64, 268, 253, 136);

        jPanel1.setBackground(new java.awt.Color(51, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProsesActionPerformed
    String nama = Nama.getText();
    String absen = Absen.getText();
    String mapel = Mapel.getText();
    int nilai = Integer.parseInt(String.valueOf(Nilai.getText()));
               
    
    
    if(nilai < 75 )
            Hasil.setText("Nama : "+nama +"\n" + "Absen : "+absen +"\n" + "Mapel : "+mapel + "\nNilai : "+nilai +"\n" + "Anda tidak Lulus" );
        else if(nilai >= 75 && nilai <= 100)
            Hasil.setText("Nama : "+nama +"\n" + "Absen : "+absen +"\n" + "Mapel : "+mapel + "\nNilai : "+nilai +"\n" + "Anda Lulus" );
        else
            Hasil.setText("Nama : "+nama +"\n" + "Absen : "+absen +"\n" + "Mapel : "+mapel + "\nNilai : "+nilai + "\n" + "Nilai anda melebihi batas maksimal" );
    
    }//GEN-LAST:event_ProsesActionPerformed

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
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Mapel;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nilai;
    private javax.swing.JToggleButton Proses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
