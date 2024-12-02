package app.sysmoda.controlador;

import app.sysmoda.modelo.Talla;
import app.sysmoda.servicios.TallaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/talla")
@CrossOrigin("*")
public class TallaController {
    @Autowired
    TallaService tallaService;

    @GetMapping
    public List<Talla> listar() {
        return tallaService.findAll();
    }
}
