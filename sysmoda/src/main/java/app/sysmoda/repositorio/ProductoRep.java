package app.sysmoda.repositorio;

import app.sysmoda.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRep extends JpaRepository<Producto, Long> {
}
