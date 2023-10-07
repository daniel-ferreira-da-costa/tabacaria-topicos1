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

        if (repository.findByEmail(dto.email()) != null) {
            throw new Exception("Email já existe.");
        }

        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome(dto.nome());
        novaPessoa.setCpf(dto.cpf());
        novaPessoa.setEmail(dto.email());
        novaPessoa.setSenha(dto.senha());
        novaPessoa.setEderecoPrincipal(dto.ederecoPrincipal());
        novaPessoa.setEnderecoReserva(dto.enderecoReserva());
        novaPessoa.setTelefone(dto.telefone());
        novaPessoa.setWhatsapp(dto.whatsapp());

        repository.persist(novaPessoa);

        return PessoaResponseDTO.valueOf(novaPessoa);
    }

    @Override
    @Transactional
    public PessoaResponseDTO update(PessoaDTO dto, Long id) {
        Pessoa Pessoa = repository.findById(id);
        if (Pessoa != null) {
            Pessoa.setNome(dto.nome());
            Pessoa.setCpf(dto.cpf());
            Pessoa.setEmail(dto.email());
            Pessoa.setSenha(dto.senha());
            Pessoa.setEderecoPrincipal(dto.ederecoPrincipal());
            Pessoa.setEnderecoReserva(dto.enderecoReserva());
            Pessoa.setTelefone(dto.telefone());
            Pessoa.setWhatsapp(dto.whatsapp());
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