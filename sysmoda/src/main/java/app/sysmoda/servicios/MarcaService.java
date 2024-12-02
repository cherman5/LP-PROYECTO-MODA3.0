package app.sysmoda.servicios;

import app.sysmoda.modelo.Marca;

import java.util.List;

public interface MarcaService {
    List<Marca> findAll();

    Marca create(Marca marca);

    Marca update(Long id, Marca marca);

    void delete(Long id);
}
