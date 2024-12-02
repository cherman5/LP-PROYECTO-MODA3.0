package app.sysmoda.servicios;

import app.sysmoda.modelo.DetalleVenta;
import app.sysmoda.modelo.Venta;

import java.util.List;

public interface DetalleVentaService {
    List<DetalleVenta> findAll();
    DetalleVenta create(DetalleVenta detalleventa);
}
