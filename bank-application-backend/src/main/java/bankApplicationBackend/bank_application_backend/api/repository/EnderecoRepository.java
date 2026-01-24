package bankApplicationBackend.bank_application_backend.api.repository;

import bankApplicationBackend.bank_application_backend.api.model.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Long> {
}
