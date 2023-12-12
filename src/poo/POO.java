/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

/**
 *
 * @author Tenshi
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona1=new Persona("Patricia", "Lapuerta", 28);
        persona1.setCI("1725659492");
        System.out.println("Nombre: "+persona1.nombre);
        System.out.println("Apellido: "+persona1.apellido);
        System.out.println("Edad: "+persona1.edad);
        System.out.println("CI: "+persona1.getCI());
     
        
    }
    
}
