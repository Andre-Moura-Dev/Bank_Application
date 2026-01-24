package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.UsuarioEntity;
import java.time.LocalDateTime;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuditoriaDTO {

    private Long idAuditoria;
    private UsuarioEntity usuario;
    private String acao;
    private LocalDateTime dtHora;
}
