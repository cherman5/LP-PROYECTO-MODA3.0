package app.sysmoda.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name="talla")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Talla {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String talla;
}

