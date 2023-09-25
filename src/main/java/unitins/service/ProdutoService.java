package unitins.service;

import java.util.List;

import unitins.dto.ProdutoDTO;
import unitins.dto.ProdutoResponseDTO;

public interface ProdutoService {

    public ProdutoResponseDTO insert(ProdutoDTO dto);

    public ProdutoResponseDTO update(ProdutoDTO dto, Long id);

    public void delete(Long id);

    public ProdutoResponseDTO findById(Long id);

    public List<ProdutoResponseDTO> findByNome(String nome);

    public List<ProdutoResponseDTO> findByAll(); 

}
