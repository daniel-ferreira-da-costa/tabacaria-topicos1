package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import unitins.model.Endereco;
import unitins.model.Telefone;

public class PessoaDTO{
    @NotBlank(message = "insira o nome corretamente")
    String nome;
    @NotBlank(message = "insira o email corretamente")
    String email;
    @NotBlank(message = "insira o cpf corretamente")
    String cpf;
    @NotBlank(message = "insira a senha corretamente")
    String senha;
    @NotBlank(message = "insira o enderecoPrincipal corretamente")
    Endereco enderecoPrincipal;
    @NotBlank(message = "insira o telefone corretamente")
    Telefone telefone;

    public PessoaDTO(String nome, String email, String cpf, String senha, Endereco enderecoPrincipal, Telefone telefone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.senha = senha;
        this.enderecoPrincipal = enderecoPrincipal;
        this.telefone = telefone;
    }



    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public Endereco getEnderecoPrincipal() {
        return enderecoPrincipal;
    }

    public Telefone getTelefone() {
        return telefone;
    }

}
