package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.ContaEntity;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContaPoupancaDTO {

    private Long idContaPoupanca;
    private ContaEntity conta;
    private BigDecimal taxaRendimento;
    private LocalDateTime ultimoRendimento;
}
