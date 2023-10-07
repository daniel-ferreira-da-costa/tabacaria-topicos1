package unitins.dto;

import unitins.model.Produto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
public record ProdutoDTO(
    @NotNull(message = "o campo nome nao pode ser nulo")
    String nome,
    @NotNull(message = "o campo qtdNoEstoque nao pode ser nulo")
    int qtdNoEstoque,
    @NotNull(message = "o campo valor nao pode ser nulo")
    double valor,
    @NotNull(message = "o campo preco nao pode ser nulo")
    double preco,
    @NotBlank(message = "o campo descricao nao pode ficar vazio")
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