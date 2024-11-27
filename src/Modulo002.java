public class Modulo002 {
    public static void main(String[] args) {
        // Verifica se o número é par ou ímpar
        int numero = 22;
        verificacaoNumero(numero);
    }

    public static int verificacaoNumero(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " = Número Par");
        } else {
            System.out.println(numero + " = Número Ímpar");
        }
        return numero;
    }
}