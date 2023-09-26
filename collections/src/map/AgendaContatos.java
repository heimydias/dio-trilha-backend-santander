package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarNome(String nome) {
        Integer numeroNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroNome = agendaContatoMap.get(nome);
        }
        return numeroNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Julia", 123456);
        agendaContatos.adicionarContato("Julia", 5665);
        agendaContatos.adicionarContato("Julia Silva", 111111);
        agendaContatos.adicionarContato("Julia Santos", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);
        agendaContatos.adicionarContato("Julia", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarNome("Julia Santos"));
    }
}
