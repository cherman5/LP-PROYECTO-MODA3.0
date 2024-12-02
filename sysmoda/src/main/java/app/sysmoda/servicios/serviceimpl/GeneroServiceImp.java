package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.Genero;
import app.sysmoda.repositorio.GeneroRep;
import app.sysmoda.servicios.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GeneroServiceImp implements GeneroService {
    @Autowired
    GeneroRep generoRep;
    @Override
    public List<Genero> findAll() {
        return generoRep.findAll();
    }
}
