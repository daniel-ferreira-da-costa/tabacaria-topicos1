package unitins.service;


import java.util.List;

import unitins.dto.PedidoDTO;
import unitins.dto.PedidoResponseDTO;

public interface PedidoService {

        public PedidoResponseDTO insert(PedidoDTO dto, String login);
        public PedidoResponseDTO findById(Long id);
        public List<PedidoResponseDTO> findByAll();
        public List<PedidoResponseDTO> findByAll(String login);
}
