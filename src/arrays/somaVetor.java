package arrays;

import java.util.Locale;
import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double media;

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        double[] numeros = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um numero:");
            numeros[i] = sc.nextDouble();
            soma = soma+numeros[i];
        }

        media = soma / n;

        System.out.print("VALORES = ");

        for (int i = 0; i < n; i++){
            System.out.printf("%.1f ", numeros[i]);
        }

        System.out.printf("\nSOMA = %.2f%n ", soma);
        System.out.printf("\nMEDIA = %.2f%n ", media);
    }
}
