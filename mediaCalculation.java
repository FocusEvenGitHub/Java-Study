import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class mediaCalculation {
    public static void main(String[] args) {
        // Solicita as duas notas
        try (Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8)) {
            // Solicita as duas notas
            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();
            
            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            
            // Calcula a média
            double media = (nota1 + nota2) / 2;
            
            // Exibe o resultado
            System.out.printf("A media das notas e: %.2f%n", media);
        }
    }
}
