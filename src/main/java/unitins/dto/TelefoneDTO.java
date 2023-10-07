package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import unitins.model.Telefone;

public record TelefoneDTO(
    @NotBlank(message = "O campo codigoArea nao pode ser nulo.")
    @Size(min = 2, max = 2, message = "O Codigo de Area é sem o 0")
    String codigoArea,

    @NotBlank(message = "O campo numero nao pode ser nulo.")
    @Pattern(regexp = "\\d{5}\\-\\d{4}$", message = "O número deve estar formulado: 9****-****")
    String numero
) {
    public static TelefoneDTO valueOf(Telefone telefone){
        return new TelefoneDTO(
            telefone.getCodigoArea(), 
            telefone.getNumero()
        );
    }
}