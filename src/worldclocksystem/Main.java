package worldclocksystem;

public class Main {
    public static void main(String[] args) {
        ClockMenu menu = new ClockMenu();

        try {
            menu.exibirMenu();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            menu.fecharScanner();
        }

        System.out.println("Programa finalizado.");
    }
}