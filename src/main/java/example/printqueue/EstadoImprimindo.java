package example.printqueue;

public class EstadoImprimindo implements IEstadoTrabalho {

    @Override
    public void iniciar(TrabalhoImpressao trabalho) {
        // Já está imprimindo, nada a fazer.
    }

    @Override
    public void pausar(TrabalhoImpressao trabalho) {
        trabalho.mudarEstado(new EstadoPausado());
    }

    @Override
    public void retomar(TrabalhoImpressao trabalho) {
        // Já está em andamento.
    }

    @Override
    public void concluir(TrabalhoImpressao trabalho) {
        trabalho.mudarEstado(new EstadoConcluido());
    }

    @Override
    public void falhar(TrabalhoImpressao trabalho) {
        trabalho.mudarEstado(new EstadoFalhou());
    }

    @Override
    public String getNome() {
        return "Imprimindo";
    }
}
