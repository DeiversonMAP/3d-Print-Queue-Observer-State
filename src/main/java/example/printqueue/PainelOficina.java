package example.printqueue;

public class PainelOficina implements IObservadorTrabalho {

    private String ultimaAtualizacao;

    @Override
    public void atualizar(TrabalhoImpressao trabalho, String estadoAnterior, String estadoNovo) {
        this.ultimaAtualizacao = "Painel: " + trabalho.getNomePeca() + " saiu de " + estadoAnterior + " para " + estadoNovo;
    }

    public String getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }
}
