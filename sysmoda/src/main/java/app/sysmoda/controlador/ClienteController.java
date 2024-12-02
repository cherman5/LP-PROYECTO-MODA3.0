package app.sysmoda.controlador;

import app.sysmoda.modelo.Cliente;
import app.sysmoda.servicios.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteController {
    @Autowired
    ClienteService service;

    @GetMapping
    public List<Cliente> listar() {
        return service.findAll();
    }
}

