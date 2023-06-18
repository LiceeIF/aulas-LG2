package OrientacaoObjetos.semana14;

public class Programa {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Rodrigo");
        Produto p1 = new Produto("Camiseta", 29.99);
        Produto p2 = new Produto("Calça jeans", 79.99);
        Produto p3 = new Produto("Tênis", 99.99);

        cliente.adicionarAoCarrinho(p1);
        cliente.adicionarAoCarrinho(p2);
        cliente.adicionarAoCarrinho(p3);
        cliente.verCarrinho();

        double total = cliente.exibirTotalDoCarrinho();
        System.out.println("Total: R$" + total);

        cliente.removerDoCarrinho(p3);
        cliente.verCarrinho();

        total = cliente.exibirTotalDoCarrinho();
        System.out.println("Total: R$" + total);
    }
}
