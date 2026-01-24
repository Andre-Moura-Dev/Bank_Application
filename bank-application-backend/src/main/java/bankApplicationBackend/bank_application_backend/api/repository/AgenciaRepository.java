package bankApplicationBackend.bank_application_backend.api.repository;

import bankApplicationBackend.bank_application_backend.api.model.AgenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AgenciaRepository extends JpaRepository<AgenciaEntity, Long> {
    Optional<AgenciaEntity> buscarPorNumeroAgencia(String numero_agencia);
}
