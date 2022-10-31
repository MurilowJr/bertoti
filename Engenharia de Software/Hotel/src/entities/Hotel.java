package entities;

import java.util.LinkedList;
import java.util.List;

public class Hotel {
    private List<Hospede> hospede = new LinkedList<Hospede>();
    private List<Quarto> quarto = new LinkedList<Quarto>();
    private List<Funcionario> funcionario = new LinkedList<Funcionario>();

    public void cadastrarHospede(Hospede host) {
        hospede.add(host);
    }
}
