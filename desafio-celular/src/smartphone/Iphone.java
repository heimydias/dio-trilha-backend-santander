package smartphone;

import smartphone.applicativos.AparelhoTelefonico;
import smartphone.applicativos.NavegadorInternet;
import smartphone.applicativos.ReprodutorMusical;

public class Iphone {
    public static void main(String[] args) {

        ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();

        AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.iniciarCorreioVoz();

        NavegadorInternet navegadorInternet = new NavegadorInternet();
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();
    }
}
