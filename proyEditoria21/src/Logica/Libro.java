/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Estudiante
 */
public class Libro extends Ejemplar {

   private String Autor,Edi;

    public Libro(String Autor, String Edi, String id, String Titulo, double Numpag) {
        super(id, Titulo, Numpag);
        this.Autor = Autor;
        this.Edi = Edi;
    }

    public Libro() {
        super();
        this.Autor = "";
        this.Edi="";
        
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getEdi() {
        return Edi;
    }

    public void setEdi(String Edi) {
        this.Edi = Edi;
    }

   @Override
  public String toString (){
          return super.toString()+
                  "Autor :"+Autor
                  +"\nEditorial: "+Edi+" \n";
  }
  
   
}
