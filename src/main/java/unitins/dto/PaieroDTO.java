package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PaieroDTO(
    @NotBlank(message = "O campo nome deve ser informado.")
    String nome,

    @NotBlank(message = "O campo nome deve ser informado.")
    String descricao,

    @NotBlank(message = "O campo nome deve ser informado.")
    int qtdNoEstoque,

    @NotBlank(message = "O campo nome deve ser informado.")
    String sabor,

    @NotNull(message = "O campo idEstado deve ser informado.")
    Long idPaiero
    ) {}
