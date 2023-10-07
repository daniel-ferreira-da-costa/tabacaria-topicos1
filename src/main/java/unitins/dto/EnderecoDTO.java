package unitins.dto;

import unitins.model.Endereco;

public record EnderecoDTO(

        String nome,
        String logradouro,
        String numero,
        String complemento,
        String bairro,
        String cep,
        String cidade,
        String estado) {
    public static EnderecoDTO valueOf(Endereco endereco) {
        return new EnderecoDTO(
            endereco.getNome(),
            endereco.getLogradouro(),
            endereco.getNumero(),
            endereco.getComplemento(),
            endereco.getBairro(),
            endereco.getCep(),
            endereco.getCidade(),
            endereco.getEstado());
    }
}