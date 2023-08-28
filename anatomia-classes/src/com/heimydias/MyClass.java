package com.heimydias;

public class MyClass {
    public static void main(String[] args) {
        String primeiroNome = "Heimy";
        String segundoNome = "Dias";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
