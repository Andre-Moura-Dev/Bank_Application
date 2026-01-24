package bankApplicationBackend.bank_application_backend.api.service;

import bankApplicationBackend.bank_application_backend.api.dto.FuncionarioDTO;
import bankApplicationBackend.bank_application_backend.api.model.FuncionarioEntity;
import bankApplicationBackend.bank_application_backend.api.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioEntity> listarTodos() {
        return funcionarioRepository.findAll();
    }

    public FuncionarioEntity cadastrar(FuncionarioDTO dto) {
        dto.setIdFuncionario(dto.getIdFuncionario());
        dto.setUsuario(dto.getUsuario());
        dto.setMatricula(dto.getMatricula());
        dto.setCargoFuncionario(dto.getCargoFuncionario());
        dto.setSupervisor(dto.getSupervisor());

        FuncionarioEntity entity = FuncionarioEntity.builder()
                .idFuncionario(dto.getIdFuncionario())
                .usuario(dto.getUsuario())
                .matricula(dto.getMatricula())
                .cargoFuncionario(dto.getCargoFuncionario())
                .supervisor(dto.getSupervisor())
                .build();

        return funcionarioRepository.save(entity);
    }

    public FuncionarioEntity atualizar(Long id, FuncionarioDTO dto) {

        FuncionarioEntity objeto = buscarFuncionarioPorId(id);
        objeto.setIdFuncionario(dto.getIdFuncionario());
        objeto.setUsuario(dto.getUsuario());
        objeto.setMatricula(dto.getMatricula());
        objeto.setCargoFuncionario(dto.getCargoFuncionario());
        objeto.setSupervisor(dto.getSupervisor());

        return funcionarioRepository.save(objeto);
    }

    public ResponseEntity deletar(Long id) {
        funcionarioRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public FuncionarioEntity buscarFuncionarioPorId(Long id) {
        return funcionarioRepository.findById(id).get();
    }

    public Optional<FuncionarioEntity> buscarFuncionarioPorMatricula(String matricula) {
        return funcionarioRepository.buscarPorMatricula(matricula);
    }
}
