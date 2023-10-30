package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import unitins.model.Produto;

public class ProdutoDTO{
    @NotBlank(message = "insira o nome corretamente")
    String nome;
    @NotBlank(message = "insira a qtdNoEstoque corretamente")
    int qtdNoEstoque;
    @NotBlank(message = "insira o valor corretamente")
    double valor;
    @NotBlank(message = "insira o preco corretamente")
    double preco;
    @NotBlank(message = "insira a descrição corretamente")
    String descricao;

    public ProdutoDTO(@NotBlank(message = "insira o nome corretamente") String nome,
            @NotBlank(message = "insira a qtdNoEstoque corretamente") int qtdNoEstoque,
            @NotBlank(message = "insira o valor corretamente") double valor,
            @NotBlank(message = "insira o preco corretamente") double preco,
            @NotBlank(message = "insira a descrição corretamente") String descricao) {
        this.nome = nome;
        this.qtdNoEstoque = qtdNoEstoque;
        this.valor = valor;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public int getQtdNoEstoque() {
        return qtdNoEstoque;
    }

    public double getValor() {
        return valor;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

}