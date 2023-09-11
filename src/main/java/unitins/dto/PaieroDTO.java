package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record PaieroDTO(
    @NotBlank(message = "O campo nome deve ser informado.")
    String nome,

    @NotBlank(message = "O campo descricao deve ser informado.")
    String descricao,

    @NotBlank(message = "O campo quantidade no estoque deve ser informado.")
    int qtdNoEstoque,

    @NotBlank(message = "O campo sabor deve ser informado.")
    String sabor,

    @NotNull(message = "O campo idPaiero deve ser informado.")
    Long idPaiero
    ) {}
