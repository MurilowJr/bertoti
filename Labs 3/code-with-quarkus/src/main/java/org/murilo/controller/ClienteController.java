package org.murilo.controller;

import org.murilo.entities.Cliente;
import org.murilo.services.ClienteService;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Path("/api/cliente")
public class ClienteController {

    @Inject
    ClienteService clienteService;

    @GET
    public List<Cliente> retrieveClientes(){

        List<Cliente> clientes = new ArrayList<>();

        try {
            clientes = clienteService.findAllClientes();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clientes;
    }

    @POST
    @Transactional
    public void addCliente(Cliente cliente){
        clienteService.addCliente(cliente);
    }
}
