public class Cliente {
    
    public static void main (String[] args){
        //Instancia um novo carro
        Carro carro = new Carro();

        //Instancia um novo carro Sedan e inclui no objeto Carro
        Sedan sedan = new Sedan();

        carro.setMontadora(sedan);

        carro.marca();

        System.out.println("Informação de Carro: ");
        System.out.println(sedan.infoCarro());
    }
}
