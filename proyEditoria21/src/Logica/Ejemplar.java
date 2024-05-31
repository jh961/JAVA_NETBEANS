/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

public class Ejemplar {
protected String id,Titulo;
protected double Numpag;
    public Ejemplar(String id, String Titulo, double Numpag) {
        this.id = id;
        this.Titulo = Titulo;
        this.Numpag = Numpag;
    }
    public Ejemplar() {
        this.id = "";
        this.Titulo = "";
        this.Numpag = 0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public double getNumpag() {
        return Numpag;
    }

    public void setNumpag(double Numpag) {
        this.Numpag = Numpag;
    }

   

    @Override
    public String toString() {
        return " Informacion " + 
                "\n Numero de Identificacion: " + this.id 
                + "\n Nombre: " + this.Titulo 
                + "\n Numero de Paginas : " + this.Numpag +"\n";
    }
    public double ValorImp (){
    return this.Numpag*500;
    }
}
