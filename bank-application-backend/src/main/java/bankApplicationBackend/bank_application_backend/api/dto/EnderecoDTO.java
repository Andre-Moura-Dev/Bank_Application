package bankApplicationBackend.bank_application_backend.api.dto;

import bankApplicationBackend.bank_application_backend.api.model.UsuarioEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EnderecoDTO {

    private Long idEndereco;
    private UsuarioEntity usuario;
    private String cep;
    private String logradouro;
    private Integer numeroCasa;
    private String bairro;
    private String cidade;
    private String estado;
    private String complemento;
}
