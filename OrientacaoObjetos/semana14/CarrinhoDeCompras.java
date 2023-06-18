package OrientacaoObjetos.semana14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Produto> itens;

    public CarrinhoDeCompras() {
        itens = new ArrayList<>();
    }

    public double calcularTotal() {
        double total = 0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }

    public double calcularTotal(int b) {
        double total = 0;
        for (Iterator<Produto> iterator = itens.iterator(); iterator.hasNext();) {
            Produto produto = iterator.next();
            total += produto.getPreco();
        }
        return total;
    }

    public void imprimirItens() {
        System.out.println("Itens no carrinho:");
        for (Produto produto : itens) {
            System.out.println(produto.getNome() + " - R$" + produto.getPreco());
        }
    }

    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void removerItem(Produto produto) {
        itens.remove(produto);
    }
}
