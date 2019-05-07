package Control_BD;
/**
 * Es importante importar tanto los formularios como las librerias
 */
import FormularioCliente.EliminarCliente;
import FormularioCliente.ListarCliente;
import FormularioCliente.ModificarCliente;
import FormularioCliente.AgregarCliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;/**
 * <p>
 * Clase Control_Cliente.
 * </p>
 * <p>
 * Utilizamos esta clase para definir 15 metodos para el control de clientes
 * </p>
 * La clase contiene 15 metodos con el fin de controlar a los clientes.
 * <ul>
 * <li>Metodo agregarCliente()</li>
 * <li>Metodo listarTodosClientes()</li>
 * <li>Metodo CargarModificarClientes()</li>
 * <li>Metodo CargarEliminarClientes()</li>
 * <li>Metodo CargarClientes()</li>
 * <li>Metodo CargarClientesVentas()</li>
 * <li>Metodo ejecutarConsultaTodaTabla()</li>
 * <li>Metodo buscarCliente()</li>
 * <li>Metodo buscarListaCliente()</li>
 * <li>Metodo buscarModificarCliente()</li>
 * <li>Metodo buscarEliminarCliente</li>
 * <li>Metodo buscarRegistrodniOnombreOapellido</li>
 * <li>Metodo buscarRegistroCedulaONombreOapellido</li>
 * <li>Metodo EliminarCliente</li>
 * <li>Metodo ModificarCliente</li>
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
 * En esta clase se exponen todos los métodos para ejercer control sobre los
 * datos que van desde y hacia la tabla clientes. En esta clase se hace la
 * validación y organizacion de los datos.
 */
//Heredamos de la clase conexion2
public class Control_Cliente extends ControlClienteConsultasProductos{

    public static Connection getConexion() {
        return ConexionConBaseDatos.getConexion();
    }
    
     public void ejecutarConsultaTodaTabla() {
        try {
            //conexion = ConexionConBaseDatos.getConexion();
            //Como heredamos el metodo getConexion() queda;
            conexion01 = ConexionConBaseDatos.getConexion();
            sentencia = conexion01.createStatement();
            String consultaSQL = "SELECT * FROM table_Cliente ORDER BY Nombre_Cliente ASC";
            resultado = sentencia.executeQuery(consultaSQL);
            //Hacemos un bulce es decir mientras haya datos en la BaseDeDatos se estara ejecutar eso.
            while (resultado.next()) {
                int codigo = resultado.getInt("idCliente");
                String nombre = resultado.getString("Nombre_Cliente");
                String apellido = resultado.getString("Apellido_Cliente");
                String razon_s_cliente = resultado.getString("razon_s_Cliente");
                String ruc_cliente = resultado.getString("ruc_Cliente");
                String direccion_Cliente = resultado.getString("direccion_Cliente");
                String telefono_Cliente = resultado.getString("telefono_Cliente");
                String correo_Cliente = resultado.getString("correo_Cliente");
                //Aqui creamos un vector donde los está la informacion se creara una fila
                Object[] info = {codigo, nombre, apellido, razon_s_cliente,ruc_cliente,direccion_Cliente,telefono_Cliente,correo_Cliente};

                //Aqui al modelo1 de la tabla le agrega una fila con los datos que están en info1
                modelo1.addRow(info);
            }//Aqui se cierra while porque no hay mas datos en la BD .
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion01 = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }

    }//Aqui se cierra metodo ejecutarConsulta
     
     
    @Override
      public void CargarModificarClientes() {
            //le asigna el modelo1 al jtable
            ModificarCliente.jTable_clientes.setModel(modelo1);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
      }
      
    @Override
      public void CargarEliminarClientes(){
           
      }
     
/**
 * Este metodo de sobrecarga es para modificar usuario por ende tiene diferente parametro
 * @param code
 * @param nombre
 * @param apellido
 * @param razon_social
 * @param ruc
 * @param direccion
 * @param telefono
 * @param correo 
 */
    @Override
    public void Modificar(String code, String nombre, String apellido, String razon_social, String ruc, String direccion, String telefono, String correo) {
        super.Modificar(code, nombre, apellido, razon_social, ruc, direccion, telefono, correo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarCliente(String code) {
        super.EliminarCliente(code); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarT(String parametroBusqueda, boolean buscarPordni, boolean buscarPorNombre, boolean buscarPorApellido) {
        super.buscarT(parametroBusqueda, buscarPordni, buscarPorNombre, buscarPorApellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarT(String parametroBusqueda) {
        super.buscarT(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarEliminarCliente(String parametroBusqueda) {
        super.buscarEliminarCliente(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
           //le asigna el modelo1 al jtable
            EliminarCliente.jTable_clientes.setModel(modelo1);
            //ejecuta una consulta a la BD
            buscarT(parametroBusqueda);
    }

    @Override
    public void buscarModificarCliente(String parametroBusqueda) {
        super.buscarModificarCliente(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
          //le asigna el modelo1 al jtable
            ModificarCliente.jTable_clientes.setModel(modelo1);
            //ejecuta una consulta a la BD
            buscarT(parametroBusqueda);
    }
//metodos buscar con sobrecarga
    @Override
    public void buscar(String parametroBusqueda) {
        super.buscar(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
        //le asigna el modelo1 al jtable
        ListarCliente.jTableListarCliente.setModel(modelo1);

        //ejecuta una consulta a la BasesDeDatos
        ejecutarConsultaTodaTabla();
    }

    @Override
    public void buscar(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorApellido) {
        super.buscar(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorApellido); //To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public void CargarClientesVentas() {
        super.CargarClientesVentas(); //To change body of generated methods, choose Tools | Templates.
         

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
    }

    @Override
    public void CargarClientes() {
        super.CargarClientes(); //To change body of generated methods, choose Tools | Templates.
          //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
    }

 
    @Override
    public void listarTodosClientes() {
        super.listarTodosClientes(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Agregar(String nombre, String apellido, String razon_social, String ruc, String direccion, String telefono, String correo) {
        super.Agregar(nombre, apellido, razon_social, ruc, direccion, telefono, correo); //To change body of generated methods, choose Tools | Templates.
    }
  
  
}//cierra class
