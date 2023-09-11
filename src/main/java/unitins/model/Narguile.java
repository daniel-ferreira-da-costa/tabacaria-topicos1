package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Narguile extends Produto {

    @Column(name = "tamanho_narguile", nullable = false)
    private Tamanho tamanho;
}
