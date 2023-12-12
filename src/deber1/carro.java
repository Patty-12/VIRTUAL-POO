/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber1;

/**
 *
 * @author Tenshi
 */
public class carro extends vehiculo{

    public carro(String marca, String año, String chasis) {
        super(marca, año, chasis);
    }

    public carro() {
    }
    
    public void reparacionPuertas(){
        System.out.println("METODO PARA REPARACION DE PUERTAS DE CARROS");
    }
}
