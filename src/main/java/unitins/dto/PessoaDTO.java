package unitins.dto;

import unitins.model.Endereco;
import unitins.model.Pessoa;
import unitins.model.Telefone;

public record PessoaDTO(
    String nome,
    String email,
    String cpf,
    String senha,
    Endereco ederecoPrincipal,
    Endereco enderecoReserva,
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
