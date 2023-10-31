public class ClienteParticular implements Cliente {
    private String nome;

    public ClienteParticular(String nome){
        this.nome = nome;
    }

    @Override
    public void notificar(String mensagem){
        System.out.println("Cliente Particular " + nome + " recebeu a mensagem: " + mensagem);
    }
}
