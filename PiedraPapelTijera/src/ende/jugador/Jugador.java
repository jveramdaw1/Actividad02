package ende.jugador;

class Jugador{
	
	private int exitos;      // numero de partidas ganadas
	private int empates;
	
	public Jugador() {
		this.exitos = 0;
		this.empates = 0;
	}

    public int getExitos() 
    {
        return exitos;
    }
    
    public int getEmpates() 
    {
        return empates;
    }
    
    public void setExitos() 
    {
        exitos ++;
    }
    
    public void setEmpates() 
    {
        empates ++;
    }
    
    /**
     * Escoge piedra, papel o tijera al azar
     */
	
    public String opcion_al_azar()
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
}
