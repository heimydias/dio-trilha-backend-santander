package rede;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        String appEscolhido="msn";

        if (appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        }else if (appEscolhido.equals("face")){
            smi = new Facebook();
        }else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
