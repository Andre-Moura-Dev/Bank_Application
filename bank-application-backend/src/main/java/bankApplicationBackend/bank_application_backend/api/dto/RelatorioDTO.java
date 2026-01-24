package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.FuncionarioEntity;
import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RelatorioDTO {

    private Long idRelatorio;
    private FuncionarioEntity funcionario;
    private String tipoRelatorio;
    private LocalDateTime dtGeracao;
}
