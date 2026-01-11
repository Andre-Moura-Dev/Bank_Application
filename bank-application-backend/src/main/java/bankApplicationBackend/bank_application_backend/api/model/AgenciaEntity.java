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
@Table(name = "Agencias")
public class AgenciaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_agencia")
    private Long idAgencia;

    @Column(name = "nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "codigo_agencia", nullable = false, unique = true, length = 10)
    private String codigoAgencia;

    @JsonIgnore
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "endereco_id",
            referencedColumnName = "id_endereco",
            nullable = false
    )
    private EnderecoEntity endereco;
}
