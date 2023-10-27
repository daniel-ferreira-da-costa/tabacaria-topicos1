package unitins.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import unitins.dto.PessoaDTO;
import unitins.dto.PessoaResponseDTO;
import unitins.model.Pessoa;
import unitins.repository.PessoaRepository;

@ApplicationScoped
public class PessoaServiceImpl implements PessoaService {

    @Inject
    PessoaRepository repository;

    @Override
    @Transactional
    public PessoaResponseDTO insert(PessoaDTO dto) throws Exception {

        if (repository.findByEmail(dto.getEmail()) != null) {
            throw new Exception("Email já existe.");
        }

        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(dto.getNome());
        novaPessoa.setCpf(dto.getCpf());
        novaPessoa.setEmail(dto.getEmail());
        novaPessoa.setSenha(dto.getSenha());
        novaPessoa.setEnderecoPrincipal(dto.getEnderecoPrincipal());
        novaPessoa.setTelefone(dto.getTelefone());

        repository.persist(novaPessoa);

        return PessoaResponseDTO.valueOf(novaPessoa);
    }

    @Override
    @Transactional
    public PessoaResponseDTO update(PessoaDTO dto, Long id) {
        Pessoa Pessoa = repository.findById(id);
        if (Pessoa != null) {
            Pessoa.setNome(dto.getNome());
            Pessoa.setCpf(dto.getCpf());
            Pessoa.setEmail(dto.getEmail());
            Pessoa.setSenha(dto.getSenha());
            Pessoa.setEnderecoPrincipal(dto.getEnderecoPrincipal());
            Pessoa.setTelefone(dto.getTelefone());
        } else
            throw new NotFoundException();
        return PessoaResponseDTO.valueOf(Pessoa);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public PessoaResponseDTO findById(Long id) {
        return PessoaResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<PessoaResponseDTO> findByNome(String nome) {
        return repository.findByNome(nome).stream()
                .map(u -> PessoaResponseDTO.valueOf(u)).toList();
    }

    @Override
    public List<PessoaResponseDTO> findByAll() {
        return repository.listAll().stream()
                .map(u -> PessoaResponseDTO.valueOf(u)).toList();
    }

}