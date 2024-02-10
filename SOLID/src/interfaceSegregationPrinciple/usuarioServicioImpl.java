
package interfaceSegregationPrinciple;

/*
El principio indica que es mejor segregar los metodos en diferentes interfaces en vez de ocupar una sola intefaz de proposito general.
En este ejemplo tenemos una interfaz usuarioServicio que contenia todos los metods que implementara usuarioServicioImpl, pero esto rompe
con el principio de segregacion, y se decide crear dos interfaces una llamada crudUsuario que tendra los metodos para el CRUD, y una interfaz
sesionServicio con los metodos inicio y cierre de sesion. De esta manera cada interfaz corresponde a un trabajo independiente y el desarrollo
de software es mas impecable.
*/
public class usuarioServicioImpl implements crudUsuario,sesionServicio{

    @Override
    public usuario obtenerUsuario(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public usuario crearUsuario(usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public usuario actualizarUsuario(usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarUsuario(long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void iniciarSesion(usuario usuadio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void cerrarSesion(usuario usuadio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
