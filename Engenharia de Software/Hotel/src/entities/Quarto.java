package entities;

public class Quarto{
    private String tipoQuarto;
    private int numero;
    private int andar;
    private Reserva reserva;
	
    
    public Quarto() {
    	
    }


	public Quarto(String tipoQuarto, int numero, int andar, Reserva reserva) {
		this.tipoQuarto = tipoQuarto;
		this.numero = numero;
		this.andar = andar;
		this.reserva = reserva;
	}


	public String getTipoQuarto() {
		return tipoQuarto;
	}


	public void setTipoQuarto(String tipoQuarto) {
		this.tipoQuarto = tipoQuarto;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public int getAndar() {
		return andar;
	}


	public void setAndar(int andar) {
		this.andar = andar;
	}


	public Reserva getReserva() {
		return reserva;
	}


	public void setReserva(Reserva novaReserva) {
		this.reserva = novaReserva;
	}
    
    
    
    
    
}
