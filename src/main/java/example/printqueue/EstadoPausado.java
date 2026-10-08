package example.printqueue;

public class EstadoPausado implements IEstadoTrabalho {

    @Override
    public void iniciar(TrabalhoImpressao trabalho) {
        // Use retomar() para continuar um trabalho pausado.
    }

    @Override
    public void pausar(TrabalhoImpressao trabalho) {
        // Já está pausado.
    }

    @Override
    public void retomar(TrabalhoImpressao trabalho) {
        trabalho.mudarEstado(new EstadoImprimindo());
    }

    @Override
    public void concluir(TrabalhoImpressao trabalho) {
        // Não é possível concluir um trabalho pausado sem retomar primeiro.
    }

    @Override
    public void falhar(TrabalhoImpressao trabalho) {
        trabalho.mudarEstado(new EstadoFalhou());
    }

    @Override
    public String getNome() {
        return "Pausado";
    }
}
