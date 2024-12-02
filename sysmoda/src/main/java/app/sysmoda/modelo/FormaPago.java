package app.sysmoda.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="formapago")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FormaPago {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String formapago;
}
