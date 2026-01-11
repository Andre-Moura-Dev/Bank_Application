package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.enums.usuarios.Tipo_Usuario;
import lombok.*;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsuarioDTO {

    private Long idUsuario;
    private String nome;
    private String cpf;
    private LocalDate dtNascimento;
    private String telefone;
    private Tipo_Usuario tipoUsuario;

    // Relacionamentos com a tabela usuário
    private Long idFuncionario;
    private Long idCliente;
}
