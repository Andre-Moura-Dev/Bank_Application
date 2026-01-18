package bankApplicationBackend.bank_application_backend.api.model;

import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "Conta_Corrente",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_corrente_conta", columnNames = "id_conta")
        }
)
public class ContaCorrenteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta_corrente")
    private Long idContaCorrente;

    @OneToOne
    @JoinColumn(
            name = "id_conta",
            referencedColumnName = "id_conta",
            nullable = false
    )
    private ContaEntity conta;

    @Column(name = "limite", nullable = false, precision = 15, scale = 2)
    private BigDecimal limite;

    @Column(name = "dt_vencimento", nullable = false)
    private LocalDate dtVencimento;

    @Column(name = "taxa_manutencao", nullable = false, precision = 5, scale = 2)
    private BigDecimal taxaManutencao;
}
