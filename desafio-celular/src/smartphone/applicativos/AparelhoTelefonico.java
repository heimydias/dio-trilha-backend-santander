package smartphone.applicativos;

import java.util.Random;
import java.util.Scanner;

public class AparelhoTelefonico {

    private final Scanner sc = new Scanner(System.in);
    public AparelhoTelefonico() {
        System.out.println("Abrindo Telefone");
    }

    public void ligar() {
        Random random = new Random();

        int numero = random.nextInt(99999999) + 10000000;

        System.out.println("Ligando para: 9" + numero);

        boolean atendeu = random.nextBoolean();

        if (atendeu == true) {
            System.out.println("Alô...");
        } else {
            System.out.println("Sua chamada esta sendo encaminhada para caixa de mensagens...");
        }

    }

    public void atender() {
        Random random = new Random();

        System.out.println("Ligando...");

        int numeroLigando = random.nextInt(10000000, 99999999);

        System.out.println("Chamando 9" + numeroLigando);

        String atenderOuNao;

        System.out.println("Atender ou Desligar?");
        atenderOuNao = sc.next();

        if ("Atender".equals(atenderOuNao)) {
            System.out.println("Alô...");
        } else {
            System.out.println("Chamada desligada...");
        }
    }

    public void iniciarCorreioVoz() {
        int ouvir;

        System.out.println("Você tem uma mensagem de voz...");
        System.out.println("Para ouvir digite 1 | Para excluir digite 2");
        ouvir = sc.nextInt();

        if (ouvir == 1) {
            System.out.println("Me liga é urgente...");
        } else {
            System.out.println("Mensagem de voz excluida...");
        }
    }

}
