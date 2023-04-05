/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
1 Método constructor que inicialice el radio pasado como parámetro.
2 Métodos get y set para el atributo radio de la clase Circunferencia.
3 Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
4 Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
5 Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).
.
 */
package entidades;

import java.util.Scanner;


public class Circunferencia {
    
    private int radio;

    public Circunferencia(int radio) {
        this.radio = radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }
    
    public void crearCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Radio");
        radio=leer.nextInt();
               
    }
    
    public double area(){
        double area = Math.pow(radio,2)*Math.PI;
        return Math.round(area);
        
    }
    
    public double peri(){
        double perim = 2*Math.PI*radio;
        return Math.round(perim);
    }

    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
    
    
    
    
}
