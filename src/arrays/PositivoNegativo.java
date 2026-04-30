package arrays;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos valores vai ter cada vetor?");
        int n = sc.nextInt();
        int[] vect2 = new int[n];
        int[] vect1 = new int[n];
        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++){
            vect1[i] = sc.nextInt();
        }
        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            vect2[i] = sc.nextInt();
        }

        System.out.println("VETOR RESULTANTE:");

        for (int i = 0; i < n; i++) {
            System.out.println(vect1[i]+vect2[i]);
        }


    }



}
