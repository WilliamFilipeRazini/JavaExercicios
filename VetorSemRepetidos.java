import java.util.Scanner;

public class VetorSemRepetidos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int count = 0;

        System.out.println("Digite 10 números inteiros **sem repetição**:");

        while (count < numeros.length) {
            System.out.print("Número " + (count + 1) + ": ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                boolean repetido = false;

                // Verifica se o número já foi digitado
                for (int i = 0; i < count; i++) {
                    if (numeros[i] == numero) {
                        repetido = true;
                        break;
                    }
                }

                if (repetido) {
                    System.out.println("Número repetido! Digite um número diferente.");
                } else {
                    numeros[count] = numero;
                    count++;
                }
            } else {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.next(); // descarta entrada inválida
            }
        }

        // Encontra o maior e o menor valor
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibe resultados
        System.out.println("\nMenor número: " + menor);
        System.out.println("Maior número: " + maior);

        scanner.close();
    }
}
