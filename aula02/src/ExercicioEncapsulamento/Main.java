package ExercicioEncapsulamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cnh pessoa = new Cnh();


        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        pessoa.setNome(nome);


        System.out.println("Digite sua idade: ");

        int idade = sc.nextInt();
        pessoa.setIdade(idade);

        sc.close();


    }


}
