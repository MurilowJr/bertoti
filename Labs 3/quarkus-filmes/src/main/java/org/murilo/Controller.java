package org.murilo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

import java.util.List;

@Path("/filmes")
public class Controller {
    Model model = new Model();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{nome}/{midia}/{duracao}")
    public Response filme1(@PathParam("nome") String nome, @PathParam("midia") String midia, @PathParam("duracao") String duracao){
        List<Filmes> filmesEncontrados = model.buscarTipo(new Tipo(nome, midia));
        String json = new Gson().toJson(filmesEncontrados);
        return Response.status(200).entity(json).build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{nome}/")
    public Response filme2(@PathParam("nome") String nome, @PathParam("midia") String midia, @PathParam("duracao") String duracao) {
        List<Filmes> filmesEncontrados = model.buscarNome(nome);
        String json = new Gson().toJson(filmesEncontrados);
        return Response.status(200).entity(json).build();
    }
}