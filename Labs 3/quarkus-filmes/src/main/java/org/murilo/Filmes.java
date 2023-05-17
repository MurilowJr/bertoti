package org.murilo;

public class Filmes {
    private String nome;
    private String duracao;
    private String sinopse;

    public Filmes(){

    }

    public Filmes(String nome, String duracao, String sinopse) {
        this.nome = nome;
        this.duracao = duracao;
        this.sinopse = sinopse;
    }

    public String getNome() {
        return nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

}
