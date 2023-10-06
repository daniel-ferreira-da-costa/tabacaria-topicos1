package unitins.dto;

import unitins.model.Telefone;
import unitins.model.Usuario;

public record UsuarioResponseDTO(
    Long id,
    String nome,
    String login,
    Telefone telefone,
    Telefone whatsapp
) { 
    public static UsuarioResponseDTO valueOf(Usuario usuario){

        return new UsuarioResponseDTO(
            usuario.getId(), 
            usuario.getNome(),
            usuario.getLogin(),
            usuario.getTelefone(),
            usuario.getWhatsapp()
        );
    }
}
