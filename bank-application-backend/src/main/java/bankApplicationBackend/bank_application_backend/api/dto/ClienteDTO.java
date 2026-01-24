package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.UsuarioEntity;
import lombok.*;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteDTO {

    private Long idCliente;
    private UsuarioEntity usuario;
    private BigDecimal scoreCredito;
}
