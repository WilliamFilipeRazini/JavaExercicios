import java.util.ArrayList;
import java.util.Scanner;

public class VetorImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        ArrayList<Integer> vetor2 = new ArrayList<>();

        System.out.println("Digite 10 números inteiros no intervalo [0, 50]:");

        int count = 0;
        while (count < vetor1.length) {
            System.out.print("Número " + (count + 1) + ": ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                if (numero >= 0 && numero <= 50) {
                    vetor1[count] = numero;
                    if (numero % 2 != 0) {
                        vetor2.add(numero);
                    }
                    count++;
                } else {
                    System.out.println("Número fora do intervalo! Digite entre 0 e 50.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next(); // descarta entrada inválida
            }
        }

        // Imprime o vetor1
        System.out.println("\nVetor 1 (todos os valores):");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + "\t");
            if ((i + 1) % 2 == 0) System.out.println(); // 2 por linha
        }

        // Imprime o vetor2
        System.out.println("\nVetor 2 (apenas ímpares):");
        for (int i = 0; i < vetor2.size(); i++) {
            System.out.print(vetor2.get(i) + "\t");
            if ((i + 1) % 2 == 0) System.out.println(); // 2 por linha
        }

        scanner.close();
    }
}
