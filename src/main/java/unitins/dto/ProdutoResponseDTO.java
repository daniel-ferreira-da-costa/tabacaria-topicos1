package unitins.dto;

import unitins.model.Produto;
import unitins.model.Tipo;

public record ProdutoResponseDTO(
    Long id,
    String nome,
    String descricao,
    double valor,
    double preco,
    int qtdNoEstoque,
    Tipo tipo
    ){
        public static ProdutoResponseDTO valueOf(Produto produto) {
            return new ProdutoResponseDTO(
                    produto.getId(),
                    produto.getNome(),
                    produto.getDescricao(),
                    produto.getPreco(),
                    produto.getValor(),
                    produto.getQtdNoEstoque(),
                    produto.getTipo());
    }
}