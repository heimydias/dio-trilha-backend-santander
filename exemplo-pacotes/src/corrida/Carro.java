package corrida;

public class Carro extends Veiculo{

    private void confereCombustivel() {
        System.out.println("Conferindo Combustivel");
    }

    private void confereCambio() {
        System.out.println("Conferindo cambio em P");
    }

    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }
}
