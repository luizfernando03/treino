package estruturaCondicional;

import java.util.Scanner;

public class SimOuNao {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

      int depor;

        System.out.println ("Qual o formato da audiencia?  Online digite ( 1 ) caso seja Presencial digite ( 2 ) ");
        depor = sc.nextInt ();

        if(depor == 1) {
            System.out.println("Sim");
        }else{
            System.out.println("Não");

       }

    }
}
