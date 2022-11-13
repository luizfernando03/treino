package estruturaCondicional;

import java.util.Scanner;

public class CalculoOperadoraTelefoneMinutos {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println ("Quantos minustos foram gastos ?");

        int minutos = sc.nextInt ();

        double conta = 50.0;
        if (minutos > 100 ) {
            conta  += (minutos - 100) * 2.0;
            //Formato nomral era conta = conta +(minutos - 100) *2.0
            //Porem o += é um operador de distribuiçaõ que fica a+=b; ou sejaa fica = a+b;
            //Desta forma fica conta +=(minutos - 100) * 2.0; onde o resultado é o mesmo.
        }
        System.out.printf ("Valor da conta = R$ %.2f%n", conta);

        sc.close ();
    }

}
