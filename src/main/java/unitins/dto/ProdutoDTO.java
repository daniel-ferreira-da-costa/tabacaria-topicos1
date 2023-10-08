package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import unitins.model.Produto;

public record ProdutoDTO(
    @NotBlank(message = "insira o nome corretamente")
    String nome,
    @NotBlank(message = "insira a qtdNoEstoque corretamente")
    int qtdNoEstoque,
    @NotBlank(message = "insira o valor corretamente")
    double valor,
    @NotBlank(message = "insira o preco corretamente")
    double preco,
    @NotBlank(message = "insira a descrição corretamente")
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