package worldclocksystem;

public abstract class Clock {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Clock() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Clock(int hora, int minuto, int segundo) {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora deve estar entre 0 e 24");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 59) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto deve estar entre 0 e 59");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo deve estar entre 0 e 59");
        }
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract void ajustarRelogio(Clock outroRelogio);

    @Override
    public String toString() {
        return getHoraFormatada();
    }
}