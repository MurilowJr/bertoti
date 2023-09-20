public class Hatch implements Montadora {
    
    private String cor;
    private int numeroChassi;
    private String motor;
    private String pneus;
    private String tipoDeIgnicao;

    public void construirCarroceria(){
        this.numeroChassi = 3;
    }

    public void pintaCarro(){
        this.cor = "Cinza Chumbo";
    }

    public void montarPecas(){
        this.motor = "VHC";
        this.pneus = "Goodyear";
        this.tipoDeIgnicao = "Elétrica";
    }

    public String infoCarro(){
        return "Número do chassi: " + this.numeroChassi
             + "\nCor do carro: " + this.cor
             + "\nTipo de motor: " + this.motor
             + "\nTipo de pneus: " + this.pneus
             + "\nTipo de Ignição: " + this.tipoDeIgnicao;
    }
}
