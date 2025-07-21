package AulaPoo;

import AulaPoo.Carro;



public class Main {

    public static void main(String[] args) {

        AulaPoo.Carro meuCarro = new Carro();
        meuCarro.cor = "Vermelho";
        meuCarro.modelo = "Civic";
        meuCarro.ano = 2022;

        meuCarro.ligar();

    }
}
