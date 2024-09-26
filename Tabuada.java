import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira um número
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        // Exibindo a tabuada de 1 a 10
        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Fechando o scanner
        scanner.close();
    }
}
