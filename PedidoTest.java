public class PedidoTest {
    public static void main(String[] args) {

        Pedido pedidoVazio = new Pedido();

        if (pedidoVazio.calcularTotal() == 0.0) {
            System.out.println("Teste pedido vazio OK");
        } else {
            System.out.println("Erro: pedido vazio deveria ser 0");
        }

    }
}
