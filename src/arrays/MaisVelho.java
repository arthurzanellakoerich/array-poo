package arrays;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Quantas pessoas serao digitadas?");
        int n = sc.nextInt();
        String[] nomes = new String[n];
        int[] idades = new int[n];
        int maisVelho = 0;

        for (int i =0; i<n; i++){
            System.out.println("Dados da " + (i+1) + " pessoa" );
            System.out.println("Nome:");
            sc.nextLine();
            nomes[i]= sc.nextLine();
            System.out.println("Idade:");
            idades[i] = sc.nextInt();
        }

        System.out.println("PESSOA MAIS VELHA:");

        String nomeMaisVelho = "";

        for (int i = 0; i<n; i++){
            if (idades[i] > maisVelho){
                maisVelho = idades[i];
                nomeMaisVelho = nomes[i];
            }
        }

        System.out.println("Nome: " + nomeMaisVelho);
        System.out.println("Idade: " + maisVelho);
    }
}
