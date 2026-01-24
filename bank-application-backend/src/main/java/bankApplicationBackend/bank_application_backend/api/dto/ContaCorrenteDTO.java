package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.ContaEntity;
import java.time.LocalDate;
import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContaCorrenteDTO {

    private Long idContaCorrente;
    private ContaEntity conta;
    private BigDecimal limite;
    private LocalDate dtVencimento;
    private BigDecimal taxaManuntencao;
}
