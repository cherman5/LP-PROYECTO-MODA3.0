package app.sysmoda.repositorio;

import app.sysmoda.modelo.Marca;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarcaRep extends JpaRepository<Marca, Long> {
}
