/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiante
 */
public class Revista extends Ejemplar {
    private double NumEdi;

    public Revista(double NumEdi, String id, String Titulo, double Numpag) {
        super(id, Titulo, Numpag);
        this.NumEdi = NumEdi;
    }
   
   
    public Revista() {
        super();
        this.NumEdi = 0;
    }

    public double getNumEdi() {
        return NumEdi;
    }

    public void setNumEdi(double NumEdi) {
        this.NumEdi = NumEdi;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Numero de Edicion: " + NumEdi;
    }
    
}
