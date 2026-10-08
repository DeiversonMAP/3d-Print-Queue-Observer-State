package example.printqueue;

public class EstadoConcluido implements IEstadoTrabalho {

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
        // Já está concluído.
    }

    @Override
    public void falhar(TrabalhoImpressao trabalho) {
        // Estado final, não pode falhar após concluído.
    }

    @Override
    public String getNome() {
        return "Concluido";
    }
}
