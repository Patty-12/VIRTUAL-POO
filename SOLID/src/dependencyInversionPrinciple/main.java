
package dependencyInversionPrinciple;


public class main {

/*
El principio explica que se debe depender de las abstracciones y no depender de las implementaciones, en el ejemplo se puede ver una clase llamada
reporte generador, la cual en un principio tenia como atributos a las clases pdfGenerador y csvGenerador para implementar una metodo llamado
exportar, pero que pasaria si se añade una clase llamada excelGenerador, tocaria agregar otro atributo a la clase reporteGenerador y esto 
romperia con el principio de inversion de dependencias, por lo que la solucion es crear una interfaz con un metodo exportar e implementar en cada
clase(pdfGenerador, csvGenerador) y en la case principal reporteGenerador colocarla como atributo, con su respectivo constructor.
De esta forma se crea un metodo generar y se llama el metodo de la interfaz, por lo que no importaria si se manda a generar ya sea por pdf o csv
la clase va funcionar deacuerdo a la clase enviada que implementa el metodo de la interfaz por el constructor.
*/
    public static void main(String[] args) {
        reporteGenerador reportes=new reporteGenerador(new pdfGenerador());
        reporteGenerador reportes1=new reporteGenerador(new csvGenerador());
        
    }
    
}
