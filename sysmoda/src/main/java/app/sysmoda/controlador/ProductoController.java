package app.sysmoda.controlador;

import app.sysmoda.dto.UpdateStockDTO;
import app.sysmoda.modelo.Marca;
import app.sysmoda.modelo.Producto;
import app.sysmoda.servicios.MarcaService;
import app.sysmoda.servicios.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/producto")
@CrossOrigin("*")
public class ProductoController {
    @Autowired
    ProductoService service;

    @GetMapping
    public List<Producto> listar() {
        return service.findAll();
    }

    @PostMapping
    public Producto guardar(@RequestBody Producto obj) {
        return service.create(obj);
    }

    @PutMapping("/{id}")
    public Producto editar(@PathVariable Long id, @RequestBody Producto obj) {
        return service.update(id, obj);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.delete(id);
    }
    @PutMapping("/stock/{id}")
    public Producto actualizarStock(@PathVariable Long id, @RequestBody UpdateStockDTO dto) {
        return service.updateStock(id, dto.getStock());
    }
}
