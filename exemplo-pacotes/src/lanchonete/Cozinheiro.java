package lanchonete;

public class Cozinheiro {

    public void adicionarLacheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCAO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLacheNoBalcao();
        adicionarSucoNoBalcao();
    }
    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    public void prepararVitamina(){
        System.out.println("PREPARANDO SUCO");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararVitamina();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }
    public void selecionarIngredientesVitamina(){
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }
    public void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    public void baterVitaminaLiquidificador(){
        System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
    }
    public void fritarIngredientesLanche(){
        System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGUER");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes (Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}