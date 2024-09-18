public class doubleAndInt {
    public static void main(String[] args) {
        // Declaração de variáveis
        double valorDouble = 9.75;
        int valorInt;

        // Casting explícito de double para int
        valorInt = (int) valorDouble;

        // Imprime o valor original e o valor após o casting
        System.out.println("Valor original (double): " + valorDouble);
        System.out.println("Valor apos o casting para int: " + valorInt);
    }
}
