package example.printqueue;

public class EstadoFalhou implements IEstadoTrabalho {

    @Override
    public void iniciar(TrabalhoImpressao trabalho) {
        // Estado final, nada a fazer.
    }

    @Override
    public void pausar(TrabalhoImpressao trabalho) {
        // Estado final, nada a fazer.
    }

    @Override
    public void retomar(TrabalhoImpressao trabalho) {
        // Estado final, nada a fazer.
    }

    @Override
    public void concluir(TrabalhoImpressao trabalho) {
        // Estado final, não pode concluir um trabalho que falhou.
    }

    @Override
    public void falhar(TrabalhoImpressao trabalho) {
        // Já está marcado como falha.
    }

    @Override
    public String getNome() {
        return "Falhou";
    }
}
