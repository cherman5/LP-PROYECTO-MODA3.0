package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.TipoVenta;
import app.sysmoda.repositorio.TipoVentaRep;
import app.sysmoda.servicios.TipoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoVentaServiceImp implements TipoVentaService {
  @Autowired
    TipoVentaRep repository;

    @Override
    public List<TipoVenta> findAll() {
        return repository.findAll();
    }
}
