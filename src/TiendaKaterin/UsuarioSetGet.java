package TiendaKaterin;
/**
 *@author Adonis
 *@author Samuel
 *@author Yasuri
 *@since 27/04/2019
 *@version 8.2
 * 
 */

 /** Se creara una clase llamada UsuarioSetget La cual la utilizaremos para 
 * hacer los set y los get de el registro de los usuarios es decir los set para asinar 
 * una valores a las variables y los get para que me retorne los valores de cada variable
 * estos los heredamos de una clase abstract
 */ 
public class UsuarioSetGet extends ClaseAbstractUsuario{
/**
 * 
 * @param id 
 */
    @Override
    public void setId(int id) {
        super.setId(id); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getId() {
        return super.getId(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTelefono(int telefono) {
        super.setTelefono(telefono); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTelefono() {
        return super.getTelefono(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setApellidos(String apellidos) {
        super.setApellidos(apellidos); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getApellidos() {
        return super.getApellidos(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNombres(String nombres) {
        super.setNombres(nombres); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNombres() {
        return super.getNombres(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTipo(String tipo) {
        super.setTipo(tipo); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTipo() {
        return super.getTipo(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPassword() {
        return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setUsuario(String usuario) {
        super.setUsuario(usuario); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getUsuario() {
        return super.getUsuario(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setdni(int dni) {
        super.setdni(dni); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getdni() {
        return super.getdni(); //To change body of generated methods, choose Tools | Templates.
    }
           

 
}
