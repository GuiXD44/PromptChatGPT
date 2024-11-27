public class Main {
    public static void main(String[] args) {
        // Exemplo: calcular o fatorial de um número
        int num = 7;
        int resultado = calcularFatorial(num);
        System.out.println(resultado);
    }


    public static int calcularFatorial(int numA) {
        int fatorial = 1;
        for (int i = 1; i <= numA; i++) {
            fatorial *= i;
        }
        return fatorial;
    }
}