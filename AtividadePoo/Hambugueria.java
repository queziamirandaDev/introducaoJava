package AtividadePoo;


interface cardapio {

   void lanchedocardapio();
}


abstract class Hamburgueria implements cardapio {

    public void opcao1(){

        System.out.println("Cliente escolheu XBacon");



    }

    public void opcao2(){

        System.out.println("Cliente escolheu Xsalada");

    }

    public void opcao3(){

        System.out.println("Cliente escolheu XChedder");

    }

    public void opcao4(){

        System.out.println("Cliente escolheu XChicken");

    }




}

