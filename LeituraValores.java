import java.util.Scanner;

public class LeituraValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[6];

        System.out.println("Digite 6 valores inteiros:");

        int i = 0;
        while (i < valores.length) {
            System.out.print("Valor " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                valores[i] = scanner.nextInt();
                i++;
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.next(); // descarta a entrada inválida
            }
        }

        // Mostra os valores lidos
        System.out.println("\nValores lidos:");
        for (int valor : valores) {
            System.out.println(valor);
        }

        scanner.close();
    }
}

