package smartphone.applicativos;

import java.util.Random;
import java.util.Scanner;

public class ReprodutorMusical {

    private final Scanner sc = new Scanner(System.in);
    public ReprodutorMusical() {
        System.out.println("Abrindo Music");
    }

    public void tocar() {
        Random random = new Random();

        int numeroAleatorio = random.nextInt(1, 3) ;

        System.out.println("Tocando Música: " + numeroAleatorio + "...");
    }

    public void pausar() {
        System.out.println("Música Pausada...");
    }

    public void selecionarMusica() {

        int selecionar = 0;

        System.out.println("Playlist de Músicas");
        System.out.println("   -----------");
        System.out.println("   |Música: 1|");
        System.out.println("   |Música: 2|");
        System.out.println("   |Música: 3|");
        System.out.println("   -----------");

        System.out.println("Selecione Musica: ");
        selecionar = sc.nextInt();

        switch (selecionar) {
            case 1:{
                System.out.println("Tocando musica 1...");
            }break;
            case 2:{
                System.out.println("Tocando musica 2...");
            }break;
            case 3:{
                System.out.println("Tocando musica 3...");
            }break;
        }

    }
}
