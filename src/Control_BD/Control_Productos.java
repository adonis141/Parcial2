package Control_BD;

import FormulariosProductos.ConsultarProductos;
import static FormulariosProductos.ConsultarProductos.jTableListarCliente;
import FormulariosProductos.EliminarProductos;
import FormulariosProductos.ModificarProductos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

/**
 * En esta clase se exponen todos los métodos para ejercer control sobre los
 * datos que van desde y hacia la tabla clientes. En esta clase se hace la
 * validación y organizacion de los datos.
 */
public class Control_Productos extends ControlClienteConsultasProductos{
    
    public Control_Productos(){
    
    }
    
    public void ejecutarConsultaTodaTabla() {

        try {
            conexion01 = ConexionConBaseDatos.getConexion();
            sentencia = conexion01.createStatement();
            String consultaSQL = "SELECT * FROM table_Productos ORDER BY idProductos ASC";
            resultado = sentencia.executeQuery(consultaSQL);
            //mientras haya datos en la BD ejecutar eso...
            while (resultado.next()) {
                String codigo = resultado.getString("idProductos");
                String nombre = resultado.getString("nombreProductos");
                String precioventa = resultado.getString("preciosProductos");
                String descripcion = resultado.getString("descripcionProductos");
                String cantidad = resultado.getString("cantidadProductos");
                   String preciocompraProductos = resultado.getString("preciocompraProductos");

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, precioventa,descripcion,cantidad,preciocompraProductos};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }//cierra while (porque no hay mas datos en la BD)
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error SQL:\n" + e);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e);
            conexion01 = null;
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }

    }//cierra metodo ejecutarConsulta

    @Override
    public void buscarRegistroProductoss(String parametroBusqueda) {
        super.buscarRegistroProductoss(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarProductosparaEliminarProductos(String parametroBusqueda) {
        super.buscarProductosparaEliminarProductos(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarProductosparaProductos(String parametroBusqueda) {
        super.buscarProductosparaProductos(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarProductosparaVentas(String parametroBusqueda) {
        super.buscarProductosparaVentas(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Este metodo es de sobre carga es modificar producto
     * @param code
     * @param nombre
     * @param precios
     * @param descripcion
     * @param cantidad_productos
     * @param preciocompra
     * @param dif 
     */
    @Override
    public void Modificar(String code, String nombre, float precios, String descripcion, int cantidad_productos, float preciocompra, float dif) {
        super.Modificar(code, nombre, precios, descripcion, cantidad_productos, preciocompra, dif); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(String code) {
        super.Eliminar(code); //To change body of generated methods, choose Tools | Templates.
        //le asigna el modelo al jtable
              EliminarProductos.jTable_productos.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
    }

    @Override
    public void buscarRegistroProductos(String parametroBusqueda) {
        super.buscarRegistroProductos(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarProductos(String parametroBusqueda) {
        super.buscarProductos(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutarConsultaTodaTablaventas() {
        super.ejecutarConsultaTodaTablaventas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutarConsultaTodaTabla_por_agotar() {
        super.ejecutarConsultaTodaTabla_por_agotar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarTodosProductos() {
        super.listarTodosProductos(); //To change body of generated methods, choose Tools | Templates.
        //le asigna el modelo al jtable
        ConsultarProductos.jTableListarCliente.setModel(modelo);


        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
        
    }

    @Override
    public void listarTodosProductos_por_agotar() {
        super.listarTodosProductos_por_agotar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DefaultTableModel mostrar_inicial() {
        return super.mostrar_inicial(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarProductos_eliminar() {
        super.CargarProductos_eliminar(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarProductos2() {
        super.CargarProductos2(); //To change body of generated methods, choose Tools | Templates.
         //le asigna el modelo al jtable
        ModificarProductos.jTable_productos.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
    }

    @Override
    public void CargarProductosVentas() {
        super.CargarProductosVentas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarProductos() {
        super.CargarProductos(); //To change body of generated methods, choose Tools | Templates.
         //le asigna el modelo al jtable
        RealizarVentas.SeleccionarProductos.setModel(modelo);
        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla();
         
    }
    /**
     * Este metodo es de sobrecarga es de agregar cliente 
     * @param cedula
     * @param nombre
     * @param apellido
     * @param direccion
     * @param telefono 
     */

    @Override
    public void agregar(String cedula, String nombre, String apellido, String direccion, String telefono) {
        super.agregar(cedula, nombre, apellido, direccion, telefono); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Modificar(String code, String nombre, String apellido, String razon_social, String ruc, String direccion, String telefono, String correo) {
        super.Modificar(code, nombre, apellido, razon_social, ruc, direccion, telefono, correo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void EliminarCliente(String code) {
        super.EliminarCliente(code); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Este metodo es para buscar registrocedulaNombreapelllido
     * @param parametroBusqueda
     * @param buscarPordni
     * @param buscarPorNombre
     * @param buscarPorApellido 
     */
    @Override
    public void buscarT(String parametroBusqueda, boolean buscarPordni, boolean buscarPorNombre, boolean buscarPorApellido) {
        super.buscarT(parametroBusqueda, buscarPordni, buscarPorNombre, buscarPorApellido); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * 
     * @param parametroBusqueda 
     */
    @Override
    public void buscarT(String parametroBusqueda) {
        super.buscarT(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarEliminarCliente(String parametroBusqueda) {
        super.buscarEliminarCliente(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarModificarCliente(String parametroBusqueda) {
        super.buscarModificarCliente(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar(String parametroBusqueda) {
        super.buscar(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorApellido) {
        super.buscar(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorApellido); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarClientesVentas() {
        super.CargarClientesVentas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarClientes() {
        super.CargarClientes(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarEliminarClientes() {
        super.CargarEliminarClientes(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarModificarClientes() {
        super.CargarModificarClientes(); //To change body of generated methods, choose Tools | Templates.
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
