
package openClosed;

import java.util.List;


public class superAdmin extends usuario {

    public superAdmin(String nombre, openClosed.rol rol, List<permiso> permisos) {
        super(nombre, rol.SUPER_ADMIN,List.of(permiso.values()));
    }
    
    
}
