package set;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarNome(String nome) {
        Set<Contato> contatosNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosNome.add(c);
            }
        }
        return contatosNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Julia", 123456);
        agendaContatos.adicionarContato("Julia", 874952);
        agendaContatos.adicionarContato("Julia Silva", 111111);
        agendaContatos.adicionarContato("Julia Santos", 654987);
        agendaContatos.adicionarContato("Maria Silva", 111111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarNome("Julia"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 555555));

        agendaContatos.exibirContato();
    }
}
