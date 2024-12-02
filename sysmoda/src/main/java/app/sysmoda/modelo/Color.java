package app.sysmoda.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="color")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Color {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String color;
}
