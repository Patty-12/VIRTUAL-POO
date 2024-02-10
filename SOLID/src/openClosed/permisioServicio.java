
package openClosed;

import java.util.Collections;
import java.util.List;

/*El principio explica que las clases deben estar abiertas a extensiones pero cerradas a modificadas
En este caso tenemos un metodo para retornar una lista de permisos deacuerdo al rol de cada usuario, en este caso
tenemos un enum de rol(ADMIN, MODERADOR, ANONIMO), una solucion seria retornar con un switch cada permiso, pero si se crea otro rol
rompe con el princip ya q tocaria modificar el metodo por el cambio de otras clases.

para eso la solucion es q el usuario tenga sus permisos y crear clases hijas q hereden el permiso correspondiente a cada rol y simplemente en 
este metodo obtenerPermisos retornar los permisos, con esto si creo otro rol como SUPER_ADMIN, no modifico el metodo.

El principio tambien aclara que es abierta a crear  extensiones, por lo q al final se crea un metodo para eliminarPermiso
 */
public class permisioServicio {
    
    private final usuarioServicio usuarioServicio;

    public permisioServicio(usuarioServicio usuarioServicio) {
        this.usuarioServicio = usuarioServicio;
    }
    
    public List<permiso> obtenerPermisos(long usuarioId){
        final usuario usu=usuarioServicio.obtenerUsuario(usuarioId);
        return usu.permisos;
    }
    
    public void eliminarPermisos(long usuarioId, permiso permiso){
        
    }
}
