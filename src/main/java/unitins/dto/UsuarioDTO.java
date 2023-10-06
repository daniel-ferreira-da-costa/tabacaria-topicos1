package unitins.dto;

import unitins.model.Telefone;

public record UsuarioDTO (
    String nome,
    String login,
    String senha,
    Telefone telefone,
    Telefone whatsapp
) {

}
