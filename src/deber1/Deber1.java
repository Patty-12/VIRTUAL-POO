/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deber1;


/**
 *
 * @author Tenshi
 */
public class Deber1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //vehiculo v1=new vehiculo();la clase abstracta no se puede instanciar 
        carro c1=new carro("Chevrolet", "2021", "2568497526");
        c1.setCilindraje("1.6");
        System.out.println("Marca "+c1.marca);
        System.out.println("Año "+c1.año);
        System.out.println("Chasis "+c1.chasis);
        System.out.println("Cilindraje "+c1.getCilindraje());
        c1.reparacionPuertas();
        
        moto m1=new moto("Motor1", "2023", "3658497269");
        m1.setCilindraje("c200");
        System.out.println("Marca "+m1.marca);
        System.out.println("Año "+m1.año);
        System.out.println("Chasis "+m1.chasis);
        System.out.println("Cilindraje "+m1.getCilindraje());
        m1.mantenimientoCadena();
  
    }
    
}
