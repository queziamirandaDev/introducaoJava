package Exercicios;

public class Aluno {

    String name;
    int ra;

    void ativo(){
        System.out.println("Aluna " + name + " portadora do RA: " + ra);
    }


}

    class TesteAluno {

        public static void main(String[] args) {

            Aluno dadosAluno = new Aluno();
            dadosAluno.name = "Quézia";
            dadosAluno.ra = 2337886;

            dadosAluno.ativo();
        }



    }
