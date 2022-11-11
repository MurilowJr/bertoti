package entities;

import java.util.LinkedList;
import java.util.List;

public class Hotel {
    private List<Hospede> hospedes = new LinkedList<Hospede>();
    private List<Quarto> quarto = new LinkedList<Quarto>();
    private List<Funcionario> funcionario = new LinkedList<Funcionario>();

    public void cadastrarHospede(Hospede host) {
        hospedes.add(host);
    }

    public Hospede buscarHospedePorCpf (String cpf) {
        for(Hospede hospede : hospedes) {
            if (hospede.getCpf().equals(cpf)){
                return hospede;
            }
        }
        return null;
    }

    public List<Quarto> buscarQuarto(int numero){
        for(Quarto quartos : quarto) {
            if (quartos.getNumero() == numero){
                return quarto;
            }
        }
        return null;
    }
}
