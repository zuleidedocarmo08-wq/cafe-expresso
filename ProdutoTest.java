public class ProdutoTest {
    public static void main(String[] args) {

        Produto produto = new Produto("Café", 5.0);

        if (!produto.getNome().equals("Café")) {
            System.out.println("Erro no nome");
        } else {
            System.out.println("Nome OK");
        }

        if (produto.getPreco() != 5.0) {
            System.out.println("Erro no preço");
        } else {
            System.out.println("Preço OK");
        }
    }
}
