package unitins.dto;

import jakarta.validation.constraints.NotBlank;
import unitins.model.Tamanho;

public record NarguileDTO(
    @NotBlank(message = "O campo nome deve ser informado.")
    String nome,

    @NotBlank(message = "O campo descricao deve ser informado.")
    String descricao,

    @NotBlank(message = "O campo quantidade no estoque deve ser informado.")
    int qtdNoEstoque,

    @NotBlank(message = "O campo valor deve ser informado.")
    float valor,

    @NotBlank(message = "O campo tamanho deve ser informado.")
    Tamanho tamanho
) { }
