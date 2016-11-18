/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;
import clases.Validar;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
/**
 *
 * @author Lenovo
 */
public class HorasExtras extends javax.swing.JDialog {

    /**
     * Creates new form HorasEstras
     */
    Validar v= new Validar();
    public HorasExtras(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        v.ValidarSoloNumeros(txtHO);
        v.ValidarSoloNumeros(txtHDFN);
        v.ValidarSoloNumeros(txtHED);
        v.ValidarSoloNumeros(txtHEDDF);
        v.ValidarSoloNumeros(txtHEN);
        v.ValidarSoloNumeros(txtRN);
        v.ValidarSoloNumeros(txtTotal);
        this.setLocationRelativeTo(null);
    }
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoG4.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cmbHED = new javax.swing.JComboBox<>();
        cmbHEN = new javax.swing.JComboBox<>();
        cmbHEDDF = new javax.swing.JComboBox<>();
        cmbHENDF = new javax.swing.JComboBox<>();
        cmbHDFN = new javax.swing.JComboBox<>();
        txtHED = new javax.swing.JTextField();
        txtHEN = new javax.swing.JTextField();
        txtHEDDF = new javax.swing.JTextField();
        txtHENDF = new javax.swing.JTextField();
        txtHDFN = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmdCalcular = new javax.swing.JButton();
        cmdBorrar = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtRN = new javax.swing.JTextField();
        cmbRN = new javax.swing.JComboBox<>();
        cmdPasarDato = new javax.swing.JButton();
        jLabel1Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbHED.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora extra diurna" }));
        jPanel1.add(cmbHED, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 220, -1));

        cmbHEN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora extra nocturna" }));
        jPanel1.add(cmbHEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 220, -1));

        cmbHEDDF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora extra diurna dominical  o festiva" }));
        jPanel1.add(cmbHEDDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 220, -1));

        cmbHENDF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora extra nocturna dominical o festiva" }));
        jPanel1.add(cmbHENDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 220, -1));

        cmbHDFN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hora dominical o festiva nocturna" }));
        cmbHDFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHDFNActionPerformed(evt);
            }
        });
        jPanel1.add(cmbHDFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 220, -1));

        txtHED.setText("0");
        jPanel1.add(txtHED, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 40, -1));

        txtHEN.setText("0");
        txtHEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHENActionPerformed(evt);
            }
        });
        jPanel1.add(txtHEN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 40, -1));

        txtHEDDF.setText("0");
        jPanel1.add(txtHEDDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 40, -1));

        txtHENDF.setText("0");
        jPanel1.add(txtHENDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 40, -1));

        txtHDFN.setText("0");
        txtHDFN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHDFNActionPerformed(evt);
            }
        });
        jPanel1.add(txtHDFN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 40, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 51));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HORAS EXTRAS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 140, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Num. Horas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 60, 70, -1));

        cmdCalcular.setText("Calcular");
        cmdCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(cmdCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        cmdBorrar.setText("Borrar");
        jPanel1.add(cmdBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, -1, -1));

        txtTotal.setEditable(false);
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 90, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, 20));
        jPanel1.add(txtHO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 80, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Hora Ordinaria:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Recargos:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        txtRN.setText("0");
        jPanel1.add(txtRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 40, -1));

        cmbRN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Recargo nocturno" }));
        jPanel1.add(cmbRN, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 220, -1));

        cmdPasarDato.setText("Pasar Dato");
        cmdPasarDato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdPasarDatoActionPerformed(evt);
            }
        });
        jPanel1.add(cmdPasarDato, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jLabel1Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/abstract-wallpaper-1080p-186.jpg"))); // NOI18N
        jPanel1.add(jLabel1Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 390));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtHENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHENActionPerformed

    private void cmbHDFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHDFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbHDFNActionPerformed

    private void cmdCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCalcularActionPerformed
        String resp; 
     double n1,n2,n3,n4,n5,n6,total,Ho,resultado1 ,resultado2,resultado3,resultado4,resultado5,resultado6;
     int op1,op2,op3,op4,op5;
     
     if(txtHO.getText().trim().isEmpty()){
         JOptionPane.showMessageDialog(this,"Digite el valor de hora ordinaria","Error", JOptionPane.ERROR_MESSAGE);
         txtHO.requestFocusInWindow();
     }else{
         
     
         
     Ho = Double.parseDouble(txtHO.getText());
     
         
     n1 = Double.parseDouble(txtHED.getText());
     n2 = Double.parseDouble(txtHEN.getText());
     n3 = Double.parseDouble(txtHEDDF.getText());
     n4 = Double.parseDouble(txtHENDF.getText());
     n5 = Double.parseDouble(txtHDFN.getText());
     n6 = Double.parseDouble(txtRN.getText());
     
     resultado1=(Ho*n1)*1.25;
     resultado2=(Ho*n2)*1.75;
     resultado3=(Ho*n3)*2.0;
     resultado4=(Ho*n4)*2.10;
     
     
     //recargos
     resultado5=(Ho*n5)*0.75;
     resultado6=(Ho*n6)*0.35;
     
     

total=resultado1+resultado2+resultado3+resultado4+resultado5+resultado6;    
     
     Principal.txtHorasExtras2.setText(txtTotal.getText()); 
          
    
     resp = String.valueOf(total);
     txtTotal.setText(resp);
      // TODO add your handling code here:
     }
     
    
    
    }//GEN-LAST:event_cmdCalcularActionPerformed

    private void cmdPasarDatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdPasarDatoActionPerformed
    
     //ventana.HorasExtras=txtTotal.getText();
     
    // ventana.setVisible(true);
     this.setVisible(false);
    // this.dispose();
         
     
    }//GEN-LAST:event_cmdPasarDatoActionPerformed

    private void txtHDFNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHDFNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHDFNActionPerformed

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
            java.util.logging.Logger.getLogger(HorasExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HorasExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HorasExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HorasExtras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HorasExtras dialog = new HorasExtras(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbHDFN;
    private javax.swing.JComboBox<String> cmbHED;
    private javax.swing.JComboBox<String> cmbHEDDF;
    private javax.swing.JComboBox<String> cmbHEN;
    private javax.swing.JComboBox<String> cmbHENDF;
    private javax.swing.JComboBox<String> cmbRN;
    private javax.swing.JButton cmdBorrar;
    private javax.swing.JButton cmdCalcular;
    private javax.swing.JButton cmdPasarDato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fondo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtHDFN;
    private javax.swing.JTextField txtHED;
    private javax.swing.JTextField txtHEDDF;
    private javax.swing.JTextField txtHEN;
    private javax.swing.JTextField txtHENDF;
    private javax.swing.JTextField txtHO;
    private javax.swing.JTextField txtRN;
    public javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}