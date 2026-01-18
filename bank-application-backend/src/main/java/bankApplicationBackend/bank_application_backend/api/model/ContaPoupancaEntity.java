package bankApplicationBackend.bank_application_backend.api.model;

import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "Conta_Poupanca",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_poupanca_conta", columnNames = "id_conta")
        }
)
public class ContaPoupancaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta_poupanca")
    private Long idContaPoupanca;

    @OneToOne
    @JoinColumn(
            name = "id_conta",
            referencedColumnName = "id_conta",
            nullable = false
    )
    private ContaEntity conta;

    @Column(name = "taxa_rendimento", nullable = false, precision = 15, scale = 2)
    private BigDecimal taxaRendimento;

    @Column(name = "ultimo_rendimento")
    private LocalDateTime ultimoRendimento;
}
