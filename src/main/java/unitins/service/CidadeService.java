
package unitins.service;

import java.util.List;

import unitins.dto.CidadeDTO;
import unitins.dto.CidadeResponseDTO;


public interface CidadeService {

    public CidadeResponseDTO insert(CidadeDTO dto);

    public CidadeResponseDTO update(CidadeDTO dto, Long id);

    public void delete(Long id);

    public CidadeResponseDTO findById(Long id);

    public List<CidadeResponseDTO> findByNome(String nome);

    public List<CidadeResponseDTO> findByAll(); 
    
}