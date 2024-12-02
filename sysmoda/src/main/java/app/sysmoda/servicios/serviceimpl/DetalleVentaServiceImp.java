package app.sysmoda.servicios.serviceimpl;

import app.sysmoda.modelo.DetalleVenta;
import app.sysmoda.modelo.Venta;
import app.sysmoda.repositorio.DetalleVentaRep;
import app.sysmoda.servicios.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleVentaServiceImp implements DetalleVentaService {
    @Autowired
    DetalleVentaRep repository;

    @Override
    public List<DetalleVenta> findAll() {
        return repository.findAll();
    }
    @Override
    public DetalleVenta create(DetalleVenta detalleventa) {
        return repository.save(detalleventa);
    }
}
