
package Control_BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * <p>
 * Clase ConexionConBaseDatos.
 * </p>
 * <p>
 * Utilizamos como gestor de bases de datos a mysql en donde creamos una base de datos
 * </p>
 * La clase contiene 1 funcion que es la funcion de la conexion.
 * <ul>
 * <li>Nombre de la base de datos : tiendakaterin</li>
 *<li>Usuario: root</li>
 * <li>Contraseña: no tiene por lo tanto se deja en blanco</li>
 * <li>Metodo getconexion()</li>
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
 * Esta clase la necesitamos para hacer la conexion con la base de datos.
 * Aqui crearemos el la funcion getConexion
 */
public class ConexionConBaseDatos {
    /**
     * Declaramos una variable staic te tipo connection y
    *que por el momento este como nul pero despues sera igual con lo que la queremos conectar.
    */
    public static Connection conexion = null;
   /**
    *En esta funcion me retorna la conexion si esuqe existe
    *como podemos ver lo conectaremos con una base de datos que se llama tiendaKaterin
     * @return 
    */
    public static Connection getConexion() {
        try {
           conexion = null;
           /**cargar nuestro driver
           *Este drive es el que añadimos como libreria que me servira para la conexion 
           *sino tengo el drive me dara error en la conexion.
           */
           Class.forName("com.mysql.jdbc.Driver");
           conexion =DriverManager.getConnection("jdbc:mysql://localhost/tiendakaterin","root","");
           System.out.println("conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion");
           JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
//Si todo salio bien tendre con exito la conexion.
        return conexion;
    }
    
}
