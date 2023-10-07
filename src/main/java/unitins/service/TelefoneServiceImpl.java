package unitins.service;

import java.util.List;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;
import unitins.dto.TelefoneDTO;
import unitins.dto.TelefoneResponseDTO;
import unitins.model.Telefone;
import unitins.repository.TelefoneRepository;

@ApplicationScoped
public class TelefoneServiceImpl implements TelefoneService {
    @Inject
    TelefoneRepository repository;

    @Override
    @Transactional
    public TelefoneResponseDTO insert(TelefoneDTO dto) {
        Telefone novoTelefone = new Telefone();
        novoTelefone.setCodigoArea(dto.codigoArea());
        novoTelefone.setNumero(dto.numero());

        repository.persist(novoTelefone);

        return TelefoneResponseDTO.valueOf(novoTelefone);
    }

    @Override
    @Transactional
    public TelefoneResponseDTO update(TelefoneDTO dto, Long id) {
        Telefone telefone = repository.findById(id);
        if (telefone != null) {
            telefone.setCodigoArea(dto.codigoArea());
            telefone.setNumero(dto.numero());
        } else
            throw new NotFoundException();

        return TelefoneResponseDTO.valueOf(telefone);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!repository.deleteById(id))
            throw new NotFoundException();
    }

    @Override
    public TelefoneResponseDTO findById(Long id) {
        return TelefoneResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<TelefoneResponseDTO> findByNumero(String numero) {
        return repository.findByNumero(numero).stream()
                .map(t -> TelefoneResponseDTO.valueOf(t)).toList();
    }

    @Override
    public List<TelefoneResponseDTO> findByAll() {
        return repository.listAll().stream()
                .map(t -> TelefoneResponseDTO.valueOf(t)).toList();
    }

}
