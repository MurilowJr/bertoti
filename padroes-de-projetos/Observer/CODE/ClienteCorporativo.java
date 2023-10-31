public class ClienteCorporativo implements Cliente {
    private String empresa;
    
    public ClienteCorporativo(String empresa){
        this.empresa = empresa;
    }

    @Override
    public void notificar(String mensagem){
        System.out.println("Cliente Corporativo da empresa " + empresa + " recebeu a mensagem: " + mensagem);
    }
}
