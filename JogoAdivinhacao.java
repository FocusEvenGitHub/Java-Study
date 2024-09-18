import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        // Criar o gerador de números aleatórios e o scanner para ler a entrada do usuário
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        // Gerar um número aleatório entre 0 e 100
        int numeroAleatorio = random.nextInt(101); // nextInt(101) gera números entre 0 e 100, inclusive

        // Inicializar variáveis
        int tentativas = 0;
        boolean acerto = false;

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 0 e 100.");

        // Loop para até 5 tentativas
        while (tentativas < 10) {
            System.out.print("Digite o seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            // Verificar se o palpite está correto
            if (palpite == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número!");
                acerto = true;
                break; // Interromper o loop se o usuário acertou
            } else if (palpite < numeroAleatorio) {
                System.out.println("O número é maior que " + palpite + ".");
            } else {
                System.out.println("O número é menor que " + palpite + ".");
            }
        }

        // Mensagem final
        if (!acerto) {
            System.out.println("Você não acertou o número. O número correto era " + numeroAleatorio + ".");
        }

        // Fechar o scanner
        scanner.close();
    }
}
