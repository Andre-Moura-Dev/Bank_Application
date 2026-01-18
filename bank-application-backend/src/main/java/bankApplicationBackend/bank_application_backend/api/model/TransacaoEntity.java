package bankApplicationBackend.bank_application_backend.api.model;

import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import bankApplicationBackend.bank_application_backend.api.enums.transacao.Tipo_Transacao;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Transacoes")
public class TransacaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_transacao")
    private Long idTransacao;

    @ManyToOne
    @JoinColumn(
            name = "id_conta_origem",
            referencedColumnName = "id_conta_origem",
            nullable = false
    )
    private ContaEntity contaOrigem;

    @ManyToOne
    @JoinColumn(
            name = "id_conta_destino",
            referencedColumnName = "id_conta_destino",
            nullable = false
    )
    private ContaEntity contaDestino;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_transacao", nullable = false, length = 50)
    private Tipo_Transacao tipoTransacao;

    @Column(name = "valor", nullable = false, precision = 15, scale = 2)
    private BigDecimal valor;

    @Column(name = "dt_hora", nullable = false)
    private LocalDateTime dtHora;

    @Column(name = "descricao", length = 100)
    private String descricao;
}
