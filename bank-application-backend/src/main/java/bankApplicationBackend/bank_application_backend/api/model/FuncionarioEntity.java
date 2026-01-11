package bankApplicationBackend.bank_application_backend.api.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import jakarta.persistence.*;
import bankApplicationBackend.bank_application_backend.api.enums.funcionarios.Cargo_Funcionario;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Funcionarios")
public class FuncionarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_funcionario")
    private Long idFuncionario;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_usuario",
            referencedColumnName = "id_usuario",
            nullable = false
    )
    private UsuarioEntity usuario;

    @Column(name = "codigo_funcionario", nullable = false, unique = true, length = 20)
    private String codigoFuncionario;

    @Enumerated(EnumType.STRING)
    @Column(name = "cargo", nullable = false, length = 30)
    private Cargo_Funcionario cargoFuncionario;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supervisor")
    private FuncionarioEntity supervisor;
}
