package app.sysmoda.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="tipoventa")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TipoVenta {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String tipoventa;
}
