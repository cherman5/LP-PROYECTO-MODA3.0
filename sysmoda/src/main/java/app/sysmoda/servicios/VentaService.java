package app.sysmoda.servicios;

import app.sysmoda.modelo.Producto;
import app.sysmoda.modelo.Venta;

import java.util.List;

public interface VentaService{
    List<Venta> findAll();
    Venta create(Venta venta);
    Venta findById(Long id);
}
