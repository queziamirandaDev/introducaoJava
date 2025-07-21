package ExemploProfessor;

import java.util.Scanner;

abstract class Hamburgueria implements Cardapio {
    public void lanchedocardapio(){
        System.out.println("Faça seu pedido: ");
    }
    Scanner scanner = new Scanner(System.in);
    String pedido = scanner.nextLine();



}



