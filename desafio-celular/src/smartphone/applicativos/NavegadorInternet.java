package smartphone.applicativos;

import java.util.Scanner;

public class NavegadorInternet {

    private final Scanner sc = new Scanner(System.in);
    public NavegadorInternet() {
        System.out.println("Abrindo Safari");
    }

    public void exibirPagina() {

        System.out.println("    Internet");
        System.out.println("--------------------");
        System.out.println("|Q Pesquisar na web |");
        System.out.println("--------------------");
    }

    public void adicionarNovaAba() {

        char simbolo;

        System.out.println("Para abrir uma nova aba selecione '+'");
        simbolo = sc.nextLine().charAt(0);

        if (simbolo == '+') {
            System.out.println("    Internet");
            System.out.println("--------------------");
            System.out.println("|Q Pesquisar na web |");
            System.out.println("--------------------");
        }
    }

    public void atualizarPagina() {

        String atualizar;

        System.out.println("Para atualizar pagina selecione 'C'");
        atualizar = sc.next();

        if ("C".equals(atualizar)) {
            System.out.println("\uD83D\uDD04");
        }
    }

}
