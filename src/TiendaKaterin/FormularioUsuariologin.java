package TiendaKaterin;

import FormularioUsuario.FormularioUsuarioNuevo;
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

public class FormularioUsuariologin extends javax.swing.JFrame {
    // Creamos un formulario para el inicio de la secion.
    
    //Aqui hacemos el uso de un contructor.
    public FormularioUsuariologin() {
        /**
         * Inicializa todos los objetos de componentes de Java Swing que usa su interfaz gráfica
         * de usuario de front-end utilizando el generador de GUI de NetBeans.
         */
        initComponents();
       this.setTitle("Tienda Katerin proyecto univo");//Es asinarle un titulo al proyecto
       /**
        * Lo que hace es centrar la ventana, haciendo que el centro de la misma 
        *coincida con el centro del componente. 
        *El problema es que cuando la ventana cambia de posicion respecto de la pantalla,
        *tambien lo hacen todos sus componentes respecto de la ventana, ya que los componentes
        *tienen una posicion fija respecto de la ventana. Entonces lo que sucede es lo siguiente:
El componente debe estar añadido a la ventana y debe de poder mostrarse. Es decir, la ventana debe estar visible.(De lo contrario simplemente centrará la ventana en la pantalla).
Mueve la ventana a una posicion de tal forma que su centro coincida con el del componente
Mueve los componentes respecto de la pantalla para que conserven su posicion respecto de la ventana
        */
       this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Usuario.setBackground(new java.awt.Color(102, 153, 255));
        Usuario.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Tekton Pro Cond", 0, 18)); // NOI18N
        jLabel2.setText("Password:");

        txtusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusuarioActionPerformed(evt);
            }
        });

        txtpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              //  txtpasswordActionPerformed(evt);
            }
        });

        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablalistado);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar Sesion");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tekton Pro Cond", 0, 36)); // NOI18N
        jLabel3.setText("INICIO DE SESION");

        jButton3.setText("Crear una cuenta");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UsuarioLayout = new javax.swing.GroupLayout(Usuario);
        Usuario.setLayout(UsuarioLayout);
        UsuarioLayout.setHorizontalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioLayout.createSequentialGroup()
                        .addContainerGap(44, Short.MAX_VALUE)
                        .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioLayout.createSequentialGroup()
                                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(UsuarioLayout.createSequentialGroup()
                                        .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(57, 57, 57)
                                        .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(102, 102, 102))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, UsuarioLayout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)))))
                .addContainerGap())
        );
        UsuarioLayout.setVerticalGroup(
            UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UsuarioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtpassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(UsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Usuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Este boton es para salir del programa
     */
   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
System.exit(0);
    }
/**
 * Este boton es para inicar secion
 */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
  try {
      
            DefaultTableModel modelo;
            UsuarioConectar func =new UsuarioConectar();
    
            UsuarioSetGet dts=new UsuarioSetGet();
            
            
            dts.setUsuario(txtusuario.getText());
            dts.setPassword(txtpassword.getText());
            
            
            modelo=func.login(dts.getUsuario(),dts.getPassword());
            
            tablalistado.setModel(modelo);
            
            if (func.totalregistros >0) {
                this.dispose();
               MenuPrincipal form = new MenuPrincipal();
                form.toFront();
                form.setVisible(true);

                if (!tablalistado.getValueAt(0, 3).toString().equals("Administrador")) {
                
                        
                }
                  if (!tablalistado.getValueAt(0, 3).toString().equals("Empleado")) {
                
                }   
            }
            else {
                JOptionPane.showMessageDialog(rootPane, "Acceso Denegado","Acceso al Sistema",JOptionPane.ERROR_MESSAGE);
            }
              
        } catch (Exception e) {
        }
    }
/**
 * Este boton es para cuando no se tiene una cuenta y se desea crear una.
 * @param evt
 */

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
           FormularioUsuarioNuevo form =new FormularioUsuarioNuevo();
//        this.add(form);
        form.toFront();
        form.setVisible(true);    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtusuarioActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuariologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuariologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuariologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioUsuariologin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioUsuariologin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Usuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablalistado;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}