package worldclocksystem;

public enum PaisFusoHorario {
    // América
    BRASIL("Brasil", 0),
    EUA_WASHINGTON("EUA - Washington", -1),
    EUA_NOVA_YORK("EUA - Nova York", -1),
    EUA_CHICAGO("EUA - Chicago", -2),
    EUA_DENVER("EUA - Denver", -3),
    EUA_LOS_ANGELES("EUA - Los Angeles", -4),
    ARGENTINA("Argentina", 0),
    CANADA_TORONTO("Canadá - Toronto", -1),
    CANADA_VANCOUVER("Canadá - Vancouver", -4),
    MEXICO("México", -3),

    // Europa
    PORTUGAL("Portugal", 4),
    ESPANHA("Espanha", 5),
    FRANCA("França", 5),
    ITALIA("Itália", 5),
    ALEMANHA("Alemanha", 5),
    REINO_UNIDO("Reino Unido", 4),

    // Ásia
    JAPAO("Japão", 12),
    CHINA("China", 11),
    INDIA("Índia", 8, 30),
    AUSTRALIA_SYDNEY("Austrália - Sydney", 13),

    // África
    AFRICA_DO_SUL("África do Sul", 5),
    EGITO("Egito", 6);

    private final String nome;
    private final int diferencaHoras;
    private final int diferencaMinutos;

    PaisFusoHorario(String nome, int diferencaHoras) {
        this(nome, diferencaHoras, 0);
    }

    PaisFusoHorario(String nome, int diferencaHoras, int diferencaMinutos) {
        this.nome = nome;
        this.diferencaHoras = diferencaHoras;
        this.diferencaMinutos = diferencaMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getDiferencaHoras() {
        return diferencaHoras;
    }

    public int getDiferencaMinutos() {
        return diferencaMinutos;
    }

    public static PaisFusoHorario[] getPaises() {
        return values();
    }

    @Override
    public String toString() {
        return nome;
    }
}