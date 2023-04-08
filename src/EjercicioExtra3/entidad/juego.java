
package EjercicioExtra3.entidad;

import java.util.Scanner;

/**
 Crea una clase "Juego" que tenga 
 * un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. 
 * El primer jugador elige un número y el segundo jugador intenta adivinarlo. 
 * El segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. 
* El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y 
* el número de veces que cada jugador ha ganado.
 */
public class juego {
    
    private int jugador1;
    private int jugador2;
    private int intentos;
    private int nrointentos;

    public juego() {
    }

    public juego(int jugador1, int jugador2, int intentos, int nrointentos) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.intentos = intentos;
        this.nrointentos = nrointentos;
    }

    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getNrointentos() {
        return nrointentos;
    }

    public void setNrointentos(int nrointentos) {
        this.nrointentos = nrointentos;
    }
    
    
    
    //Metodo
    public void iniciar_Juego(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador 1 ingrese un numero a adivinar: ");
        this.jugador1 = leer.nextInt();
        System.out.println("Ingrese el numero de intentos para jugador 2: ");
        this.nrointentos = leer.nextInt();
        System.out.println("Jugador 2 ingrese un numero");
        this.jugador2 = leer.nextInt();
        
        
    }
    
    //Metodo
    public void intentos(){
        /*
        El juego termina cuando el segundo jugador adivina el número o se queda sin intentos.
        Registra el número de intentos necesarios para adivinar el número y 
        el número de veces que cada jugador ha ganado.
        */
        intentos = 0;
        for (int i = 0; i < nrointentos; i++) {
            System.out.println("Intente nuevamente.....");
            nrointentos -= nrointentos;
            if (nrointentos == intentos) {
                System.out.println("Se terminaron los intentos...");
            }
        
        }
    }
    
}
