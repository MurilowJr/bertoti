public class Carro{
    
    private Montadora montadora;

    public void marca(){
        montadora.construirCarroceria();
        montadora.pintaCarro();
        montadora.montarPecas();
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

}