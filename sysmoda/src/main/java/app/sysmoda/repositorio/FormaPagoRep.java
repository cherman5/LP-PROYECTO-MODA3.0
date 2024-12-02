package app.sysmoda.repositorio;

import app.sysmoda.modelo.FormaPago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormaPagoRep extends JpaRepository<FormaPago, Long> {
}
