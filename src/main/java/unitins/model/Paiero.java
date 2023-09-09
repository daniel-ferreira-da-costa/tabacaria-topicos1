package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Paiero extends Produto {

    @Column(length = 60, nullable = false)
    private String sabor;

    @Column(length = 60, nullable = false)
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
}
