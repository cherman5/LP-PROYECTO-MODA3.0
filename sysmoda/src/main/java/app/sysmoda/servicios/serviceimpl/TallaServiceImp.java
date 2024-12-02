package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.Talla;
import app.sysmoda.repositorio.TallaRep;
import app.sysmoda.servicios.TallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TallaServiceImp implements TallaService {
    @Autowired
    TallaRep tallaRep;


    @Override
    public List<Talla> findAll() {
        return tallaRep.findAll();
    }
}
