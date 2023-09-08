package unitins.service;

import java.util.List;

import unitins.dto.PaieroDTO;
import unitins.dto.PaieroResponseDTO;

public interface PaieroService {

    // recursos basicos
    List<PaieroResponseDTO> getAll();

    PaieroResponseDTO findById(Long id);

    PaieroResponseDTO create(PaieroDTO dto);

    PaieroResponseDTO update(Long id, PaieroDTO dto);

    void delete(Long id);

    // recursos extras
    List<PaieroResponseDTO> findByNome(String nome);

    long count();
}
