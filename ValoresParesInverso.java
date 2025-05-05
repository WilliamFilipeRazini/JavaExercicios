import java.util.Scanner;

public class ValoresParesInverso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[9];
        int i = 0;

        System.out.println("Digite 9 números inteiros PARES:");

        while (i < valores.length) {
            System.out.print("Valor " + (i + 1) + ": ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                if (numero % 2 == 0) {
                    valores[i] = numero;
                    i++;
                } else {
                    System.out.println("O número não é par. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next(); // descarta a entrada inválida
            }
        }

        // Exibe os valores em ordem inversa
        System.out.println("\nValores lidos (em ordem inversa):");
        for (int j = valores.length - 1; j >= 0; j--) {
            System.out.println(valores[j]);
        }

        scanner.close();
    }
}
