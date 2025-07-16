package AulasJava;

import java.util.Scanner;

public class Aula003 {

    public static void main(String[] args) {

     // operadores matematicos

        double n = 2;
        double m = 3;

        System.out.println("esse " + n + "elevado a este " + m + "É igual a = " + Math.pow(n,m));

        // Matc.round arredonda o valor

        // Math.abs numero negativo da psitivo e vice versa

        // metodo Math.random



        int negativo = -10;
        System.out.println("\n2.Valor absoluto:");
        System.out.println("O valor absoluto de " + negativo + "é" + Math.abs(negativo));


        int a =7,b=5;

        System.out.println("\n3.Maior Valor:");
        System.out.println("O maior entre" + a + " e " + b + " é:" + Math.max(a,b));

        System.out.println("\n3.Menor Valor:");
        System.out.println("O menor entre" + a + " e " + b + " é:" + Math.min(a,b));


        // resto da divisão % f flutuante , 2f ira gerar 2 casas decimais apos a virgula.


        // Apendendo Input na linguagem java




        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.println(name);



    }
}
