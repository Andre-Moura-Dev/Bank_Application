package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.enums.funcionarios.Cargo_Funcionario;
import bankApplicationBackend.bank_application_backend.api.model.FuncionarioEntity;
import bankApplicationBackend.bank_application_backend.api.model.UsuarioEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FuncionarioDTO {

    private Long idFuncionario;
    private UsuarioEntity usuario;
    private String matricula;
    private Cargo_Funcionario cargoFuncionario;
    private FuncionarioEntity supervisor;
}
