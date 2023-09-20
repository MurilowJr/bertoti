public class Sedan implements Montadora{
    
    private String cor;
    private int numeroChassi;
    private String motor;
    private String pneus;
    private String tipoDeIgnicao;

    public void construirCarroceria(){
        this.numeroChassi = 2;
    }

    public void pintaCarro(){
        this.cor = "Azul";
    }

    public void montarPecas(){
        this.motor = "R Type";
        this.pneus = "Pirelli";
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
