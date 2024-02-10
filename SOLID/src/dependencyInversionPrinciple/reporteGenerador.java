
package dependencyInversionPrinciple;

public class reporteGenerador {    
    
    private final generador generador;

    public reporteGenerador(generador generador) {
        this.generador = generador;
    }
    

    
    
    public void generar(){
        generador.exportar();
    }
    /*
    private final pdfGenerador pdf;
    private final csvGenerador csv;

    public reporteGenerador(pdfGenerador pdf, csvGenerador csv) {
        this.pdf = pdf;
        this.csv = csv;
    }
    
    public void generarPdf(){
        
    }
    
    public void generarCSV(){
        
    }*/
    
}
