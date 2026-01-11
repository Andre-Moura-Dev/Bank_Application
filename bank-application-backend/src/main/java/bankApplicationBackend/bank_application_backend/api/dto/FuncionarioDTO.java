package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.enums.funcionarios.Cargo_Funcionario;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FuncionarioDTO {

    private Long idFuncionario;

    // Relacionamento com a tabela usuário
    private Long idUsuario;

    private String codigoFuncionario;
    private Cargo_Funcionario cargoFuncionario;
    private Long idSupervisor;
}
