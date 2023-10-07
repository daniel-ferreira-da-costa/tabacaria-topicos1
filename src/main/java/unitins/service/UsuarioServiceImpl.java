package unitins.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import unitins.dto.UsuarioDTO;
import unitins.dto.UsuarioResponseDTO;
import unitins.model.Usuario;
import unitins.repository.UsuarioRepository;

@ApplicationScoped
public class UsuarioServiceImpl implements UsuarioService {

    @Inject
    UsuarioRepository repository;

    @Override
    @Transactional
    public UsuarioResponseDTO insert(UsuarioDTO dto) throws Exception {

        if (repository.findByLogin(dto.login()) != null) {
            throw new Exception("Login já existe.");
        }

        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(dto.nome());
        novoUsuario.setLogin(dto.login());
        novoUsuario.setSenha(dto.senha());
        novoUsuario.setTelefone(dto.telefone());
        novoUsuario.setWhatsapp(dto.whatsapp());

        repository.persist(novoUsuario);

        return UsuarioResponseDTO.valueOf(novoUsuario);
    }

    @Override
    @Transactional
    public UsuarioResponseDTO update(UsuarioDTO dto, Long id) {
        Usuario usuario = repository.findById(id);
        if (usuario != null) {
            usuario.setLogin(dto.login());
            usuario.setNome(dto.nome());
            usuario.setSenha(dto.senha());
            usuario.setTelefone(dto.telefone());
            usuario.setWhatsapp(dto.whatsapp());
        } else
            throw new NotFoundException();
        return UsuarioResponseDTO.valueOf(usuario);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public UsuarioResponseDTO findById(Long id) {
        return UsuarioResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<UsuarioResponseDTO> findByNome(String nome) {
        return repository.findByNome(nome).stream()
            .map(u -> UsuarioResponseDTO.valueOf(u)).toList();
    }

    @Override
    public List<UsuarioResponseDTO> findByAll() {
        return repository.listAll().stream()
                .map(u -> UsuarioResponseDTO.valueOf(u)).toList();
    }

}