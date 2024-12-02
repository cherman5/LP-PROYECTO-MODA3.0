package app.sysmoda.repositorio;

import app.sysmoda.modelo.TipoVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoVentaRep extends JpaRepository<TipoVenta, Long> {
}
