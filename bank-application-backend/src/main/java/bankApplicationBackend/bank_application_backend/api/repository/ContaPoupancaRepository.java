package bankApplicationBackend.bank_application_backend.api.repository;

import bankApplicationBackend.bank_application_backend.api.model.ContaPoupancaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDateTime;
import java.util.Optional;

public interface ContaPoupancaRepository extends JpaRepository<ContaPoupancaEntity, Long> {
    Optional<ContaPoupancaEntity> buscarPorUltimoRendimento(LocalDateTime ultimo_rendimento);
}
