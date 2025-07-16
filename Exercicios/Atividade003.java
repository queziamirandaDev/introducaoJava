package Exercicios;

public class Atividade003 {

    public static void main(String[] args) {


        String nome = "Quézia";

        System.out.println("Média dos Semestres da aluna  " + nome);

        //  Média Semestres

        int nota1 = 7;
        int nota2 = 10;
        int nota3 = 6;
        int nota4 = 7;
        int nota5 = 10;
        int nota6 = 9;

        int soma = nota1+nota2+nota3+nota4+nota5+nota6;

        int media = soma/6;




        System.out.println(" A Média da aluna " + nome + " foi: " + media );



        // Opção com repeticão for

        double media5 = 0.0;

        int totalSemestre = 10;





        for (int i = 1 )


        if (media > 6) {
            System.out.println("Parabens! Você atingiu a média esperada");
        } else {
            System.out.println("Você não atingiu a nota esperada. ");
        }




        // media bimestre com média ponderada

        //Materia Matematica

        int nota01 = 6;
        int peso01 = 1;
        int nota02 = 9;
        int peso02 = 2;
        int nota03 = 7;
        int peso03 = 3;

        int totalPeso = peso01+peso02+peso03;

        int totalNota = nota01*peso01+nota02*peso02+nota03*peso03;

        int mediaPonderada = totalNota/totalPeso;



        System.out.println(mediaPonderada);







    }
}
