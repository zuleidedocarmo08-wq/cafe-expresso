public class PedidoTest {
    public static void main(String[] args) {

        Pedido pedidoVazio = new Pedido();

        if (pedidoVazio.calcularTotal() == 0.0) {
            System.out.println("Teste pedido vazio OK");
        } else {
            System.out.println("Erro: pedido vazio deveria ser 0");
            
        }
Pedido pedido2 = new Pedido();

pedido2.adicionarItem(new Produto("Café", 5.0));
pedido2.adicionarItem(new Produto("Pão", 3.0));
pedido2.adicionarItem(new Produto("Leite", 4.0));

double total2 = pedido2.calcularTotal();

if (total2 == 12.0) {
    System.out.println("Teste múltiplos itens OK");
} else {
    System.out.println("Erro no cálculo com múltiplos itens");
}
    }
}
