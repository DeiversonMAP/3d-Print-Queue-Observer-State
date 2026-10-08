package example.printqueue;

public interface IEstadoTrabalho {
    void iniciar(TrabalhoImpressao trabalho);
    void pausar(TrabalhoImpressao trabalho);
    void retomar(TrabalhoImpressao trabalho);
    void concluir(TrabalhoImpressao trabalho);
    void falhar(TrabalhoImpressao trabalho);
    String getNome();
}
