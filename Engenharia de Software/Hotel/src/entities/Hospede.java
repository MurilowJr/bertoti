package entities;

public class Hospede {
    private String nome;
    private int cpf;
    private int rg;
    private int idade;
    
    public Hospede(String nome, int cpf, int rg, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getCpf() {
        return cpf;
    }


    public void setCpf(int cpf) {
        this.cpf = cpf;
    }


    public int getRg() {
        return rg;
    }


    public void setRg(int rg) {
        this.rg = rg;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean comparar(int cpf){
        if (cpf == getCpf()){
            return true;
        } else {
            return false;
        }
    }



    

}
