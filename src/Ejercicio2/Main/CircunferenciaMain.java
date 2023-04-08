
package Ejercicio2.Main;

import Ejercicio2.entidad.Circunferencia;

/**
 *
 * @author tito
 */
public class CircunferenciaMain {
    
    public static void main(String[] args) {
        
        Circunferencia circ = new Circunferencia(); //crear una instancia de tipo circunferncia
        
        circ.crearCircunferencia();
        System.out.println("El area de la circunferencia es: " + circ.area());
        
        System.out.println("El perimetro de la circunferencia es: "+ circ.perimetro());
        
        
    }
    
}
