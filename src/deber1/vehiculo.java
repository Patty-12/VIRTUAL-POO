/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deber1;

/**
 *
 * @author Tenshi
 */
public abstract class vehiculo {
    String marca;
    String año;
    String chasis;
    private String cilindraje;

    public vehiculo(String marca, String año, String chasis ) {
        this.marca = marca;
        this.año = año;
        this.chasis = chasis;
    }

    public vehiculo() {
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }
    
    
}
