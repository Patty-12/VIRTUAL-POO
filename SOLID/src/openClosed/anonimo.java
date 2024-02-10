/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openClosed;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Yagami
 */
public class anonimo extends usuario {

    public anonimo(String nombre, openClosed.rol rol, List<permiso> permisos) {
        super(nombre, rol.ANONIMO, Collections.emptyList());
    }
    
}
