package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Paiero extends DefaultEntity {

    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 60, nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int qtdNoEstoque;

    @Column(length = 60, nullable = false)
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtdNoEstoque() {
        return qtdNoEstoque;
    }

    public void setQtdNoEstoque(int qtdNoEstoque) {
        this.qtdNoEstoque = qtdNoEstoque;
    }
}
