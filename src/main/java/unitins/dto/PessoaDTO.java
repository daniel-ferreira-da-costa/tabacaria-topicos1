package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import unitins.model.Endereco;
import unitins.model.Pessoa;
import unitins.model.Telefone;

public record PessoaDTO(
    @NotBlank(message = "insira o nome corretamente")
    String nome,
    @NotBlank(message = "insira o email corretamente")
    String email,
    @NotBlank(message = "insira o cpf corretamente")
    String cpf,
    @NotBlank(message = "insira a senha corretamente")
    String senha,
    @NotBlank(message = "insira o enderecoPrincipal corretamente")
    Endereco ederecoPrincipal,
    @NotBlank(message = "insira o enderecoReserva corretamente")
    Endereco enderecoReserva,
    @NotBlank(message = "insira o telefone corretamente")
    Telefone telefone,
    @NotBlank(message = "insira o whatsapp corretamente")
    Telefone whatsapp
) {
    public static PessoaDTO valueOf(Pessoa pessoa){
        return new PessoaDTO(
            pessoa.getNome(), 
            pessoa.getEmail(), 
            pessoa.getCpf(),
            pessoa.getSenha(),
            pessoa.getEderecoPrincipal(),
            pessoa.getEnderecoReserva(),
            pessoa.getTelefone(),
            pessoa.getWhatsapp()
        );
    }
}
