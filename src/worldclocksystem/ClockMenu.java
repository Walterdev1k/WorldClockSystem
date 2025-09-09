package worldclocksystem;

import java.util.Scanner;

public class ClockMenu {
    private final Scanner scanner; // Campo 'final' adicionado
    private BrazilianClock relogioBrasileiro;
    private AmericanClock relogioAmericano;

    public ClockMenu() {
        scanner = new Scanner(System.in);
        relogioBrasileiro = new BrazilianClock();
        relogioAmericano = new AmericanClock();
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n=== SISTEMA DE RELÓGIOS MUNDIAIS ===");
            System.out.println("1. Configurar Relógio Brasileiro");
            System.out.println("2. Configurar Relógio Americano");
            System.out.println("3. Exibir Horários Atuais");
            System.out.println("4. Ajustar Relógio Brasileiro com base no Americano");
            System.out.println("5. Ajustar Relógio Americano com base no Brasileiro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    configurarRelogioBrasileiro();
                    break;
                case 2:
                    configurarRelogioAmericano();
                    break;
                case 3:
                    exibirHorarios();
                    break;
                case 4:
                    ajustarBrasileiroComAmericano();
                    break;
                case 5:
                    ajustarAmericanoComBrasileiro();
                    break;
                case 6:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);
    }

    private void configurarRelogioBrasileiro() {
        try {
            System.out.println("\n--- Configurar Relógio Brasileiro ---");
            System.out.print("Hora (0-24): ");
            int hora = scanner.nextInt();
            System.out.print("Minuto (0-59): ");
            int minuto = scanner.nextInt();
            System.out.print("Segundo (0-59): ");
            int segundo = scanner.nextInt();

            relogioBrasileiro = new BrazilianClock(hora, minuto, segundo);
            System.out.println("Relógio Brasileiro configurado: " + relogioBrasileiro);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar buffer
        }
    }

    private void configurarRelogioAmericano() {
        try {
            System.out.println("\n--- Configurar Relógio Americano ---");
            System.out.print("Hora (0-24): ");
            int hora = scanner.nextInt();
            System.out.print("Minuto (0-59): ");
            int minuto = scanner.nextInt();
            System.out.print("Segundo (0-59): ");
            int segundo = scanner.nextInt();

            relogioAmericano = new AmericanClock(hora, minuto, segundo);
            System.out.println("Relógio Americano configurado: " + relogioAmericano);

        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            scanner.nextLine(); // Limpar buffer
        }
    }

    private void exibirHorarios() {
        System.out.println("\n--- Horários Atuais ---");
        System.out.println(relogioBrasileiro);
        System.out.println(relogioAmericano);
    }

    private void ajustarBrasileiroComAmericano() {
        try {
            relogioBrasileiro.ajustarRelogio(relogioAmericano);
            System.out.println("Relógio Brasileiro ajustado com base no Americano: " + relogioBrasileiro);
        } catch (Exception e) {
            System.out.println("Erro ao ajustar: " + e.getMessage());
        }
    }

    private void ajustarAmericanoComBrasileiro() {
        try {
            relogioAmericano.ajustarRelogio(relogioBrasileiro);
            System.out.println("Relógio Americano ajustado com base no Brasileiro: " + relogioAmericano);
        } catch (Exception e) {
            System.out.println("Erro ao ajustar: " + e.getMessage());
        }
    }

    public void fecharScanner() {
        scanner.close();
    }
}