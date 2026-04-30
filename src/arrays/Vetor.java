package arrays;

import java.util.Locale;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double media = 0;
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite um numero:");
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[1];
        }

        double avg = sum / n;
        System.out.printf("Média final: %.2f%n", avg);
    }
}
