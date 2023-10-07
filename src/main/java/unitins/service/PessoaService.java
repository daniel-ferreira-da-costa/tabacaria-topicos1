package unitins.service;

import java.util.List;

import unitins.dto.PessoaDTO;
import unitins.dto.PessoaResponseDTO;

public interface PessoaService {
        public PessoaResponseDTO insert(PessoaDTO dto) throws Exception;

    public PessoaResponseDTO update(PessoaDTO dto, Long id);

    public void delete(Long id);

    public PessoaResponseDTO findById(Long id);

    public List<PessoaResponseDTO> findByNome(String nome);

    public List<PessoaResponseDTO> findByAll(); 
}
