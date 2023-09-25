package set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoset;

    public ConjuntoConvidados() {
        this.convidadoset = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoset.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoCodigoConvite(int codigoConvite) {
        Convidado convidadoRemover = null;
        for (Convidado c : convidadoset) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoRemover = c;
                break;
            }
        }
        convidadoset.remove(convidadoRemover);
    }

    public int contarConvidados() {
        return convidadoset.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadoset);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)");

        conjuntoConvidados.adicionarConvidado("Convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("Convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("Convidado 4", 1236);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)");

        conjuntoConvidados.removerConvidadoCodigoConvite(1234);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s)");

        conjuntoConvidados.exibirConvidados();
    }
}
