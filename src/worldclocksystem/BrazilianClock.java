package worldclocksystem;

public class BrazilianClock extends Clock {

    public BrazilianClock() {
        super();
    }

    public BrazilianClock(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public void ajustarRelogio(Clock outroRelogio) {
        if (outroRelogio != null) {
            this.setHora(outroRelogio.getHora());
            this.setMinuto(outroRelogio.getMinuto());
            this.setSegundo(outroRelogio.getSegundo());
        }
    }

    @Override
    public String toString() {
        return "Relógio Brasileiro: " + getHoraFormatada();
    }
}