package unitins.dto;

import unitins.model.Paiero;

public record PaieroResponseDTO(
    Long id,
    String nome,
    String descricao,
    int qtdNoEstoque,
    String sabor){
        public static PaieroResponseDTO valueOf(Paiero paiero) {
            return new PaieroResponseDTO(
                    paiero.getId(),
                    paiero.getNome(),
                    paiero.getDescricao(),
                    paiero.getQtdNoEstoque(),
                    paiero.getSabor());
    }
}
