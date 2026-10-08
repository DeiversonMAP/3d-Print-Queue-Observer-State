package example.printqueue;

public interface IObservadorTrabalho {
    void atualizar(TrabalhoImpressao trabalho, String estadoAnterior, String estadoNovo);
}
