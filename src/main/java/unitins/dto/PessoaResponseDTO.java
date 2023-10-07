package unitins.dto;

import unitins.model.Endereco;
import unitins.model.Pessoa;
import unitins.model.Telefone;

public record PessoaResponseDTO (
    Long id,
    String nome,
    String email,
    String cpf,
    String Senha,
    Endereco ederecoPrincipal,
    Endereco enderecoReserva,
    Telefone telefone,
    Telefone whatsapp
){
    public static PessoaResponseDTO valueOf(Pessoa pessoa){
        return new PessoaResponseDTO(
            pessoa.getId(),
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
