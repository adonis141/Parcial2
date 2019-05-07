package Control_BD;

import FormularioCliente.ListarCliente;
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


public class Control_Consultas extends ControlClienteConsultasProductos{

    @Override
    public void buscarFacturasporBusquedaenVentas(String parametroBusqueda) {
        super.buscarFacturasporBusquedaenVentas(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturasporBusquedaenVentasFecha(String parametroBusqueda, String parametroBusqueda2) {
        super.buscarFacturasporBusquedaenVentasFecha(parametroBusqueda, parametroBusqueda2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturasdeVentas(String parametroBusqueda) {
        super.buscarFacturasdeVentas(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturasdeVentasFecha(String parametroBusqueda, String parametroBusqued2) {
        super.buscarFacturasdeVentasFecha(parametroBusqueda, parametroBusqued2); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutarConsultaTodaTabladeVentas() {
        super.ejecutarConsultaTodaTabladeVentas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarTodosVentas() {
        super.listarTodosVentas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturasDetall(String number) {
        super.buscarFacturasDetall(number); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturas(String number) {
        super.buscarFacturas(number); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturasporBusqueda(String parametroBusqueda, boolean buscarPorFacturas, boolean buscarPorCliente, boolean buscarPorFecha) {
        super.buscarFacturasporBusqueda(parametroBusqueda, buscarPorFacturas, buscarPorCliente, buscarPorFecha); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarFacturas(String parametroBusqueda, boolean buscarPorFacturas, boolean buscarPorCliente, boolean buscarPorFecha) {
        super.buscarFacturas(parametroBusqueda, buscarPorFacturas, buscarPorCliente, buscarPorFecha); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void ejecutarConsultaTodaTabladeFacturas() {
        super.ejecutarConsultaTodaTabladeFacturas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarTodosFacturas() {
        super.listarTodosFacturas(); //To change body of generated methods, choose Tools | Templates.
    }

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

    @Override
    public void Modificar(String code, String nombre, float precios, String descripcion, int cantidad_productos, float preciocompra, float dif) {
        super.Modificar(code, nombre, precios, descripcion, cantidad_productos, preciocompra, dif); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Eliminar(String code) {
        super.Eliminar(code); //To change body of generated methods, choose Tools | Templates.
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
    }

    @Override
    public void CargarProductosVentas() {
        super.CargarProductosVentas(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void CargarProductos() {
        super.CargarProductos(); //To change body of generated methods, choose Tools | Templates.
    }

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
    }

    @Override
    public void buscarModificarCliente(String parametroBusqueda) {
        super.buscarModificarCliente(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscar(String parametroBusqueda) {
        super.buscar(parametroBusqueda); //To change body of generated methods, choose Tools | Templates.
    }

    //Metodo buscar con sobrecarga
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

    //Metodo en sobrecarga Agregar usuario.
    @Override
    public void Agregar(String nombre, String apellido, String razon_social, String ruc, String direccion, String telefono, String correo) {
        super.Agregar(nombre, apellido, razon_social, ruc, direccion, telefono, correo); //To change body of generated methods, choose Tools | Templates.
    }

 
      
}//cierra class
