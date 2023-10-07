package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import unitins.model.Telefone;

public record TelefoneDTO(
    @NotBlank(message = "O campo codigoArea nao pode ser nulo.")
    String codigoArea,
    @NotBlank(message = "O campo numero nao pode ser nulo.")
    String numero
) {
    public static TelefoneDTO valueOf(Telefone telefone){
        return new TelefoneDTO(
            telefone.getCodigoArea(), 
            telefone.getNumero()
        );
    }
}