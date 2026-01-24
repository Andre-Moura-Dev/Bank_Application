package bankApplicationBackend.bank_application_backend.api.repository;

import bankApplicationBackend.bank_application_backend.api.model.TransacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface TransacaoRepository extends JpaRepository<TransacaoEntity, Long> {
    Optional<TransacaoEntity> buscarPorDescricao(String descricao);
}
