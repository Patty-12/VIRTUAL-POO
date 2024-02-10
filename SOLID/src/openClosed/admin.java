/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openClosed;

import java.util.List;

/**
 *
 * @author Yagami
 */
public class admin extends usuario {

    public admin(String nombre, openClosed.rol rol, List<permiso> permisos) {
        super(nombre, rol.ADMIN, List.of(permiso.LECTURA_ESCRITURA));
    }
    
    
    
}
