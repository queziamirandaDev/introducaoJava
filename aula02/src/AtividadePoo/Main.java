package AtividadePoo;

public class Main {
    public static void main(String[] args) {

       pedido01 pedido001 = new pedido01() {
           @Override
           public void lanchedocardapio() {
           }

       };

   pedido001.lanchedocardapio();
   pedido001.opcao1();

    pedido02 pedido002 = new pedido02() {
        @Override
        public void lanchedocardapio() {
        }
    };

    pedido002.opcao2();

    pedido03 pedido003 = new pedido03() {
        @Override
        public void lanchedocardapio() {

        }
    };


    pedido003.opcao3();


    pedido04 pedido004 = new pedido04() {
        @Override
        public void lanchedocardapio() {


        }
    };

    pedido004.opcao4();



       }




}
