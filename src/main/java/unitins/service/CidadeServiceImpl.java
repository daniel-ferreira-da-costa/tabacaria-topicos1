package unitins.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import unitins.dto.CidadeDTO;
import unitins.dto.CidadeResponseDTO;
import unitins.model.Cidade;
import unitins.repository.CidadeRepository;

@ApplicationScoped
public class CidadeServiceImpl implements CidadeService{
 @Inject
    CidadeRepository repository;

    @Override
    @Transactional
    public CidadeResponseDTO insert(CidadeDTO dto) {
        Cidade novaCidade = new Cidade();
        novaCidade.setNome(dto.getNome());
        novaCidade.setEstado(dto.getEstado().getId());

        repository.persist(novaCidade);

        return CidadeResponseDTO.valueOf(novaCidade);
    }

    @Override
    @Transactional
    public CidadeResponseDTO update(CidadeDTO dto, Long id) {
        
        Cidade cidade = repository.findById(id);
        if (cidade != null) {
            cidade.setNome(dto.getNome());
            cidade.setEstado(dto.getEstado().getId());
        } else 
            throw new NotFoundException();

        return CidadeResponseDTO.valueOf(cidade);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!repository.deleteById(id)) 
            throw new NotFoundException();
    }

    @Override
    public CidadeResponseDTO findById(Long id) {
        return CidadeResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<CidadeResponseDTO> findByNome(String nome) {
        return repository.findByNome(nome).stream()
            .map(e -> CidadeResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<CidadeResponseDTO> findByAll() {
        return repository.listAll().stream()
            .map(c -> CidadeResponseDTO.valueOf(c)).toList();
    }
    
}