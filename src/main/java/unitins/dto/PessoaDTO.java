package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import unitins.model.Endereco;
import unitins.model.Pessoa;
import unitins.model.Telefone;

public record PessoaDTO(
    @NotNull(message = "O campo nome nao pode ser nulo.")
    String nome,
    @NotNull(message = "O campo email nao pode ser nulo.")
    String email,
    @NotNull(message = "O campo cpf nao pode ser nulo.")
    String cpf,
    @NotNull(message = "O campo senha nao pode ser nulo.")
    String senha,
    @NotBlank(message = "O campo endereco nao pode ficar vazio")
    Endereco ederecoPrincipal,
    Endereco enderecoReserva,
    @NotBlank(message = "O campo telefone nao pode ficar vazio")
    Telefone telefone,
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
