package entities;

public class Quarto {
    private int andar;
    private int numero;
    private Reserva reserva;
    
    
    public Quarto(int andar, int numero, boolean disponibildade) {
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
}
