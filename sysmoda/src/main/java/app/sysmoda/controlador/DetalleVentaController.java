package app.sysmoda.controlador;

import app.sysmoda.dto.DetalleVentaDTO;
import app.sysmoda.modelo.DetalleVenta;
import app.sysmoda.modelo.Venta;
import app.sysmoda.repositorio.DetalleVentaRep;
import app.sysmoda.repositorio.VentaRep;
import app.sysmoda.servicios.DetalleVentaService;
import app.sysmoda.servicios.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/detalleventa")
@CrossOrigin("*")
public class DetalleVentaController {
    @Autowired
    DetalleVentaService service;
    @Autowired
    private VentaService ventaService;
    @Autowired
    private DetalleVentaRep detalleVentaRepository;
    @Autowired
    private VentaRep ventaRepository;


    @GetMapping
    public List<DetalleVenta> listar() {
        return service.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> guardar(@RequestBody DetalleVentaDTO detalleVentaDTO) {
        if (detalleVentaDTO.getIdVenta() == null) {
            throw new RuntimeException("El ID de la venta no puede ser nulo");
        }
        Venta venta = ventaRepository.findById(detalleVentaDTO.getIdVenta())
                .orElseThrow(() -> new RuntimeException("Venta no encontrada"));

        DetalleVenta detalleVenta = new DetalleVenta();
        detalleVenta.setVenta(venta);
        detalleVenta.setCantidad(detalleVentaDTO.getCantidad());
        detalleVenta.setDescripcion(detalleVentaDTO.getDescripcion());
        detalleVenta.setPreciounitario(detalleVentaDTO.getPreciounitario());
        detalleVenta.setImporte(detalleVentaDTO.getImporte());
        detalleVentaRepository.save(detalleVenta);

        // Devolver solo código de estado 200 sin cuerpo
        return ResponseEntity.ok().build();
    }


}
