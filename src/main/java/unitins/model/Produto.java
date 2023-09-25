package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Produto extends DefaultEntity{
    
    @Column(length = 60, nullable = false)
    private String nome;

    @Column(nullable = false)
    private int qtdNoEstoque;

    @Column(nullable = false)
    private double valor;
    
    @Column(nullable = false)
    private double preco;

    @Column(length = 200, nullable = false)
    private String descricao;

    @Column(nullable = true)
    private Tipo tipo;

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdNoEstoque() {
        return qtdNoEstoque;
    }

    public void setQtdNoEstoque(int qtdNoEstoque) {
        this.qtdNoEstoque = qtdNoEstoque;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = Tipo.valueOf(tipo);
    }

}
