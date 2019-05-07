
package Control_BD;

import FormularioCliente.AgregarCliente;
import FormularioCliente.ListarCliente;
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
public class ControlClienteConsultasProductos {
    //Esto es para el control de clientes 
       //modelo para la tabla
    DefaultTableModel modelo1;   
       private String sSQL1 = "";
    //vector con los titulos de cada columna
    String[] titulosColumnasp = {"ID", "NOMBRE", " PRECIO VENTA","DESCRIPCION","CANTIDAD","PRECIO COMPRA"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String[][] info1 = {};
   
    //Esto es para el consultas
     //modelo para la tabla
    DefaultTableModel modelo2;
    //matriz donde se almacena los datos de cada celda de la tabla
    //vector con los titulos de cada columna
    String info[][];
    // Conectar Base de Datos
    ConexionConBaseDatos conectar = new ConexionConBaseDatos();
    
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

    public ControlClienteConsultasProductos() {
        this.info = new String[][]{};
    }
    
    //Esto es para el control de productos
      //modelo para la tabla
    DefaultTableModel modelo;   
       String sSQL2 = "";
    //vector con los titulos de cada columna
    String[] titulosColumnas = {"ID", "NOMBRE", " PRECIO VENTA","DESCRIPCION","CANTIDAD","PRECIO COMPRA"};
    //matriz donde se almacena los datos de cada celda de la tabla
    String[][] info2 = {};
    
    
    //Primero haremos los metodos de Cliente.
    
    public void Agregar(String nombre, String apellido, String razon_social,String ruc,String direccion,String telefono,String correo) {

         Connection reg = ConexionConBaseDatos.getConexion();
        
         String sql = "INSERT INTO table_Cliente ( idCliente, Nombre_Cliente, Apellido_Cliente,razon_s_Cliente,ruc_Cliente,direccion_Cliente,telefono_Cliente,correo_Cliente)VALUES (?,?,?,?,?,?,?,?)";
            try {
            PreparedStatement pst= reg.prepareStatement(sql);
            pst.setString(1,"");
            pst.setString(2,nombre);
            pst.setString(3,apellido);
            pst.setString(4, razon_social);
            pst.setString(5, ruc);
            pst.setString(6, direccion);
            pst.setString(7, telefono);
            pst.setString(8, correo);
            int n = pst.executeUpdate();
            if (n>0){
                JOptionPane.showMessageDialog(null,"Regristado Exitosamente de Cliente");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error - "+ex);
            Logger.getLogger(AgregarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//Aqui cierra metodo agregarCliente
    //Aqui cierra metodo agregarCliente

    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    /**
     * Metodo para listar todos los registros de la tabla
     * de clientes, los muestra en un jtable.
     */
    public void listarTodosClientes() {
        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      
    }//cierra metodo listarTodosClientes
        public void CargarModificarClientes() {

        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
    

    }    
      
        //Este metodo es para eliminar clientes
    public void CargarEliminarClientes() {
        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
     
    } 
        public void CargarClientes() {

        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
     
       

    }//cierra metodo cargarTodosClientes
    public void CargarClientesVentas() {

        modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

    }//aqui se cierra metodo cargarTodosClientes
    //----------------------------------------------------------------------------
     /**
     * Metodo para consultar todos los registros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    Connection conexion01 = null;
    Statement sentencia = null;
    ResultSet resultado = null;
    PreparedStatement ps = null;

   
    //---------------------------------------------------------------------------------
    //Es para buscar Cliente
    public void buscar(String parametroBusqueda, boolean buscarPorCedula, boolean buscarPorNombre, boolean buscarPorApellido) {

            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
            //le asigna el modelo1 al jtable
            ListarCliente.jTableListarCliente.setModel(modelo1);
            //ejecuta una consulta a la BD
            buscarT(parametroBusqueda, buscarPorCedula, buscarPorNombre, buscarPorApellido);
    }//Aqui se cierra metodo buscarCliente
    //-------------------------------------------------------------------------------
    
    //Este metodo es para buscar la lista de cliente
    public void buscar(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
            //le asigna el modelo1 al jtable
            ListarCliente.jTableListarCliente.setModel(modelo1);
            //ejecuta una consulta a la BD
            buscarT(parametroBusqueda);
    }//cierra metodo buscarCliente  
    //Este metodo es para buscarModificarCliente 
    public void buscarModificarCliente(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
          
    }//cierra metodo buscarCliente    
    public void buscarEliminarCliente(String parametroBusqueda) {
            modelo1 = new DefaultTableModel(info1, titulosColumnasp) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            ;
    }//Aqui cierra metodo buscarCliente
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
     * clientes, se puede buscar por la cedula o por el nombre.
     */
        public void buscarT(String parametroBusqueda) {
        try {
            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;

                selectSQL = "SELECT * FROM table_Cliente WHERE  Nombre_Cliente LIKE ?  or  ruc_Cliente LIKE ? or  razon_s_Cliente LIKE ? ORDER BY idCliente ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
                ps.setString(2, "%" + parametroBusqueda + "%");
                ps.setString(3, "%" + parametroBusqueda + "%");

            resultado = ps.executeQuery();

            while (resultado.next()) {
           
          int codigo = resultado.getInt("idCliente");
                String nombre = resultado.getString("Nombre_Cliente");
                String apellido = resultado.getString("Apellido_Cliente");
                String razon_s_cliente = resultado.getString("razon_s_Cliente");
                String ruc_cliente = resultado.getString("razon_s_Cliente");
                String direccion_Cliente = resultado.getString("direccion_Cliente");
                String telefono_Cliente = resultado.getString("telefono_Cliente");
                String correo_Cliente = resultado.getString("correo_Cliente");
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, apellido, razon_s_cliente,ruc_cliente,direccion_Cliente,telefono_Cliente,correo_Cliente};;                

                //al modelo1 de la tabla le agrega una fila
                //con los datos que están en info1
                modelo1.addRow(info);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }
    }//Aqui secierra metodo buscarRegistro
        //-----------------------------------------------------------------------------
        
        //Este es el metodo es para buscar registro por nombre o apellido.
    public void buscarT(String parametroBusqueda, boolean buscarPordni, boolean buscarPorNombre, boolean buscarPorApellido) {

        try {

            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;
       
             if(buscarPorNombre== true){
                selectSQL = "SELECT * FROM table_Cliente WHERE Nombre_Cliente LIKE ? ORDER BY idCliente ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            else if(buscarPorApellido== true){

                selectSQL = "SELECT * FROM table_Cliente WHERE Apellido_Cliente LIKE ? ORDER BY idCliente ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            resultado = ps.executeQuery();

            while (resultado.next()) {
                int codigo = resultado.getInt("idCliente");
                String nombre = resultado.getString("Nombre_Cliente");
                String apellido = resultado.getString("Apellido_Cliente");
                 String direccion = resultado.getString("direccion_Cliente");
                String razon_s_cliente = resultado.getString("razon_s_Cliente");
                String ruc_cliente = resultado.getString("razon_s_Cliente");                

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo,nombre, apellido, direccion,razon_s_cliente,ruc_cliente};
                //Al modelo1 de la tabla le agrega una fila
                //con los datos que están en info1
                modelo1.addRow(info);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }
    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    /**
     * Método para validar la entrada del usuario
     * que ingresa para eliminar un cliente
     */
    //Este es el metodo para eliminar Cliente
    public void EliminarCliente(String code) {

        try {            
     Connection conexion = ConexionConBaseDatos.getConexion();
            Statement comando = conexion.createStatement();
            int cantidad = comando.executeUpdate("delete from table_Cliente where idCliente=" + code);
            if (cantidad == 1) {
   
                JOptionPane.showMessageDialog(null,"Eliminado");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Cliente de Codigo "+code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ex);
        }

    }//cierra metodo eliminarCliente
    //----------------------------------------------------------------------------
    public void Modificar(String code,String nombre, String apellido, String razon_social,String ruc,String direccion,String telefono,String correo) {

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/tiendakaterin", "root", "");
      
            Statement comando = conexion.createStatement();

            // linea de codigo de mysql que actualiza regristos que va modificar
            int cantidad = comando.executeUpdate("update table_Cliente set Nombre_Cliente ='" + nombre + "', "
                + " Apellido_Cliente ='" + apellido + "'" +  " "+ ", razon_s_Cliente ='" + razon_social + "'"+  ", direccion_Cliente ='" + direccion + "', telefono_Cliente ='" + telefono + "', correo_Cliente ='" + correo + "' , ruc_Cliente ='"+ruc+"'  where idCliente=" + code);
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null," Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Vendedor de un codigo "+code);
            }
            conexion.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Error -->"+ex);
        }
    }//cierra metodo modificarCliente
 //--------------------------------------------------------------------------------------

    
    //Hoy haremos los metodos para productos
     //Este metodo es para agregar un producto
     public void agregar(String cedula, String nombre, String apellido, String direccion, String telefono) {    
    }//cierra metodo agregarCliente
     public void CargarProductos(){ 
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      
     }
          public void CargarProductosVentas(){
         
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      
        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTablaventas();
     }  
          public void CargarProductos2(){
         
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        
     }
          public void CargarProductos_eliminar(){
         
         modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      
         
     }    
     
      public DefaultTableModel mostrar_inicial() {
        //cargar tabla plan sin parametros
            // conexion2 = ConexionConBaseDatos.getConexion();
          
          int totalregistros;
     //   DefaultTableModel modelo1;

        String[] titulos = {"id", "nombres", "precio", "dias"};

        String[] registro = new String[14];

        totalregistros = 0;
        modelo = new DefaultTableModel(null, titulos);

            sSQL2 = "SELECT idProductos,nombreProductos,preciosProductos,descripcionProductos,cantidadProductos,preciocompraProductos FROM table_Productos ORDER BY idProductos ASC";

        try {
            conexion01 = ConexionConBaseDatos.getConexion();

//              conexion2 = DriverManager.getConnection("jdbc:mysql://localhost/Ultimate_FerreteriaAndres", "root", "");
            Statement st = conexion01.createStatement();
            ResultSet rs = st.executeQuery(sSQL2);

            while (rs.next()) {
            
                 registro[0]  = resultado.getString("idProductos");
                registro[1] = resultado.getString("nombreProductos");
                registro[2] = resultado.getString("preciosProductos");
                registro[3] = resultado.getString("descripcionProductos");
                registro[4] = resultado.getString("cantidadProductos");
                registro[5] = resultado.getString("preciocompraProductos");
                //crea un vector donde los está la informacion (se crea una fila)
               // Object[] info2 = {codigo, nombre, precioventa,descripcion,cantidad,preciocompra};
                    
                totalregistros = totalregistros + 1;
                modelo.addRow(registro);

            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    /**
     * Metodo para listar todos los registros de la tabla
     * de clientes, los muestra en un jtable.
     */
      
      public void listarTodosProductos_por_agotar() {

        modelo = new DefaultTableModel(info2, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
        ConsultarProductos.jTableListarCliente.setModel(modelo);


        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabla_por_agotar();
        

    }
      
      
    public void listarTodosProductos() {

        modelo = new DefaultTableModel(info2, titulosColumnas) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      

    }//cierra metodo listarTodosClientes
    
     /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
    

        public void ejecutarConsultaTodaTabla_por_agotar() {

        try {
            conexion01 = ConexionConBaseDatos.getConexion();

            sentencia = conexion01.createStatement();
            //ORDER BY idProductos
            String consultaSQL = "select * from table_productos where cantidadProductos<=4";
                          Statement st = conexion01.createStatement();
            ResultSet rs = st.executeQuery(consultaSQL);


            //mientras haya datos en la BD ejecutar eso...
            while (rs.next()) {


                String codigo = rs.getString("idProductos");
                String nombre = rs.getString("nombreProductos");
                String precioventa = rs.getString("preciosProductos");
                String descripcion = rs.getString("descripcionProductos");
                String cantidad = rs.getString("cantidadProductos");
                   String preciocompraProductos = rs.getString("preciocompraProductos");

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
        
            public void ejecutarConsultaTodaTablaventas() {

        try {
            conexion01 = ConexionConBaseDatos.getConexion();

            sentencia = conexion01.createStatement();
            String consultaSQL = "SELECT * FROM table_Productos WHERE cantidadProductos>0 ORDER BY idProductos ASC ";
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
        
    public void buscarProductos(String parametroBusqueda) {

            modelo = new DefaultTableModel(info2, titulosColumnas) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el modelo al jtable
            ConsultarProductos.jTableListarCliente.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroProductos(parametroBusqueda);

    }
    /**
     *  Este metodo es para buscar  registrosProductos
     */

    public void buscarRegistroProductos(String parametroBusqueda) {

        try {

            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;
                            
                selectSQL = "SELECT * FROM table_Productos WHERE nombreProductos LIKE ? ORDER BY idProductos ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
    
            resultado = ps.executeQuery();

            while (resultado.next()) {
                String codigo = resultado.getString("idProductos");
                String nombre = resultado.getString("nombreProductos");
                String precioventa = resultado.getString("preciosProductos");
                String descripcion = resultado.getString("descripcionProductos");
                String cantidad = resultado.getString("cantidadProductos");
                String preciocompra = resultado.getString("preciosProductos");
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, precioventa,descripcion,cantidad,preciocompra};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }


    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    /**
     * Método para validar la entrada del usuario
     * que ingresa para eliminar un cliente
     */
    //Este metodo es para eliminar Productos
    public void Eliminar(String code) {

        try {            
             conexion01 = ConexionConBaseDatos.getConexion();
            Statement comando = conexion01.createStatement();
            int cantidad = comando.executeUpdate("delete from table_Productos where idProductos=" + code);
            if (cantidad == 1) {
   
                JOptionPane.showMessageDialog(null,"Eliminado");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Producto de Codigo "+code);
            }
            conexion01.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"error "+ex);
        }

    }//cierra metodo eliminarCliente

    
    /**
     * Método para validar y modificar la 
     * información de un cliente.
     */
    public void Modificar(String code,String nombre,float precios,String descripcion,int cantidad_productos, float preciocompra,float dif) {

    
        try {
             conexion01 = ConexionConBaseDatos.getConexion();
            Statement comando = conexion01.createStatement();
            
            // linea de codigo de mysql que actualiza regristos que va modificar
            int cantidad = comando.executeUpdate("update table_Productos set nombreProductos ='" + nombre + "', "
                + " preciosProductos ='" + precios + "' "+ ", descripcionProductos ='" + descripcion + "'"+ ", cantidadProductos ='" + cantidad_productos + "'"+ " , preciocompraProductos ='" + preciocompra + "' , Difererencia =" + dif + "  where idProductos=" + code);
            if (cantidad == 1) {
                JOptionPane.showMessageDialog(null," Modifico con Exito");
            } else {
                JOptionPane.showMessageDialog(null,"No existe Vendedor de un codigo "+code);
            }
            conexion01.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null," Error -->"+ex);
        }
    }//cierra metodo modificarCliente
    
    
    
    
    //es para buscar productos de compras en ventas- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
     
    public void buscarProductosparaVentas(String parametroBusqueda) {

        

            modelo = new DefaultTableModel(info2, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            
            //ejecuta una consulta a la BD
            buscarRegistroProductoss(parametroBusqueda);

    }
        public void buscarProductosparaProductos(String parametroBusqueda) {

        

            modelo = new DefaultTableModel(info2, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el modelo al jtable
            ModificarProductos.jTable_productos.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroProductoss(parametroBusqueda);

    }
        
             public void buscarProductosparaEliminarProductos(String parametroBusqueda) {

        

            modelo = new DefaultTableModel(info2, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

            ;
            //le asigna el modelo al jtable
                 EliminarProductos.jTable_productos.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarRegistroProductoss(parametroBusqueda);

    } 
    
    
    public void buscarRegistroProductoss(String parametroBusqueda) {

        try {

            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;
//  + " nombres like '%"
  //              + buscar + "%'                            
                selectSQL = "SELECT * FROM table_Productos WHERE nombreProductos LIKE ? AND cantidadProductos>0 ORDER BY idProductos ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
    
            resultado = ps.executeQuery();

            while (resultado.next()) {
                String codigo = resultado.getString("idProductos");
                String nombre = resultado.getString("nombreProductos");
                String precioventa = resultado.getString("preciosProductos");
                String descripcion = resultado.getString("descripcionProductos");
                String cantidad = resultado.getString("cantidadProductos");
                String preciocompra = resultado.getString("preciosProductos");
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {codigo, nombre, precioventa,descripcion,cantidad,preciocompra};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info2
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }
    }
    
    //Aqui hacemos los metotodos de consulta
      
    public void listarTodosFacturas() {
        
        String[] titulosColumnas = {"No_Facturas", "CLIENTE", "RAZÓN SOCIAL", "FECHA","TOTAL"};

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
      //le asigna el modelo al jtable
      //  ConsultarFacturas.jTableListarFacturas.setModel(modelo);

        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabladeFacturas();

    }//cierra metodo listarTodosFacturas
     /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */
 

    public void ejecutarConsultaTodaTabladeFacturas() {

        try {
            //Ya esta heredado el metodo
            conexion01 = ConexionConBaseDatos.getConexion();

            sentencia = conexion01.createStatement();
            String consultaSQL = "SELECT * FROM table_Facturas f inner join  table_Cliente c on f.cliente=c.idCliente ORDER BY fecha ASC";
            resultado = sentencia.executeQuery(consultaSQL);


            //mientras haya datos en la BD ejecutar eso...
            while (resultado.next()) {


             int fact = resultado.getInt("No_Facturas");
                String cliente = resultado.getString("c.Nombre_Cliente")+resultado.getString("c.Apellido_Cliente");
                String razons = resultado.getString("c.razon_s_Cliente");
                String fecha = resultado.getString("fecha");
                String total = resultado.getString("totals");



                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {fact,cliente,razons,fecha,total};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
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
    
  
    public void buscarFacturas(String parametroBusqueda, boolean buscarPorFacturas, boolean buscarPorCliente, boolean buscarPorFecha) {

        String[] titulosColumnas = {"No_Facturas", "CLIENTE","RAZÓN SOCIAL", "FECHA","TOTAL"};
        if ((parametroBusqueda.trim().length() == 0)) {
            JOptionPane.showMessageDialog(null,"Error, datos incorrectos");
        } else {

            modelo = new DefaultTableModel(info, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

          

            //le asigna el modelo al jtable
        //    ConsultarFacturas.jTableListarFacturas.setModel(modelo);
            //ejecuta una consulta a la BD
            buscarFacturasporBusqueda(parametroBusqueda, buscarPorFacturas, buscarPorCliente, buscarPorFecha);

        }

    }//cierra metodo buscarCliente
    
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
     * clientes, se puede buscar por la cedula o por el nombre.
     */
    public void buscarFacturasporBusqueda(String parametroBusqueda, boolean buscarPorFacturas, boolean buscarPorCliente, boolean buscarPorFecha) {

        try {
            //Ya esta heredado el metodo de la clase conexion2
            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;
            if (buscarPorFacturas == true) {     
                System.out.print("buscando por facturas");
                selectSQL = "SELECT * FROM table_Facturas WHERE No_Facturas LIKE ? ORDER BY fecha ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            } 
            else if(buscarPorCliente== true){
                System.out.print("buscando por cliente");
                selectSQL = "SELECT * FROM table_Facturas f inner join  table_Cliente c on f.cliente=c.idCliente WHERE   c.ruc_Cliente LIKE ? or  c.razon_s_Cliente LIKE ? or c.Nombre_Cliente LIKE ? ORDER BY fecha ASC";
                ps = conexion01.prepareStatement(selectSQL);

                 ps.setString(1, "%" + parametroBusqueda + "%");
                  ps.setString(2, "%" + parametroBusqueda + "%");
                        ps.setString(3, "%" + parametroBusqueda + "%");
            }
            else if(buscarPorFecha== true){

                System.out.print("buscando por fecha -->"+parametroBusqueda);
                selectSQL = "SELECT * FROM table_Facturas f inner join  table_Cliente c on f.cliente=c.idCliente WHERE f.fecha LIKE ?  ORDER BY fecha ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            }
            resultado = ps.executeQuery();

            while (resultado.next()) {
                int fact = resultado.getInt("No_Facturas");
                String cliente = resultado.getString("c.Nombre_Cliente")+resultado.getString("c.Apellido_Cliente");
                String fecha = resultado.getString("fecha");
                String total = resultado.getString("totals");
                String razons = resultado.getString("razon_s_Cliente");   

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {fact,cliente,razons, fecha,total};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }


    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
    
    
    //esta es la parte de mostar detalle de facturas por la tabla venta
    
    //metodo para buscar un producto
    public void buscarFacturas ( String number){
        
        String[] titulosColumnas = {"ID-VENTAS", "PRODUCTOS", "CANTIDAD", "IMPORTE"};
        if( (number.trim().length()==0)){
            JOptionPane.showMessageDialog(null,"Error, Seleccione la Facturas");
        }
        else{
            
            modelo = new DefaultTableModel(info,titulosColumnas){
                public boolean isCellEditable(int row, int column)
                {
                return false;
                }   
            };   
        //le asigna el modelo al jtable
      
       //ejecuta una consulta a la BD   
        buscarFacturasDetall(number);         
        }
        
    }//cierra metodo buscarCliente
    
      public void buscarFacturasDetall(String number) {

        try {
            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;
           
                selectSQL = "SELECT * FROM table_ventas WHERE No_Facturas LIKE ? ORDER BY idVentas ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + number + "%");
            
            resultado = ps.executeQuery();

            while (resultado.next()) {
                String id = resultado.getString("idVentas");
                String product = resultado.getString("productos");
                String cant = resultado.getString("cantidad");
                String imp = resultado.getString("importe");
                //crea un vector donde los está la informacion (se crea una fila)
                
                //buscar producto
                String name="";
                Statement comando = conexion01.createStatement();
                 ResultSet registro = comando.executeQuery("select idProductos,nombreProductos from table_productos where idProductos=" +product);
            
                 if (registro.next() == true) {
                     name = registro.getString("nombreProductos");
                    }
            // cierdda de buscar productos
                Object[] info = {id,name,cant,imp};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n " + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }


    }//cierra metodo buscarRegistro
      // parte de todo consultas en ventas--------------------------------------------------------------
      //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
    
    public void listarTodosVentas() {
        
        String[] titulosColumnas = {"id-Ventas","Fecha", "Producto", "cantidad", "Importe"};

        modelo = new DefaultTableModel(info, titulosColumnas) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        //ejecuta una consulta a la BD
        ejecutarConsultaTodaTabladeVentas();

    }//cierra metodo listarTodosFacturas
     /**
     * Metodo para consultar todos los regsitros de la base de datos de clientes
     * y luego ser mostrados en una tabla.
     */


    public void ejecutarConsultaTodaTabladeVentas() {

        try {
            conexion01 = ConexionConBaseDatos.getConexion();
            sentencia = conexion01.createStatement();
            String consultaSQL = "SELECT * FROM table_Facturas f inner join  table_Ventas v on f.No_Facturas=v.No_Facturas inner join  table_Productos p on v.Productos=p.idProductos ORDER BY v.idVentas ASC";
            resultado = sentencia.executeQuery(consultaSQL);
            //mientras haya datos en la BD ejecutar eso...
            while (resultado.next()) {
                int num = resultado.getInt("idVentas");
                String fact = resultado.getString("f.fecha");
                String prod = resultado.getString("p.nombreProductos");
                String cant = resultado.getString("cantidad");
                String importe = resultado.getString("importe");

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {num,fact,prod,cant,importe};

                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
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
       
    public void buscarFacturasdeVentasFecha(String parametroBusqueda,String parametroBusqued2) {

        String[] titulosColumnas = {"id-Ventas","Fecha", "Producto", "cantidad", "Importe"};
        if ((parametroBusqueda.trim().length() == 0)) {
            JOptionPane.showMessageDialog(null,"Error, datos incorrectos");
        } else {

            modelo = new DefaultTableModel(info, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            
            //ejecuta una consulta a la BD
            buscarFacturasporBusquedaenVentasFecha(parametroBusqueda,parametroBusqued2);

        }

    }//cierra metodo buscarCliente
    public void buscarFacturasdeVentas(String parametroBusqueda) {

        String[] titulosColumnas = {"id-Ventas","Fecha", "Producto", "cantidad", "Importe"};
        if ((parametroBusqueda.trim().length() == 0)) {
            JOptionPane.showMessageDialog(null,"Error, datos incorrectos");
        } else {

            modelo = new DefaultTableModel(info, titulosColumnas) {
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            //ejecuta una consulta a la BD
            buscarFacturasporBusquedaenVentas(parametroBusqueda);

        }

    }//cierra metodo buscarCliente
    
    /**
     * Método para buscar un registro en la base de datos dentro de la tabla
     * clientes, se puede buscar por la cedula o por el nombre.
     */
    public void buscarFacturasporBusquedaenVentasFecha(String parametroBusqueda,String parametroBusqueda2) {

        try {

        
            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;
                System.err.println(parametroBusqueda2+"    "+parametroBusqueda);
                System.out.print("buscando por facturas en Ventas");
               selectSQL = "SELECT * FROM table_Facturas f inner join  table_Ventas v on f.No_Facturas=v.No_Facturas inner join  table_Productos p on v.Productos=p.idProductos WHERE " +"  fecha<= '" +parametroBusqueda2+"' AND  fecha>= '"+parametroBusqueda+"'";
               
                      Statement st = conexion01.createStatement();
            ResultSet rs = st.executeQuery(selectSQL);
            
             
float total=0;
float ganancia=0;
//Difererencia
            while (rs.next()) {
                int num = rs.getInt("idVentas");
                String fact = rs.getString("f.fecha");
                String prod = rs.getString("p.nombreProductos");
                String cant = rs.getString("v.cantidad");
                String importe = rs.getString("v.importe");
                total=total+rs.getFloat("v.importe");
                //ganancia=ganancia+rs.getFloat("p.Difererencia");
                ganancia=ganancia+(rs.getInt("p.Difererencia"))*(rs.getInt("v.cantidad"));

                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {num,fact,prod,cant,importe};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }
    }
    public void buscarFacturasporBusquedaenVentas(String parametroBusqueda) {

        try {

        
            conexion01 = ConexionConBaseDatos.getConexion();
            String selectSQL;
            resultado = null;
                
                System.out.print("buscando por facturas en Ventas");
               selectSQL = "SELECT * FROM table_Facturas f inner join  table_Ventas v on f.No_Facturas=v.No_Facturas inner join  table_Productos p on v.Productos=p.idProductos WHERE p.nombreProductos LIKE ? ORDER BY v.idVentas ASC";
                ps = conexion01.prepareStatement(selectSQL);
                ps.setString(1, "%" + parametroBusqueda + "%");
            
            resultado = ps.executeQuery();
float total=0;
float ganancia=0;
            while (resultado.next()) {
                int num = resultado.getInt("idVentas");
                String fact = resultado.getString("f.fecha");
                String prod = resultado.getString("p.nombreProductos");
                String cant = resultado.getString("v.cantidad");
                String importe = resultado.getString("v.importe");
                
total=total+resultado.getInt("v.importe");
ganancia=ganancia+(resultado.getInt("p.Difererencia"))*(resultado.getInt("v.cantidad"));
                //crea un vector donde los está la informacion (se crea una fila)
                Object[] info = {num,fact,prod,cant,importe};
                //al modelo de la tabla le agrega una fila
                //con los datos que están en info
                modelo.addRow(info);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error\n Por la Causa" + e);
        } finally {
            CerrarConexiones.metodoCerrarConexiones(conexion01, sentencia, resultado, ps);
        }


    }//cierra metodo buscarRegistro
    //- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
      
      
}
