public class CalculaPrecoComDesconto {
    public static void main(String[] args) {
        // Declaração das variáveis
        double precoOriginal = 150.00;       // Preço original do produto em reais
        double percentualDesconto = 10.0;    // Percentual de desconto

        // Cálculo do valor do desconto em reais
        double valorDesconto = precoOriginal * (percentualDesconto / 100.0);

        // Cálculo do novo preço com desconto
        double precoComDesconto = precoOriginal - valorDesconto;

        // Impressão do novo preço com desconto
        System.out.printf("Preco original: R$ %.2f%n", precoOriginal);
        System.out.printf("Desconto aplicado: R$ %.2f%n", valorDesconto);
        System.out.printf("Novo preco com desconto: R$ %.2f%n", precoComDesconto);
    }
}
