package com.heimydias.estrutura;

public class ResultadoEscolaV1 {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperacao" : "Reprovado";

        System.out.println(resultado);
    }
}
