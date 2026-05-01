class Main {
    public static void main(String[] args) {
        Produto cafe = new Produto("Café", 5.0);
        Produto pao = new Produto("Pão", 2.0);

        ItemPedido item1 = new ItemPedido(cafe, 2); // 10
        ItemPedido item2 = new ItemPedido(pao, 3);  // 6

        Pedido pedido = new Pedido();
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        double total = pedido.calcularTotal();

        if (total == 16.0) {
            System.out.println("Teste OK - Total: " + total);
        } else {
            System.out.println("Teste ERRO");
        }
    }
}
