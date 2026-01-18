package bankApplicationBackend.bank_application_backend.api.model;

import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;

import bankApplicationBackend.bank_application_backend.api.enums.conta_investimento.Perfil_Risco;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(
        name = "Conta_Investimento",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_investimento_conta", columnNames = "id_conta")
        }
)
public class ContaInvestimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta_investimento")
    private Long idContaInvestimento;

    @OneToOne
    @JoinColumn(
            name = "id_conta",
            referencedColumnName = "id_conta",
            nullable = false
    )
    private ContaEntity conta;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil_risco", nullable = false, length = 30)
    private Perfil_Risco perfilRisco;

    @Column(name = "valor_minimo", nullable = false, precision = 15, scale = 2)
    private BigDecimal valorMinimo;

    @Column(name = "taxa_rendimento_base", nullable = false, precision = 5, scale = 2)
    private BigDecimal taxaRendimentoBase;
}
