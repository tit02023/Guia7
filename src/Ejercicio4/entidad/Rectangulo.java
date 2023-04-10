/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4.entidad;

import java.util.Scanner;

/**
    Crear una clase Rectángulo que modele rectángulos por medio de un
* atributo privado base y un atributo privado altura. 
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por
el usuario. 
* También incluirá un método para calcular la superficie del rectángulo y 
* un método para calcular el perímetro del rectángulo. 
* Por último, tendremos un método que dibujará el rectángulo mediante asteriscos
* usando la base y la altura. 
* Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
public class Rectangulo {
    
    
    
    private double base;
    private double altura;

    public Rectangulo() {
    }
    
    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    //Metodo
    public double calcularSuperficie(){
        return base * altura;
        
    }    
    //Metodo
    public double calcularPerimetro(){
        return 2*(base + altura);
    }
    //Metodo
    public void dibujarRectangulo(){
        
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(" * ");
                
            }
            System.out.println();
        }
        
    }
    //Metodos
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo: ");
        this.base = leer.nextDouble();
        System.out.println("Ingrese la altura del rectangulo: ");
        this.altura = leer.nextDouble();
        
    }
}
