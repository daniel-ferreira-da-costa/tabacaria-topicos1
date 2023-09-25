package unitins.dto;

import unitins.model.Tipo;

public class ProdutoDTO{

    private final String nome;
    private final int qtdNoEstoque;
    private final double valor;
    private final double preco;
    private final String descricao;
    private final Tipo tipo;
//construtor
    public ProdutoDTO(String nome, int qtdNoEstoque, double valor, double preco, String descricao, Tipo tipo) {
        this.nome = nome;
        this.qtdNoEstoque = qtdNoEstoque;
        this.valor = valor;
        this.preco = preco;
        this.descricao = descricao;
        this.tipo = tipo;
    }
    
//get
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

    public Tipo getTipo() {
        return tipo;
    }
//
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + qtdNoEstoque;
        long temp;
        temp = Double.doubleToLongBits(valor);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(preco);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProdutoDTO other = (ProdutoDTO) obj;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        if (qtdNoEstoque != other.qtdNoEstoque)
            return false;
        if (Double.doubleToLongBits(valor) != Double.doubleToLongBits(other.valor))
            return false;
        if (Double.doubleToLongBits(preco) != Double.doubleToLongBits(other.preco))
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (tipo != other.tipo)
            return false;
        return true;
    }
 
}