import java.util.ArrayList;

class Pedido {
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
