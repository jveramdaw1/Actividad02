package ende.jugador;

public class Jugador{
	
	private String nombre;
	private int exitos;      // numero de partidas ganadas
	
	public Jugador(String nombre) {
		this.nombre = nombre;
		this.exitos = 0;
	}
	
	public String getNombre() 
    {
        return this.nombre;
    }
	
    public int getExitos() 
    {
        return this.exitos;
    }
    
    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void setExitos() 
    {
        this.exitos ++;
    }
    
    /**
     * Escoge piedra, papel o tijera al azar
     */
	
    public String opcionAlAzar()
    {
        String opcion="";
        Integer c = (int)(Math.random()*3);
        switch(c){
            case 0:
            	opcion=("piedra");
                break;
            case 1:
            	opcion=("papel");
                break;
            case 2:
            	opcion=("tijeras");
            	break;
        }
        return opcion;
    }

	@Override
	public String toString() {
		return "\t" + this.nombre + " - Partidas ganadas -> " + this.exitos;
	}
    
    
}
