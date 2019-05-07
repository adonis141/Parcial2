
package TiendaKaterin;

import Control_BD.ConexionConBaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public interface InterfaceUsuario {
  
    public DefaultTableModel mostrar_inicial();
    public DefaultTableModel mostrar(String buscar);
    public boolean insertar(UsuarioSetGet dts);
    public boolean editar(UsuarioSetGet dts);
    public boolean eliminar(UsuarioSetGet dts);
    public DefaultTableModel login(String usuario,String pasword) ;

}
