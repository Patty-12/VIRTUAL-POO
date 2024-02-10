/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaceSegregationPrinciple;

/**
 *
 * @author Yagami
 */
public interface crudUsuario {
    usuario obtenerUsuario(long id);
    usuario crearUsuario(usuario usuario);
    usuario actualizarUsuario(usuario usuario);
    void eliminarUsuario(long id);
}
