package bankApplicationBackend.bank_application_backend.api.model;

import lombok.*;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import bankApplicationBackend.bank_application_backend.api.enums.contas.tipo_conta.Tipo_Conta;
import bankApplicationBackend.bank_application_backend.api.enums.contas.status.Status;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Contas")
public class ContaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta")
    private Long idConta;

    @Column(name = "numero_conta", nullable = false, length = 20)
    private Integer numeroConta;

    @ManyToOne
    @JoinColumn(
            name = "id_agencia",
            referencedColumnName = "id_agencia",
            nullable = false
    )
    private AgenciaEntity agencia;

    @Column(name = "saldo", nullable = false, precision = 15, scale = 2)
    private BigDecimal saldo;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_conta", nullable = false, length = 30)
    private Tipo_Conta tipoConta;

    @ManyToOne
    @JoinColumn(
            name = "id_cliente",
            referencedColumnName = "id_cliente",
            nullable = false
    )
    private ClienteEntity cliente;

    @Column(name = "dt_abertura", nullable = false)
    private LocalDateTime dtAbertura;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false, length = 30)
    private Status status;
}
