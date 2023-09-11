package unitins.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Peca extends Produto{

    @JoinColumn(name = "id_narguile", nullable = true)
    @ManyToOne
    private Narguile pertenceAoNarguile;
    
}