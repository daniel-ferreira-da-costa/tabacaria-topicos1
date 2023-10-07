package unitins.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;

@Entity
public class Pessoa extends DefaultEntity{

    private String nome;
    private String email;
    private String cpf;
    private String senha;

    @OneToOne
    @JoinTable(name="pessoa_enderecoPrincipal",
        joinColumns= @JoinColumn(name="id_pessoa"),
        inverseJoinColumns = @JoinColumn(name="id_enderecoPrincipal") )
    private Endereco ederecoPrincipal;


    @OneToOne
    @JoinTable(name="pessoa_enderecoReserva",
        joinColumns= @JoinColumn(name="id_pessoa"),
        inverseJoinColumns = @JoinColumn(name="id_enderecoReserva") )
    private Endereco enderecoReserva;
    
    @OneToOne
    @JoinTable(name="pessoa_telefone",
        joinColumns= @JoinColumn(name="id_pessoa"),
        inverseJoinColumns = @JoinColumn(name="id_telefone") )
    private Telefone telefone;

    @OneToOne
    @JoinTable(name="pessoa_whatsapp",
        joinColumns= @JoinColumn(name="id_pessoa"),
        inverseJoinColumns = @JoinColumn(name="id_whatsapp") )
    private Telefone whatsapp;

    ///////////
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public Telefone getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(Telefone whatsapp) {
        this.whatsapp = whatsapp;
    }

    public Endereco getEderecoPrincipal() {
        return ederecoPrincipal;
    }

    public void setEderecoPrincipal(Endereco ederecoPrincipal) {
        this.ederecoPrincipal = ederecoPrincipal;
    }

    public Endereco getEnderecoReserva() {
        return enderecoReserva;
    }

    public void setEnderecoReserva(Endereco enderecoReserva) {
        this.enderecoReserva = enderecoReserva;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
}
