package FormularioUsuario;
import TiendaKaterin.UsuarioConectar;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *@author Adonis
 *@author Samuel
 *@author Yasuri
 *@since 27/04/2019
 *@version 8.2
 * 
 */

public class FormularioUsuario extends javax.swing.JFrame  {

    public FormularioUsuario() {
        initComponents();
         this.setLocationRelativeTo(null);
         this.getContentPane().setBackground(Color.BLUE);
               this.setTitle("Usuario ");
               iniciar();
    }
    public void iniciar(){
        //Se cargara la tabla inicial usuario sin parametros
            try {
            DefaultTableModel modelo;
                UsuarioConectar func = new UsuarioConectar();
            modelo = func.mostrar_inicial();
            jTable_listado.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_nuevo = new javax.swing.JButton();
        txt_buscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_salir1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_listado = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

        btn_salir.setForeground(new java.awt.Color(11, 7, 7));
        btn_salir.setText("Salir");
        btn_salir.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setUndecorated(true);

        jLabel1.setText("Buscar");

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        txt_buscar.setForeground(new java.awt.Color(138, 138, 138));

        jLabel2.setForeground(new java.awt.Color(136, 127, 127));
        jLabel2.setText("Modificar");

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(131, 124, 124));
        jLabel3.setText("Nuevo");

        btn_salir1.setText("Salir");
        btn_salir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salir1ActionPerformed(evt);
            }
        });

        jTable_listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable_listado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setText("Nombre o dui");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btn_nuevo))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_buscar)
                                .addGap(136, 136, 136)
                                .addComponent(btn_salir1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(74, 74, 74)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btn_nuevo)
                    .addComponent(jLabel3))
                .addGap(8, 8, 8)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_buscar)
                        .addComponent(btn_salir1)))
                .addGap(48, 48, 48)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        // TODO add your handling code here:
             FormularioUsuarioNuevo form =new FormularioUsuarioNuevo();
//        this.add(form);
        form.toFront();
        form.setVisible(true);   
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
                //ACA CARGARE LA TABLA USUARIO CON UN PARAMETROS QUE ES EL DNI,APELLIDOS O NOMBRE
            try {
            DefaultTableModel modelo;
                UsuarioConectar func = new UsuarioConectar();
            modelo = func.mostrar(txt_buscar.getText());
            jTable_listado.setModel(modelo);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void btn_salir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salir1ActionPerformed
        // TODO add your handling code here:
                dispose();
    }//GEN-LAST:event_btn_salir1ActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_salir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_listado;
    private javax.swing.JTextField txt_buscar;
    // End of variables declaration//GEN-END:variables
}
