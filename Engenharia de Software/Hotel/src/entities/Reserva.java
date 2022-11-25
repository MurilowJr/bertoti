package entities;

public class Reserva {
	private int andar;
    private int numero;
    
    
    
    public Reserva(int andar, int numero) {
        this.andar = andar;
        this.numero = numero;
    }
    
    
    public int getAndar() {
        return andar;
    }
    public void setAndar(int andar) {
        this.andar = andar;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public Reserva comparar(Reserva reserva) {
    	if(andar == reserva.andar && numero == reserva.numero) {
    		return reserva;
    	} else {
    		return null;
    	}
    }


	@Override
	public String toString() {
		return "Reserva [andar=" + andar + ", numero=" + numero + "]";
	}
    
    
}
