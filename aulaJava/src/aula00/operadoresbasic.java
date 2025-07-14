package aula00;

public class operadoresbasic {
    public static void main(String[] args) {

        int a = 10;
        int b = 9;





        System.out.println("adição = " + (a+b));
        System.out.println("subtração = " + (a-b));
        System.out.println("multiplicação = " + (a*b));
        System.out.println("divisão = " + (a/b));
        System.out.println("resto da divisão = " + (a%b));



        //logicos

        System.out.println("A é maior que B? " + (a>b));
        System.out.println("A é igual a B? " + (a==b));

        boolean condicao1 = (a > 8);
        boolean condicao2 = (b < 3);


        System.out.println("Condição 1 AND Condição 2 = " + (condicao1 && condicao2));
        System.out.println("Condição 1 OR Comdição 2 = " + (condicao1 || condicao2));
        System.out.println("Condição ! = " + (!condicao1));


    }

}
