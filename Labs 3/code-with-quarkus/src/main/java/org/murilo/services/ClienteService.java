package org.murilo.services;

import org.murilo.entities.Cliente;
import org.murilo.repository.ClienteRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class ClienteService {

    @Inject
    ClienteRepository clienteRepository;

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll().list();
    }

    public void addCliente(Cliente cliente){
        clienteRepository.persist(cliente);
    }


}
