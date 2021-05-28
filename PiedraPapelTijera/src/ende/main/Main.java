package ende.main;

import ende.jugador.Jugador;
import ende.jugador.Juego;

/**
 * Simula el juego de Piedra, Papel o tijera
 */


public class Main 
{
    public static void main(String args[])
    {
    	Juego j1 = new Juego();
        Jugador p1 = new Jugador("Jugador 1");
        Jugador p2 = new Jugador("Jugador 2");
        
        j1.jugar(p1, p2);
    }
}
/**
 *
 */

