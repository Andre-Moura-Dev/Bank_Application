package bankApplicationBackend.bank_application_backend.api.repository;

import bankApplicationBackend.bank_application_backend.api.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
