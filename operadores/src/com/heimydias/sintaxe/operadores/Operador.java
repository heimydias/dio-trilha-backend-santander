package com.heimydias.sintaxe.operadores;

public class Operador {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println(nomeCompleto);

        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
        System.out.println(++numero);
        System.out.println(--numero);

        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;
        System.out.println(variavel);

        int a, b;
        a = 5;
        b = 6;
        String resultado = a==b ?"verdedeiro" : "falso";
        System.out.println("Condição de a E b: " + resultado);
        //expressão boleana, true ou false

        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("O NumeroUm é igual a numeroDois? " + simNao);
        simNao = numero1 != numero2;
        System.out.println("O NumeroUm é diferente do numeroDois? " + simNao);
        simNao = numero1 > numero2;
        System.out.println("O NumeroUm é maior que o numeroDois? " + simNao);
        if (numero1 < numero2){
            System.out.println("A nossa condição é verdadeira!");
        }
        String nomeUm = "Heimy";
        String nomeDois = "Heimy";
        System.out.println(nomeUm == nomeDois);
        String nomeTres = "Julia";
        String nomeQuatro = new String("Julia");
        System.out.println(nomeTres.equals(nomeQuatro));

        boolean condicao1 = true;
        boolean condicao2 = false;
        if (condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras.");
        }
        if (condicao1 || condicao2){
            System.out.println("Pelo menos uma das condições é verdadeira");
        }
    }
}
