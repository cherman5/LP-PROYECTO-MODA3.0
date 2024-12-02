package app.sysmoda.repositorio;

import app.sysmoda.modelo.Color;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ColorRep extends JpaRepository<Color, Long> {
}
