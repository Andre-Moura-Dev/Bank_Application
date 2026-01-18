package bankApplicationBackend.bank_application_backend.api.model;

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

    @Column(name = "numero_agencia", nullable = false, unique = true, length = 10)
    private String numeroAgencia;

    @OneToOne
    @JoinColumn(
            name = "id_endereco",
            referencedColumnName = "id_endereco",
            nullable = false
    )
    private EnderecoEntity endereco;
}
