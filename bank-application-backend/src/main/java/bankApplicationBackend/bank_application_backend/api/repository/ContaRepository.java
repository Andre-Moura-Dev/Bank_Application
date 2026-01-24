package bankApplicationBackend.bank_application_backend.api.repository;

import bankApplicationBackend.bank_application_backend.api.model.ContaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ContaRepository extends JpaRepository<ContaEntity, Long> {
    Optional<ContaEntity> buscarPorNumeroConta(String numero_conta);
}
