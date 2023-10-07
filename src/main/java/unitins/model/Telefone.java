package unitins.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.Size;

@Entity
public class Telefone extends DefaultEntity {
    @Column(length = 3)
    @Size(max = 3)
    private String codigoArea;
    @Column(length = 10)
    @Size(min = 10)
    private String numero;

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}