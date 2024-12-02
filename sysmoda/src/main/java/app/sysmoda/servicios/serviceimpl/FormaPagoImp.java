package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.FormaPago;
import app.sysmoda.repositorio.FormaPagoRep;
import app.sysmoda.servicios.FormaPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormaPagoImp implements FormaPagoService {
    @Autowired
    FormaPagoRep repository;

    @Override
    public List<FormaPago> findAll() {
        return repository.findAll();
    }
}
