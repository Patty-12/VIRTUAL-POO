
package openClosed;

import java.util.List;


public class usuario {
    public String nombre;
    public final rol rol;
    public final List<permiso> permisos;

    public usuario(String nombre, rol rol, List<permiso> permisos) {
        this.nombre = nombre;
        this.rol = rol;
        this.permisos = permisos;
    }

    

    
    
}
