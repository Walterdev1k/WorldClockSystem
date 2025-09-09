package worldclocksystem;

public class AmericanClock extends Clock {
    private boolean isPM;

    public AmericanClock() {
        super();
        this.isPM = false;
    }

    public AmericanClock(int hora, int minuto, int segundo) {
        super(converterParaFormatoAmericano(hora - 1), minuto, segundo); // Subtrai 1 hora para Washington
        this.isPM = (hora >= 12);
    }

    @Override
    public void setHora(int hora) {
        if (hora >= 1 && hora <= 12) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora deve estar entre 1 e 12 para formato americano");
        }
    }

    private static int converterParaFormatoAmericano(int hora) {
        if (hora == 0 || hora == 12 || hora == 24) {
            return 12;
        } else if (hora > 12) {
            return hora - 12;
        } else if (hora < 0) {
            return 12 + hora; // Para tratar horas negativas (quando subtraímos 1)
        } else {
            return hora;
        }
    }

    @Override
    public void ajustarRelogio(Clock outroRelogio) {
        if (outroRelogio != null) {
            // Subtrai 1 hora para ajustar para Washington
            int horaAjustada = outroRelogio.getHora() - 1;
            if (horaAjustada < 0) {
                horaAjustada = 24 + horaAjustada; // Ajusta para ciclo de 24 horas
            }

            int horaConvertida = converterParaFormatoAmericano(horaAjustada);
            this.setHora(horaConvertida);
            this.setMinuto(outroRelogio.getMinuto());
            this.setSegundo(outroRelogio.getSegundo());
            this.isPM = (horaAjustada >= 12);
        }
    }

    public String getPeriodo() {
        return isPM ? "PM" : "AM";
    }

    @Override
    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d %s", hora, minuto, segundo, getPeriodo());
    }

    @Override
    public String toString() {
        return "Relógio Americano: " + getHoraFormatada();
    }
}