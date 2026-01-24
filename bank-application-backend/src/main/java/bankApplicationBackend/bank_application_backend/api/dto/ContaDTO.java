package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.AgenciaEntity;
import bankApplicationBackend.bank_application_backend.api.model.ClienteEntity;
import bankApplicationBackend.bank_application_backend.api.enums.contas.tipo_conta.Tipo_Conta;
import bankApplicationBackend.bank_application_backend.api.enums.contas.status.Status;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContaDTO {

    private Long idConta;
    private String numeroConta;
    private AgenciaEntity agencia;
    private BigDecimal saldo;
    private Tipo_Conta tipoConta;
    private ClienteEntity cliente;
    private LocalDateTime dtAbertura;
    private Status status;
}
