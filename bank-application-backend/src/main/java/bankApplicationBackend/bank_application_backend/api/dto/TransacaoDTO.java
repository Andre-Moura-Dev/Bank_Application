package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.ContaEntity;
import bankApplicationBackend.bank_application_backend.api.enums.transacao.Tipo_Transacao;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class TransacaoDTO {

    private Long idTransacao;
    private ContaEntity contaOrigem;
    private ContaEntity contaDestino;
    private Tipo_Transacao tipoTransacao;
    private BigDecimal valor;
    private LocalDateTime dtHora;
    private String descricao;
}
