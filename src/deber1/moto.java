/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber1;

/**
 *
 * @author Tenshi
 */
public class moto extends vehiculo{

    public moto(String marca, String año, String chasis) {
        super(marca, año, chasis);
    }

    public moto() {
    }
    
    public void mantenimientoCadena(){
        System.out.println("METODO PARA MANTENIMIENTO DE CADENA");
    }
}
