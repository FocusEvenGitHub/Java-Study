public class ConversaoDolaresParaReais {
    public static void main(String[] args) {
        // Declaração da variável
        double valorEmDolares = 50.00;  // Valor em dólares
        double taxaDeCambio = 5.46;     // Taxa de câmbio de 1 dólar para reais

        // Conversão do valor em dólares para reais
        double valorEmReais = valorEmDolares * taxaDeCambio;

        // Impressão do resultado formatado
        System.out.printf("O valor de R$ %.2f \nequivalente a $ %.2f dolares.%n", valorEmReais, valorEmDolares);
    }
}
