package bankApplicationBackend.bank_application_backend.api.model;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Relatorios")
public class RelatorioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_relatorio")
    private Long idRelatorio;

    @ManyToOne
    @JoinColumn(
            name = "id_funcionario",
            referencedColumnName = "id_funcionario",
            nullable = false
    )
    private FuncionarioEntity funcionario;

    @Column(name = "tipo_relatorio", nullable = false, length = 50)
    private String tipoRelatorio;

    @Column(name = "dt_geracao", nullable = false)
    private LocalDateTime dtGeracao;
}
