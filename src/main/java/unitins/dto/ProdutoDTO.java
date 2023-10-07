package unitins.dto;

import unitins.model.Produto;

public record ProdutoDTO(

    String nome,
    int qtdNoEstoque,
    double valor,
    double preco,
    String descricao
){ 
    public ProdutoDTO valueOf(Produto produto){
        return new ProdutoDTO(
            produto.getNome(),
            produto.getQtdNoEstoque(),
            produto.getValor(),
            produto.getPreco(),
            produto.getDescricao()
        );
    }
 
}