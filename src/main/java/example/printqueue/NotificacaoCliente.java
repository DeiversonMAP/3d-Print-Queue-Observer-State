package example.printqueue;

public class NotificacaoCliente implements IObservadorTrabalho {

    private String ultimaMensagem;

    @Override
    public void atualizar(TrabalhoImpressao trabalho, String estadoAnterior, String estadoNovo) {
        if (estadoNovo.equals("Concluido")) {
            this.ultimaMensagem = "Sua peça \"" + trabalho.getNomePeca() + "\" ficou pronta!";
        } else if (estadoNovo.equals("Falhou")) {
            this.ultimaMensagem = "Houve um problema na impressão de \"" + trabalho.getNomePeca() + "\".";
        }
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}
