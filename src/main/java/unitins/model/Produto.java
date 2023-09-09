package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Produto extends DefaultEntity {
    @Column(length = 60, nullable = false)
    private String nome;

    @Column(nullable = false)
    private int qtdNoEstoque;

    @Column(nullable = false)
    private float valor;

    @Column(length = 200, nullable = false)
    private String descricao;


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

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
}
