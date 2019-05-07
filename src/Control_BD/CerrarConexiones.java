package Control_BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 * <p>
 * Clase CerrarConexiones.
 * </p>
 * <p>
 * Utilizamos para cerrar la conexion
 * </p>
 * La clase contiene un metodo que es la funcion de la conexion.
 * <ul>
 * <li> Se cierra conexion con la base de datos tiendakaterin</li>
 * <li>Metodo metodoCerrarConexion()</li>
 * </ul>
 */

/**
 *@author Adonis
 *@author Samuel
 *@author Yasuri
 *@since 27/04/2019
 *@version 8.2
 * 
 */
/**
 * Esta clase la necesitamos para cerra la conexion con la base de datos.
 * Aqui crearemos el metodoCerraConexiones
 */

//Heredamos de la clase ConexionConBaseDatos
public class CerrarConexiones extends ConexionConBaseDatos{
    /**En esta clase solo ocuparemos un metodo el cual sirve cerrar la conexion (connection)
    *a la base de datos, cerrar los resultados(resulset)
    *cerrar las sentencias (preparedStatement y Statement)
    */
    public static void metodoCerrarConexiones(Connection conexion, Statement sentencia, ResultSet resultado, PreparedStatement ps ){
        
        if(ps != null){
            try{
                ps.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el PreparedStatement(ps)\n Error: "+e1);   
            }
            resultado = null;
        }
        
        if(resultado != null){
            try{
                resultado.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el ResultSet (resultado)\n Error: "+e1);
            }
            resultado = null;
        }
        
        if(sentencia != null){
            try{
                sentencia.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar el Statement (sentencia)\n Error "+e1);
            }
            sentencia = null;
        }
  
        if(conexion != null){
            try{
                conexion.close();
            }
            catch(SQLException e1){
                JOptionPane.showMessageDialog(null,"No se pudo cerrar Connection (conexion)\n Error "+e1);
            }
            conexion = null;
        }
        
    }  
}
