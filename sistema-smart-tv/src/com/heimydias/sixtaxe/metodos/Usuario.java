package com.heimydias.sixtaxe.metodos;

public class Usuario {
    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();
        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        smartTv.desligada();
        System.out.println("Novo status -> Tv ligada? " + smartTv.ligada);

        System.out.println("volume atual: " + smartTv.volume);

        System.out.println("Canal atual: " + smartTv.canal);

    }
}
