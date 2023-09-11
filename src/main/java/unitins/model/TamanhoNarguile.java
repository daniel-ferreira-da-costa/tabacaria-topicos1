package unitins.model;

public enum TamanhoNarguile {
    GRANDE(1, "Grande"),
    MEDIO(2, "Medio"),
    PEQUENO(3, "Pequeno");

    private final int id;
    private final String descricao;

    private TamanhoNarguile(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }
}
