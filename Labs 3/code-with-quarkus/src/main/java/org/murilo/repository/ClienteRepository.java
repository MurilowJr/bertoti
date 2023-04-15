package org.murilo.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import org.murilo.entities.Cliente;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente> {
}
