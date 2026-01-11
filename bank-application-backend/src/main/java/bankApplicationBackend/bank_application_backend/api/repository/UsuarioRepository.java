package bankApplicationBackend.bank_application_backend.api.repository;

import bankApplicationBackend.bank_application_backend.api.model.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
    Optional<UsuarioEntity> buscarPorCpf(String cpf);
}
