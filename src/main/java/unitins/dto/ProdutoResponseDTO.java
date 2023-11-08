package unitins.dto;

import unitins.model.Produto;

public record ProdutoResponseDTO(
    Long id,
    String nome,
    String descricao,
    Double valor,
    Double preco,
    int qtdNoEstoque
    ){
        public static ProdutoResponseDTO valueOf(Produto produto) {
            return new ProdutoResponseDTO(
                    produto.getId(),
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getPreco(),
                    produto.getValor(),
                    produto.getQtdNoEstoque());
    }
}