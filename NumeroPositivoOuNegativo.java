import java.util.Scanner;

public class NumeroPositivoOuNegativo {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que digite um número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificando se o número é positivo ou negativo
        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

        // Fechando o scanner
        scanner.close();
    }
}
