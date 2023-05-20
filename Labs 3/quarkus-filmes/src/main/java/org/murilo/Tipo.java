package org.murilo;

public class Tipo {
    private String nome;
    private String midia;

    public Tipo(String nome, String midia) {
        this.nome = nome;
        this.midia = midia;
    }

    public String getNome() {
        return nome;
    }

    public String getMidia() {
        return midia;
    }

    public boolean comparar(Tipo tipo){
        if(nome.equals(tipo.midia) && nome.equals(tipo.nome)){
            return true;
        } else {
            return false;
        }
    }
}
