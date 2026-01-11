package bankApplicationBackend.bank_application_backend.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import bankApplicationBackend.bank_application_backend.api.enums.usuarios.Tipo_Usuario;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    private String cpf;

    @Column(name = "dt_nascimento", nullable = false)
    private LocalDate dtNascimento;

    @Column(name = "telefone", nullable = false, length = 15)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_usuario", nullable = false, length = 20)
    private Tipo_Usuario tipoUsuario;

    // Funcionário
    @JsonIgnore
    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
    private FuncionarioEntity funcionario;

    // Cliente
    @JsonIgnore
    @OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
    private ClienteEntity cliente;

    // Endereços
    @OneToMany(
            mappedBy = "usuario",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<EnderecoEntity> enderecos = new ArrayList<>();
}
