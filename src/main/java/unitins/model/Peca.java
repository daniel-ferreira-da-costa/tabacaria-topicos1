package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Peca extends DefaultEntity{
    @Column(length = 60, nullable = false)
    private String nome;

    @Column(length = 60, nullable = false)
    private String descricao;

    @Column(nullable = false)
    private int qtdNoEstoque;

    @Column(nullable = false)
    private float valor;

    @JoinColumn(name = "id_narguile", nullable = true)
    @ManyToOne
    private Narguile pertenceAoNarguile;
}