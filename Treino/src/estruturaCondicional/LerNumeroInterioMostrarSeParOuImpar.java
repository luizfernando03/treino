package estruturaCondicional;

import java.util.Scanner;

public class LerNumeroInterioMostrarSeParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Fazer um programa para ler um número inteiro e
        // dizer se este número é par ou ímpar

        int n = sc.nextInt ();

        if (n % 2 == 0){
            System.out.println ("par");
        }else{
            System.out.println ("impa");
        }
        sc.close ();
    }
}
