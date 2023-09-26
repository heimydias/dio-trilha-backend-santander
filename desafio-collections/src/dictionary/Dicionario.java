package dictionary;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class Dicionario {

    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()){
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String palavraPesquisa = null;
        if (!dicionarioMap.isEmpty()) {
            palavraPesquisa = dicionarioMap.get(palavra);
        }
        return palavraPesquisa;
    }

    public static void main(String[] args) {

        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("Inerente", "O que está ligado de forma inseparável ao ser.");
        dicionario.adicionarPalavra("Antônimo", "Palavras que têm sentido contrário a outras.");
        dicionario.adicionarPalavra("Ambíguo", "Que contém ou pode conter múltiplos sentidos.");
        dicionario.adicionarPalavra("Hipotético", "Que se pauta em hipóteses ou suposições.");

        dicionario.exibirPalavras();

        dicionario.removerPalavra("Inerente");

        dicionario.exibirPalavras();

        System.out.println("Definição da Palavra Ambíguo: " + dicionario.pesquisarPorPalavra("Ambíguo"));


    }
}
