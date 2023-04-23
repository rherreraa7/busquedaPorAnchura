/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busqueda;

import static java.sql.DriverManager.println;

/**
 *
 * @author rherrera
 */
public class Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
         int a;
         int b;
       Laberinto lab = new Laberinto();
     a=  lab.OBSTACULO;
      System.out.println("Laberinto " + a );
      
    b=  lab.getValor(0, 0);
    
       System.out.println("Laberinto " + b );
    }
    
}
