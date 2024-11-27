public class Modulo004 {
    public static void main(String[] args) {
        // Array de notas de um estudante
        int[] notas = {85, 70, 90, 11, 65};
        calcularMedia(notas);
    }
    public static double calcularMedia(int[] notas) {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        double media = (double) soma / notas.length;

        // Verificar aprovação
        if (media >= 70) {
            System.out.println("Aprovado com média " + media);
        } else {
            System.out.println("Reprovado com média " + media);
        }
        return media;
    }
}