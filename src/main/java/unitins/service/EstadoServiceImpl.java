package unitins.service;

import java.util.List;

import unitins.dto.EstadoDTO;
import unitins.dto.EstadoResponseDTO;
import unitins.model.Estado;
import unitins.repository.EstadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class EstadoServiceImpl implements EstadoService {

    @Inject
    EstadoRepository repository;

    @Override
    @Transactional
    public EstadoResponseDTO insert(EstadoDTO dto) {
        Estado novoEstado = new Estado();
        novoEstado.setNome(dto.getNome());
        novoEstado.setSigla(dto.getSigla());

        repository.persist(novoEstado);

        return EstadoResponseDTO.valueOf(novoEstado);
    }

    @Override
    @Transactional
    public EstadoResponseDTO update(EstadoDTO dto, Long id) {
        
        Estado estado = repository.findById(id);
        if (estado != null) {
            estado.setNome(dto.getNome());
            estado.setSigla(dto.getSigla());
        } else 
            throw new NotFoundException();

        return EstadoResponseDTO.valueOf(estado);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!repository.deleteById(id)) 
            throw new NotFoundException();
    }

    @Override
    public EstadoResponseDTO findById(Long id) {
        return EstadoResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<EstadoResponseDTO> findByNome(String nome) {
        return repository.findByNome(nome).stream()
            .map(e -> EstadoResponseDTO.valueOf(e)).toList();
    }

    @Override
    public List<EstadoResponseDTO> findByAll() {
        return repository.listAll().stream()
            .map(e -> EstadoResponseDTO.valueOf(e)).toList();
    }
    
}