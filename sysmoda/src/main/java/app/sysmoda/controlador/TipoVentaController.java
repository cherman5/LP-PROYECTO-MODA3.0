package app.sysmoda.controlador;

import app.sysmoda.modelo.TipoVenta;
import app.sysmoda.servicios.TipoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoventa")
@CrossOrigin("*")
public class TipoVentaController {
    @Autowired
    TipoVentaService service;

    @GetMapping
    public List<TipoVenta> listar() {
        return service.findAll();
    }

}
