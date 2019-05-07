
package FormularioUsuario;

import TiendaKaterin.UsuarioConectar;
import TiendaKaterin.UsuarioSetGet;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *@author Adonis
 *@author Samuel
 *@author Yasuri
 *@since 27/04/2019
 *@version 8.2
 * 
 */

public class FormularioUsuarioNuevo extends javax.swing.JFrame {
    /**
     * Creamos una nuevo formulario para el registro de un nuevo Usuario.
     */
    public FormularioUsuarioNuevo() {
        initComponents();
    this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.magenta);
               this.setTitle("Usuario Nuevo ");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    private void initComponents() {

        btn_guardar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        txt_nombres = new javax.swing.JTextField();
        txt_usuario = new javax.swing.JTextField();
        txt_apellidos = new javax.swing.JTextField();
        txt_pasword = new javax.swing.JTextField();
        txt_dni = new javax.swing.JTextField();
        combo_tipo = new javax.swing.JComboBox();
        txt_telefono = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        txt_nombres.setForeground(new java.awt.Color(153, 143, 143));
        txt_nombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombresActionPerformed(evt);
            }
        });

        txt_usuario.setForeground(new java.awt.Color(153, 143, 143));
        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        txt_apellidos.setForeground(new java.awt.Color(153, 143, 143));

        txt_pasword.setForeground(new java.awt.Color(153, 143, 143));

        txt_dni.setForeground(new java.awt.Color(153, 143, 143));
        txt_dni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dniActionPerformed(evt);
            }
        });

        combo_tipo.setForeground(new java.awt.Color(157, 155, 155));
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Empleado" }));

        txt_telefono.setForeground(new java.awt.Color(153, 143, 143));

        jLabel1.setText("Nuevo");

        jLabel2.setForeground(new java.awt.Color(146, 146, 146));
        jLabel2.setText("Buscar");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("DUI");

        jLabel6.setText("Usuario");

        jLabel7.setText("Contraseña");

        jLabel8.setText("Telefono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_pasword, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_salir)
                                    .addComponent(btn_guardar)))
                            .addComponent(jLabel3)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_dni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar))
                .addGap(11, 11, 11)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_salir))
                .addGap(12, 12, 12)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
  
if(txt_nombres.getText().length() == 0 ||  txt_apellidos.getText().length() == 0 || txt_usuario.getText().length() ==0 || txt_pasword.getText().length() == 0 || txt_dni.getText().length() == 0 || txt_telefono.getText().length() == 0){
        
               JOptionPane.showMessageDialog(rootPane, "rellene todos los campos");

}
else{
    UsuarioSetGet dts = new UsuarioSetGet();
        UsuarioConectar func = new UsuarioConectar();

        dts.setNombres(txt_nombres.getText());

        dts.setApellidos(txt_apellidos.getText());
        dts.setUsuario(txt_usuario.getText());
        
        int tipo = combo_tipo.getSelectedIndex();
        dts.setTipo((String) combo_tipo.getItemAt(tipo));
        dts.setdni(Integer.parseInt(txt_dni.getText()));
        dts.setPassword(txt_pasword.getText());
        dts.setTelefono( Integer.parseInt(txt_telefono.getText()));

        
          if (func.insertar(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El Usuario fue insertado satisfactoriamente");
          //      mostrar("");
            //    inhabilitar();
            }
}
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
                dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    private void txt_dniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dniActionPerformed

    private void txt_nombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombresActionPerformed

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioUsuarioNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JComboBox combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_dni;
    private javax.swing.JTextField txt_nombres;
    private javax.swing.JTextField txt_pasword;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables
}
