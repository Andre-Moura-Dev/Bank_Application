package bankApplicationBackend.bank_application_backend.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Enderecos")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Long idEndereco;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_usuario",
            referencedColumnName = "id_usuario",
            nullable = false
    )
    private UsuarioEntity usuario;

    @Column(name = "cep", nullable = false, length = 10)
    private String cep;

    @Column(name = "logradouro", nullable = false, length = 100)
    private String logradouro;

    @Column(name = "numero_casa", nullable = false)
    private Integer numeroCasa;

    @Column(name = "bairro", nullable = false, length = 45)
    private String bairro;

    @Column(name = "cidade", nullable = false, length = 45)
    private String cidade;

    @Column(name = "estado", nullable = false, length = 2)
    private String estado;

    @Column(name = "complemento", length = 45)
    private String complemento;

    // Agencia
    @JsonIgnore
    @OneToOne(mappedBy = "endereco", fetch = FetchType.LAZY)
    private AgenciaEntity agencia;
}
