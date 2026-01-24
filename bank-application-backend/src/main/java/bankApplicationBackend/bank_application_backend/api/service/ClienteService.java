package bankApplicationBackend.bank_application_backend.api.service;

import bankApplicationBackend.bank_application_backend.api.dto.ClienteDTO;
import bankApplicationBackend.bank_application_backend.api.model.ClienteEntity;
import bankApplicationBackend.bank_application_backend.api.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<ClienteEntity> listarTodos() {
        return clienteRepository.findAll();
    }

    public ClienteEntity cadastrar(ClienteDTO dto) {
        dto.setIdCliente(dto.getIdCliente());
        dto.setUsuario(dto.getUsuario());
        dto.setScoreCredito(dto.getScoreCredito());

        ClienteEntity entity = ClienteEntity.builder()
                .idCliente(dto.getIdCliente())
                .usuario(dto.getUsuario())
                .scoreCredito(dto.getScoreCredito())
                .build();

        return clienteRepository.save(entity);
    }

    public ClienteEntity atualizar(Long id, ClienteDTO dto) {

        ClienteEntity objeto = buscarClientePorId(id);
        objeto.setIdCliente(dto.getIdCliente());
        objeto.setUsuario(dto.getUsuario());
        objeto.setScoreCredito(dto.getScoreCredito());

        return clienteRepository.save(objeto);
    }

    public ResponseEntity deletar(Long id) {
        clienteRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public ClienteEntity buscarClientePorId(Long id) {
        return clienteRepository.findById(id).get();
    }
}
