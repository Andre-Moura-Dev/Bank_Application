package bankApplicationBackend.bank_application_backend.api.service;

import bankApplicationBackend.bank_application_backend.api.dto.UsuarioDTO;
import bankApplicationBackend.bank_application_backend.api.model.UsuarioEntity;
import bankApplicationBackend.bank_application_backend.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<UsuarioEntity> listarTodos() {
        return usuarioRepository.findAll();
    }

    public UsuarioEntity cadastrar(UsuarioDTO dto) {
        dto.setIdUsuario(dto.getIdUsuario());
        dto.setNome(dto.getNome());
        dto.setCpf(dto.getCpf());
        dto.setDtNascimento(dto.getDtNascimento());
        dto.setTelefone(dto.getTelefone());
        dto.setTipoUsuario(dto.getTipoUsuario());

        UsuarioEntity entity = UsuarioEntity.builder()
                .idUsuario(dto.getIdUsuario())
                .nome(dto.getNome())
                .cpf(dto.getCpf())
                .dtNascimento(dto.getDtNascimento())
                .telefone(dto.getTelefone())
                .tipoUsuario(dto.getTipoUsuario())
                .build();

        return usuarioRepository.save(entity);
    }

    public UsuarioEntity atualizar(Long id, UsuarioDTO dto) {

        UsuarioEntity objeto = buscarUsuarioPorId(id);
        objeto.setNome(dto.getNome());
        objeto.setCpf(dto.getCpf());
        objeto.setDtNascimento(dto.getDtNascimento());
        objeto.setTelefone(dto.getTelefone());
        objeto.setTipoUsuario(dto.getTipoUsuario());

        return usuarioRepository.save(objeto);
    }

    public ResponseEntity deletar(Long id) {
        usuarioRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    public UsuarioEntity buscarUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).get();
    }

    public Optional<UsuarioEntity> buscarUsuarioPorCpf(String cpf) {
        return usuarioRepository.buscarPorCpf(cpf);
    }
}
