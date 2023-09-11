package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Peca extends Produto{

    @JoinColumn(name = "id_narguile", nullable = true)
    @ManyToOne
    private Narguile pertenceAoNarguile;

    @Column(name = "tamanho_narguile_compativel", nullable = false)
    private Tamanho TamanhoNarguileCompativel;
}