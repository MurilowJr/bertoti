package org.murilo;

public class Filmes {
    private Tipo tipo;
    private String duracao;

    public Filmes(){

    }

    public Filmes(Tipo tipo, String duracao) {
        this.tipo = tipo;
        this.duracao = duracao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public String getDuracao() {
        return duracao;
    }
}
