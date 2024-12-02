package app.sysmoda.servicios;

import app.sysmoda.modelo.Cliente;

import java.util.List;

public interface ClienteService {
    List<Cliente> findAll();
}
