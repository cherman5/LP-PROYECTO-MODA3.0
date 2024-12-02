package app.sysmoda.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="marca")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String marca;
}
