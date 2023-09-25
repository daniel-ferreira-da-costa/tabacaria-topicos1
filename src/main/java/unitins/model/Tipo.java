package unitins.model;

public enum Tipo {
    ACESSORIO(1, "Acessorio"),
    ESSENCIA(2, "Essencia"),
    PAIERO(3, "Paiero"),
    PECA(4, "Peca"),
    NARGUILE(5, "Narguile");
    
    private final int id;
    private final String descricao;

    private Tipo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Tipo valueOf(int id) {
        for (Tipo tipo : Tipo.values()) {
            if (tipo.getId() == id) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("ID inválido: " + id);
    }

}
