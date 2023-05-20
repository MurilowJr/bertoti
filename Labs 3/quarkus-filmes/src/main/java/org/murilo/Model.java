package org.murilo;

import java.util.LinkedList;
import java.util.List;

public class Model {
    private List<Filmes> filmes = new LinkedList<>();

    public Model(){
        addFilme(new Filmes(new Tipo("Shrek","VHS"), "100"));
        addFilme(new Filmes(new Tipo("Mario","DVD"), "110"));
    }

    public void addFilme(Filmes filme){
        filmes.add(filme);
    }

    public List<Filmes> buscarTipo(Tipo tipo){
        List<Filmes> filmesEncontrados = new LinkedList<>();

        for(Filmes filme:filmes){
            if(tipo.comparar(filme.getTipo())) filmesEncontrados.add(filme);
        }
        return filmesEncontrados;
    }
}
