public class ObserverConcessionaria {

    public static void main(String[] args){
        Concessionaria concessionaria = new Concessionaria();

        ClienteParticular cliente1 = new ClienteParticular("João");
        ClienteParticular cliente2 = new ClienteParticular("Maria");
        ClienteCorporativo cliente3 = new ClienteCorporativo("Empresa ABC");
        
        concessionaria.registrarCliente(cliente1);
        concessionaria.registrarCliente(cliente2);
        concessionaria.registrarCliente(cliente3);
        
        concessionaria.adicionarCarroNovo("Sedan");
        concessionaria.adicionarCarroNovo("SUV");
    }
    
}
