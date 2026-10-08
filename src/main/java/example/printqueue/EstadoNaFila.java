package example.printqueue;

public class EstadoNaFila implements IEstadoTrabalho {

    @Override
    public void iniciar(TrabalhoImpressao trabalho) {
        trabalho.mudarEstado(new EstadoImprimindo());
    }

    @Override
    public void pausar(TrabalhoImpressao trabalho) {
        // Trabalho ainda não começou a imprimir, não há o que pausar.
    }

    @Override
    public void retomar(TrabalhoImpressao trabalho) {
        // Nada a retomar enquanto está apenas na fila.
    }

    @Override
    public void concluir(TrabalhoImpressao trabalho) {
        // Não é possível concluir um trabalho que ainda não começou.
    }

    @Override
    public void falhar(TrabalhoImpressao trabalho) {
        trabalho.mudarEstado(new EstadoFalhou());
    }

    @Override
    public String getNome() {
        return "NaFila";
    }
}
