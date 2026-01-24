package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.EnderecoEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AgenciaDTO {

    private Long idAgencia;
    private String nome;
    private String numero_agencia;
    private EnderecoEntity endereco;
}
