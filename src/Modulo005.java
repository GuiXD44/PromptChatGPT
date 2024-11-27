public class Modulo005 {
    public static void main(String[] args) {
        int numero = 11;
        boolean primo = verificarNumPrimo(numero);

        if (primo) {
            System.out.println(numero + " é um número primo");
        } else {
            System.out.println(numero + " não é um número primo");
        }
    }

    // Função para verificar se o número é primo
    public static boolean verificarNumPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}