/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtra2;

import EjercicioExtra2.entidad.Puntos;

/**
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos.
 */
public class PuntosMain {
    
    public static void main(String[] args) {
        Puntos puntos = new Puntos();
        
        puntos.crearPuntos();
//        puntos.calcularDistancia();
//        System.out.println("El punto x1 es: "+ ""+ puntos.getX1());
//        System.out.println("El punto y1 es: "+ ""+ puntos.getY1());
//        System.out.println("El punto x2 es: "+ ""+ puntos.getX2());
//        System.out.println("El punto y1 es: "+ ""+ puntos.getY1());
//        System.out.println("punto x1 es: "+ puntos.crearPuntos());
//        System.out.println("punto y1 es: "+ puntos.crearPuntos());
//        System.out.println("punto x2 es: "+ puntos.crearPuntos());
//        System.out.println("punto y2 es: "+ puntos.crearPuntos());
        System.out.println("La distancia entre los puntos es: " + "" + puntos.calcularDistancia());
        
        
    }
    
}
