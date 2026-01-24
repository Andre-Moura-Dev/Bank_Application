package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.ContaEntity;
import bankApplicationBackend.bank_application_backend.api.enums.conta_investimento.Perfil_Risco;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContaInvestimentoDTO {

    private Long idContaInvestimento;
    private ContaEntity conta;
    private Perfil_Risco perfilRisco;
    private BigDecimal valorMinimo;
    private BigDecimal taxaRendimentoBase;
}
