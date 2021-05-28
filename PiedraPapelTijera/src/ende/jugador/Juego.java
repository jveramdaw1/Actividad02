package ende.jugador;

public class Juego {
	
	private static boolean FIN_DE_JUEGO = false;
    private int rondasJugadas;
    private int empates;
    
    public Juego() {
    	this.rondasJugadas = 0;
    	this.empates = 0;
    }

	public int getRondasJugadas() {
		return rondasJugadas;
	}

	public void setRondasJugadas(int rondasJugadas) {
		this.rondasJugadas = rondasJugadas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates() {
		this.empates ++;
	}
    
    public void jugar(Jugador p1, Jugador p2) {
    	while( FIN_DE_JUEGO == false ) {
    		
        	String py1 = p1.opcionAlAzar();
        	String py2 = p2.opcionAlAzar();
        	
    		rondasJugadas ++;
    		
        	System.out.println(this.toString());
        	
    		if(py1 == py2 ) {
    			this.setEmpates();
    		}
    		else if(py1 == "tijeras" && py2 != "piedra") {
    			p1.setExitos();
    		}
    		else if(py1 == "papel" && py2 != "tijeras") {
    			p1.setExitos();
    		}
    		else if(py1 == "piedra" && py2 != "papel") {
    			p1.setExitos();
    		}
    		else {
    			p2.setExitos();
    		}
    		
        	System.out.println(p1.getNombre() + " : " + py1 + "\t" + p1.toString());
        	System.out.println(p2.getNombre() + " : " + py2 + "\t" + p2.toString() + "\n");
        	
    		if(p1.getExitos() == 3 || p2.getExitos() == 3) {
    			FIN_DE_JUEGO = true;
    		}
    	}
    }

	@Override
	public String toString() {
		
		return "***** Ronda: " + this.rondasJugadas +" *********************\n" + "Numero de empates: "+ this.empates + "\n";
	}
    
    
}
