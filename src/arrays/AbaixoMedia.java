package arrays;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter o vetor?");
        int n = sc.nextInt();
        double[] vect = new double[n];
        double media;
        double abaixoMedia = 0;
        double soma = 0;

        for (int i = 0; i<n; i++) {
            System.out.println("Digite um numero:");
            vect[i] = sc.nextDouble();
            soma = soma+vect[i];
        }

        media = (soma/n);
        System.out.printf("MEDIA DO VETOR = %.3f%n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

        for (int i = 0; i<n; i++){
            if (vect[i] < media){
                System.out.println(vect[i]);
            }
        }
    }
}
