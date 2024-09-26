import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira um número inteiro
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        // Verificando se o número é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }

        // Fechando o scanner
        scanner.close();
    }
}
