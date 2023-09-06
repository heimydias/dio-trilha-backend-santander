package com.heimydias.sixtaxe.metodos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligada(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando volume: " + volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo volume: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("Canal: " + canal);
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
}
