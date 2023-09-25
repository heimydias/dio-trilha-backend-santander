package words;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<Palavra> palavraSet;

    public ConjuntoPalavrasUnicas() {
        this.palavraSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavraSet.add(new Palavra(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavra palavraRemover = null;
        for (Palavra p : palavraSet){
            if (p.getPalavra() == palavra) {
                palavraRemover = p;
                break;
            }
        }
        palavraSet.remove(palavraRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavra.contains(palavra);
    }

    public void exibirPalavras() {
        System.out.println(palavraSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.exibirPalavras();

        conjuntoPalavrasUnicas.adicionarPalavra("Lupa");
        conjuntoPalavrasUnicas.adicionarPalavra("Violino");
        conjuntoPalavrasUnicas.adicionarPalavra("Escuro");
        conjuntoPalavrasUnicas.adicionarPalavra("Lupa");
        conjuntoPalavrasUnicas.adicionarPalavra("Livro");

        conjuntoPalavrasUnicas.exibirPalavras();

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Escuro"));

        conjuntoPalavrasUnicas.removerPalavra("Lupa");

        conjuntoPalavrasUnicas.exibirPalavras();
    }

}
