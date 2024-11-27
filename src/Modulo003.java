public class Modulo003 {
    public static void main(String[] args) {
        // Verifica se o número é positivo, negativo ou zero
        int numero = 22;
        verificaNumero(numero);

    }
    public static int verificaNumero(int numero) {
        if (numero > 0) {
            System.out.println(numero + " é positivo");
        } else if (numero < 0) {
            System.out.println(numero + " é negativo");
        } else {
            System.out.println(numero + " é zero");
        }
        return numero;
    }
}