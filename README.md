1° Fazer a interface

java
package ExemploProfessor;

public interface Cardapio {
        void lanchedocardapio();
}



2° Criar a classe Pai

java
package ExemploProfessor;

import java.util.Scanner;

abstract class Hamburgueria implements Cardapio {
    public void lanchedocardapio(){
        System.out.println("Faça seu pedido: ");
    }
    Scanner scanner = new Scanner(System.in);
    String pedido = scanner.nextLine();

}



3° Criar classe filho

java
package ExemploProfessor;

class Pedido extends Hamburgueria {

    public void opcao(){
        System.out.println("O lanche escolhido foi " + pedido);
    }
}


4° Criar o Main e dar run no arquivo

java
package ExemploProfessor;

public class Main {
    public static void main(String[] args) {
        Pedido pedido01 = new Pedido();

        pedido01.lanchedocardapio();
        pedido01.opcao();



    }
}





