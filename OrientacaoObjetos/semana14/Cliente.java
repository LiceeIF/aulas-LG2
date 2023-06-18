package OrientacaoObjetos.semana14;

public class Cliente {
    private int id;
    private String nome;
    private CarrinhoDeCompras carrinho;

    public Cliente(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public void adicionarAoCarrinho(Produto produto) {
        if (carrinho == null)
            carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(produto);
    }

    public void removerDoCarrinho(Produto produto) {
        carrinho.removerItem(produto);
    }

    public double exibirTotalDoCarrinho() {
        return carrinho.calcularTotal();
    }

    public void verCarrinho() {
        carrinho.imprimirItens();
    }
}
