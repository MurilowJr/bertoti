package org.murilo;

import java.util.LinkedList;
import java.util.List;

public class Model {
    private List<Filmes> filmes = new LinkedList<>();

    public Model(){
        addFilme(new Filmes("Shrek", "120", "A Historia de um Ogro"));
        addFilme(new Filmes("Mario", "110", "O Encanador mais famoso da Nintendo"));
    }

    public void addFilme(Filmes filme){
        filmes.add(filme);
    }

    public Filmes buscarNome(String nome) {
        for(Filmes filme:filmes){
            if(filme.getNome().equals(nome)) return filme;
        }
        return null;
    }

    public List<Filmes> getFilmes(){
        return filmes;
    }
}
