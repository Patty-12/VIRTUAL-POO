
package liskovSubstitutionPrinciple;


/*
El prinicipio indica que los objetos creados deber ser replazables por instancias de sus subtipos sin que se modifique el correcto funcionamiento
del programa. Esto se explica de la siguiente manera, tenemos una clase padre animal con un metodo hacer sonido, y tenemos dos clases hijas
perro y gato, cada una hereda el metodo(@Override) de la clase padre, cada una con su respectivo mensaje.

creamos en la clase main un metodo hacerSonidoAnimal y pasamos por parametos la clase animal. en el metodo main principal creamos instancias
de cada clase (perro y gato), y enviamos al metodo ya sea el perro o el gato y el programa se debe comportar segun la clase hija.

Si es perro dira q ladra
si es gato dira q maulla.

*/
public class main {

    
    public static void main(String[] args) {
        
        perro p=new perro();
        gato g=new gato();
        hacerSonidoAnimal(g);
    }
    
    public static void hacerSonidoAnimal(animal animal){
        animal.hacerSonido();
    }
    
}
