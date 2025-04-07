import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Contador contador = new Contador();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Incrementar");
            System.out.println("2. Decrementar");
            System.out.println("3. Zerar");
            System.out.println("4. Mostrar valor");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    contador.incrementar();
                    System.out.println("Valor incrementado!");
                    break;

                case 2:
                    contador.decrementar();
                    break;

                case 3:
                    contador.zerar();
                    System.out.println("Valor zerado!");
                    break;

                case 4:
                    System.out.println("Valor atual: " + contador.getValor());
                    break;

                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }
    }
}
try {
    int opcao = scanner.nextInt();
    // Resto do código...
} catch (java.util.InputMismatchException e) {
    System.out.println("Entrada inválida! Por favor, insira um número.");
    scanner.nextLine();  // Limpa o buffer do scanner
}
