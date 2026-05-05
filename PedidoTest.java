public class PedidoTest {
    public static void main(String[] args) {

        Produto p1 = new Produto("Café", 5.0);
        Produto p2 = new Produto("Pão", 3.0);

        Pedido pedido = new Pedido();

        pedido.adicionarItem(p1);
        pedido.adicionarItem(p2);

        double total = pedido.calcularTotal();

        if (total == 8.0) {
            System.out.println("Total OK");
        } else {
            System.out.println("Erro no total");
        }
    }
}
