package unitins.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;

public class Pessoa {

    private String nome;
    private String email;
    
    @OneToOne
    @JoinTable(name="usuario_telefone",
        joinColumns= @JoinColumn(name="id_usuario"),
        inverseJoinColumns = @JoinColumn(name="id_telefone") )
    private Telefone telefone;

    @OneToOne
    @JoinTable(name="usuario_whatsapp",
        joinColumns= @JoinColumn(name="id_usuario"),
        inverseJoinColumns = @JoinColumn(name="id_whatsapp") )
    private Telefone whatsapp;
}
