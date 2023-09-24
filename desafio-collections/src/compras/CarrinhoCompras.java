package compras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {

    private List<Item> itemList;

    public CarrinhoCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemRemover.add(i);
                }
            }
            itemList.removeAll(itemRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoCompras{" +
                "itemList=" + itemList +
                '}';
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();

        carrinhoCompras.adicionarItem("Arroz", 21.0, 3);
        carrinhoCompras.adicionarItem("Feijão", 16.0, 3);
        carrinhoCompras.adicionarItem("Farinha", 8.0, 1);
        carrinhoCompras.adicionarItem("Arroz", 21.0, 2);

        carrinhoCompras.exibirItens();

        carrinhoCompras.removerItem("Lápis");

        carrinhoCompras.exibirItens();

        System.out.println("O valor total da compra é = " + carrinhoCompras.calcularValorTotal());

    }
}
