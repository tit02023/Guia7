/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtra1;

import EjercicioExtra1.entidad.Cancion;

/**
 Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
public class CancionMain {
    
    public static void main(String[] args) {
        Cancion sonido = new Cancion();
    
    
    sonido.setTitulo("Summer of 69");
    sonido.setAutor("Bryan Adams");
    
    System.out.println("El titulo de la cancion es: "+ "" + sonido.getTitulo());
    System.out.println("El autor de la cancion es: "+ "" + sonido.getAutor());
    
    }
    
    
    
}
