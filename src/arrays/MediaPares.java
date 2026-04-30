package arrays;

import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos elementos vai ter o vetor?");
        int n = sc.nextInt();
        int[] vect = new int[n];
        double media;
        double soma = 0;
        int quantidade = 0;

        System.out.println("Digite um numero:");
        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextInt();
        }

        for (int i =0; i<n; i++){
            if (vect[i] % 2 == 0){
                soma=soma+vect[i];
            }
        }
        
        for (int i=0; i<n; i++){
            if (vect[i] % 2 ==0){
                quantidade++;
            }
        }

        media=(soma/quantidade);
        if (soma >0){
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        } else {
            System.out.println("NENHUM NUMERO PAR");
        }
    }
}
