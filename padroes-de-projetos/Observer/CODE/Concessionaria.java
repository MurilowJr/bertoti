import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private List<Cliente> clientes = new ArrayList<>();
    private List<String> carrosNovos = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
    }

    public void notificarClientes() {
        for (Cliente cliente : clientes) {
            cliente.notificar("Novos carros chegaram ao estoque: " + carrosNovos);
        }
    }

    public void adicionarCarroNovo(String modelo) {
        carrosNovos.add(modelo);
        notificarClientes();
    }
}
