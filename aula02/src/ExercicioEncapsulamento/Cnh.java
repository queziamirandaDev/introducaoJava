package ExercicioEncapsulamento;

import java.util.Scanner;

public class Cnh {

    private String nome;
    private int idade;


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        System.out.println("Ola " + nome);
        this.nome = nome;
    }

    public int getIdade() {

        return idade;
    }

    public void setIdade(int idade){
        if (idade >= 18) {
            System.out.println("Você pode ter CNH");;
            this.idade = idade;
        } else {
            System.out.println("Você ainda não tem idade para ter CNH");
        }

    }
}


