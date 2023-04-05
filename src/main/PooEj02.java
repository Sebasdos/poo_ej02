
package main;

import entidades.Circunferencia;
import java.util.Scanner;


public class PooEj02 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Circunferencia c1 = new Circunferencia(leer.nextInt());
        c1.crearCircunferencia();
        c1.area();
        System.out.println("el area del circulo es: "+c1.area());
        c1.peri();
        System.out.println("el perimetro del circulo es: "+c1.peri());
                      
        
    }
    
}
