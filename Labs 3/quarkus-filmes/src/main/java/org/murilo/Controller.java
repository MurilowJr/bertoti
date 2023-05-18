package org.murilo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;

@Path("/filmes")
public class Controller {
    Model model = new Model();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("{nome}/{duracao}/{sinopse}/")
    public Response filme2(@PathParam String nome, @PathParam String duracao, @PathParam String cor){
            List<Filmes> filmesEncontrados = model.buscarNome(new Filmes(nome, duracao, sinopse));
            String json = new Gson().toJson(filmesEncontrados);
        return Response.status(200).entity(json).build();
    }
}
