package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.Cliente;
import app.sysmoda.repositorio.ClienteRep;
import app.sysmoda.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImp  implements ClienteService {
    @Autowired
    ClienteRep repository;


    @Override
    public List<Cliente> findAll() {
        return repository.findAll();
    }
}
