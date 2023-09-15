package lanchonete;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        //ações que não precisam estarem disponiveis para toda a aplicação
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitamina();
        //ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLacheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //ações que não precisam estar disponíveis para toda a aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //ação que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();
        //Não deveria mas o estabelecimento ainda não definiu normas de atendimento
        cliente.pagarPedidoBalcao();
        //esta ação é muito sigilosa, deve ser privada
        cliente.consultarSaldoApp();

        //já pensou os clientes ouvindo que o gás acabou?
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
