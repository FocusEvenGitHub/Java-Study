public class precoByQuantidade {
        public static void main(String[] args) {
            // Declaração de variáveis
            double precoProduto = 19.99;  // Preço do produto
            int quantidade = 5;           // Quantidade de produtos
    
            // Cálculo do valor total
            double valorTotal = precoProduto * quantidade;
    
            // Impressão do resultado
            System.out.printf("O valor total para %d produtos a R$ %.2f \ncada: R$ %.2f%n", quantidade, precoProduto, valorTotal);
        }    
}
