import java.util.Scanner;

public class MenuCalculoArea {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo o menu
        System.out.println("Escolha uma opção:");
        System.out.println("1. Calcular área do quadrado");
        System.out.println("2. Calcular área do círculo");

        // Solicitando ao usuário que escolha uma opção
        System.out.print("Digite sua escolha (1 ou 2): ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                // Calculando a área do quadrado
                System.out.print("Digite o valor do lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado * lado;
                System.out.println("A área do quadrado é: " + areaQuadrado);
                break;
                
            case 2:
                // Calculando a área do círculo
                System.out.print("Digite o valor do raio do círculo: ");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                System.out.println("A área do círculo é: " + areaCirculo);
                break;

            default:
                // Caso o usuário insira uma opção inválida
                System.out.println("Opção inválida. Por favor, escolha 1 ou 2.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
