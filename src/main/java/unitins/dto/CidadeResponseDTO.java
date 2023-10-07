package unitins.dto;

import unitins.model.Cidade;
import unitins.model.Estado;

public record CidadeResponseDTO(
    Long id,
    String nome,
    Estado estado
) { 
    public static CidadeResponseDTO valueOf(Cidade cidade){
        return new CidadeResponseDTO(
            cidade.getId(), 
            cidade.getNome(),
            cidade.getEstado());
    }
}
