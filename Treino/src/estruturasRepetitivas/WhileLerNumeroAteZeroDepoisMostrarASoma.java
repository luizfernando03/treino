package estruturasRepetitivas;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class WhileLerNumeroAteZeroDepoisMostrarASoma {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        //Fazer um programa que lê um valor
        //inteiro N e depois N números inteiros.
        //Ao final, mostra a soma dos N números
        //lidos ( ENTRADA 3,5,2,4 ^^  SAIDA 11)

        //Variel
        int x = sc.nextInt ();
        int soma = 0;

        while (x != 0){
            soma = soma + x;
            //poderia trocar pelo OPERADOR DE ATRIBUIÇÃO ACUMULATIVA soma += x;
            x = sc.nextInt ();
        }
        System.out.println (soma);
        sc.close ();
    }
}
