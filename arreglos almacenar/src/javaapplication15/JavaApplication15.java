/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class JavaApplication15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x[]= new int[5];
       for (int z=0;z<5;z++){
           x[z]= Integer.parseInt(JOptionPane.showInputDialog("digite los valores del arreglo"));
   
      }
      for (int z=0;z<5;z++){
          JOptionPane.showMessageDialog(null,"los valores ingresados son args"+ x[z]);
    
}}}
