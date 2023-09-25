package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exebirProdutoNome() {
        Set<Produto> produtosNome = new TreeSet<>(produtoSet);
        return produtosNome;
    }

    public Set<Produto> exibirPreco() {
        Set<Produto> produtosPreco = new TreeSet<>(new ComparatorPreco());
        produtosPreco.addAll(produtoSet);
        return produtosPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Produto 5", 15.0, 5);
        cadastroProdutos.adicionarProduto(2L, "Produto 0", 20.0, 10);
        cadastroProdutos.adicionarProduto(1L, "Produto 3", 10.0, 2);
        cadastroProdutos.adicionarProduto(9L, "Produto 9", 2.0, 2);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exebirProdutoNome());
        System.out.println(cadastroProdutos.exibirPreco());
    }
}
