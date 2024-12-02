package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.Venta;
import app.sysmoda.repositorio.VentaRep;
import app.sysmoda.servicios.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaServiceImp implements VentaService {
    @Autowired
    VentaRep repository;


    @Override
    public List<Venta> findAll() {
        return repository.findAll();
    }

    @Override
    public Venta create(Venta venta) {
        return repository.save(venta);
    }

    @Override
    public Venta findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
